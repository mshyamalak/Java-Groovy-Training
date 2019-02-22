package com.tcs.ignio.groovy.programs

trait TestHelper{
	public static boolean called = false
	def static init(){
		called = true;
	}
}
class MachineTest implements TestHelper{
}
	println MachineTest.init();

