package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class SearchCommand extends Command{

	public SearchCommand(HttpServletRequest request) {
		System.out.println("SearchCommand 도착");
		super.setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		switch (request.getParameter("page")) {
		case "2_positions": 
			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
			System.out.println("포지션:"+request.getParameter("positions"));
			break;

		default:
			break;
		}
		super.execute();
	}

}
