package UserServices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import UserServices.entity.Hotel;

@FeignClient(name="Hotel-Service")
public interface HotelInterface {
	
	@GetMapping("/hotel/{hotelId}")
    ResponseEntity<Hotel> getHotel(@PathVariable("hotelId") String hotelId);
	

}
