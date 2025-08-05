/*class Animal {
	long lifespan;
	float weight;
	Animal (long years, float kg) {
		lifespan = years;
		weight = kg;
	}
	public void print() {
		System. out.println ("Maximum longevity: " + lifespan + " in years") ;
		System.out.println ("Maximum weight:" + weight + "in kgs") ;
	}
}
// End of class Animal
class Aquatic extends Animal {
	boolean scale;		// true: has scale, false: no scale
	Aquatic(long years, float kg, boolean skin) {
		super (years, kg) ;	//Super class constructor
		scale = skin;
	}
	public void print() {
		super.print();		// Call the super class method
		System. out.println ("Has scale?" + scale) ;
	}
}
// End of class Aquatic

class Land extends Animal {
	short vision; //0 = nocturnal, 1 = only day light, 2 = both
	Land (long years, float kg, short vision) {
		super (years, kgs) ;		// Super class constructor
		this.vision = vision;		
	}
}
// End of class Land
class Pet extends Land {
	String name;
	Pet(long years, float kg, short vision, String name) {
		super (years, kgs, vision, name);	// Super class constructor
		this. name = name;
	}
}
// End of class Pet
class Wild extends Land {
	float speed; // Maximum running speed in mph
	Wild(long years, float kg, short vision, float speed) {
		super (years, kgs, vision, name); // Super class constructor
		this. speed = speed;
	}
}
// End of class Wild
class AnimalWorld<T extends Animal> {
	//Type parameter is limited to Animal and its sub classes
	T [] listofAnimals;
	
	AnimalWorld(T [] list) // Generic constructor to create a list of type T
		listOfAnimals = list;
	}
}
// End of the generic class AnimalWorld

class BoundedWildcards {
	//Case 1: Unbound wildcard: Any object can be passed as its argument.
	static void vitality (AnimalWorld <?> animals) {
		//To print the vitality of animals in the list of animals
		for (Animal a : animals)
			a.print () ;
		System.out.println ();
}
// Case 2: Lower bounded wildcard: Any object of Aquatic or Animal can 
// be passed as its argument.
	static void showSea (AnimalWorld <? super Aquatic> animals) {
		//For aquatic or unknown animals
		for (Object obj : animals)
			obj.print();
			// Call the method defined in Animal/ Aquatic class
		System.out.println();
	}
// Case 3a: Upper bounded wildcard: Any object of Land/ Pet/ Wild can 
// be passed as its argument.

	static void showLand (AnimalWorld <? extends Land> animals) {
		//For Land or any of its subclasses
		for(int i = 0; i < animals.listOfAnimals.length) {
			animals.listOfAnimals[i].print();
				// Call the method defined in Animal class
			System.out.println ("Vision : " +animals.listOfAnimals[i].vision);
		}
			System.out.println();
	}

// Case 3b: Upper bounded wildcard: Any object of only Pet class can
// be passed as its argument.

	static void showPet (AnimalWorld <? extends Pet> animals) {
		//For lists of Pet objects only
	for(int i = 0; i < animals.listOfAnimals.length) {
		System. out.println ("Pet's name: "+
		animals.listOfAnimals [i].name);
		animals. listOfAnimals[i].print();
		// Call the method defined in Animal class
		System.out.println ("Vision : " +animals.listOfAnimals[i].vision);
	}
	System.out.println();
}
// Case 3c: Upper bounded wildcard: Any object of only Wild class can 
// be passed as its argument.
	static void showWild (AnimalWorld <? extends Wild> animals) {
		//For objects of Wild class only
		for(int i = 0; i < animals.listOfAnimals.length) {
			animals.listOfAnimals[i].print();
				// Call the method defined in Animal class
			System. out.println ("Maximum running speed: " +
				animals. listOfAnimals [i] .speed + " in mph");
			System. out.println ("Vision : " +
				animals.listOfAnimals[i].vision);
		}
			System.out.println() ;
	}
}
// End of the method definitions in class BoundedWildcards

class BoundedWildcardArgumentsDemo {
	public static void main (String args []) {

	// Create a list of unknown animals of class Animal
	Animal unknown = new Animal (40, 720);
			// An unknown animal object is created
	Animal u [] = {unknown};	// Array of unknown animals
	AnimalWorld<Animal> uList = new AnimalWorld<Animal>(u);
							// Place the unknown into a list
	
	// Create a list of aquatic animals
	Aquatic whale = new Aquatic(90, 150000);
					// A whale object is created
	Aquatic shark = new Aquatic(400, 2150);
					// A shark object is created
	Animal q [] = { whale, shark } ;
					// Array of aquatic animals
	AnimalWorld<Aquatic> qList = new AnimalWorld<Aquatic>(q);
					// Place the aquatics into a list
	// Create a list of land animals
		Land owl = new Land(3, 1, 0);
									// A land owl object is created
		Land 1 [] = { owl };	// An array of land objects is created
		AnimalWorld<Land> lList = new AnimalWorld<Land>(1);
													// Place the animals into a list
		// Create a list of pet animals
		Pet dog = new Pet (15, 75, 2, "Prince");
						// A pet dog object is created
		Pet p [] = { new Pet (15, 75, 2, "Prince") } ;
						// An array of pet objects is created
		AnimalWorld<Pet> pList = new AnimalWorld<Pet>(p);
						// Place the pets into a list
		// Create a list of wild animals
		Wild cheetah = new Land(15, 75, 2);
						// A cheetah object is created
		Wild deer = new Land(10, 50, 1);
						// A deer object is created
		Wild w [] = { cheetah, deer } ;
						// Array of non-aquatic animals
		AnimalWorld<Wild> wList = new AnimalWorld<Wild>(w);
		                //Place the wilds into a list
		// Call the methods and see the outcomes
			// vitality ( ... ) is with unlimited wildcard argument and
			// hence we can pass argument of any type
			vitality (uList);	//OK
			vitality (qList);	//OK
			vitality (1List);	//OK
			vitality (pList);	//OK
			vitality (wList);	//OK
			
			// showSea ( ... ) is with lower bound wildcard argument with
				// class Aquatic and its super classes
				showSea (uList);// OK
				showSea(qList);// OK
				showSea(1List);//Compile-time error
				showSea(pList);//Compile-time error
				showSea(wList);//Compile-time error
				
			// showLand ( ... ) is with upper bound wildcard argument with
				// class Land and its subclasses
				showLand (uList);	// Compile-time error
				showLand (qList);	// Compile-time error
				showLand (1List);	// OK
				showLand(pList) ;	// OK
				showLand(wList);	// OK
				
		//showPet ( ... ) is with upper bound wildcard argument with
			// class Pet and its subclasses
			showPet (uList);	// Compile-time error
			showPet (qList);	// Compile-time error
			showPet (1List);	// Compile-time error
			showPet (pList);	//OK
			showPet (wList);	// Compile-time error
		// showWild ( ... ) is with upper bound wildcard argument with
			// class Wild and its sub classes			
			showWild (uList);	// Compile-time error
			showWild (qList);	// Compile-time error
			showWild (1List);	// Compile-time error
			showWild (pList);	// Compile-time error
			showWild (wList);	//OK

	}
}*/





