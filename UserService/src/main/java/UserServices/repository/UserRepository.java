package UserServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserServices.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User save(String userId);
	
	//we can write Customer query here

}
