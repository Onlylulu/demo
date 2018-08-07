package cn.my12306.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
		//驱动
		private static final String driver="com.mysql.jdbc.Driver";
		//地址
		private static final String url="jdbc:mysql://localhost:3306/my12306?ssl=true&useUnicode=true&characterEncoding=utf-8";
		//用户
		private static final String user="root";
		//密码
		private static final String pwd="123456";
		
	//连接数据库
	public static Connection getconn(){
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, pwd);
			
			//连接池
//			Context context=new InitialContext();
//			DataSource ds=(DataSource)context.lookup("java:comp/env/my12306");
//			conn=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//增删改
	public static int executeUpdate(String sql,Object[] objs){
		int rs=-1;
		Connection conn=null;
		PreparedStatement stat=null;
		try {
			conn=BaseDao.getconn();
			stat=conn.prepareStatement(sql);
			if(objs!=null){
				for (int i = 0; i < objs.length; i++) {
					stat.setObject(i+1, objs[i]);
				}
			}
			rs=stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(null, stat, conn);
		}
		return rs;
	}
	//查询
	public static ResultSet executeQuery(String sql,Object[] objs){
		Connection conn=null;
		PreparedStatement stat=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getconn();
			stat=conn.prepareStatement(sql);
			if(objs!=null){
				for (int i = 0; i < objs.length; i++) {
					stat.setObject(i+1, objs[i]);
				}
			}
			rs=stat.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	//释放资源（rs，stat，conn）
	public static void getclose(ResultSet rs,Statement stat,Connection conn){
		
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(stat!=null){
				stat.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//释放资源rs
	public static void getclose(ResultSet rs){
		Statement stat=null;
		Connection conn=null;
		try {
			stat=rs.getStatement();
			conn=stat.getConnection();
			
			BaseDao.getclose(rs, stat, conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

