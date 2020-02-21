package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.LoginVO;


public class LoginDAO extends MybatisConnector {
	private final String namespace = "login";
	SqlSession sqlSession;

	
	private static LoginDAO instance = new LoginDAO();
	public static LoginDAO getInstance() {
		return instance;
	}
	
	public LoginVO selectLoginInfoByPK(String id, String pw) {
		sqlSession = sqlSession();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		try {
			return sqlSession.selectOne(namespace + ".selectLoginInfoByPK", map);
		} finally {
			sqlSession.close();
		}
	}	
}
