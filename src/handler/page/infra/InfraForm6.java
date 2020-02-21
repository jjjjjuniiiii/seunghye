package handler.page.infra;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm6 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList6 = infraDAO.selectInfra6Info();	
		req.setAttribute("infraList6", infraList6);
		
		return "/WEB-INF/views/page/infra6.jsp";	
		
	}
}
