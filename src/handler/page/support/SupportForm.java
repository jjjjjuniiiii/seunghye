package handler.page.support;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import dao.SupportDAO;




public class SupportForm implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		SupportDAO computeDAO1 = SupportDAO.getInstance();
		int data1 = computeDAO1.count1();
		int data2 = computeDAO1.count2();
		int data3 = computeDAO1.count3();
		int data4 = data1+data2+data3;
		int data5 = computeDAO1.count5();
		int data6 = computeDAO1.count6();
		int data7 = computeDAO1.count7();
		int data8 = data5+data6+data7;
		int data9 = computeDAO1.count9();
		int data10 = computeDAO1.count10();
		int data11 = computeDAO1.count11();
		int data12 = data9+data10+data11;
		//노후장비 data13~16
		int data13 = computeDAO1.count13();
		int data14 = computeDAO1.count14();
		int data15 = computeDAO1.count15();
		int data16 = data13+data14+data15;
		//센터외
		int data17 = computeDAO1.count17();
		int data18 = computeDAO1.count18();
		int data19 = computeDAO1.count19();
		int data20 = data17+data18+data19;
		int data21 = computeDAO1.count21();
		int data22 = computeDAO1.count22();
		int data23 = computeDAO1.count23();
		int data24 = data21+data22+data23;
		//storage
		int data25 = computeDAO1.count25();
		int data26 = computeDAO1.count26();
		int data27 = computeDAO1.count27();
		//storage_노후장비
		int data28 = computeDAO1.count28();
		int data29 = computeDAO1.count29();
		int data30 = computeDAO1.count30();	
		
		req.setAttribute("data1", data1);
		req.setAttribute("data2", data2);
		req.setAttribute("data3", data3);
		req.setAttribute("data4", data4);
		req.setAttribute("data5", data5);
		req.setAttribute("data6", data6);
		req.setAttribute("data7", data7);
		req.setAttribute("data8", data8);
		req.setAttribute("data9", data9);
		req.setAttribute("data10", data10);
		req.setAttribute("data11", data11);
		req.setAttribute("data12", data12);
		req.setAttribute("data13", data13);
		req.setAttribute("data14", data14);
		req.setAttribute("data15", data15);
		req.setAttribute("data16", data16);
		req.setAttribute("data17", data17);
		req.setAttribute("data18", data18);
		req.setAttribute("data19", data19);
		req.setAttribute("data20", data20);
		req.setAttribute("data21", data21);
		req.setAttribute("data22", data22);
		req.setAttribute("data23", data23);
		req.setAttribute("data24", data24);
		req.setAttribute("data25", data25);
		req.setAttribute("data26", data26);
		req.setAttribute("data27", data27);
		req.setAttribute("data28", data28);
		req.setAttribute("data29", data29);
		req.setAttribute("data30", data30);
		
		return "/WEB-INF/views/page/support.jsp";		
		
	}
}
