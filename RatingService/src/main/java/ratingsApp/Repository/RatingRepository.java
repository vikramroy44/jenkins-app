package ratingsApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ratingsApp.Entity.Rating;

public interface RatingRepository  extends JpaRepository<Rating, String>{
	
	List<Rating> getByUserId(String userId);
	List<Rating> getByHotelId(String hotelId);

}
