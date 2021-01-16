// tutorial from YouTube video -- Java Full Course | Java Tutorial for Beginners [2021] [NEW]
// I change amigoscode to chris for basically every opportunity.

package com.chris;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //write your code here
        System.out.println("Hooray my first java app");
        char a = 'A';
        System.out.println("Hooray my frist java program");
    /* comments!
    more comments!
    Comments with a kick!
    */

        // primitive data types
        int number1 = 100; // int stores whole numbers from -2,147 mil to -2,147 mil
        String brand = "chris's oreos";
        double number2 = 100.11;
        Date date = new Date();
        byte theByte = -128; // -128 to 127 for byte
        short theShort = 8_989; // -32768 to 32767 for short
        long theLong = 12_321_354_324_652_431L; // long stores whole numbers from -9,223 quadrillion to 9,223 quadrillion. put l or L at the end of the number
        float pi = 3.14F; // F of f at the end of a float
        boolean isAdult = false; // either true or false
        char nameInitial = 'A';
        System.out.println(number1);
        System.out.println(brand);
        System.out.println(number2);
        System.out.println(data);
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(isAdult);
        System.out.println(nameInitial);

        // reference data types
        String name = new String(original:"chris");
        Systm.out.println(name);
        Systm.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);
        Person alex = new Person(name:"alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " ")

        alex.name = "Alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

        // Number variables
        int zero = 0;
        int one = 1;
        double number3 = 2.1415;
        int subscriberCountForChris = 1_000_000;

        // The String Class
        char a = 'A';
        char b = 'B';
        String name = new String(original:"Chris");
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String(original:"code");
        System.out.println(name.contains("code"));
        System.out.println(name.contains(code));
        System.our.println(name.equals(code));
        Date date = new Date();
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        // Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = ten + two;
        System.out.println(addition);
        System.out.println(10 * 3);
        System.out.println(10 % 3);

        // The Math Class
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(36));
        System.out.println((int) Math.sqrt(36));
        System.out.println(Math.PI);

        // Comparison Operators
        int khalidAge = 18;
        int mariamAge = 20;
        boolean isKhalidOlderThanMariam = khalidAge > mariamAge; // delete line?
        System.out.println(khalidAge > mariamAge);
        System.out.println(khalidAge >= mariamAge);
        System.out.println(khalidAge < mariamAge);
        System.out.println(khalidAge <= mariamAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge);

        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        boolean isChrisMember = true;
        System.out.println((isAdult || isStudent) && isChrisMember);
        System.out.println((!isAdult || isStudent) && isChrisMember); // the ! flips the boolean
        System.out.println(isAdult == true);
        String name = "Mark";
        System.out.println((10 > 8 || <= 2) && !isAdult && name.contains("M"));

        // If Statements
        int age = 17;
        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
        System.out.println(message);
        if (age >= 18) {
            System.out.println("Hooary... I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }

        // Switch Statement
        String sex = "FEMALE";
        if (sex.equals("FEMALE")) {

        } else if (sex.equals("MALE")) {

        } else if (sex.equals("PREFER_NOT_SAY")) {

        } else {

        }
        switch (sex) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("I prefer not to say");
                break;
            default:
                System.out.println("Unknown sex");
        }

        // Arrays
        int zero = 0;
        int one = 1;
        int [] numbers = new int[2];
        System.out.println(Arrays.toString(numbers));
        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        boolean [] numbers = new boolean[3];
        System.out.println(Arrays.toString(numbers));
        String [] numbers = new String[3];
        System.out.println(Arrays.toString(numbers));
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));
        int [] numbers = {2, 0, 1, 5, 8};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        String [] names = {"Goodbye World"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        // Arrays and Indexes
        int[] numbers = {2, 0, 1, 4, 100};
        int two = numbers[0];
        int zero = numbers[1]; // make sure index is actually in the array, no 5, 6, etc
        System.out.println(two);
        System.out.println(zero);

        //Loops
        int[] numbers = {1, 2, 3, 4, 5};

        int number = 0;
        number++; // same as number = number + 1
        System.out.println(number);
        number--;
        System.out.println(number);
        number -= 5;
        System.out.println(number);

        // Enhanced For Loop
        System.out.println("Enhanced for loop");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names} {
            break;
            System.out.println(name);
            break;
        }

        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }

        // While Loop
        int count = 1;
        while (count <= 20) {
            System.out.println("count: " + count);
            count++;
        }

        // Do While Loop
        int count = 1;
        do {  // do while loops executes at least once
            System.out.println(count);
            count++;
        }
        while (count <= 20);

        while (true) {

        }

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult");
        } else {
            System.out.println("and you are an adult :)");
        }

        // Methods
        System.out.println(); // println is a method
        String brand = "Samsung";
        System.out.println(brand.toUpperCase()); //toUpperCase is also a method. Notice both println and toUpperCase have parenthesis
        boolean startsWithS = brand.startsWith("S");
        System.out.println(startsWithS);
        System.out.println(brand.endsWith("g"));

        // Undrstanding Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurences(letters, searchLetter: 'A');
        System.out.println();

        // Classes and Objects
        Lens lensOne = new Lens(brand:"sony", focalLength:"85mm", isPrime:true);
        Lens lensTwo = new Lens(brand:"sony", focalLength:"30mm", isPrime:true);
        Lens lensThree = new Lens(brand:"canon", focalLength:"24-70mm", isPrime:false);
        System.out.println("Lens: 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("Lens: 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("Lens: 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);

        // Classes
        Passport ukPassport = new Passport(number:"1234", country: "England (UK)", LocalDate.of(year:2025, month:1, dayOfMonth:13))
        Passport ukPassport = new Passport(number:"1235", country:"USA", LocalDate.of(year:2030, month:2, dayOfMonth:5))

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }


    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }

    public static int countOccurences(char [] letters, char searchLetter) {
        System.out.println(Arrays.toString(letters));
        System.out,println(searchLetter);
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;

    }
}
