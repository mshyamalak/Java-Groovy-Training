package com.tcs.ignio.groovy.programs

def factorial
factorial = {int n, def accu =1G ->
	if(n<2) return accu
	factorial.trampoline(n-1,n*accu)
}
factorial = factorial.trampoline()
//factorial = factorial
println factorial(1000)

