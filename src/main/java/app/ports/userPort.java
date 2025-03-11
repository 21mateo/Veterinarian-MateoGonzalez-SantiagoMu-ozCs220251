package app.ports;

import app.domain.models.user;

public interface userPort {
	public user findByUserName(user User) throws Exception;
	public boolean existsByUserName(user User) throws Exception;
	public void createUser(user User) throws Exception;

}
