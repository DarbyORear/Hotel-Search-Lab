package HotelSearch.HotelSearchLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import HotelSearch.HotelSearchLab.Dao.HotelsDao;

@Controller
public class HotelSearchController {

	@Autowired
	private HotelsDao hotelsDao;


//show form
@RequestMapping("/")
public ModelAndView indexpage() {
//	ModelAndView mav = new ModelAndView("index");
//	return mav;
	return new ModelAndView("index");

}

@RequestMapping("/results")
public ModelAndView resultspage() {
//	ModelAndView mav = new ModelAndView("index");
//	return mav;
	return new ModelAndView("results");

}
//@RequestMapping("/food")
//public ModelAndView listFood(
//		@RequestParam(value="keyword", required=false) String keyword,
//		@RequestParam(value="category", required=false) String category) {
//	ModelAndView mav = new ModelAndView("list-food");
//	if (keyword != null && !keyword.isEmpty()) {
//		mav.addObject("foods", foodDao.findByKeyword(keyword));
//	} else if (category != null && !category.isEmpty()) {
//		mav.addObject("foods", foodDao.findByCategory(category));
//	} else {
//		mav.addObject("foods", foodDao.findAll());
//	}
//	// list of categories needed for <select>
//	mav.addObject("categories", foodDao.findAllCategories());
//	return mav;
//}
//
//@RequestMapping("/food/create")
//public ModelAndView showCreateForm() {
//	// If there is only one model value to add, use this one-line shortcut. Equivalent to
//	// ModelAndView mav = new ModelAndView("food-form");
//	// mav.addObject("title", "Add a Food");
//	return new ModelAndView("food-form", "title", "Add a Food");
//}
//
//@RequestMapping(value="/food/create", method=RequestMethod.POST)
//public ModelAndView submitCreateForm(Food food) {
//	foodDao.create(food);
//	return new ModelAndView("redirect:/food");
//}
//
//// path variable required to identify which food we're editing
//@RequestMapping("/food/{id}/update")
//public ModelAndView showEditForm(@PathVariable("id") Long id) {
//	ModelAndView mav = new ModelAndView("food-form");
//	mav.addObject("food", foodDao.findById(id));
//	mav.addObject("title", "Edit Food");
//	return mav;
//}
//
//// same URL but different method
//@RequestMapping(value="/food/{id}/update", method=RequestMethod.POST)
//public ModelAndView submitEditForm(Food food, @PathVariable("id") Long id) {
//	food.setId(id);
//	foodDao.update(food);
//	return new ModelAndView("redirect:/food");
//}
//
//@RequestMapping("/food/{id}/delete")
//public ModelAndView delete(@PathVariable("id") Long id) {
//	foodDao.delete(id);
//	return new ModelAndView("redirect:/food");
//}

//public List<Hotel> listHotels(@RequestParam(value = "name", required = false) String name) {
//	
//	if (name != null && !name.isEmpty()) {
//		return hotelsDao.findByName(name);
//	} else {
//	return hotelsDao.findAll();
//	}
//	

}
