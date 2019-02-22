package com.tcs.ignio.groovy.cls

def emp = new EmpInherit(id:1, fname:'john', salary:1583.464)
println "$emp.id $emp.fname $emp.salary"
 def cust = new CustInherit(custid:12, fname:'john', invoice : 6546.656)
 println "$cust.custid, $cust.fname, $cust.invoice"