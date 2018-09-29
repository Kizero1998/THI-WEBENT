<%-- 
    Document   : ViewData
    Created on : Sep 29, 2018, 10:28:08 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>

    </head>
    <body>
        <h1>Exams List</h1>
                
            <h:dataTable value="#{ExamBean.exams}" var="e" border="1">
                <h:column>                    
                        <h:outputText value="Subject"/>
                        
                        <h:outputText value="#{e.subject}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Start Time"/>
                        <h:outputText value="#{e.startTime}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Exam Date"/>
                        <h:outputText value="#{e.examDate}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Duration"/>
                        <h:outputText value="#{e.duration}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Class Room"/>
                        <h:outputText value="#{e.classRoom}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Falcuty"/>
                        <h:outputText value="#{e.falcuty}"/>
                </h:column>
                <h:column>                    
                        <h:outputText value="Status"/>
                        <h:outputText value="#{e.status}"/>
                </h:column>
                
            </h:dataTable>
          
</html>
