package ratingsApp.Service;

import java.util.List;

import ratingsApp.Entity.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	//getAllge
	List<Rating> getAll();
	
	//getAll by userId
	List<Rating> getByUserId(String userId);
	
	//get All by HotelId
	
	List<Rating> getByHotelId(String hotelId);

}
