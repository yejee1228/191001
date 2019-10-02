<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2 id = "ques_text">4. 팀아이디와 포지션 입력하면 해당 선수 정보 출력</h2>
<form class = "btn2_spac" id="btn4" action="${ctx}/player.do">
	<div>팀아이디 : </div><div><input type="text" name="teamId" /></div>
	<div>포지션 : </div><div><input type="text" name="position" /></div>
	<input type="hidden" name="action" value="search" />
	<input type="hidden" name="folder" value="player" />
	<input type="hidden" name="page" value="4_find_by_teamid_position" />
	<div></div><div><input id = "btn_4" type="button" value="전송"/></div>
</form>