
package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomato.repository.ItemsRepository;
import com.thinkxfactor.zomato.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantRepository RestaurantRepository;
	private ItemsRepository ItemsRepository;

	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant rst) {
		Restaurant persistedrestaurant = RestaurantRepository.save(rst);
		return persistedrestaurant;
	}

	@PostMapping("/additems")
	public Items addItems(@RequestBody Items its) {
		Items persisteditems = ItemsRepository.save(its);
		return persisteditems;
	}

	@GetMapping("/getAll")
	public List<Restaurant> getAll()

	{
		List<Restaurant> listofrestaurants = RestaurantRepository.findAll();
		return listofrestaurants;
	}

	@GetMapping("/getItems")
	public List<Items> getAllItems()

	{
		List<Items> listofitems = ItemsRepository.findAll();
		return listofitems;
	}
}
