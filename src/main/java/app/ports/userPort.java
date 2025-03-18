package app.ports;

import app.domain.models.User;

public interface UserPort {
	public User findByUserName(User user) throws Exception;
	public boolean existsByUserName(String userName) throws Exception;
	public void createUser(User user) throws Exception;

}
