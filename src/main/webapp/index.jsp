<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body style="text-align: center;margin: 200px 0px">
<form action="showTackAirPort" method="post">
    起飞机场<select name="takeid">
    <option value="0">请选择</option>
    <c:forEach items="${takeport}" var="takeport">
        <option value="${takeport.id}">${takeport.portName}</option>
    </c:forEach>
</select>
<%--    降落机场<select name="landid" >--%>
<%--    <option value="0" >请选择</option>--%>
<%--    <c:forEach items="${land}" var="land">--%>
<%--        <option value="${land.id}">${land.portName}</option>--%>
<%--    </c:forEach>--%>
<%--</select>--%>
<%--    <input type="submit" value="查询"/>--%>
<%--    <table border="1" style="margin: 10px auto;text-align: center">--%>
<%--        <tr>--%>
<%--            <th>飞机编号</th>--%>
<%--            <th>起飞机场</th>--%>
<%--            <th>起飞城市</th>--%>
<%--            <th>降落机场</th>--%>
<%--            <th>降落城市</th>--%>
<%--            <th>航行时间</th>--%>
<%--            <th>票价（元）</th>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${list}" var="l">--%>
<%--            <tr>--%>
<%--                <td>${l.airNo}</td>--%>
<%--                <td>${l.takePort.portName}</td>--%>
<%--                <td>${l.takePort.cityName}</td>--%>
<%--                <td>${l.landPort.portName}</td>--%>
<%--                <td>${l.landPort.cityName}</td>--%>
<%--                <td>--%>
<%--                    <c:if test="${l.time>60}">--%>
<%--                        ${Math.floor(l.time/60)}小时${l.time%60}分钟--%>
<%--                    </c:if>--%>
<%--                    <c:if test="${l.time<60}">--%>
<%--                        ${l.time}分钟--%>
<%--                    </c:if>--%>
<%--                </td>--%>
<%--                <td>${l.price}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
</form>
</body>
</html>
