package com.group8.services.QuestionPaperGen.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group8.services.QuestionPaperGen.Entity.Domain;
import com.group8.services.QuestionPaperGen.Entity.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionPaperRepository extends JpaRepository<Item, Integer> {

	//@Query("SELECT i.id as id, i.domain as domain, i.item_type as itemType, i.item_text as itemText, i.answer_key as answerKey, i.author as author, i.to_be_updated as toBeUpdated, i.to_be_deleted as toBeDeleted FROM Item i")
	@Query(value = "select * from ((select * from item where domain = :math limit :m) union all (select * from item where domain = :phy limit :p) union all (select * from item where domain = :chem limit :c)) t3;", nativeQuery = true) 
	List<Item> findByDomain(@Param("math") String math, @Param("m") int m, @Param("phy") String phy, @Param("p") int p, @Param("chem") String chem, @Param("c") int c);	
	
//	@Query(value = "SELECT * FROM Item WHERE ")
//	List<Item> findByMath()
}
