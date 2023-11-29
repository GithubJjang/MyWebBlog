package com.example.blog.Dummy;

import org.apache.commons.dbcp.BasicDataSource;

// 커넥션풀 테스트
public class dbcpTest {
	private static BasicDataSource dbcp = null;
	
	private dbcpTest() {
		
	}
	
	public BasicDataSource getInstance() {
		if(dbcp==null) {
			dbcp = new BasicDataSource();
			dbcp.setUrl(null);
			dbcp.setUsername(null);
			
		}
		return dbcp;
	}
}
