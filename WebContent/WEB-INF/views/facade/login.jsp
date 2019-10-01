<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "../common/head.jsp"/>
<div></div>
<div>
	<img id="soccer"  src = "${img}/soccer.png" alt = ""/>    
</div>
<div></div>
<div></div>
<div><form id="login_form">
	<div class="login_tab">
	  <div class="one">
	  	 USERNAME  <input id = "userName" type="text" name="playerId" style="width: 100%"/></div>
	  <div class="two">
	  	<input id = "login_btn" type="button" value="로그인" style="width: 100%;height: 100%"/></div>
	  <div class="three">
	  	PASSWORD  <input id = "password" type="text" name="solar" style="width: 100%"/></div>
	  <div class="four">
	  	<input type="hidden" name="action" value="login" style="width: 100%;height: 100%"/>
     	<input type="hidden" name="folder" value="facade" style="width: 100%;height: 100%"/>
    	<input type="hidden" name="page" value="home" style="width: 100%;height: 100%"/>
	  </div>
	</div>
     
     </form></div>
<div></div>
<div></div>
<div>
	<h3 id = "join_tag"><a id="a_join" href="#">회원가입</a></h3>
</div>
<div></div>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');

</script> 
