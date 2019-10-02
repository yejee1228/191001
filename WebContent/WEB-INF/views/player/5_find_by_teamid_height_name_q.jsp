<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2 id = "ques_text">5. 팀아이디,키,포지션 입력하면 해당 선수 정보 출력</h2>
<form class = "btn3_spac" id = "btn5">
<div>팀 아이디  </div><div><input type="text" name = "teamId" /></div>
<div>키  </div><div><input type="text" name = "height" /></div>
<div>포지션  </div><div><input type="text" name = "position" /></div>
<input type="hidden" name = "action" value = "search" />
<input type="hidden" name = "folder" value = "player" />
<input type="hidden" name = "page" value = "5_find_by_teamid_height_name" />
<div></div><div><input id = "btn_5" type="button" value = "검색" /></div>
</form>
