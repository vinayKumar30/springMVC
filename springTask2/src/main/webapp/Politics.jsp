<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<form action="politics.do">
<pre>
PartyName:<input type="text" name="partyname"/> 
Age:<input type="text" name="age"/>
Status:<textarea rows="5" cols="20"></textarea>
RullingYear:<select type="pol">
<option>Select</option>
<option>1995-2000</option>
<option>2001-2005</option>
<option>2006-2010</option>
<option>2011-2015</option>
<option>2016-2020</option>

</select>
<input type="submit" value="APPLY">
</pre>
</form>
</body>
</html>