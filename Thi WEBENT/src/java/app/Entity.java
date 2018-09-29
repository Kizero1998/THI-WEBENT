/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


/**
 *
 * @author Dell
 */
public class Entity {
    private String subject;
    private float startTime;
    private float examDate;
    private float duration;
    private String classRoom;
    private String faculty;
    private String status;

    public Entity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Entity(String subject, float startTime, float examData, float duration, String classRoom, String faculty, String status) {
        this.subject = subject;
        this.startTime = startTime;
        this.examDate = examData;
        this.duration = duration;
        this.classRoom = classRoom;
        this.faculty = faculty;
        this.status = status;
    }
    
}
