package UserServices.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "micro_users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name= "ID")
	//private String userId;
	private String userId;
	
	@Column(name = "NAME", length = 25)
	private String name;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name= "ABOUT")
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList();
	//private List<Rating> ratings;
	
	
	

}
