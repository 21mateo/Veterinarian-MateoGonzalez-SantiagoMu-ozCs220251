package app.service.interfaces;

import app.domain.models.user;

public interface loginService {
	public void login(user User) throws Exception;
	public void logout();

}
