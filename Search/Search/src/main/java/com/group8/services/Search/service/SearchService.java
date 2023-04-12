package com.group8.services.Search.service;

//import java.util.Map;
import java.util.List;

import com.group8.services.Search.Entity.Criteria;
import com.group8.services.Search.Entity.Item;

public interface SearchService {
	
	public List<Item> searchFunc(Criteria criteria);
}
