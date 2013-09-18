package groovyMVC.generators

import groovy.text.SimpleTemplateEngine


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

	print "Enter Model Name:"
	def modelName = br.readLine()

	println ""
	println "Generating ${modelName}Validator ...."

	def binding = [model:modelName]
	def templateFile = new File(".\\src\\main\\groovy\\groovyMVC\\templates\\test.template")
	def engine = new SimpleTemplateEngine()
	def template = engine.createTemplate(templateFile)
	def writable = template.make(binding)

	println ""
	println writable

	//	Write out the file
	File destFile = new File(".\\src\\main\\java\\groovyMVC\\validation\\${modelName}Validator.java")

	destFile.withWriter {Writer out ->
		writable.writeTo(out)
	}

