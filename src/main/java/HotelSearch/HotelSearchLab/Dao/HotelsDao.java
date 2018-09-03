package HotelSearch.HotelSearchLab.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import HotelSearch.HotelSearchLab.Entities.Hotel;

@Repository
@Transactional
public class HotelsDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Hotel> findAll() {
		// TODO Auto-generated method stub
		//you speak like java (not like sql) when you talk to hibernate or jpa (which is why "Product" is capitalized
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}

	public Hotel findById(Long id){
		return em.find(Hotel.class, id);

	}

	//this is the method that does the actual search on the database by name
	public List<Hotel> findByName(String name) {
		
		return em.createQuery("from Hotel where name like :n", Hotel.class)
				.setParameter("n", "%" + name + "%")
				.getResultList();
	}
	
	//this is the method that does the actual search on the database by name
	public List<Hotel> findByCity(String city) {
		
		return em.createQuery("from Hotel where name : cityName", Hotel.class)
				.setParameter("cityName", city)
				.getResultList();
	}
	
	public void create(Hotel hotel) {
		em.persist(hotel);
	}
	
	public void update(Hotel hotel) {
		em.merge(hotel);
	}
	
//	public void delete(Long id) {
//		// Deleting with Hibernate entity manager requires fetching a reference first.
//		Hotel hotel = em.getReference(Hotel.class, id);
//		em.remove(hotel);
//	}


}
