<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div>
	<form>
		<div id = "join_title"><h3>회원가입</h3></div>
		<div class = "join_form">
			<div>플레이어 id</div><div id="input"><input type="text" name="playerId" style = "width: 100%"/></div>
			<div>이름</div><div id="input"><input type="text" name="playerName" style = "width: 100%"/></div>
			<div>팀 id</div><div id="input"><input type="text" name="teamId" style = "width: 100%"/></div>
			<div>영문이름</div><div id="input"><input type="text" name="ePlayerName" style = "width: 100%"/></div>
			<div>닉네임</div><div id="input"><input type="text" name="nickname" style = "width: 100%"/></div>
			<div>입단연도</div><div id="input"><input type="text" name="joinYyyy" style = "width: 100%"/></div>
			<div>포지션</div><div id="input"><input type="text" name="position" style = "width: 100%"/></div>
			<div>백넘버</div><div id="input"><input type="text" name="backNo" style = "width: 100%"/></div>
			<div>국적</div><div id="input"><input type="text" name="nation" style = "width: 100%"/></div>
			<div>생년월일</div><div id="input"><input type="text" name="birthDate" style = "width: 100%"/></div>
			<div>솔라</div><div id="input"><input type="text" name="solar" style = "width: 100%"/></div>
			<div>키</div><div id="input"><input type="text" name="height" style = "width: 100%"/></div>
			<div>몸무게</div><div id="input"><input type="text" name="weight" style = "width: 100%"/></div>
			<input type="hidden" name="action" value="join" style="width: 100%;height: 100%"/>
     		<input type="hidden" name="folder" value="facade" style="width: 100%;height: 100%"/>
    		<input type="hidden" name="page" value="login" style="width: 100%;height: 100%"/>
			<div id="back"><a id = "back_page" href="#">뒤로가기</a>
			</div>
			<div id="submit">
				<input type="submit" value='회원가입'/>
			</div>
		</div>
		
	</form>
</div>

<script>
app.init('${ctx}');
</script>
