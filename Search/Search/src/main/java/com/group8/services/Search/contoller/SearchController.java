package com.group8.services.Search.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.group8.services.Search.service.SearchService;
import com.group8.services.Search.Entity.Item;
import com.group8.services.Search.Entity.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SearchController {
	
	@Autowired 
	private SearchService SearchService;

	@PostMapping("/Search")
	public List<Item> searchFunc(@RequestBody Criteria criteria){
		return SearchService.searchFunc(criteria);
	}
}
