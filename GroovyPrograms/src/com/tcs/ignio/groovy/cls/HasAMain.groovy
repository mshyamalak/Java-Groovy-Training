package com.tcs.ignio.groovy.cls
 
def employee =new Employee(id:1,name:'john',address:new Address(doorno:10, street: '12th cross', city:'chennai'));
println "$employee.id $employee.name $employee.address.city $employee.address.doorno, $employee.address.street"