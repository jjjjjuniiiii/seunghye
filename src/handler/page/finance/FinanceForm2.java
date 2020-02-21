package handler.page.finance;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.FinanceDAO;
import dao.SupportDAO;


public class FinanceForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		FinanceDAO financeDAO = FinanceDAO.getInstance();
		List financeList2 = financeDAO.selectFinance1Info();
		req.setAttribute("financeList2", financeList2);
		
		return "/WEB-INF/views/page/finance2.jsp";		
		
	}
}
