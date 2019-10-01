package com.soccer.web.serviceimpls;

import java.util.List;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	public static PlayerServiceImpl getInstance() {return instance;}
	public PlayerServiceImpl() {}
	
	@Override
	public boolean join(PlayerBean param) {
		return PlayerDaoImpl.getInstance().insertPlayer(param);
	}
	@Override
	public PlayerBean login(PlayerBean param) {
		System.out.println("★★★ 7. PlayerServiceImpl 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s ",
				param.getPlayerId(), 
				param.getSolar()));
		PlayerBean player = new PlayerBean();
		player = PlayerDaoImpl.getInstance().selectByPlayerIdSolar(param);
		return player;
	}
	@Override
	public List<String> findPositions() {
		return PlayerDaoImpl.
				getInstance().
				selectPositions();
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		return PlayerDaoImpl
				.getInstance().selectByTeamIdPosition(param);
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param) {
		return null;
	}

	

}
