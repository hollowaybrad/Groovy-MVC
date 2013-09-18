
class Customer {
	String fname
	String lname
}


Customer.metaClass.properties.each { p -> println "${p.name} = ${p.type}" }


