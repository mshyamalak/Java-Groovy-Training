package com.tcs.ignio.usecase;

public class SQLRepository implements Repository{
	public String save(){
		return "save is called";
	}
	public String findAll(){
		return "find all is called";
		
	}
	public String findById(){
		return "find by id is called";
	}
	public String remove(){
		return "remove is called";

}
	public String update(){
		return "update is called";
}
	public String auth() {
		return " auth is called";
	}
	}