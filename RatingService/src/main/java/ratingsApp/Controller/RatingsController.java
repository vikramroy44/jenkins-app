package ratingsApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ratingsApp.Entity.Rating;
import ratingsApp.Service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingsController {
	
	@Autowired
	private RatingService ratingService;
	
	//create
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating rating2 = ratingService.create(rating);
		return  ResponseEntity.status(HttpStatus.CREATED).body(rating2);
		
	}
	
	//getAll ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating(){
		
		return ResponseEntity.ok(ratingService.getAll());
	}
	
	//get ratings by Hotel Id
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getByHotelId(hotelId));
		
	}
	
	//get Ratings By User ID
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		
		return ResponseEntity.ok(ratingService.getByUserId(userId));
	}
	

}
