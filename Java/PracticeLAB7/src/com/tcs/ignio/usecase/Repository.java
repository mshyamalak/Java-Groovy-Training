package com.tcs.ignio.usecase;

public interface Repository extends Authentication {
	
//}
//interface FinderRepository{
	String findAll();
	String findById();
	String save();
//}
//interface RemoveRepository{
	String remove();
//}
//interface RemoveRepository{
	String update();

}
//public interface Repository extends SaveRepository, FinderRepository, RemoveRepository, RemoveRepository
