package handler.page.giftcard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.GiftcardDAO;
import dao.MDDAO;
import dao.SupportDAO;


public class GiftcardForm2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		GiftcardDAO giftcardDAO = GiftcardDAO.getInstance();
		List giftcardList2 = giftcardDAO.selectGiftcard2Info();
		req.setAttribute("giftcardList2", giftcardList2);
		
		return "/WEB-INF/views/page/giftcard2.jsp";		
		
	}
}
