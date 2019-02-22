package com.tcs.ignio.usecase;

public class CustomerService {
	
	private Repository repository;
	
	public CustomerService(){
		
	}
	

	public CustomerService(Repository repository) {
	
		this.repository = repository;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	public String save() {
		return repository.save();
	}

	public String findAll() {
		return repository.findAll();

	}

	public String findById() {
		return repository.findById();
	}

	public String remove() {
		return repository.remove();

	}

	public String update() {
		return repository.update();
		
	}
	public String auth() {
		return repository.auth();
	}
}
