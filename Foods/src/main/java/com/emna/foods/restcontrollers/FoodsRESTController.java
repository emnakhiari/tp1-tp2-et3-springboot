package com.emna.foods.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.emna.foods.entities.Foods;
import com.emna.foods.service.FoodsService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FoodsRESTController {
	@Autowired
	FoodsService FoodsService;
	
	@RequestMapping(path = "all" , method = RequestMethod.GET)
	public List<Foods> getAllFoods() {
	return FoodsService.getAllFoods();
	}
	

	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Foods getFoodsById(@PathVariable("id") Long id) {
	return FoodsService.getFoods(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Foods createFoods(@RequestBody Foods Foods) {
	return FoodsService.saveFoods(Foods);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Foods updateFoods(@RequestBody Foods Foods) {
	return FoodsService.updateFoods(Foods);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFoods(@PathVariable("id") Long id)
	{
		FoodsService.deleteFoodsById(id);
	}
	
	@RequestMapping(value="/prodscat/{idTypes}",method = RequestMethod.GET)
	public List<Foods> getFoodsByCatId(@PathVariable("idTypes") Long idTypes) {
	return FoodsService.findByTypesIdTypes(idTypes);
	}
	
}
