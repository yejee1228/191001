package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		super.setRequest(request);
		System.out.println("★★★ 5. MoveCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("folder"),
				request.getParameter("page")));
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}

	@Override
	public void execute() {

		super.execute();
	}

}
