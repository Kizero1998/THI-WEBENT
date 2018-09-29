<%-- 
    Document   : Login
    Created on : Sep 27, 2018, 1:01:06 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Create new Exam</h1>
        <h:form>
            Subject: <h:inputText value="#{ExamBean.subject}"/><br/>
            Start Time: <h:inputText value="#{ExamBean.startTime}"/><br/>
            Exam Date: <h:inputText value="#{ExamBean.examDate}"/><br/>
            Duration: <h:inputText value="#{ExamBean.duration}"/><br/>
            ClassRoom: <h:inputText value="#{ExamBean.classRoom}"/><br/>
            Faculty: <h:inputText value="#{ExamBean.faculty}"/><br/>
            Status: <h:inputText value="#{ExamBean.status}"/><br/>
            <h:commandButton action="#{ExamBean.AddExam()}" value="Add"/>
        </h:form>
    </body>
</html>
</f:view>