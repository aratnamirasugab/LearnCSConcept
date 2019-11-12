Class vs Interface : mirip tapi tidak serupa

Class : Sebuah blueprint atau prototipe in which simillar to real object.
-> memiliki attributes
-> access modifier/specifier
-> class name
-> methods
-> constructor
-> interface(bisa jadi)
-> superclass(bisa jadi)
-> body

>Constructor pada class digunakan untuk meninisiasi terbentuknya sebuah object baru hasil dari blueprint si class
>Attributes/fields pada class adalah state/sifat/variabel yang akan membentuk sebuah object
>Methods digunakan untuk mengimpelemtasikan sifat dari sebuah class.
// Java program to demonstrate Class 
// Class Declaration 
public class Dog { 

	// Instance Variables 
	String name; 
	String breed; 
	int age; 
	String color; 

	// Constructor Declaration of Class 
	public Dog(String name, String breed, 
			int age, String color) 
	{ 
		this.name = name; 
		this.breed = breed; 
		this.age = age; 
		this.color = color; 
	} 

	// method 1 
	public String getName() 
	{ 
		return name; 
	} 

	// method 2 
	public String getBreed() 
	{ 
		return breed; 
	} 

	// method 3 
	public int getAge() 
	{ 
		return age; 
	} 

	// method 4 
	public String getColor() 
	{ 
		return color; 
	} 

	@Override
	public String toString() 
	{ 
		return ("Hi my name is "
				+ this.getName() 
				+ ".\nMy breed, age and color are "
				+ this.getBreed() + ", "
				+ this.getAge() + ", "
				+ this.getColor()); 
	} 

	public static void main(String[] args) 
	{ 
		Dog tuffy = new Dog("tuffy", "papillon", 
							5, "white"); 
		System.out.println(tuffy.toString()); 
	} 
} 


Interface : Sebuah interface mempunyai methods dan variabel tapi interface hanya dalam bentuk abstract.
->Sebuah interface menspesifikasikan sebuah class harus apa dan tidak
->Sebuah blueprint methods yang akan diimplements kedalam sebuah class. misalnya class player(), implements interface move



// Java program to demonstrate 
// working of interface. 
import java.io.*; 

// A simple interface 
interface in1 { 

	// public, static and final 
	final int a = 10; 

	// public and abstract 
	void display(); 
} 

// A class that implements the interface. 
class testClass implements in1 { 

	// Implementing the capabilities of 
	// interface. 
	public void display() 
	{ 
		System.out.println("Geek"); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		testClass t = new testClass(); 
		t.display(); 
		System.out.println(a); 
	} 
} 

Differences between a Class and an Interface:

CLASS	
The keyword used to create a class is “class”	
A class can be instantiated i.e, objects of a class can be created.	
Classes does not support multiple inheritance.	
It can be inherit another class.	
It can be inherited by another class using the keyword ‘extends’.	
It can contain constructors.	
It cannot contain abstract methods.	
Variables and methods in a class can be declared using any access specifier(public, private, default, protected)	
Variables in a class can be static, final or neither.	


INTERFACE
The keyword used to create an interface is “interface”
An Inteface cannot be instantiated i.e, objects cannot be created.
Inteface supports multiple inheritance.
It cannot inherit a class.
It can be inherited by a class by using the keyword ‘implements’ and it can be inherited by an interface using the keyword ‘extends’.
It cannot contain constructors.
It contains abstract methods only.
All variables and methods in a interface are declared as public.
All variables are static and final.