package app.service.interfaces;

import app.domain.models.User;

public interface loginService {
	public void login(User User) throws Exception;
	public void logout();

}
