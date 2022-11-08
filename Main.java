import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        String name;
        String age;
        String city;
        String college;
        String profession;
        String animal;
        String petName;


        //Accept the user's name
        System.out.println("Enter your name:");
        name = input.nextLine();

        //Accept the users's age
        System.out.println("Enter your age:");
        age = input.nextLine();

        //Accept the city name of the user
        System.out.println("Enter the name of your City:");
        city = input.nextLine();

        //Accept the college name of the user
        System.out.println("Enter the name of your college:");
        college = input.nextLine();

        //Accept the profession of the user
        System.out.println("Enter the name of your profession:");
        profession = input.nextLine();

        //Accept the type of animal the user has
        System.out.println("Enter your type of animal:");
        animal = input.nextLine();

        //Accept the pet name of the user
        System.out.println("Enter your pet's name:");
        petName = input.nextLine();

        //Display the story with the inputs the user entered
        System.out.println("The once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a(n) " + profession + ". " + "Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily, ever after! " );

        //System.out.println("Hello world!");

    }
}