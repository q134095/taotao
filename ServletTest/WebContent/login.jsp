<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
function open(a){
	 var="string2" value="${fn:replace('I am from google', 'google', 'runoob')}" 
	 
}
function open2(){
	//alert("验证错误，请重新输入");
	parent.open('http://www.baidu.com','vvv','width=600,height=500');
	$('#abc').submit();
}
</script>


<title>标题</title>
</head>
<body>
	Hello:<br>
	<font color="green" size="22">
		<%
			out.print(request.getParameter("userName")+"<br>");
		%>
	</font>
	<a href="javascript:void(0);" onclick="open2(); return false;" target="_blank">aaaaa</a>
<c:set var="PUBLISH_TIME" value="2019/02/10"/> 
<c:set var="PUBLISH_TIME2" value="2019/02/15"/>
<fmt:parseDate value="${PUBLISH_TIME}" pattern="yyyy/MM/dd" var="publishDate"/>
<fmt:parseDate value="${PUBLISH_TIME2}" pattern="yyyy/MM/dd" var="publishDate2"/>
<c:if test="${publishDate2.time >  publishDate.time }">
<p>${publishDate.time}</p>
<p>${publishDate2.time}</p>
</c:if>

<c:choose>
<c:when test="true">
<c:choose>
<c:when test="true">
<p>true````````</p>
</c:when>

<c:when test="false">
<p>false````````</p>
</c:when>
</c:choose>
</c:when>
<c:when test="false"><p>false````````</p></c:when>
</c:choose>
<p>替换后的字符串 :${fn:replace(string2, "google", 'runosob')}</p>

<form id="abc" method="post" action="http://www.baidu.com" target="vvv">

</form>
</body>
</html>
