<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <h2>Add Employee</h2>
    
    <form action="/employee/saveEmployee" method="post" >
        <label for="name"> Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="role">Role:</label>
        <input type="text" id="role" name="role" required><br><br>
        
        <input type="submit" value="Add Employee">
    </form>

</body>
</html>