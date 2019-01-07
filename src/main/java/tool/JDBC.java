package tool;

import java.sql.*;

public class JDBC
{
	String				dbDriver	= "com.mysql.jdbc.Driver";
	String				url			= "jdbc:mysql://localhost:3306/erp_finance?useUnicode=true&characterEncoding=UTF-8";
	String				user		= "root";
	String				passWord	= "123456";

	public Connection	conn		= null;

	public JDBC()
	{
		try
		{
			Class.forName(dbDriver).newInstance();
			conn = DriverManager.getConnection(url, user, passWord);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
