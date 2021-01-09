// YouTube video Java Tutorial for Beginners [2020]

package com.package;

import java.util.Date;
import java.awt.*;
import java.util.Arrays;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // Primitive and Reference Types
        int age = 30;
        System.out.println(age);
        int temp1 = 20, int temp2 = 50;
        age = 35
        System.out.println(age);
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
        byte age = 40;
        long viewsCount = 3_123_456_789L; // use l or L at the end to let java compiler know this value is a long
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true; // boolean is true or false
        byte age = 30;
        Date now = new Date();
        now.getTime()
        System.out.println(now);
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        Point point1 = new Point(x:1, y:1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("z"));
        System.out.println(message.replace(target:"!", replacement: "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); // gets rid of 'white space'
        String message = "Hello \"Chris\"";
        System.out.println(message);
        // c:\Windows\...
        String message = "c:\tWindows\\..."; // \t is a tab \n is a new line
        System.out.println(message);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        int [] numbers = { 2, 3, 5, 1, 4 };
        System.out.println(numbers.length);
        Systm.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        Systm.out.println(Arrays.toString(numbers));
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
        int[][] numbers = { { 1, 2, 3}, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
        final float PI = 3.14F; # final makes PI a constant
        int pi = 1;
        int result = 10 + 3;
        System.out.println(result);
        int result = 10 / 3;
        System.out.pringtln(result);
        double result = (double)10 / (double)3;
        System.out.println(result);
        int x = 1;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
        int x = 1;
        x += 2; # can use -= or /= as well
        System.out.println(x);
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        double x = 1.1;
        double y = x + 2;
        System.out.println(y);
        int y = (int)x + 2;
        System.out.println(y);
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
        // The Math Class
        int result = Math.round(1.1F);
        System.out.println(result);
        int result = (int)Math.ceil(1.1F);
        System.out.println(result);
        int result = (int)Math.floor(1.1F);
        System.out.println(result);
        int result = Math.max(5, 7);
        System.out.println(result);
        int result = Math.min(5, 7);
        System.out.println(result);
        double result = Math.random();
        System.out.println(result);
        double result = Math.random() * 100;
        System.out.println(result);
        int result = (int) Math.round(Math.random() * 100); // round returns a long
        System.out.println(result);
        int result = (int) (Math.random() * 100); // put math.random()*100 in parenthesis so (int) goes to the entire thing and not just the random method
        System.out.println(result);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format( number: 1234567.891);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format( number: 0.1);
        System.out.println(result);
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        // reading input
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte().trim(); # nextFloat nextDouble next, reads only one token, nextLine, reads all tokens in line
        System.out.println("You are " + age);
        // Control Flow
        int x = 1;
        int y = 1;
        System.out.println(x == y); //  !=  >  <  >=  <=
        // Logical Operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30 // && is the logical and operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || is the 'or' operator
        // if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20 && temp <= 30)
            System.out.println("It is a nice day");
        else
            System.out.println("Cold day");
        // Simplifying if statements
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        // The Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        // Switch Statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
              System.out.println("You're a guest");
        }
        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You are a guest");
        // For Loops
        for (int i = 1; i <= 5; i++) // initialize i, set boolean, counter
            System.out.println("Hello World " + i);
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World " + i);
        // While Loops
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World " + i);
        int i = 0;
        while (i > 0) {
            System.out.print("Hello World " + i);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"));
                continue;
            if (input.equals("quit"));
                break; // break gets out of loop
            System.out.println(input);
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"));
                continue;
            if (input.equals("quit"));
                break;
            System.out.println(input);
        }
        // For-each loop
        String[] fruits = { "Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        String[] fruits = { "Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        for (String fruit : fruits) // same as above but this is a for-each loop
            System.out.println(fruit);
    }
}
