package com.group8.services.ItemBankCRUD.service;

import com.group8.services.ItemBankCRUD.Entity.Item;
import java.util.List;

public interface ItemService {
	 
    // Save operation
    Item saveItem(Item item);
 
    // Read operation
    List<Item> fetchItemList();
    
    // Get operation
    Item getItem(Integer itemId);
 
    // Update operation
    Item updateItem(Item item, Integer itemId);
 
    // Delete operation
    void deleteItemById(Integer itemId);
}
