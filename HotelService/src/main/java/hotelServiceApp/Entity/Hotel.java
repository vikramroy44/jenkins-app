package hotelServiceApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@Column(name="ID")
	private String hotelId;
	
	@Column(name="NAME", length= 30)
	private String hotelName;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="ABOUT")
	private String about;

}
