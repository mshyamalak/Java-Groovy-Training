package com.tcs.ignio.groovy.programs

trait Server{
	String exec() {'server'}
}
trait Client {
	String exec(){
		'client'
	}
}
class ProxyMain implements Server,Client{
	
}
def xy = new ProxyMain();
println xy.exec();

