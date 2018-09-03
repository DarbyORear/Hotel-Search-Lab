package HotelSearch.HotelSearchLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public ModelAndView showList(@RequestParam("city") String city) {
	List<Hotel>allHotels = hotelsDao.findAll();
	ModelAndView mav = new ModelAndView("results", "hotels", allHotels);
	mav.addObject("city", city);
//	mav.addObject("hotels", allHotels);
	return mav;
}



@RequestMapping("/goback")
public ModelAndView showIndexAgain() {
//	ModelAndView mav = new ModelAndView("index");
//	return mav;
	return new ModelAndView("index");

}

}
