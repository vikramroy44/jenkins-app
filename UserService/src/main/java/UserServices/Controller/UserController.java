package UserServices.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UserServices.entity.User;
import UserServices.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	//create user
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user ){
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	
	
	//get user
	@GetMapping("/{userId}")
	@CircuitBreaker(name="ratingHotelCircuitB", fallbackMethod = "ratingHotelFallBack")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	public  ResponseEntity<User> ratingHotelFallBack(String userId, Exception ex) {
		logger.info("FallBack Method Callled :" + ex.getMessage());
		System.out.println("*** Fall BACK Method Called");
		
	   User user = User.builder().userId("12345")
			   .email("FallBack@Gmail.com")
			   .name("ABCD Dummy").about("Fall Back Reached").build();
		
		//return  ResponseEntity.ok().body(user);
	   return new ResponseEntity<User>(user, HttpStatus.OK);
		
	}
	
	
	//getAll user
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}

}
