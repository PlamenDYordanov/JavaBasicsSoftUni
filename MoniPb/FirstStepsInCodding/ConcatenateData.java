package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();;
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // System.out.println("You are "+ firstName +" "+ lastName + ", a "+age+"-years old person from "+town+".");
        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,lastName,age,town);
        //конзолата име, фамилия, възраст и град
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."
    }
}