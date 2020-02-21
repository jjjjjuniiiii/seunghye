package handler.page.support;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.SupportDAO;


public class SupportForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		SupportDAO supportDAO = SupportDAO.getInstance();
		List supportList2 = supportDAO.selectSupport2Info();
		req.setAttribute("supportList2", supportList2);
		
		return "/WEB-INF/views/page/support2.jsp";		
		
	}
}
