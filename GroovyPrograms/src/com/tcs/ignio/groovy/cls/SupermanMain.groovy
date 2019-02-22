package com.tcs.ignio.groovy.cls

def superMan = new SuperMan
(fname: 'john',lname : 'peter');

println "$superMan.fname $superMan.lname"
println "${superMan.count()}";