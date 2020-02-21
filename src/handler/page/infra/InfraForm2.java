package handler.page.infra;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList2 = infraDAO.selectInfra2Info();	
		req.setAttribute("infraList2", infraList2);
		
		return "/WEB-INF/views/page/infra2.jsp";		
	}
}
