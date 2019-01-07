package dao;

import java.sql.*;

import bean.UserBean;
import tool.JDBC;

public class UserDAO
{
	private Connection        conn = null;
	private PreparedStatement ps   = null;
	private JDBC              jdbc = null;

	public UserDAO()
	{
		jdbc = new JDBC();
		conn = jdbc.conn;
	}
	public UserBean getUserById(int userId)
	{
		String sql = "select * from userinfo where userId = 1";
		ResultSet rs = null;
		UserBean user = null;

		try
		{
			ps = conn.prepareStatement(sql);
//			ps.setInt(1, userId);
			rs = ps.executeQuery();

			while (rs.next())
			{
				user = new UserBean();
				user.setUserId(rs.getInt(1));
				user.setPassWord(rs.getString(2));
				user.setUserName(rs.getString(3));
				user.setStatus(rs.getInt(4));
				user.setFlag(true);
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
}
