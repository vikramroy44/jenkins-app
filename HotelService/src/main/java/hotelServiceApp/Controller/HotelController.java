package hotelServiceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;
import hotelServiceApp.Entity.Hotel;
import hotelServiceApp.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	
	@PostMapping
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		
	       Hotel saveHotel = hotelService.saveHotel(hotel);
	       
	       return ResponseEntity.status(HttpStatus.CREATED).body(saveHotel);
		
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
		
		//return new ResponseEntity<Hotel>(hotelService.getHotelById(hotelId), HttpStatus.OK);
		
		return ResponseEntity.ok(hotelService.getHotelById(hotelId));
		
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> allHotel = hotelService.getAllHotel();
		//return new ResponseEntity<Hotel>(HttpStatus.OK);
		return ResponseEntity.ok(allHotel);
	}

}
