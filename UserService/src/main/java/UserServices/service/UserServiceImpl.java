package UserServices.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import UserServices.FeignClient.HotelInterface;
import UserServices.FeignClient.RatingInterface;
import UserServices.entity.Hotel;
import UserServices.entity.Rating;
import UserServices.entity.User;
import UserServices.exceptions.UserNotFoundException;
import UserServices.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	HotelInterface hotelInterface;
	
	@Autowired
	RatingInterface ratingInterface;
	
	//@Autowired
	 RestTemplate restTemplate = new RestTemplate();


	
	//private org.slf4j.Logger logger =LoggerFactory.getLogger(UserServiceImpl.class);
	 
	

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
		User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException());
		//http://localhost:8084/rating/user/bf6c08b1-b8f2-44d9-8d07-973cde311ea3  Rating URL
		//restTemplate.getForObject(url:"http://localhost:8083/user/1", ArrayList.class);
	//ArrayList<Rating> ratingUser=restTemplate.getForObject("http://localhost:8083/user/af1359f5-0a81-410c-8962-ea1975a3d0f0", ArrayList.class);
	
		Rating[] ratingUser = restTemplate.getForObject("http://localhost:8084/rating/user/"+user.getUserId(), Rating[].class);
		//logger.info("{}", ratingUser);
		List<Rating> ratingList = Arrays.stream(ratingUser).toList();
		//ResponseEntity<Rating> ratingUser = ratingInterface.getRating(user.getUserId());
		//List<ResponseEntity<Rating>> ratingList = Arrays.asList(ratingUser);
		//Collection<Rating> ratingList1 = (List<Rating>) ratingUser.getBody();
		//List<Rating> asList = Arrays.asList(((HttpEntity<Rating>) ratingList).getBody());
 		List<Rating> ratingHotel= ratingList.stream().map(rating-> {
		//Hotel forObject = restTemplate.getForObject("http://localhost:8082/hotel/"+ rating.getHotelId(), Hotel.class);
			ResponseEntity<Hotel> hotel = hotelInterface.getHotel(rating.getHotelId());
		//logger.info("{}", forObject);
		rating.setHotel(hotel.getBody());
		return rating;
		}
		).collect(Collectors.toList());
		
	user.setRatings((List<Rating>) ratingHotel);
		//http://localhost:8082/hotel/5e7522d0-c7ad-46c6-af90-70215af6d108   Hotel URL
		
		
		return user;
	
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
