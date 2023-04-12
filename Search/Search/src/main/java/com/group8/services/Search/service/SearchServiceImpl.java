package com.group8.services.Search.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group8.services.Search.Entity.Criteria;
import com.group8.services.Search.Entity.Item;
import com.group8.services.Search.repositories.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchRepository SearchRepository;
	
	@Override
	public List<Item> searchFunc(Criteria criteria){
		List<Item> mathqsns;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("field = " + criteria.getField() + " data = " + criteria.getData() );
//		System.out.println("hello " + criteria.getField().equals("Author"));
		if(criteria.getField().equals("Domain")){
			mathqsns =  SearchRepository.findByDomain(criteria.getData());
		}
		else if(criteria.getField().equals("Author")){
			mathqsns = SearchRepository.findByAuthor(criteria.getData());
		}
		else {
			mathqsns = SearchRepository.findByItemText(criteria.getData());
		}
		
		return mathqsns;
	}
}
