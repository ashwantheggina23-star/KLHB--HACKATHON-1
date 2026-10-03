/*
1c) Methods:

Write a Java program to calculate the total water consumption of a household using a method.

Create the following method:

calculateTotal(int morningUsage, int eveningUsage)
The method should return the total water consumption. Read the morning and evening water usage from the user, call the method, and display the total consumption.

Answer:(penalty regime: 0, 0, ... %)
*/

import java.util.Scanner;

public class TotalWaterUsage {

public static int calculateTotal(int morningUsage, int eveningUsage) {

   return morningUsage + eveningUsage;

}

public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

int morning,evening,total;

 System.out.print("Enter morning water usage (litres): ");
     morning = scanner.nextInt();

 System.out.print("Enter evening water usage (litres): ");
     evening = scanner.nextInt();

     total = calculateTotal(morning, evening);

 System.out.println("Total Water Consumption: " + total + " litres");


}

}



