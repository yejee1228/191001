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
	//test
	public List<PlayerBean> selectByMany(PlayerBean param);
}
