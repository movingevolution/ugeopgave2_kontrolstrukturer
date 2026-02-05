import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main( String[] args) {

        /*opg3
        int time = 14;

        if (time >= 5 && time <= 11) {
            System.out.println("Formiddag");
        } else if(time >= 12 && time <= 17) {
            System.out.println("Eftermiddag");
        } else if (time >= 18 && time <=21) {
            System.out.println("Aften");
        } else if ((time >= 22 && time <= 24) || (time >=0 && time <= 4 )) {
            System.out.println("Nat");
        } else {
            System.out.println("Ugyldigt tidspunkt!");
        }*/

        /*opg7
        int partySize = 4;
        int availableSeats = 6;
        boolean hasReservation = false;
        int waitTime = 20;
        boolean restaurantFull = false;

        if (((partySize <= availableSeats && hasReservation == true) || (partySize <= availableSeats && waitTime <= 20)) && !restaurantFull) {
            System.out.println("Table Available");
            System.out.println("Estimated wait: " + waitTime);
        } else {
            System.out.println("Restaurant Full!");
        } */

        /*opg9
        boolean isAdmin = false;
        boolean accountActive = true;
        boolean isSuperUser = false;
        boolean isUser = false;
        boolean isGuest = true;
        boolean hasTime = false;
        boolean isSuspended = true;

        if ((isAdmin && accountActive) || isSuperUser){
            System.out.println("FULL ACCESS");
        } else if((isUser && accountActive && !isSuspended) || (isGuest && hasTime)) {
            System.out.println("RESTRICTED ACCESS");
        } else {
            System.out.println("ACCESS DENIED");
        }*/

        /*opg12
        double balance = 5000;
        double amount = 2000;
        String operation = "deposit";

        switch (operation) {
            case "withdraw":
                if(amount > balance) {
                    System.out.println("Insufficient Funds!");
                } else {
                    balance -= amount;
                    System.out.println("Withdraw: " + amount + " kr");
                    System.out.println("New Balance: " + balance + " kr");
                }
                break;
            case "deposit":
                balance += amount;
                System.out.println("Deposit: " + amount + " kr");
                System.out.println("New Balance: " + balance + " kr");
                break;
            case "balance":
                System.out.println("Balance: " + balance + " kr");
                break;
            case "transfer":
                balance -= amount;
                System.out.println("Transfer: " + amount + " kr");
                System.out.println("New Balance: " + balance + " kr");
                break;
            }*/

        /*opg19
        int attempts = 0;
        int maxAttempts = 3;
        String correctPassword = "secret123";
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);

        while(attempts < maxAttempts && !accessGranted) {
            System.out.println("Enter Password: ");
            String myPassword = scanner.nextLine();
            attempts++;

            if (myPassword.equals(correctPassword)) {
                accessGranted = true;
                System.out.println("Access Granted");
            }
            else {
                System.out.println("Wrong password, try again.");
            }
        }

        if(!accessGranted) {
            System.out.println("Account locked!");
        } */

        /*opg23
        int numberTest = 90;
        int numberOfDivisors = 0;

        for(int i = 1; i <= numberTest; i++) {
            if(numberTest % i == 0) {
                numberOfDivisors++;
            }

        }

        if(numberOfDivisors == 2) {
            System.out.println(numberTest + " is a prime number.");
        } else {
            System.out.println(numberTest + " is NOT a prime number.");
        }*/

        /*opg25
        ArrayList<Integer> weekTemp = new ArrayList<>(Arrays.asList(18, 22, 20, 25, 19, 21, 23));

        double sum = 0;
        int hottestDay = weekTemp.getFirst();
        int coldestDay = weekTemp.getFirst();
        int daysOverTwenty = 0;

        for(int i = 0; i < weekTemp.size(); i++) {
            int temp = weekTemp.get(i);
            sum += temp;
            hottestDay = (temp > hottestDay) ? temp : hottestDay;
            coldestDay = (temp < coldestDay) ? temp : coldestDay;

            if(temp > 20) {
                daysOverTwenty++;
            }
        }

        System.out.printf("Average: %.2f degrees%n", sum / weekTemp.size());
        System.out.println("Hottest Day: " + hottestDay + " degress");
        System.out.println("Coldest Day: " + coldestDay + " degrees");
        System.out.println("Days over twenty degrees: " + daysOverTwenty);*/




    }
}
