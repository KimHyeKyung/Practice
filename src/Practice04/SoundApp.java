package Practice04;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
//    	Cat cat = new Cat();
//    	Dog dog = new Dog();
//    	Sparrow sparrow = new Sparrow();
//    	Duck duck = new Duck();
//
//		if (soundable instanceof Cat) {
//			System.out.println(cat.sound());
//		} else if (soundable instanceof Dog) {
//			System.out.println(dog.sound());
//		} else if (soundable instanceof Sparrow) {
//			System.out.println(sparrow.sound());
//		} else if (soundable instanceof Duck) {
//			System.out.println(duck.sound());
//		}
    	
    	System.out.println(soundable.sound());
    }
    
}
