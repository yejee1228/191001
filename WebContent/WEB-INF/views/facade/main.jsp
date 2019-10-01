<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "../common/head.jsp"/>

<div class = "container">
<div></div> <div><h3>회원관리</h3></div> <div></div>
<div></div> 
<div class = "content">
${page}
<c:choose>
	<c:when test="${page eq 'login'}">
		<jsp:include page = "login.jsp"/>
	</c:when>
	<c:when test="${page eq 'join'}">
		<jsp:include page = "join.jsp"/>
	</c:when>
	<c:when test="${page eq 'main'} && ${folder eq 'player'}">
		<jsp:include page = "../player/main.jsp"/>
	</c:when>
</c:choose>

</div> 
<div></div>
<div></div> <div></div> <div></div>
</div>

<jsp:include page="../common/foot.jsp"/>