import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("Enter an adjective (description): ");
//        adjective1 = sc.nextLine();
//        System.out.print("Enter a noun (animal or person): ");
//        noun1 = sc.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective2 = sc.nextLine();
//        System.out.print("Enter a verb ending with -ing (action): ");
//        verb1 = sc.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective3 = sc.nextLine();
//
//        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
//        System.out.println("In an exhibit, I saw a " + noun1 + ".");
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 +"!");
//        System.out.println("I was " + adjective3 + "!");

        // Shopping cart program

//        String item;
//        double price;
//        int quantity;
//        char currency = '$';
//        double total;
//
//        System.out.print("What item would you like to buy? : ");
//        item = sc.nextLine();
//        System.out.print("What is the price for each? : ");
//        price = sc.nextDouble();
//        System.out.print("How many would you like? : ");
//        quantity = sc.nextInt();
//
//        total = price * quantity;
//
//        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
//        System.out.println("Your total is " + currency + total);

//        int number1;
//        int number2;
//        int number3;
//
//        number1 = random.nextInt(1, 7);
//        number2 = random.nextInt(1, 7);
//        number3 = random.nextInt(1, 7);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//
//        result = Math.pow(2,10);
//        System.out.println(result);
//        System.out.println(Math.abs(-34.4343));
//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.round(Math.PI));
//        System.out.println(Math.ceil(Math.PI));
//        System.out.println(Math.floor(Math.PI));
//        System.out.println(Math.max(3, 34234));
//        System.out.println(Math.min(3, 32433));

//        HYPOTENUSE c = Math.sqrt(a^2 + b^2)

//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side a: ");
//        a = sc.nextDouble();
//        System.out.print("Enter the length of side b: ");
//        b = sc.nextDouble();
//
//        c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypotenuse (side c) is: " + c + "cm");

//        double radius;
//        double circumference;
//        double area;
//        double volume;
//
//        System.out.print("Enter the radius: ");
//        radius = sc.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
//
//        System.out.printf("The circumference is: %fcm\n", circumference);
//        System.out.printf("The area is: %.1fcm^2\n", area);
//        System.out.printf("The volume is: %.1fcm^3\n", volume);

//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age= 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("Your are %f inches tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);

        // Flags

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

//        double price1 = 9.99;
//        double price2 = 100.15;
//        double price3 = -54.01;
//
//        System.out.printf("% .2f\n", price1);
//        System.out.printf("% .2f\n", price2);
//        System.out.printf("% .2f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

//        int id1 = 1;
//        int id2 = 23;
//        int id3 = 456;
//        int id4 = 7890;
//
//        System.out.printf("%-4d\n", id1);
//        System.out.printf("%-4d\n", id2);
//        System.out.printf("%-4d\n", id3);
//        System.out.printf("%-4d\n", id4);

//        double principal;
//        double rate;
//        int timesCompounded;
//        int years;
//        double amount;
//
//        System.out.print("Enter tha principal amount: ");
//        principal = sc.nextDouble();
//
//        System.out.print("Enter the intrest rate (in %): ");
//        rate = sc.nextDouble() / 100;
//
//        System.out.print("Enter the # of times compounded per year: ");
//        timesCompounded = sc.nextInt();
//
//        System.out.print("Enter the # of years: ");
//        years = sc.nextInt();
//
//        amount = principal * Math.pow(1 + rate/timesCompounded , timesCompounded * years);
//
//        System.out.printf("The amount after %d is : $%.2f", years, amount);

//        String name = "Dhanush Gowda";
//
//        int length = name.length();
//
//        System.out.println(length);
//        System.out.println(name.charAt(2));
//        System.out.println(name.indexOf("a"));
//        System.out.println(name.lastIndexOf("a"));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println(name.isEmpty());
//        System.out.println(name.replace('o', '0'));
//        System.out.println(name.contains(" ") ? "Your name contains a space" : "Your name does not contain any space");
//        System.out.println(name.equals("password") ? "Your password is correct" : "Your name can't be password");

        // .subString() = A method used to extract a portion of a string .subString(start, end)

//        String email;
//        String username;
//        String domain;
//
//        System.out.print("Enter your email ID: ");
//
//        email = sc.nextLine();
//
//        if(email.contains("@")){
//            username = email.substring(0, email.indexOf('@'));
//            domain = email.substring(email.indexOf('@')+1);
//
//            System.out.println(username);
//            System.out.println(domain);
//        } else {
//            System.out.println("Email is invalid (must contain @)");
//        }

        // WEIGHT CONVERSION PROGRAM

