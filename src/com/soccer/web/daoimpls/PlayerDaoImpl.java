package com.soccer.web.daoimpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao{
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	public static PlayerDaoImpl getInstance() {return instance;}
	private PlayerDaoImpl() {}
	
	
	@Override
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		System.out.println("★★★ 8. PlayerDaoImpl 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s ",
				param.getPlayerId(), 
				param.getSolar()));
		PlayerBean p = new PlayerBean();
		try {
			String sql = "SELECT *\n" + 
					"FROM PLAYER \n" + 
					"WHERE PLAYER_ID LIKE ?\n" + 
					"AND SOLAR LIKE ?";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection().prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				p = new PlayerBean();
				p.setBackNo(rs.getString("BACK_NO"));
				p.setBirthDate(rs.getString("BIRTH_DATE"));
				p.setePlayerName(rs.getString("E_PLAYER_NAME"));
				p.setHeight(rs.getString("HEIGHT"));
				p.setJoinYyyy(rs.getString("JOIN_YYYY"));
				p.setNation(rs.getString("NATION"));
				p.setNickname(rs.getString("NICKNAME"));
				p.setPlayerName(rs.getString("PLAYER_NAME"));
				p.setPlayerId(rs.getString("PLAYER_ID"));
				p.setSolar(rs.getString("SOLAR"));
				p.setPosition(rs.getString("POSITION"));
				p.setTeamId(rs.getString("TEAM_ID"));
				p.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.toString());
		return p;
	}
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + 
					"FROM PLAYER";
			ResultSet rs = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql)
					.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		
		try {
			String sql = "";
			PreparedStatement stmt = DatabaseFactory.createDatabase(Constants.VENDOR).getConnection().prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	

}
