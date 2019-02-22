package com.tcs.ignio.groovy.cls

class NamedTrait {
	trait FlyingAbility{
		private def getFlyMessage(){
			"i m flying"
		}
		String fly(){
			getFlyMessage();
		}
	}



}
