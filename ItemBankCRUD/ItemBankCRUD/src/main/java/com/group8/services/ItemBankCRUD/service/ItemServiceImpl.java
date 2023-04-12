package com.group8.services.ItemBankCRUD.service;

import com.group8.services.ItemBankCRUD.Entity.Item;
import com.group8.services.ItemBankCRUD.repositories.ItemRepository;
//Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Annotation
@Service

//Class
public class ItemServiceImpl  implements ItemService {
 @Autowired
 private ItemRepository ItemRepository;

 // Save operation
 @Override
 public Item saveItem(Item Item)
 {
     return ItemRepository.save(Item);
 }

 // Read operation
 @Override 
 public List<Item> fetchItemList()
 {
     return (List<Item>) ItemRepository.findAll();
 }
 
 // Get operation
 @Override
 public Item getItem(Integer itemId) {
	 return ItemRepository.findById(itemId).get();
 }

 // Update operation
 @Override
 public Item updateItem(Item item, Integer itemId){
     Item itemDB = ItemRepository.findById(itemId).get();
     //System.out.println(itemDB);
     if (Objects.nonNull(item.getDomain()) && !"".equalsIgnoreCase(item.getDomain())) {
    	 itemDB.setDomain(item.getDomain());
     }
     
     if (Objects.nonNull(item.getAnswerKey()) && !"".equalsIgnoreCase(item.getAnswerKey())) {
    	 itemDB.setAnswerKey(item.getAnswerKey());
     }
     
     if (Objects.nonNull(item.getAuthor()) && !"".equalsIgnoreCase(item.getAuthor())) {
    	 itemDB.setAuthor(item.getAuthor());
     }
     
     
     if (Objects.nonNull(item.getItemText()) && !"".equalsIgnoreCase(item.getItemText())) {
    	 itemDB.setItemText(item.getItemText());
     }
     

     if (Objects.nonNull(item.getItemType()) && !"".equalsIgnoreCase(item.getItemType())) {
    	 itemDB.setItemType(item.getItemType());
     }
     

     if (Objects.nonNull(item.isToBeDeleted())) {
    	 itemDB.setToBeDeleted(item.isToBeDeleted());
     }
     
     if (Objects.nonNull(item.isToBeUpdated())) {
    	 itemDB.setToBeUpdated(item.isToBeUpdated());
     }
    
    
     
//     if (Objects.nonNull(item.getItemName()) && !"".equalsIgnoreCase(item.getItemName())) {
//         itemDB.setItemName(item.getItemName());
//     }
//
//     if (Objects.nonNull(
//             Item.getItemAddress())
//         && !"".equalsIgnoreCase(
//             Item.getItemAddress())) {
//         depDB.setItemAddress(
//             Item.getItemAddress());
//     }
//
//     if (Objects.nonNull(Item.getItemCode())
//         && !"".equalsIgnoreCase(
//             Item.getItemCode())) {
//         depDB.setItemCode(
//             Item.getItemCode());
//     }

     return ItemRepository.save(itemDB);
     //System.out.print(newItem);
     //return newItem;
 }

 // Delete operation
 @Override
 public void deleteItemById(Integer ItemId)
 {
     ItemRepository.deleteById(ItemId);
 }
}
