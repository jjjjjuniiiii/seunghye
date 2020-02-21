package handler.page.infra;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm4 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList4 = infraDAO.selectInfra4Info();	
		req.setAttribute("infraList4", infraList4);
		
		return "/WEB-INF/views/page/infra4.jsp";
		
	}
}
