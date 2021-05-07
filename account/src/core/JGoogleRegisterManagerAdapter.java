package core;

import jgoogle.JGoogleRegisterManager;

public class JGoogleRegisterManagerAdapter implements RegisterService {

	@Override
	public void register(String email, String password) {
		
		JGoogleRegisterManager googleRegisterManager = new JGoogleRegisterManager();
		googleRegisterManager.register(email, password);
	}
	
	
}
