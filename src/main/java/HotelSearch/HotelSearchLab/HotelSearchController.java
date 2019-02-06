package HotelSearch.HotelSearchLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import HotelSearch.HotelSearchLab.Dao.HotelsDao;
import HotelSearch.HotelSearchLab.Entities.Hotel;

@Controller
public class HotelSearchController {

	@Autowired
	private HotelsDao hotelsDao;


//show form
@RequestMapping("/")
public ModelAndView indexpage() {
	return new ModelAndView("index");

}


@RequestMapping("/results")
public ModelAndView showList() {
	List<Hotel>allHotels = hotelsDao.findAll();
	ModelAndView mav = new ModelAndView("results", "hotels", allHotels);
//	mav.addObject("hotels", allHotels);
	return mav;
}

@PostMapping("/specific-results")
public ModelAndView showSpecificList(@RequestParam("city") String city) {
//	List<Hotel>HotelsByCity = hotelsDao.findByCity(city);
	List<Hotel>specificHotels = hotelsDao.findByCity(city);
	ModelAndView mav = new ModelAndView("specific-results");
	mav.addObject("hotels", specificHotels);
	return mav;
}




//Delete this?
//to show all:
//@RequestMapping("/results")
//public ModelAndView showList(@RequestParam("city") String city) {
//	List<Hotel>allHotels = hotelsDao.findAll();
//	ModelAndView mav = new ModelAndView("results");
//	mav.addObject("hotels", allHotels);
////	mav.addObject("hotels", allHotels);
//	return mav;
//} else {
//	return 
//}
//}





//@RequestMapping("/")
//public ModelAndView showIndexAgain() {
////	ModelAndView mav = new ModelAndView("index");
////	return mav;
//	return new ModelAndView("index");


}
