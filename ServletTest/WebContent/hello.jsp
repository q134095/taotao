<%@ page language="java" import="java.util.*,java.io.*"
pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
response.setHeader("Cache-Control","cache,must-revalidate");
response.setHeader("Pragma","public");
   out.clear();
   out = pageContext.pushBody();
   response.setContentType("application/pdf");
   response.setHeader("Content-Disposition","inline;fileName=special condition letter.pdf");

   try {
    String strPdfPath = new String("C://201810.pdf");

    File file = new File(strPdfPath);
    if (file.exists()) {
     DataOutputStream temps = new DataOutputStream(response
       .getOutputStream());
     DataInputStream in = new DataInputStream(
       new FileInputStream(strPdfPath));

     byte[] b = new byte[2048];
     while ((in.read(b)) != -1) {
      temps.write(b);
      temps.flush();
     }

     in.close();
     temps.close();
    } else {
     out.print(strPdfPath + " 文件不存在!");
    }

   } catch (Exception e) {
    out.println(e.getMessage());
   }
%>
<html>
<head>
<title>标题</title>
   <base href="<%=basePath%>">
</head>
<body>
   <br>
</body>
</html>