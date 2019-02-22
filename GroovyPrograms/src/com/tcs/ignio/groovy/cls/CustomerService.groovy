package com.tcs.ignio.groovy.cls

class CustomerService {
	//postional parameters
	def save(int id, String name){
		"$id $name"
	}
	//named parameters
	def find(Map args){
		args
	}
	//named + postional parameters
	def findAll(Map args, Integer key){
		"$args-$key"
	}
	
}
