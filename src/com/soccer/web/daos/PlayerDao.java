package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {
	public boolean insertPlayer(PlayerBean param);
	//1. 로그인
	public PlayerBean selectByPlayerIdSolar(PlayerBean param);
	// 2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> selectPositions();
	// 4.
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param);
	// 5. 팀아이디,키,포지션 입력하면 해당 선수 정보 출력
	public List<PlayerBean> selectByTeamIdHeightName(PlayerBean param);
}
