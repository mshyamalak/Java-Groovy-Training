package com.tcs.ignio.groovy.programs

trait Filtering{
		StringBuilder append(String str){
			def subst= str.replace('o', ' ');
			super.append(subst);
		}
		String toString(){
			super.toString()
		}
}

def sb = new StringBuilder().withTraits(Filtering)
//println sb.append('groovy');
sb.append('groovy');
sb.append('groovy');
sb.append('groovy');
sb.append('groovy');

println sb.toString();