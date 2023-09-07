package ratingsApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ratingsApp.RatingServiceApplication;
import ratingsApp.Entity.Rating;
import ratingsApp.Repository.RatingRepository;

@Service
public class RatingServiceImp implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.getByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.getByHotelId(hotelId);
	}
	

}
