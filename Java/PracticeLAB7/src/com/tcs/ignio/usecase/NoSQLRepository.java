package com.tcs.ignio.usecase;

public class NoSQLRepository implements Repository {
	public String save() {
		return "NOSQL save is called";
	}

	public String findAll() {
		return "NOSQL find all is called";

	}

	public String findById() {
		return "NOSQL find by id is called";
	}

	public String remove() {
		return "NOSQL remove is called";

	}

	public String update() {
		return "NOSQL update is called";
	}
	public String auth() {
		return "NOSQL auth is called";
	}

}
