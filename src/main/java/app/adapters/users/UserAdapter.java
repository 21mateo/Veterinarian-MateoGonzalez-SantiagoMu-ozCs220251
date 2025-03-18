package app.adapters.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.user.entity.UserEntity;
import app.adapters.users.repository.UserRepository;
import app.domain.models.User;
import app.ports.UserPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class UserAdapter implements UserPort {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUserName(User user) throws Exception {
		UserEntity userEntity = userRepository.findByUserName(user.getUserName());
		if (userEntity == null){
			return null;
		}
		return userAdapter(userEntity);
	}


	@Override
	public boolean existsByUserName(String userName) throws Exception {
		return userRepository.existsByUserName(userName);
	}

	@Override
	public void createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	private User userAdapter(UserEntity userEntity) {
		if (userEntity == null) {
			return null;
		}
		User user = new User();
		user.setPersonId(userEntity.getPersonId().getPersonId());
		user.setDocument(userEntity.getPersonId().getDocument());
		user.setName(userEntity.getPersonId().getName());
		user.setUserName(userEntity.getUserName());
		user.setPassword(userEntity.getPassword());
		user.setRole(userEntity.getRole());
		user.setId(userEntity.getId());
		return user;
	}
	

}
