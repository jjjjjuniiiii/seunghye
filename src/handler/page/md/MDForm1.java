package handler.page.md;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.MDDAO;
import dao.SupportDAO;


public class MDForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		MDDAO mdDAO = MDDAO.getInstance();
		List mdList1 = mdDAO.selectMD1Info();
		req.setAttribute("mdList1", mdList1);
		
		return "/WEB-INF/views/page/md1.jsp";		
		
	}
}
