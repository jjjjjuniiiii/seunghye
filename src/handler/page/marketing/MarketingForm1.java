package handler.page.marketing;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.MDDAO;
import dao.MarketingDAO;
import dao.SupportDAO;


public class MarketingForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		MarketingDAO marketingDAO = MarketingDAO.getInstance();
		List marketingList1 = marketingDAO.selectMarketing1Info();
		req.setAttribute("marketingList1", marketingList1);
		
		return "/WEB-INF/views/page/marketing1.jsp";		
		
	}
}
