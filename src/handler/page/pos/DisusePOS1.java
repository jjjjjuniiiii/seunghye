package handler.page.pos;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.POSDAO;


public class DisusePOS1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		//Fixed Form의 입력 값 받아오기
		int sequence = Integer.parseInt(req.getParameter("input0"));		
		POSDAO disuseDAO = POSDAO.getInstance();
		disuseDAO.updateDisusePOS1(sequence);	
		
		res.sendRedirect(req.getContextPath()+"/page/user/pos2");
		return null;
	}
}
