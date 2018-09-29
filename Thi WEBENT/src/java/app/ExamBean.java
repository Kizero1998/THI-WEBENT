/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import model.DataProcess;

/**
 *
 * @author Dell
 */
public class ExamBean {
    private String subject;
    private float startTime;
    private float examDate;
    private float duration;
    private String classRoom;
    private String faculty;
    private String status;

    private ArrayList exams;

    public ArrayList getExams() {
        return exams;
    }

    public void setExams(ArrayList exams) {
        this.exams = exams;
    }
    
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getExamDate() {
        return examDate;
    }

    public void setExamDate(float examDate) {
        this.examDate = examDate;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Creates a new instance of TestBean
     */
    public ExamBean() 
    {
        DataProcess dt=new DataProcess();
        exams=dt.getData();
    }

        public String AddExam()
        {
            DataProcess dt=new DataProcess();
            if(dt.addExam(subject, startTime, examDate, duration, classRoom, faculty, status))
                return "success";
            return "failed";
            
        }
    

}

