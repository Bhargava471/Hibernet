<%@page import="com.mouritech.department.entity.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Management System</title>
</head>
<body>
<center>
	<h1>Department Management System</h1>
	<h2>
		<a href="new">Add New Department</a> 
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="list">List of Departments</a> 
	</h2>
</center>
<div align="center">

	<table border="1" cellpadding = "5">
		<caption><h2>List of employees</h2></caption>
		<tr>
			<th>DepartmentId </th>
			<th>DepartmentName </th>
			<th>DepartmentBranch </th>
			<th>DepartmentLocation</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="dept" items = "${listDept}">
		<tr>
			<td><c:out value= "${dept.deptId}" /></td>
			<td><c:out value= "${dept.deptName}" /></td>
			<td><c:out value= "${dept.deptBranch}" /> </td>
			<td><c:out value= "${dept.deptLocation}" /></td>
			<td>
				<a href="edit?id=<c:out value= "${dept.deptId}" />">Edit Department</a> 
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="delete?id=<c:out value= "${dept.deptId}" />">Delete Department</a> 
			</td>
		</tr>
		</c:forEach>
	</table>
		
</div>
</body>
</html>