class Animal {
    long lifespan;
    float weight;

    Animal(long years, float kg) {
        lifespan = years;
        weight = kg;
    }

    public void print() {
        System.out.println("Maximum longevity: " + lifespan + " in years");
        System.out.println("Maximum weight: " + weight + " in kgs");
    }
}

class Aquatic extends Animal {
    boolean scale;

    Aquatic(long years, float kg, boolean skin) {
        super(years, kg);
        scale = skin;
    }

    public void print() {
        super.print();
        System.out.println("Has scale? " + scale);
    }
}

class Land extends Animal {
    short vision; // 0 = nocturnal, 1 = day only, 2 = both

    Land(long years, float kg, short vision) {
        super(years, kg);
        this.vision = vision;
    }

    public void print() {
        super.print();
    }
}

class Pet extends Land {
    String name;

    Pet(long years, float kg, short vision, String name) {
        super(years, kg, vision);
        this.name = name;
    }
}

class Wild extends Land {
    float speed;

    Wild(long years, float kg, short vision, float speed) {
        super(years, kg, vision);
        this.speed = speed;
    }
}

class AnimalWorld<T extends Animal> {
    T[] listOfAnimals;

    AnimalWorld(T[] list) {
        listOfAnimals = list;
    }
}

class BoundedWildcards {

    static void vitality(AnimalWorld<?> animals) {
        for (Animal a : animals.listOfAnimals)
            a.print();
        System.out.println();
    }

    static void showSea(AnimalWorld<? super Aquatic> animals) {
        for (Object obj : animals.listOfAnimals)
            ((Animal) obj).print();
        System.out.println();
    }

    static void showLand(AnimalWorld<? extends Land> animals) {
        for (int i = 0; i < animals.listOfAnimals.length; i++) {
            animals.listOfAnimals[i].print();
            System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
    }

    static void showPet(AnimalWorld<? extends Pet> animals) {
        for (int i = 0; i < animals.listOfAnimals.length; i++) {
            System.out.println("Pet's name: " + animals.listOfAnimals[i].name);
            animals.listOfAnimals[i].print();
            System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
    }

    static void showWild(AnimalWorld<? extends Wild> animals) {
        for (int i = 0; i < animals.listOfAnimals.length; i++) {
            animals.listOfAnimals[i].print();
            System.out.println("Maximum running speed: " +
                    animals.listOfAnimals[i].speed + " in mph");
            System.out.println("Vision: " + animals.listOfAnimals[i].vision);
        }
        System.out.println();
    }
}

class BoundedWildcardArgumentsDemo {
    public static void main(String[] args) {

        // Unknown Animal
        Animal unknown = new Animal(40, 720);
        Animal[] u = {unknown};
        AnimalWorld<Animal> uList = new AnimalWorld<>(u);

        // Aquatic Animals
        Aquatic whale = new Aquatic(90, 150000, true);
        Aquatic shark = new Aquatic(400, 2150, true);
        Aquatic[] q = {whale, shark};
        AnimalWorld<Aquatic> qList = new AnimalWorld<>(q);

        // Land Animal
        Land owl = new Land(3, 1, (short) 0);
        Land[] lArr = {owl};
        AnimalWorld<Land> lList = new AnimalWorld<>(lArr);

        // Pet Animal
        Pet dog = new Pet(15, 75, (short) 2, "Prince");
        Pet[] p = {dog};
        AnimalWorld<Pet> pList = new AnimalWorld<>(p);

        // Wild Animals
        Wild cheetah = new Wild(15, 75, (short) 2, 70.5f);
        Wild deer = new Wild(10, 50, (short) 1, 40.2f);
        Wild[] w = {cheetah, deer};
        AnimalWorld<Wild> wList = new AnimalWorld<>(w);

        // Method calls
        BoundedWildcards.vitality(uList);
        BoundedWildcards.vitality(qList);
        BoundedWildcards.vitality(lList);
        BoundedWildcards.vitality(pList);
        BoundedWildcards.vitality(wList);

        BoundedWildcards.showSea(uList);
        BoundedWildcards.showSea(qList);

        BoundedWildcards.showLand(lList);
        BoundedWildcards.showLand(pList);
        BoundedWildcards.showLand(wList);

        BoundedWildcards.showPet(pList);

        BoundedWildcards.showWild(wList);
    }
}
