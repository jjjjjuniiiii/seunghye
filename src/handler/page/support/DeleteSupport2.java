package handler.page.support;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.SupportDAO;


public class DeleteSupport2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		//Fixed Form의 입력 값 받아오기
		int sequence = Integer.parseInt(req.getParameter("input0"));
		SupportDAO supportDAO = SupportDAO.getInstance();
		supportDAO.deleteSupport2(sequence);
		
		res.sendRedirect(req.getContextPath()+"/page/user/support2");
		return null;
	}
}
