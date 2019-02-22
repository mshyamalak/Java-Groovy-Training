package com.tcs.ignio.groovy.cls

def greeter = new SystemGreeter() as Greeter

println greeter.greet('john')
println greeter.shutdown();
