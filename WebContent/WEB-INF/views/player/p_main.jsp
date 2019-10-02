<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "../common/head.jsp"/>

<div class = "container">
<div><h1 id = "main_text">플레이어</h1></div>
<div class = "content">
<c:choose>
	<c:when test="${page eq 'main'}">
		<jsp:include page = "2_positions_q.jsp"/>
		<jsp:include page = "4_find_by_teamid_position_q.jsp"/>
		<jsp:include page = "5_find_by_teamid_height_name_q.jsp"/>
		<a id = "back_page" href="#">뒤로가기</a>
	</c:when>
	<c:when test="${page eq '2_positions'}">
		<jsp:include page = "2_positions.jsp"/>
	</c:when>
	<c:when test="${page eq '4_find_by_teamid_position'}">
		<jsp:include page = "4_find_by_teamid_position.jsp"/>
	</c:when>
	<c:when test="${page eq '5_find_by_teamid_height_name'}">
		<jsp:include page = "5_find_by_teamid_height_name.jsp"/>
	</c:when>
</c:choose>
</div> 
<div></div>
</div>

<script>
app.init('${ctx}');

</script> 

<jsp:include page = "../common/foot.jsp"/>

