package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class JoinCommand extends Command{
	public JoinCommand(HttpServletRequest request) {
		System.out.println("★★★ 5. joinCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		setRequest(request);
	}
	@Override
	public void execute() {
		super.execute();
	}
}
