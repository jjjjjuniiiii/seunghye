package handler.page.pos;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.CommandHandler;
import dao.POSDAO;


public class PosForm1 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		POSDAO posDAO = POSDAO.getInstance();
		List posList1 = posDAO.selectPOSInfo();	
		req.setAttribute("posList1", posList1);
		
		return "/WEB-INF/views/page/pos1.jsp";		
		
	}
}
