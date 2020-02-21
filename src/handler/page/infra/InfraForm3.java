package handler.page.infra;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm3 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList3 = infraDAO.selectInfra3Info();	
		req.setAttribute("infraList3", infraList3);
		
		return "/WEB-INF/views/page/infra3.jsp";		
		
	}
}
