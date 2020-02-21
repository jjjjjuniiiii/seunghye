package handler.page.md;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.MDDAO;
import dao.SupportDAO;


public class MDForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		MDDAO mdDAO = MDDAO.getInstance();
		List mdList2 = mdDAO.selectMD2Info();
		req.setAttribute("mdList2", mdList2);
		
		return "/WEB-INF/views/page/md2.jsp";		
		
	}
}
