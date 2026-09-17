package keysWordDriven;

public class saucedemoexecutor {
	saucedemokeyword s=new saucedemokeyword();
	public void sauceexecutor(String keyword) {
		if(keyword.equals("Launchbrowser"))
		{
			s.launchbrowser();
			
		}else if(keyword.equals("openurl"))
		{
			s.openurl();
		}
		else if(keyword.equals("username"))
		{
			s.username();
		}
		else if(keyword.equals("password"))
		{
			s.password();
		}
		else if(keyword.equals("login"))
		{
			s.login();
		}
		else if(keyword.equals("closebrowser"))
		{
			s.closeBrowser();
		}
	}

}
