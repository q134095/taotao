<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<style type="text/css">
#id{ bgcolor:#FF0000 !important;}
.class{ bgcolor:yellow;}
table.imagetable {
font-family: verdana,arial,sans-serif;
font-size:11px;
color:#333333;
border-width: 1px;
border-color: #999999;
border-collapse: collapse;
}
table.imagetable th {
background:#b5cfd2 url('cell-blue.jpg');
border-width: 1px;
padding: 8px;
border-style: solid;
border-color: #999999;
}
table.imagetable td {
background:#dcddc0 url('cell-grey.jpg');
border-width: 1px;
padding: 8px;
border-style: solid;
border-color: #999999;
}
</style>

<body>
<table class="imagetable">
<tr>
<th>Info Header 1</th><th>Info Header 2</th><th>Info Header 3</th>
</tr>
<tr bgcolor="#FF0000!important" class="class">
<td>Text 1A</td><td>Text 1B</td><td>Text 1C</td>
</tr>
<tr>
<td id="id">Text 2A</td><td>Text 2B</td><td>Text 2C</td>
</tr>
</table>
</body>

</html>