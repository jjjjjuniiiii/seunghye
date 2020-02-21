package handler.page.marketing;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.MDDAO;
import dao.MarketingDAO;
import dao.SupportDAO;


public class MarketingForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		MarketingDAO marketingDAO = MarketingDAO.getInstance();
		List marketingList2 = marketingDAO.selectMarketing2Info();
		req.setAttribute("marketingList2", marketingList2);
		
		return "/WEB-INF/views/page/marketing2.jsp";		
		
	}
}
