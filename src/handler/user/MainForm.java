package handler.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.LoginDAO;
import dao.UserDAO;
import model.LoginVO;
import model.UserVO;


public class MainForm implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		return "/WEB-INF/views/page/main.jsp";		
		
	}
}
