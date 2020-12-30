package userinterface;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.UserAuthentication;

public class Tester {
	static Log logger = LogFactory.getLog(Tester.class);
	
	public static void main(String[] args) {
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser(" ", "Asdf@123");
			//System.out.println("User has logged in successfully");
			logger.info("User has logged in successfully");
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
