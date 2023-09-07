package UserServices.service;

import java.util.List;

import UserServices.entity.User;

public interface UserService {
	
	//user operation 
	// It is interface so we can't write the body of any methods
	
	//create User
	User saveUser(User user);
	
	//getAllUser
	List<User> getAllUser();
	
	//get User By Id
	User getUser(String userId);
	
	//update User by ID
	
	User updateUser(String userId);
	
	//delete user by id
	void deleteUser(String userId);

}
