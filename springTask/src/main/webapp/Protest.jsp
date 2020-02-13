<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Gray" >
<form action="./protest.do" method="post">
<pre>
Organisation:<input type="text" name="organisation"/> 
Date:<input type="text" name="date"/>
Reason:<textarea rows="5" cols="20"></textarea>
<select type="location">
<option>Select</option>
<option>Road</option>
<option>Park</option>
<option>Vidhana Soudha</option>
<option>Mejastit</option>
<option>Mall</option>
<option>College</option>

</select>
<input type="submit" value="APPLY">
</pre>
</form>

</body>
</html>