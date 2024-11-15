import java.util.Scanner;

class AniMal1 {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends AniMal1 {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends AniMal1 {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to create a Dog, 2 to create a Cat, 3 to create an Animal:");
        int choice = scanner.nextInt();

        AniMal1 animal;
        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            case 3:
                animal = new AniMal1();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        animal.makeSound();
    }
}
