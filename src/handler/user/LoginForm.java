package handler.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.LoginDAO;
import model.LoginVO;

public class LoginForm implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//Login.jsp에서 사용자로부터 입력 받은 id와 pw 받아오기
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		
		// DB커넥션 - DB [intern]테이블에서 id, pw 조회하기 		
		LoginDAO loginDAO = LoginDAO.getInstance();
		LoginVO result = loginDAO.selectLoginInfoByPK(id, pw);
		
		
		//로그인 성공(DB에 id,pw 쌍이 일치) or 실패 처리
		if(result!=null) {//성공 시 main 페이지로 이동
			return "/WEB-INF/views/page/main.jsp";
		}
		else//실패시 로그인 창에 머뭄
			return "/WEB-INF/views/user/login.jsp";	
		
	}
}
