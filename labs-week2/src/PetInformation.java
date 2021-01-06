import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Dog myDog = new Dog();

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        dogName = scnr.next();
        dogAge = scnr.nextInt();
        scnr.nextLine();
        dogBreed = scnr.nextLine();

        // TODO: Create generic pet (using petName, petAge) and then call printInfo
        Pet pet = new Pet(petName, petAge);
        pet.printInfo();

        // TODO: Create dog pet (using dogName, dogAge, dogBreed) and then call printInfo
        Dog dog = new Dog(dogName, dogAge, dogBreed);
        dog.printInfo();
        System.out.println("   Breed: " + dog.getBreed());

        // TODO: Use getBreed(), to output the breed of the dog

    }
}