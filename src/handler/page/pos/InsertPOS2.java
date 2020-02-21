package handler.page.pos;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.POSDAO;

public class InsertPOS2 implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		//Fixed Form의 입력 값 받아오기
		POSDAO countDAO = POSDAO.getInstance();
		int sequence = countDAO.countPOS()+1;
		String part = "06";
		String approved_disuse = "Y";
		String large_category = req.getParameter("box1");
		String small_category = req.getParameter("box2");
		String system = req.getParameter("box3");
		String using = req.getParameter("input1")==null?"":req.getParameter("input1");
		String host_name = req.getParameter("input2")==null?"":req.getParameter("input2");
		String manufacturer = req.getParameter("input3")==null?"":req.getParameter("input3");
		String model_name = req.getParameter("input4")==null?"":req.getParameter("input4");
		String specification = req.getParameter("input5")==null?"":req.getParameter("input5");
		int purchase_num = 0;
		try {
			purchase_num = Integer.parseInt(req.getParameter("input6"));
		}catch(Exception e) {
		}
		String install_name = req.getParameter("input7")==null?"":req.getParameter("input7");
		int install_num = 0;
		try {
			install_num = Integer.parseInt(req.getParameter("input8"));
		}catch(Exception e) {
		}
		Date start_date = null;
		try{
			start_date = Date.valueOf(req.getParameter("input9")==null?"":req.getParameter("input9"));
		}catch(Exception e) {
			
		}
		String deterioration = req.getParameter("input10")==null?"":req.getParameter("input10");
		int start_money = 0;
		try {
			start_money = Integer.parseInt(req.getParameter("input11"));
		}catch(Exception e) {
		}
		String place = req.getParameter("input12")==null?"":req.getParameter("input12");
		String location = req.getParameter("input13")==null?"":req.getParameter("input13");
		String status_progress = req.getParameter("input14")==null?"":req.getParameter("input14");
		String contract_term = req.getParameter("input15")==null?"":req.getParameter("input15");
		int month_money = 0;
		try {
			month_money = Integer.parseInt(req.getParameter("input16"));
		}catch(Exception e) {
		}
		String status_use = req.getParameter("input17")==null?"":req.getParameter("input17");
		String disuse_or_recycling = req.getParameter("input18")==null?"":req.getParameter("input18");
		String reason_disuse = req.getParameter("input19")==null?"":req.getParameter("input19");
		String note = req.getParameter("input20")==null?"":req.getParameter("input20");
		String unification = req.getParameter("input21")==null?"":req.getParameter("input21");
		String EOS_end_date = req.getParameter("input22")==null?"":req.getParameter("input22");
		
		POSDAO insertDAO = POSDAO.getInstance();
		insertDAO.insertPOS2(sequence, part, approved_disuse, large_category, small_category,
				system, using, host_name, manufacturer, model_name, specification, purchase_num,
				install_name, install_num, start_date, deterioration, start_money, place, location,
				status_progress, contract_term, month_money, status_use, disuse_or_recycling, reason_disuse,
				note, unification, EOS_end_date);	
		
		res.sendRedirect(req.getContextPath()+"/page/user/pos2");
		return null;
	}
}
