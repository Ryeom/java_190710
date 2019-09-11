package helloWeb.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.b")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
	
	protected void doprocess(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		String RequestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command  = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		
		if(command.equals("/board_write.b")){
			
			System.out.println("board wirte");
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/view/board_write.jsp");
		}
		
		
		
		if(forward.isRedirect()) {
			res.sendRedirect(forward.getPath());
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
			dispatcher.forward(req, res);
		}
		
		
		
	}
	
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doprocess(req, res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doprocess(req, res);
	}

}
