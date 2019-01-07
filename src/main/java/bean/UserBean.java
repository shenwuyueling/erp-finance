package bean;

public class UserBean
{

	private int    userId   = -1;
	private String passWord = "";
	private String userName = "";
	private int    status   = -1;
	boolean        flag     = false;

	public UserBean()
	{
		userId = 0;
		passWord = "";
		userName = "";
		status = -1;
	}

	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getPassWord()
	{
		return passWord;
	}
	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
	{
		this.status = status;
	}
	public boolean isFlag()
	{
		return flag;
	}
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
}
