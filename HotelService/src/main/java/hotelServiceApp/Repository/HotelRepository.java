package hotelServiceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hotelServiceApp.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
