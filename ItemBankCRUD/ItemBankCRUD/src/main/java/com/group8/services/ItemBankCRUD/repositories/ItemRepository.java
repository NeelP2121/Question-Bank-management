package com.group8.services.ItemBankCRUD.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group8.services.ItemBankCRUD.Entity.Item;
import org.springframework.stereotype.Repository;
import com.group8.services.ItemBankCRUD.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
}
