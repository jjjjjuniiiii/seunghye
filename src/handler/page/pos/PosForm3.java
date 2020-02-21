package handler.page.pos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;

import dao.POSDAO;


public class PosForm3 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		POSDAO posDAO = POSDAO.getInstance();
		List posList3 = posDAO.selectPOS_PDA1Info();		
		req.setAttribute("posList3", posList3);
		
		return "/WEB-INF/views/page/pos3.jsp";		
		
	}
}
