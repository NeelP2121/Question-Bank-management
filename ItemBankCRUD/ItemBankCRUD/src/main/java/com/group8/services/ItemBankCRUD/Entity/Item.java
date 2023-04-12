package com.group8.services.ItemBankCRUD.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
    private String domain; // question domain
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getAnswerKey() {
		return answerKey;
	}
	public void setAnswerKey(String answerKey) {
		this.answerKey = answerKey;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isToBeUpdated() {
		return toBeUpdated;
	}
	public void setToBeUpdated(boolean toBeUpdated) {
		this.toBeUpdated = toBeUpdated;
	}
	public boolean isToBeDeleted() {
		return toBeDeleted;
	}
	public void setToBeDeleted(boolean toBeDeleted) {
		this.toBeDeleted = toBeDeleted;
	}
	private String itemType; // question type - example mcq, ... enums
    private String itemText; // question text
    private String answerKey; // answer key for the question object
    private String author;
    private boolean toBeUpdated;
    private boolean toBeDeleted;
}
