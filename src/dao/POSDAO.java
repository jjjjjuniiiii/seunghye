package dao;


import java.sql.Date;
import java.util.HashMap;
import java.util.List;


import org.apache.ibatis.session.SqlSession;

import model.POSVO;

public class POSDAO extends MybatisConnector {
	private final String namespace = "pos";
	SqlSession sqlSession;

	private static POSDAO instance = new POSDAO();
	public static POSDAO getInstance() {
		return instance;
	}
	
	//select
	public List selectPOSInfo() {
		sqlSession = sqlSession();
		try {
			return sqlSession.selectList(namespace + ".selectPOSInfo");
		} finally {
			sqlSession.close();
		}
	}	
	public List selectPOS2Info() {
		sqlSession = sqlSession();
		try {
			return sqlSession.selectList(namespace + ".selectPOS2Info");
		} finally {
			sqlSession.close();
		}
	}
	public List selectPOS_PDA1Info() {
		sqlSession = sqlSession();
		try {
			return sqlSession.selectList(namespace + ".selectPOS_PDA1Info");
		} finally {
			sqlSession.close();
		}
	}
	public List selectPOS_PDA2Info() {
		sqlSession = sqlSession();
		try {
			return sqlSession.selectList(namespace + ".selectPOS_PDA2Info");
		} finally {
			sqlSession.close();
		}
	}
	
