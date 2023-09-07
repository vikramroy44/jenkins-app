package hotelServiceApp.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelServiceApp.Entity.Hotel;
import hotelServiceApp.Exceptions.ResourceNotFoundException;
import hotelServiceApp.Repository.HotelRepository;

@Service
public class HotelServiceImp implements HotelService{
   
	@Autowired
	private HotelRepository hotelRepository; 
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String Iduuid = UUID.randomUUID().toString();
		hotel.setHotelId(Iduuid);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel Not Found for ID: " + hotelId));
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	
	
	}


