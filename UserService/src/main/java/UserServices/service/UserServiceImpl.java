package UserServices.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserServices.entity.User;
import UserServices.exceptions.UserNotFoundException;
import UserServices.repository.UserRepository;
import UserServices.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		//String userUUId = UUID.randomUUID().toString();
		//user.setUserId(userUUId);
		
		// TODO Auto-generated method stub
		return userRepository.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException());
	}

	@Override
	public User updateUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.save(userId);
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		
	}

}