	//insert
	public void insertPOS1(int sequence, String part, String approved_disuse, String large_category, 
			String small_category, String system, String using, String host_name, String manufacturer, 
			String model_name, String specification, int purchase_num, String install_name, int install_num, 
			Date start_date, String deterioration, int start_money, String place, String location,
			String status_progress, String contract_term, int month_money, String status_use, 
			String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence); 
		map.put("part", part);
		map.put("approved_disuse", approved_disuse);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		
		try {
			sqlSession.insert(namespace + ".insertPOS1", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}	
	public void insertPOS2(int sequence, String part, String approved_disuse, String large_category, 
			String small_category, String system, String using, String host_name, String manufacturer, 
			String model_name, String specification, int purchase_num, String install_name, int install_num, 
			Date start_date, String deterioration, int start_money, String place, String location,
			String status_progress, String contract_term, int month_money, String status_use, 
			String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence); 
		map.put("part", part);
		map.put("approved_disuse", approved_disuse);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		
		try {
			sqlSession.insert(namespace + ".insertPOS2", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void insertPOS3(int sequence, String part, String approved_disuse, String large_category, 
			String small_category, String system, String using, String host_name, String manufacturer, 
			String model_name, String specification, int purchase_num, String install_name, int install_num, 
			Date start_date, String deterioration, int start_money, String place, String location,
			String status_progress, String contract_term, int month_money, String status_use, 
			String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence); 
		map.put("part", part);
		map.put("approved_disuse", approved_disuse);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		
		try {
			sqlSession.insert(namespace + ".insertPOS3", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void insertPOS4(int sequence, String part, String approved_disuse, String large_category, 
			String small_category, String system, String using, String host_name, String manufacturer, 
			String model_name, String specification, int purchase_num, String install_name, int install_num, 
			Date start_date, String deterioration, int start_money, String place, String location,
			String status_progress, String contract_term, int month_money, String status_use, 
			String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence); 
		map.put("part", part);
		map.put("approved_disuse", approved_disuse);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);				
		try {
			sqlSession.insert(namespace + ".insertPOS4", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	//update
	//(1) disuse
	public void updateDisusePOS1(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.update(namespace + ".updateDisusePOS1", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}	
	public void updateDisusePOS2(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.update(namespace + ".updateDisusePOS2", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void updateDisusePOS3(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.update(namespace + ".updateDisusePOS3", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void updateDisusePOS4(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.update(namespace + ".updateDisusePOS4", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	//(2) update
	public void updatePOS1(int sequence, String large_category, String small_category, String system, String using, 
			String host_name, String manufacturer, String model_name, String specification, int purchase_num, 
			String install_name, int install_num, Date start_date, String deterioration, int start_money, 
			String place, String location, String status_progress, String contract_term, int month_money, 
			String status_use, String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		try {
			sqlSession.update(namespace + ".updatePOS1", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void updatePOS2(int sequence, String large_category, String small_category, String system, String using, 
			String host_name, String manufacturer, String model_name, String specification, int purchase_num, 
			String install_name, int install_num, Date start_date, String deterioration, int start_money, 
			String place, String location, String status_progress, String contract_term, int month_money, 
			String status_use, String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		try {
			sqlSession.update(namespace + ".updatePOS2", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void updatePOS3(int sequence, String large_category, String small_category, String system, String using, 
			String host_name, String manufacturer, String model_name, String specification, int purchase_num, 
			String install_name, int install_num, Date start_date, String deterioration, int start_money, 
			String place, String location, String status_progress, String contract_term, int month_money, 
			String status_use, String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		try {
			sqlSession.update(namespace + ".updatePOS3", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void updatePOS4(int sequence, String large_category, String small_category, String system, String using, 
			String host_name, String manufacturer, String model_name, String specification, int purchase_num, 
			String install_name, int install_num, Date start_date, String deterioration, int start_money, 
			String place, String location, String status_progress, String contract_term, int month_money, 
			String status_use, String disuse_or_recycling, String reason_disuse, String note, String unification, String EOS_end_date) {
		sqlSession = sqlSession();
		HashMap map = new HashMap();
		map.put("sequence", sequence);
		map.put("large_category", large_category); 
		map.put("small_category", small_category); 
		map.put("system", system);
		map.put("using", using);
		map.put("host_name", host_name);
		map.put("manufacturer", manufacturer);
		map.put("model_name", model_name);
		map.put("specification", specification);
		map.put("purchase_num", purchase_num);
		map.put("install_name", install_name);
		map.put("install_num", install_num);
		map.put("start_date", start_date);
		map.put("deterioration", deterioration);
		map.put("start_money", start_money);
		map.put("place", place);
		map.put("location", location);
		map.put("status_progress", status_progress);
		map.put("contract_term", contract_term);
		map.put("month_money", month_money);
		map.put("status_use", status_use);
		map.put("disuse_or_recycling", disuse_or_recycling);
		map.put("reason_disuse", reason_disuse);
		map.put("note", note);
		map.put("unification", unification);
		map.put("EOS_end_date", EOS_end_date);		
		try {
			sqlSession.update(namespace + ".updatePOS4", map);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	//delete
	public void deletePOS1(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.delete(namespace + ".deletePOS1", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void deletePOS2(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.delete(namespace + ".deletePOS2", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void deletePOS3(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.delete(namespace + ".deletePOS3", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public void deletePOS4(int sequence) {
		sqlSession = sqlSession();
		try {
			sqlSession.delete(namespace + ".deletePOS4", sequence);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	

	//count
	public int countPOS() {//sequence
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".countPOS");
		} finally {
			sqlSession.close();
		}
	}
	public int count1() {//data1_서버_NT
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count1");
		} finally {
			sqlSession.close();
		}
	}
	public int count2() {//data2_서버_UNIX
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count2");
		} finally {
			sqlSession.close();
		}
	}
	public int count3() {//data3_서버_LINUX
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count3");
		} finally {
			sqlSession.close();
		}
	}
	public int count5() {//data5_서버_NT_사용장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count5");
		} finally {
			sqlSession.close();
		}
	}
	public int count6() {//data6_서버_UNIX_사용장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count6");
		} finally {
			sqlSession.close();
		}
	}
	public int count7() {//data7_서버_LINUX_사용장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count7");
		} finally {
			sqlSession.close();
		}
	}
	public int count9() {//data9_서버_NT_유휴장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count9");
		} finally {
			sqlSession.close();
		}
	}public int count10() {//data10_서버_UNIX_유휴장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count10");
		} finally {
			sqlSession.close();
		}
	}public int count11() {//data11_서버_LINUX_유휴장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count11");
		} finally {
			sqlSession.close();
		}
	}
	//노후장비 count13~15
	public int count13() {//data13_서버_NT_노후장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count13");
		} finally {
			sqlSession.close();
		}
	}public int count14() {//data14_서버_UNIX_노후장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count14");
		} finally {
			sqlSession.close();
		}
	}
	public int count15() {//data15_서버_LINUX_노후장비
			sqlSession = sqlSession();
			try {
				return sqlSession.selectOne(namespace + ".count15");
			} finally {
				sqlSession.close();
			}
	}
	
	public int count17() {//data9_서버_NT_센터외
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count17");
		} finally {
			sqlSession.close();
		}
	}public int count18() {//data10_서버_UNIX_센터외
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count18");
		} finally {
			sqlSession.close();
		}
	}public int count19() {//data11_서버_LINUX_센터외
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count19");
		} finally {
			sqlSession.close();
		}
	}
	public int count21() {//data21_서버_NT_단일화
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count21");
		} finally {
			sqlSession.close();
		}
	}public int count22() {//data22_서버_UNIX_단일화
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count22");
		} finally {
			sqlSession.close();
		}
	}public int count23() {//data23_서버_LINUX_단일화
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count23");
		} finally {
			sqlSession.close();
		}
	}
	////storage
	public int count25() {//data25_storage
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count25");
		} finally {
			sqlSession.close();
		}
	}public int count26() {//data26_storage_사용장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count26");
		} finally {
			sqlSession.close();
		}
	}public int count27() {//data27_storage_유휴장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count27");
		} finally {
			sqlSession.close();
		}
	}
	//storage_노후장비
	public int count28() {//data27_storage_노후장비
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count28");
		} finally {
			sqlSession.close();
		}
	}
	public int count29() {//data29_storage_센터외
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count29");
		} finally {
			sqlSession.close();
		}
	}public int count30() {//data30_storage_단일화
		sqlSession = sqlSession();
		try {
			return sqlSession.selectOne(namespace + ".count30");
		} finally {
			sqlSession.close();
		}
	}
}
