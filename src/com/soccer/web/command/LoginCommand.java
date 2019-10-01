package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		System.out.println("★★★ 5. LoginCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setFolder(request.getParameter("folder"));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		PlayerBean player = new PlayerBean();
		player.setPlayerId(playerId);
		player.setSolar(solar);
		player = PlayerServiceImpl.getInstance().login(player);
		System.out.println("10.로그인커맨드");
		System.out.println(player);
		
		String a = (player.getPlayerId()==null) ? "login" : request.getParameter("page");
		String b = (player.getPlayerId()==null) ? "facade" : request.getParameter("folder");
		request.setAttribute("page", a);
		request.setAttribute("folder",b);
		
		System.out.println(a+","+b);
		super.execute();
	}
}