//        double weight;
//        double newWeight;
//        int choice;
//
//        System.out.println("Weight conversion program");
//        System.out.println("1: Convert lbs to kgs");
//        System.out.println("2: Convert kgs to lbs");
//
//        System.out.print("Choose an option: ");
//        choice = sc.nextInt();
//
//        if(choice == 1){
//            System.out.print("Enter the weight in lbs: ");
//            weight = sc.nextDouble();
//            newWeight = weight * 0.453592;
//
//            System.out.printf("Your weight is:  %.2f kgs", newWeight);
//        } else if (choice == 2){
//            System.out.print("Enter the weight in kgs: ");
//            weight = sc.nextDouble();
////            newWeight = weight / 0.453592;
//            newWeight = weight * 2.20462;
//
//            System.out.printf("Your weight is %.2f lbs", newWeight);
//        } else {
//            System.out.println("That was not a valid choice");
//        }

//        double temp;
//        double newTemp;
//        String unit;
//
//        System.out.print("Enter the temperature: ");
//        temp = sc.nextDouble();
//
//        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
//        unit = sc.next().toUpperCase();
//
//        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;
//
//        System.out.printf("%.1f° %s", newTemp, unit);

        // Enhanced Switch

//        System.out.print("Enter the day the week: ");
//        String day = sc.nextLine();
//
//        switch(day){
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday 😔");
//            case "Saturday", "Sunday" -> System.out.println("It is weekend 😀");
//            default -> System.out.println(day + " is not a day");
//        }

//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean validOperator = true;
//
//        System.out.print("Enter the first number: ");
//        num1 = sc.nextDouble();
//
//        System.out.print("Enter an Operator (+, -, *, /, ^): ");
//        operator = sc.next().charAt(0);
//
//        System.out.print("Enter the second number: ");
//        num2 = sc.nextDouble();
//
//        switch(operator){
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if(num2 == 0){
//                    System.out.println("Cannot divide by zero!");
//                    validOperator = false;
//                }else{
//                    result = num1 / num2;
//                }
//            }
//            case '^' -> result = Math.pow(num1, num2);
//            default -> {
//                System.out.println("Invalid operator!");
//                validOperator = false;
//            }
//        }
//
//        if(validOperator){
//            System.out.println(result);
//        }

        // username must be b/w  4-21 characters
        // username must not contain spaces or underscores

//        String username;
//
//        System.out.print("Enter your new username: ");
//        username = sc.nextLine();
//
//        if(username.length() < 4 || username.length() > 21){
//            System.out.println("Username must be between 4-21 characters");
//        } else if (username.contains(" ") || username.contains("_")) {
//            System.out.println("Username must not contain spaces or underscores");
//        } else {
//            System.out.println("Welcome " + username);
//        }

//        String name = "";
//
//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = sc.nextLine();
//        }
//
//        System.out.println("Hello " + name);

//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = sc.next().toUpperCase();
//        }
//
//        System.out.println("Your have quit the game");

//        int age = 20;
//
//        do {
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = sc.nextInt();
//        } while(age < 0);
//
//        System.out.println("You are " + age + " years old");

//        int number;
//
//        do {
//            System.out.print("Enter a number b/w 1-10: ");
//            number = sc.nextInt();
//        } while(number < 1 || number > 10);
//
//        System.out.println("You picked " + number);

        // NUMBER GUESSING GAME

//        int guess;
//        int attempts = 0;
//        int min = 1;
//        int max = 100;
//        int randomNumber = random.nextInt(min, max+1);
//
//        System.out.println("NUMBER GUESSING GAME");
//        System.out.printf("Guess a number between %d-%d\n", min, max);
//
//        do{
//            System.out.print("Enter a guess: ");
//            guess = sc.nextInt();
//            attempts++;
//
//            if(guess < randomNumber){
//                System.out.println("TOO LOW! Try again");
//            }else if(guess > randomNumber){
//                System.out.println("TOO HIGH! Try again");
//            } else {
//                System.out.println("CORRECT! The number was " + randomNumber);
//                System.out.println("Number of attempts: " + attempts);
//            }
//
//        } while(guess != randomNumber);

        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        cols = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
