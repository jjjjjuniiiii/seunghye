package handler.page.pos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;

import dao.POSDAO;


public class PosForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		POSDAO posDAO = POSDAO.getInstance();
		List posList2 = posDAO.selectPOS2Info();		
		req.setAttribute("posList2", posList2);	
		
		return "/WEB-INF/views/page/pos2.jsp";		
		
	}
}
