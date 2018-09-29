/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import app.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class DataProcess {
    public Connection getConnection()
    {
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user="sa";
            String password="123123";
            String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=dbExam";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return conn;
        
    }
      public boolean addExam(String subject, float startTime, float examDate, float duration, String classRoom, String falcuty, String status) {
        int result=0;
        String sql="INSERT INTO tblExaming VALUES(?,?,?,?)";
        try{
            PreparedStatement prst=getConnection().prepareStatement(sql);
            prst.setString(1, subject);
            prst.setFloat(2, startTime);
            prst.setFloat(3, examDate);
            prst.setFloat(4, duration);
            prst.setString(5, classRoom);
            prst.setString(6, falcuty);
            prst.setString(5, status);
            result=prst.executeUpdate();
            prst.close();   
            
            } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
            return result>0;
    }
    public ArrayList<Entity> getData(){
        ArrayList<Entity> list = new ArrayList<Entity>();
        String sql = "SELECT * FROM  tblExaming";
        try{
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            Entity e = new Entity();
            e.setSubject(rs.getString(1));
            e.setStartTime(rs.getFloat(2));
            e.setExamDate(rs.getFloat(3));
            e.setDuration(rs.getFloat(4));
            e.setClassRoom(rs.getString(5));
            e.setFaculty(rs.getString(6));
            e.setStatus(rs.getString(7));
            list.add(e);
           
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
}
