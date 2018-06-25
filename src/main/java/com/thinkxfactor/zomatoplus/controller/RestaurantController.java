package com.thinkxfactor.zomatoplus.controller;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;



	@RestController
	@RequestMapping("/restaurant")
	public class RestaurantController {
	 
		List<Restaurant>  rsts =  new ArrayList();
			List<Items> itss=new ArrayList();
			 
			
		@PostMapping("/create")
		public Restaurant  createRestaurant(@RequestParam("id") String id,@RequestParam("name") String name,
				@RequestParam("address") String address,
		@RequestParam("phno") String phno,
@RequestParam("rating") String rating,
@RequestParam("pay_method") String pay_method){
			Restaurant rst= new Restaurant(id,name,address,phno,rating,pay_method);
		/*	Restaurant rst1,rst2,rst3;
			rst1=new Restaurant("1","Papaya","Park Street","9073707070","five","online");
			rst2=new Restaurant("2","Peshawri","JBS Haldane Avenue","033 30991211","four","online");
		    rst3=new Restaurant("3","Chilis","South City","033 30990321","five","cash");
			rsts.add(rst3);
			rsts.add(rst1);
			rsts.add(rst2)*/;	
			rsts.add(rst);
			return rst;
		}
@GetMapping("/getall")
public List<Restaurant> RestaurantList() {
	
	
	return rsts;
}
@PostMapping("/additems")
public List<Items>  addItems(@RequestParam("id") String id ,
		@RequestParam("starter") String starter,
@RequestParam("m_course")String m_course,
@RequestParam("dessert") String dessert) {
  Items it= new Items(id,starter,m_course,dessert);
/*  Items it1=new Items("1","soup","rice","souffle");
  Items it2=new Items("2","pakora","sizzler","ice-cream");
  Items it3=new Items("3","salad","Chapatti","smoothie");
	itss.add(it2);
	itss.add(it3);
	itss.add(it1);*/
  itss.add(it);
	return itss;
}
	
}

