package javaOOP.JavaOOP.interfaces.birthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");
            String objectType = tokens[0];
            switch (objectType) {
                case "Citizen":
                    String personName = tokens[1];
                    int personAge = Integer.parseInt(tokens[2]);
                    String personId = tokens[3];
                    String personBirthDate = tokens[4];
                    Citizen citizen = new Citizen(personName, personAge, personId, personBirthDate);
                    birthableList.add(citizen);
                    break;

                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    birthableList.add(pet);
                    break;

                case "Robot":
                    break;
            }

            input = scanner.nextLine();

        }
        String year = scanner.nextLine();

        boolean isFound = false;

        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("<no output>");
        }
    }
}
