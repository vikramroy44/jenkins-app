package UserServices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import UserServices.entity.Rating;

@FeignClient(name="Rating-Service")
public interface RatingInterface {
	@GetMapping("/rating/user/{userId}")
    // getRating(@PathVariable("userId") String userId);
	ResponseEntity<Rating> getRating(@PathVariable("userId") String userId);

}
