package KeyowrdFramworkImplemtation;

import keysWordDriven.saucedemoexecutor;

public class saucekeyword {
	public static void main(String[] args) throws InterruptedException {
		saucedemoexecutor s = new saucedemoexecutor();
		s.sauceexecutor("Launchbrowser");
		s.sauceexecutor("openurl");
		s.sauceexecutor("username");
		s.sauceexecutor("password");
		s.sauceexecutor("login");
		Thread.sleep(2000);
		s.sauceexecutor("closebrowser");
	}
	

}
