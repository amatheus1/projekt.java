import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party party = new Party();

        while (shouldContinue){
            System.out.println("wybierz opcje");
            System.out.println("1. wyswietl gościa");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. znajdz po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;

            }
        }
    }
}