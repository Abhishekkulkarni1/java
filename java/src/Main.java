import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        weight distribution
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        double weight, newWeight;
//
//        try {
//            System.out.println("Select an option:");
//            System.out.println("1. Convert kg to lbs");
//            System.out.println("2. Convert lbs to kg");
//            System.out.print("Enter your choice (1 or 2): ");
//            choice = scanner.nextInt();
//
//            if (choice == 1) {
//                System.out.println("You have selected conversion from kg to lbs.");
//                System.out.print("Enter the weight in kg: ");
//                weight = scanner.nextDouble();
//                newWeight = weight * 2.20;
//                System.out.printf(weight + " kg in lbs is: %.1f lbs" , newWeight);
//            } else if (choice == 2) {
//                System.out.println("You have selected conversion from lbs to kg.");
//                System.out.print("Enter the weight in lbs: ");
//                weight = scanner.nextDouble();
//                newWeight = weight / 2.20;
//                System.out.println(weight + " lbs in kg is: " + newWeight + " kg.");
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input! Please enter a valid number. Error: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//        temp conversion

//        System.out.println("enter wether you wantto convert from degree celcius or you wantto convert to degree farenhite");
//        System.out.println("enter C for celcius to farenhite or F for farenhite to celcius");
//
//        Scanner scanner = new Scanner(System.in);
//
//        double temp;
//        System.out.println("Enter the temp");
//        temp = scanner.nextDouble();
//        System.out.println("You have entered " + temp);
//        String unit;
//        System.out.println("Enter the unit");
//        unit = scanner.next();
//        System.out.println("You have entered " + unit);
//        String finalAnswer;
//
//        double newTemp;
//        newTemp = (unit.equals("C") ? (temp * 9/5)+32 : (temp - 32)+5/9);
//        if(unit.equals("C")){
//            System.out.println("the new temp from Celcius to farenhite is " + newTemp);
//        } else{
//            System.out.println("the new temp from farenhite to celcius is " + newTemp);
//        }
//        scanner.close();
// enhanced switch cases
//        Scanner scanner = new Scanner(System.in);
//        String day = scanner.next();
//        switch (day){
//            case "Monday", "Tuesday", "Wednesday", "Friday", "Thursday" -> System.out.println("It is weekday");
//            case "Saturday", "Sunday" -> System.out.println("It is weekend");
//            default -> System.out.println("Bhai tere liye naya weekday banaye kya bsdk");
//        }
//        scanner.close();

        // calculator program
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        double number1 = scanner.nextDouble();
//        System.out.println("Enter the last number");
//        double number2 = scanner.nextDouble();
//        System.out.println("Enter the operator");
//        char operator = scanner.next().trim().charAt(0);
//
//        if (operator == '*' || operator == '+' || operator == '-' || operator == '/' || operator == '%') {
//            System.out.println("You want to " + operator);
//            switch (operator){
//                case '*' -> System.out.println("The o/p is " + (number1 * number2));
//                case '/' -> System.out.println("The o/p is " + (number1 / number2));
//                case '+' -> System.out.println("The o/p is " + (number1 + number2));
//                case '-' -> System.out.println("The o/p is " + (number1 - number2));
//                case '%' -> System.out.println("The o/p is " + (number1 % number2));
//                default -> System.out.println("Invalid operator entered");
//            }
//        } else {
//            System.out.println("Wrong operator entered");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the random number guessing game");
//        Random random = new Random();
//        int randomNumber = random.nextInt(1, 101);
//        System.out.println(randomNumber);
//        int guess;
//        int attempt = 0;
//        do{
//            System.out.print("Enter your guess:");
//            guess = scanner.nextInt();
//            attempt++;
//            if(guess > randomNumber){
//                System.out.println("The number you have entered is higher then the actual number");
//            } else if(guess < randomNumber) {
//                System.out.println("The number you have entered is lower then the actual number");
//            } else {
//                System.out.println("Congratulations!! You have guessed it right!! Yaayyy");
//                if(attempt == 1){
//                    System.out.println("It took " + attempt + " attempt for you to guess the correct number.");
//                }else {
//                    System.out.println("It took " + attempt + " attempts for you to guess the correct number.");
//                }
//            }
//        }while(guess != randomNumber);
//        scanner.close()

//        for(int row=6; row >= 1; row--){
//            for (int col = 1; col <= row; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println("");
////            prints
////            1 2 3 4 5 6
////            1 2 3 4 5
////            1 2 3 4
////            1 2 3
////            1 2
////            1
//        }
//        for(int row = 1; row <= 6; row++){
//            for(int col = 1; col <= row; col++ ){
//                System.out.print(col + " ");
//            }
//            System.out.println(" ");
////            prints
////            1
////            1 2
////            1 2 3
////            1 2 3 4
////            1 2 3 4 5
////            1 2 3 4 5 6
//        }
//        int num = 1;
//        for(int row = 1; row <= 6; row++){
//            for(int col = 1; col <= row; col++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println("");
////            prints
////            1
////            2 3
////            4 5 6
////            7 8 9 10
////            11 12 13 14 15
////            16 17 18 19 20 21
//        }
//        for(int row = 1; row <=6; row++){
////            System.out.print(row + " ");
//            for(int col = 1; col <= row; col++){
////                System.out.print(col + " ");
//                if((row+col) % 2 == 0){
//                    System.out.print(1 + " ");
//                }else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println("");
////            prints
////            1
////            0 1
////            1 0 1
////            0 1 0 1
////            1 0 1 0 1
////            0 1 0 1 0 1
//        }
//        for(int row = 6; row >= 1; row--){
//            for(int col = 1; col <= row; col++){
////                System.out.print(col + " ");
//                if((row+col) % 2 == 0){
//                    System.out.print(1 + " ");
//                }else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println(" ");
////        prints
////        0 1 0 1 0 1
////        1 0 1 0 1
////        0 1 0 1
////        1 0 1
////        0 1
////        1
//        }
//        for(int row = 1; row <= 2*6; row++){
//            int totalRowInCol = row > 6 ? 2*6 - row : row;
////            System.out.println(totalRowInCol + " ");
//            for(int col = 1; col < totalRowInCol; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println("");
////            prints
////            1
////            1 2
////            1 2 3
////            1 2 3 4
////            1 2 3 4 5
////            1 2 3 4
////            1 2 3
////            1 2
////            1
//        }
//        fibonachi numbers
//        Scanner scanner = new Scanner(System.in);
//        int fibNum = scanner.nextInt();
//        int prevNum = 0;
//        int currentNum = 1;
//        int count  = 2;
//        while(count <= fibNum){
//            int temp = currentNum;
//            currentNum = prevNum + currentNum;
//            prevNum = temp;
//            count++;
//        }
//        System.out.println(currentNum);
//        count occ
//        Scanner scanner = new Scanner(System.in);
//        int n = 1000089;
//        int count = 0;
//        while(n > 0){
//            int rem = n % 10;
//            if(rem == 0){
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);
//reverse the number
        int n = 1982922222;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            if(ans > (Integer.MAX_VALUE - rem) / 10){
                System.out.println(0);
            }
            System.out.println(Integer.MAX_VALUE);
            ans = ans * 10 + rem;
            //
        }
        System.out.println(ans);
    }
}
