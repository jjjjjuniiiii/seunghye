package handler.page.finance;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.FinanceDAO;
import dao.SupportDAO;


public class FinanceForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		FinanceDAO financeDAO = FinanceDAO.getInstance();
		List financeList1 = financeDAO.selectFinance1Info();
		req.setAttribute("financeList1", financeList1);
		
		return "/WEB-INF/views/page/finance1.jsp";		
		
	}
}
