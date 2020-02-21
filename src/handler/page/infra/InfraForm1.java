package handler.page.infra;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.InfraDAO;
import dao.POSDAO;


public class InfraForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		InfraDAO infraDAO = InfraDAO.getInstance();
		List infraList1 = infraDAO.selectInfra1Info();	
		req.setAttribute("infraList1", infraList1);
		
		return "/WEB-INF/views/page/infra1.jsp";		
		
	}
}
