import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {

            //-------------------------------------------------------Question 1---------------------------------------------------------
    /* 1-Write a java program to print the sum,multiply,subtract,divide and reminder of Two numbers
    takes to numbers as input
    */
            System.out.println("Q1 Calculations between two numbers.");

            try {//Ask user to input two numbers
                System.out.print("Enter the first number: ");
                int operand1 = in.nextInt();
                System.out.print("Enter the second number: ");
                int operand2 = in.nextInt();

                //calculations
                System.out.println("Calculations between these two numbers are: ");
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                System.out.println(operand1 + " x " + operand2 + " = " + (operand1 * operand2));
                System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                System.out.println(operand1 + " mod " + operand2 + " = " + (operand1 % operand2));
            }catch(InputMismatchException e){
                System.out.println("Your input should be a number.");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            }catch(ArithmeticException e) {
                System.out.println("the second operand cannot be zero. (/0 is not acceptable).");
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 1 end-------------------------------------------------------


            //-------------------------------------------------------Question 2---------------------------------------------------------
            /* 2-Write a Java program that takes a number and prints the multiplication table of it
             */
            System.out.println("Q2 Multiplication table");

            //Ask user to inout a number
            try {
                System.out.print("Please enter a number to display its multiplication table: ");
                int multiplier = in.nextInt();

                //display the multiplication table
                System.out.println("This the table: ");
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%2d x %d = %d\n", multiplier, i, multiplier * i);
                }
            } catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            }

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 2 end-------------------------------------------------------


            //-------------------------------------------------------Question 3---------------------------------------------------------
            /* 3- Write a Java programmer to print the area and perimeter os a circle
             */
            System.out.println("Q3 Circle perimeter and area calculator");

            //Ask user to enter the radius
            try {
                System.out.print("Please enter the radius: ");
                double radius = in.nextDouble();
                circleCalculations(radius);
            }catch (InputMismatchException e){
                System.out.println("your input should be a number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 3 end-------------------------------------------------------

            in.nextLine();
            //-------------------------------------------------------Question 4---------------------------------------------------------
            /* 4-Java program to find out the average of a set of integers
             */
            System.out.println("Q4 Average of set of integers.");

            try {
                System.out.print("How many numbers you want to add: ");
                int noInputNumbers = in.nextInt();
                if (noInputNumbers <= 0) {
                    throw new RuntimeException("Number of things should be positive!");
                }

                //main logic
                int sum = 0;
                for (int i = 0; i < noInputNumbers; i++) {
                    System.out.printf("Enter number%d: ", i + 1);
                    sum += in.nextInt();
                }
                System.out.println("The average is: " + ((double) sum / noInputNumbers));
            }catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 4 end-------------------------------------------------------

            in.nextLine();
            //-------------------------------------------------------Question 5---------------------------------------------------------
            /* Write a Java program that accepts three integers as input,
             add first two numbers together
             determines if their sum equal to the third integer
             */
            System.out.println("Q5 sum confirmation.");
            try {
                //Ask user to input the first two numbers
                System.out.print("Please enter the first number: ");
                int firstNumber = in.nextInt();
                System.out.print("Please enter the second number: ");
                int secondNumber = in.nextInt();

                //sum and confirm
                System.out.print("enter the expected sum: ");
                System.out.println((firstNumber + secondNumber == in.nextInt()) ? "True!" : "False");
            } catch (InputMismatchException e){
                System.out.println("your input should be number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 5 end-------------------------------------------------------


            //-------------------------------------------------------Question 6---------------------------------------------------------
            /* 6-Write a Java program to reverse a word
             */
            System.out.println("Q6 Word reverser");

            //Ask user to enter a String
            System.out.print("Please enter a word to reverse it for you: ");
            String originalString = in.next();

            //reverse the word
            String reversedString = "";
            for (int i = originalString.length() - 1; i >= 0; i--) { //loops that starts from the end of the string to its start.
                reversedString += originalString.charAt(i); //A way to append a char at the last of a string (use concatenation)
            }
            //result print
            System.out.println("The reversed String is: " + reversedString);

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 6 end-------------------------------------------------------


            //-------------------------------------------------------Question 7---------------------------------------------------------
            /* 7-Check if the input number even or odd
             */
            System.out.println("Q7 Even Odd checker");

            //Ask the user to input a number
            try {
                System.out.print("Please enter a number: ");
                int number = in.nextInt();
                //print even or odd
                System.out.printf("number %d is %s\n", number, (number % 2 == 0 ? "even" : "odd"));
            } catch (InputMismatchException e){
                System.out.println("Your input should be a number.");
                in.nextLine();
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 7 end-------------------------------------------------------


            //-------------------------------------------------------Question 8---------------------------------------------------------
            /* write a program to convert from Celsius ro Fahrenheit
             */
            System.out.println("Q8 Celsius to Fahrenheit convertor");

            try {
                //Ask user to enter the temperature in Celsius
                System.out.print("Please enter the Celsius degree: ");
                double celsius = in.nextDouble();
                if(celsius < -273.15)
                    throw new RuntimeException("Celsius can't be lower than -273.15");
                //print the result
                System.out.println("Temperature in Fahrenheit is: " + (celsius * 9 / 5 + 32));
            }catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 8 end-------------------------------------------------------


            //-------------------------------------------------------Question 9---------------------------------------------------------
    /* print a char of a string given its index
    both from user
    */
            System.out.println("Q9 determine index character");
            try {
                //Ask user to enter a string and index
                in.nextLine();
                System.out.print("Please enter a string: ");
                String sentence = in.nextLine();

                //Print the result
                System.out.print("Please enter an index: ");
                char targetChar = sentence.charAt(in.nextInt());
                System.out.println("The char in this index is: " + targetChar);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 9 end-------------------------------------------------------


            //-------------------------------------------------------Question 10---------------------------------------------------------
            /* 10- Print area and perimeter of rectangle
             */
            System.out.println("Q10 Rectangle perimeter and area calculator");
            try {
                //Ask user for width and height
                System.out.print("Width = ");
                double width = in.nextDouble();
                System.out.print("Height = ");
                double height = in.nextDouble();
                if(height <= 0 || width <= 0){
                    throw new RuntimeException("width and height should be positive numbers (>0).");
                }

                //print results
                System.out.println("Area = " + width * height);
                System.out.println("Perimeter = " + 2 * (height + width));
            }catch (InputMismatchException e){
                System.out.println("You should enter a number");
                in.nextLine(); //to make sure that the wrong input doesn't continue
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 10 end-------------------------------------------------------


            //-------------------------------------------------------Question 11---------------------------------------------------------
            /* Compare two numbers
             */
            System.out.println("Q11 Compare two numbers.");
            try {
                compareTwoNumbers();
            }catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine();
            }

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 11 end-------------------------------------------------------


            //-------------------------------------------------------Question 12---------------------------------------------------------
            /*convert seconds to hours:minutes:seconds
             */
            try {
                secondDisplayer();
            } catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine();
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 12 end-------------------------------------------------------


            //-------------------------------------------------------Question 13---------------------------------------------------------
    /* Write a java program that accepts four integers from the user
    and print equals if all are equals
    */
            System.out.println("Q13 Equality checker");

            //take input and apply
            try {
                System.out.print("Please enter number1: ");
                int n1 = in.nextInt();
                boolean equally = true;
                for (int i = 1; i < 4; i++) {
                    System.out.printf("Please enter number%d: ", i + 1);
                    int n2 = in.nextInt();
                    if (n1 != n2) {
                        equally = false;
                    }
                    n1 = n2;
                }

                System.out.println(equally ? "Numbers are equal" : "Numbers are not equal");
            } catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine();
            }


            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 13 end-------------------------------------------------------


            //-------------------------------------------------------Question 14---------------------------------------------------------
    /* Write a java program that reads an integer
    and check whether it is negative, zero or positive
    */
        try {
            System.out.println("Q14 Single number sign checker");

            //Ask user to enter a value
            System.out.print("Please enter a number: ");
            int number = in.nextInt();

            //print the result
            if (number > 0)
                System.out.println("number is positive");
            else if (number == 0)
                System.out.println("number is zero");
            else
                throw new Exception("number is negative");
        } catch (InputMismatchException e){
            System.out.println("Your input should be a number");
            in.nextLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 14 end-------------------------------------------------------


            //-------------------------------------------------------Question 15---------------------------------------------------------
    /* 15- take integers from user until user enter -1
    then show number of positive, zeros and negatives integers
    */
            System.out.println("Q15 multiple number sign checker");

            System.out.println("Enter numbers: (enter -1 to stop):");
            int positives = 0;
            int negatives = 0;
            int zeros = 0;
            try {
                while (true) {
                    int n = in.nextInt();
                    if (n == -1)
                        break;
                    else if (n > 0)
                        positives++;
                    else if (n == 0)
                        zeros++;
                    else
                        negatives++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Your input should be a number");
                in.nextLine();
            }
            System.out.println("positives :" + positives);
            System.out.println("zeros :" + zeros);
            System.out.println("negatives :" + negatives);

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 15 end-------------------------------------------------------


            //-------------------------------------------------------Question 16---------------------------------------------------------
            /* reverse digits of a number took from user
             */
            System.out.println("Q16 number reverser");

            //Ask user to enter a number
            try {
                System.out.print("please enter a number: ");
                int numberToReverse = in.nextInt();
                int reversedNumber = 0;

                //reverse
                while (numberToReverse != 0) {
                    reversedNumber *= 10;
                    reversedNumber += numberToReverse % 10;
                    numberToReverse /= 10;
                }
                System.out.println("Reversed number: " + reversedNumber);
            } catch (InputMismatchException e){
                System.out.println("Your input should be a number");
                in.nextLine();
            }


            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 16 end-------------------------------------------------------


            //-------------------------------------------------------Question 17---------------------------------------------------------
    /* take integers from user until user enter -1
    then show the biggest and the smallest number
    */
            System.out.println("Q17 The biggest and the lowest integer.");

            //take inputs
            try {
                System.out.print("Enter a number: ");
                int max = in.nextInt();
                int min = max;
                while (true) {
                    System.out.print("do you want to continue: (write 'y' to continue 'n' to stop)");
                    char c = Character.toLowerCase(in.next().charAt(0));
                    if (c == 'n')
                        break;
                    else if (c == 'y') {
                        System.out.print("Enter a number: ");
                        int n = in.nextInt();
                        if (n > max)
                            max = n;
                        else if (n < min)
                            min = n;
                    }
                    else{
                        throw new RuntimeException("You should enter y for yes or n for no");
                    }
                }
                //prints the result
                System.out.println("The largest number is: " + max);
                System.out.println("The smallest number is: " + min);

            } catch (InputMismatchException e){
                System.out.println("Your input should be a number");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }




            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 17 end-------------------------------------------------------


            //-------------------------------------------------------Question 18---------------------------------------------------------
            /* 18-Determine number of char 'a' in sentence
             */

            System.out.println("Q18 determine repeating of 'a'");

            //Ask user to enter a sentence
            System.out.print("Please enter a string: ");
            in.nextLine();
            String string = in.nextLine();

            //determine and print
            int aCounter = 0;
            for (int i = 0; i < string.length(); i++) {
                if (Character.toLowerCase(string.charAt(i)) == 'a')
                    aCounter++;
            }
            System.out.println("number of 'a' is: " + aCounter);

            System.out.println("--------------------------------------------------------------------------------------------------------\n");
            //-----------------------------------------------------Question 18 end-------------------------------------------------------


            System.out.println("Goodbye!");
            System.exit(0);
    }


    public static void circleCalculations(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Radius should be positive");
        }
        //Calculations
        double PI = Math.PI;
        System.out.println("Perimeter is = " + (2 * PI * radius));
        System.out.println("Area is = " + (PI * radius * radius));
    }


    public static void compareTwoNumbers() throws InputMismatchException {
        //Ask user to enter two number
        System.out.print("Enter first integer: ");
        int firstInt = in.nextInt();
        System.out.print("Enter second integer: ");
        int secondInt = in.nextInt();

        //comparison and print
        if (firstInt == secondInt) {
            System.out.println(firstInt + " == " + secondInt);
            System.out.println(firstInt + " >= " + secondInt);
            System.out.println(firstInt + " <= " + secondInt);
        } else {
            System.out.println(firstInt + "!=" + secondInt);
            if (firstInt > secondInt) {
                System.out.println(firstInt + ">" + secondInt);
                System.out.println(firstInt + ">=" + secondInt);
            } else {
                System.out.println(firstInt + "<=" + secondInt);
                System.out.println(firstInt + "<" + secondInt);
            }
        }
    }


    public static void secondDisplayer() throws InputMismatchException{
        System.out.println("Q12 Seconds displayer");

        //Ask user to enter seconds
        System.out.print("Please enter seconds: ");
        int seconds = in.nextInt();
        if (seconds < 0)
         throw new RuntimeException("seconds can't be negative");
        //calculate and prints
        int secondsBox = seconds % 60;
        int minutesBox = (seconds / 60) % 60;
        int hoursBox = (seconds / 3600);
        System.out.printf("%d:%d:%d\n", hoursBox, minutesBox, secondsBox);

    }
}
