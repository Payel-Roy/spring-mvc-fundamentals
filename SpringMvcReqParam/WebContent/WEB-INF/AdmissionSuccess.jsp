<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${welcomeMessage}</h1>
       <h1>You have submitted your admission form successfully</h1>
         <table>
         <tr>
         <td>Student Name:</td><td><h5>${student1.studentName}</h5></td></tr>
         <tr>
         <td>Student Hobby:</td><td><h5>${student1.studentHobby}</h5></td></tr>
         <tr>
         <td>Student Mob Number:</td><td><h5>${student1.studentMobile}</h5></td></tr>
         <tr>
         <td>Student DOB:</td><td><h5>${student1.studentDOB}</h5></td></tr>
         <tr>
         <td>Student Skills:</td><td><h5>${student1.studentSkills}</h5></td></tr>
		<tr>
         <td>Student Address</td><td><h5>country: ${student1.studentAddress.country}</h5>
         							<h5>city: ${student1.studentAddress.city}</h5>
         							<h5>street: ${student1.studentAddress.street}</h5>
         							<h5>pincode: ${student1.studentAddress.pincode}</h5></td></tr>

         </table>
      
</body>
</html>