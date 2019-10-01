package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request) {
		System.out.println("★★★ 5. CreateCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		setRequest(request);
		setAction(action);
		setDomain(domain);
		super.execute();
	}
	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		if(PlayerServiceImpl.getInstance().join(param)) {
			System.out.println("회원가입 성공");
		}else{
			System.out.println("가입실패");
		};
	}
}
