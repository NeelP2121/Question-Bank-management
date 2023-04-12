package com.group8.services.Search.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group8.services.Search.Entity.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<Item, Integer> {

	//@Query("SELECT i.id as id, i.domain as domain, i.item_type as itemType, i.item_text as itemText, i.answer_key as answerKey, i.author as author, i.to_be_updated as toBeUpdated, i.to_be_deleted as toBeDeleted FROM Item i")
	@Query(value = "select * from item where domain = :data ;", nativeQuery = true) 
	List<Item> findByDomain(@Param("data") String data);
	
	@Query(value = "select * from item where author = :data ;", nativeQuery = true)
	List<Item> findByAuthor(@Param("data") String data);

	@Query(value = "select * from item where item_text = :data ;", nativeQuery = true)
	List<Item> findByItemText(@Param("data") String data);	
	
//	@Query(value = "SELECT * FROM Item WHERE ")
//	List<Item> findByMath()
}
