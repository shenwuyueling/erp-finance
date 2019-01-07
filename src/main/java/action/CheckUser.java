package action;

import bean.UserBean;
import dao.UserDAO;

public class CheckUser
{
	private UserBean user = null;
	private boolean  flag = false;

	public CheckUser(int userId, String passWord)
	{
		UserDAO userdao = new UserDAO();
		user = userdao.getUserById(userId);

		this.flag = passWord.equals(user.getPassWord()) && user.isFlag();
	}
	public boolean isFlag()
	{
		return flag;
	}
	public UserBean getUser()
	{
		return user;
	}
}
