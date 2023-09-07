package hotelServiceApp.Service;

import java.util.List;

import hotelServiceApp.Entity.Hotel;

public interface HotelService  {
	//Create Hotel
	Hotel saveHotel(Hotel hotel);
	
	//getHotel
   Hotel getHotelById(String hotelId);
   
   
   //getAll Hotel
  List<Hotel> getAllHotel();

}
