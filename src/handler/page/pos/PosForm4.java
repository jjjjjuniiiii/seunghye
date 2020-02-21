package handler.page.pos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;

import dao.POSDAO;


public class PosForm4 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		POSDAO posDAO = POSDAO.getInstance();
		List posList4 = posDAO.selectPOS_PDA2Info();		
		req.setAttribute("posList4", posList4);
		
		return "/WEB-INF/views/page/pos4.jsp";		
		
	}
}
