<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="Spring" uri="http://www.springframework.org/tags"%>
<html>
   <body>
   <h1>${welcomeMessage}</h1>
   
       <h1>STUDENT ADMISSION FORM</h1>
        <form:errors path="student1.*"/>

       <form action = "/SpringMVC/SubmissionForm.html" method = "POST">
      	<p><Spring:message code="label.studentName"/> <input type = "text" name = "studentName">
        </p>         
        <p>
         Student Hobby: <input type = "text" name = "studentHobby" />
        </p>
        <p>
         Student Mobile Number: <input type = "text" name = "studentMobile" />
        </p>
        <p>
         Student DOB: <input type = "text" name = "studentDOB" />
        </p>
        <p>
         Student skills: <select name = "studentSkills" multiple>
         				<option value="Java">Java</option>
		         		<option value="Spring">Spring</option>
         				<option value="Spring MVC">Spring MVC</option>
         				</select>
        </p>
        
        <p>Student's Address</p>
        <p>
         Country: <input type = "text" name = "studentAddress.country">
        </p>         
        <p>
         city: <input type = "text" name = "studentAddress.city" />
        </p>
        <p>
         street: <input type = "text" name = "studentAddress.street" />
        </p>
        <p>
         pincode: <input type = "text" name = "studentAddress.pincode" />
        </p>
         <input type = "submit" value = "Submit this form by clicking here" />
      </form>
      
   </body>
</html>