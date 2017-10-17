package kr.co.jhta.school.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisUtils {
	
	private static SqlMapClient sqlMapClient;
	
	static{
		try{
			Reader reader = Resources.getResourceAsReader("kr/co/jhta/school/config/SqlMapConfig.xml");
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}
}
