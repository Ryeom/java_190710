package com.test.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		System.out.println(req);
		System.out.println(req.getParameter("user_id"));
		System.out.println(req.getParameter("user_pw"));
		
		String id = "dmfua";
		
		
		ActionForward forward = new ActionForward();
		HttpSession session = req.getSession();
		
		session.setAttribute("user_id", id);
		
		forward.setRedirect(true);
		forward.setPath("index.jsp");
		
		return forward;
	}

}
