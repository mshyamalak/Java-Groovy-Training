package com.tcs.ignio.groovy.programs

import groovy.json.JsonSlurper

//json representation
def inputText = '{"name" : "Groovy" , "year" : 2005}'
//json into object
def slurper = new JsonSlurper();
def obj = slurper.parseText(inputText);
println obj

def sluperFile = new JsonSlurper();
def users = sluperFile.parse("new File(assests/users.json");
	user.each{
		user ->
		println $user.id $user.name
	}
