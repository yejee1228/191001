<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "../common/head.jsp"/>
로그인 실패
<a id = "back_page" href="#">로그인 재시도</a>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');
</script>