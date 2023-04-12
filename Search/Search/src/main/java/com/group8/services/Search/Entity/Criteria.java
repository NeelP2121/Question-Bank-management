package com.group8.services.Search.Entity;

import lombok.Data;

@Data
public class Criteria{
	private String field;
    private String data;

    public String getField(){
        return this.field;
    }

    public String getData(){
        return this.data;
    }
    public void setField(String field){
        this.field = field;
    }
    public void setData(String data){
        this.data = data;
    }

}