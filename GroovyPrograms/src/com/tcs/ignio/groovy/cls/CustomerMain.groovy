package com.tcs.ignio.groovy.cls

def customer =new Customer();
//customer.id=1;
//customer.fname="john";
//customer.lname="peter"
//customer.city = "chennai"
//
//println "id $customer.id"
//println "firstname $customer.fname"
//println "lastname $customer.lname"
//println "city $customer.city"

////////////////////////////////////////////////////////////////////

// no arg contructor
println "id $customer.id"
println "firstname $customer.fname"
println "lastname $customer.lname"
println "city $customer.city"

//4 args constructor

customer = new Customer(id:1, fname:'john', lname : 'peter', city:'chennai');
println "id $customer.id"
println "firstname $customer.fname"
println "lastname $customer.lname"
println "city $customer.city"

// 3 args
customer = new Customer(id:1, fname:'john', lname : 'peter');
customer.city='chennai'
println "id $customer.id"
println "firstname $customer.fname"
println "lastname $customer.lname"
println "city $customer.city"

// 2 args
customer = new Customer(id:1, fname:'john' );
customer.lname='peter'
customer.city='chennai'
println "id $customer.id"
println "firstname $customer.fname"
println "lastname $customer.lname"
println "city $customer.city"


