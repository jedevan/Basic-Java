package oop cagulada;

public class Person{

	String name;
	int age;
	
	void setName(String newName) {	
	this.name = newName
} 
	
	void setAge(int newAge){
	this.age = newAge
}
	String describe(){
	return"Name: " + name + ", Age: " + age;
	

}
}
