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


Interface : Sebuah blueprint bisa dibilang kumpulan method yang dimana siap dipakai oleh class