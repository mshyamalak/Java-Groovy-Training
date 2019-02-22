package com.tcs.ignio.groovy.programs

trait Shutdown{
	String shutdown(){
		"machine is shutting down";
	}
}
trait Restart{
	String restart(){
		"machine is restarting"
	}
}
class PowerServer{
	
}
def pServer = new PowerServer() as Shutdown;
println pServer.shutdown();
def ps = pServer as Restart;
println ps.restart();

//or
def nServer = new PowerServer();
def apis = nServer.withTraits(Shutdown,Restart)
println apis.shutdown();
println apis.restart();