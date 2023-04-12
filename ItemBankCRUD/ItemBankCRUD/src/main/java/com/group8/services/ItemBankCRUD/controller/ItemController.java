package com.group8.services.ItemBankCRUD.controller;


//import com.group8.services.ItemBankCRUD.Entity.Item;
import java.util.List;

import javax.validation.Valid;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group8.services.ItemBankCRUD.Entity.Item;
import com.group8.services.ItemBankCRUD.service.ItemService;
 
// Annotation
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ItemController {
 
    // Annotation
    @Autowired private ItemService ItemService;
 
    
    // Save operation
    @PostMapping("/Items")
    public Item saveItem(@Valid @RequestBody Item Item)
    {
        return ItemService.saveItem(Item);
    }
 
    // Read operation
    @GetMapping("/Items")
    public List<Item> fetchItemList()
    {
    	//model.put("listUser", ItemService.fetchItemList());
    	//return "item-form";
        return ItemService.fetchItemList();
    }
    
    @GetMapping("/Items/{id}")
    public Item getItem(@PathVariable("id") Integer ItemId) {
    	Item itemFromDB = ItemService.getItem(ItemId);
    	return itemFromDB;
    }
 
    // Update operation
    @PutMapping("/Items/{id}")
    public Item updateItem(@RequestBody Item Item, @PathVariable("id") Integer ItemId)
    {
    	System.out.print("Hello");
        Item updated = ItemService.updateItem(Item, ItemId);
        System.out.print(updated);
        return updated;
    }
 
    // Delete operation
    @DeleteMapping("/Items/{id}")
    public String deleteItemById(@PathVariable("id")
                                       Integer ItemId)
    {
        ItemService.deleteItemById(ItemId);
        return "Deleted Successfully";
    }
}
