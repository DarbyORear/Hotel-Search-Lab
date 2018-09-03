package HotelSearch.HotelSearchLab.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_listing", schema="hotelsdb")
public class Hotel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String name;
	@Column(name = "price_per_night")
	private Integer pricePerNight;
	
	public Hotel() {};
	
	public Hotel(Long id, String city, String name, Integer pricePerNight) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
		this.pricePerNight = pricePerNight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	

	
	}
	
 
	
