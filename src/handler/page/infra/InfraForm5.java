package handler.page.infra;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm5 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList5 = infraDAO.selectInfra5Info();	
		req.setAttribute("infraList5", infraList5);
		
		return "/WEB-INF/views/page/infra5.jsp";	
		
	}
}
