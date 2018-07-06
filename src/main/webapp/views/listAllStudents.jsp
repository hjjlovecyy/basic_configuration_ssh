<%--
  Created by IntelliJ IDEA.
  User: hejiajun
  Date: 2018/7/5
  Time: 下午3:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <div>学生名单：</div><br>
    <table border="1" cellpadding="10">
        <tr>
            <td>ID 值</td>
            <td>姓名</td>
        </tr>
        <s:iterator value="#request.students" var="student" status="st">
            <tr>
                <td><s:property value="#student.id" /></td>
                <td><s:property value="#student.studentName" /></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
