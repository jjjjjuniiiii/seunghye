package handler.page.infra;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class DeleteInfra6 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		//Fixed Form의 입력 값 받아오기
		int sequence = Integer.parseInt(req.getParameter("input0"));
		InfraDAO disuseDAO = InfraDAO.getInstance();
		disuseDAO.deleteInfra6(sequence);	
		
		res.sendRedirect(req.getContextPath()+"/page/user/infra6");
		return null;
	}
}
