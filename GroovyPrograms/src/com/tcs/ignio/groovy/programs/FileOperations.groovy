package com.tcs.ignio.groovy.programs

//how to read file content
try{
	def file = new File("assests/greetings.txt");
	file.eachLine { println "$it"}
}
catch(e){
	println "${e.getMessage()}"
	println " file not found "
}
// how to access all files from the dir
def dir = new File(/c:\/)
	//dir.eachFile{file ->
		//println file.name
	//}

println "text files only"
dir.eachFileMatch(~/.*\.txt/) { file ->
	println file.name
}
//write content into files
new File('assests/quote.txt').withWriter('utf-8') { writer ->
	writer.writeLine 'groovy is easy'
	writer.writeLine 'java is core'
	writer.writeLine 'kotin is easy'
}
try{
	def src = new File("assests/quotes.txt");
	def dst = new File("assests/quotescopy.txt");
	//copy
	dst << src.text
}
catch(e){
	println " copy failed ${e.getMessage()}"
}
///windows
def process = "powershell dir".execute() //process object
println "${process.txt}";

//get free space on disk
 def diskFreeProcess = "powershell Get-PSDrive".execute()
 def outputtext = diskFreeProcess.