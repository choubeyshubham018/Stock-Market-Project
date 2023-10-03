<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Detail</title>
</head>
<body>
	<h1 style="text-align: center;">Stock Price</h1>
	<h3 style="text-align: center;">${response}</h3>
	<form action="getStockPrice" method="get">
		<table align="center" border="1">
			<tr>
				<th>Stock Name</th>
				<td><input type="text" name="companyName" /></td>
			</tr>
			<tr>
				<th>Quantity</th>
				<td><input type="text" name="quantity" /></td>
			</tr>
			<tr>
			<td></td>
			<td> <input type="submit" value="SUBMIT"></td>
			</tr>
		</table>
	</form>
</body>
</html>