package handler.page.support;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.SupportDAO;


public class SupportForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		SupportDAO supportDAO = SupportDAO.getInstance();
		List supportList1 = supportDAO.selectSupport1Info();
		req.setAttribute("supportList1", supportList1);
		
		return "/WEB-INF/views/page/support1.jsp";		
		
	}
}
