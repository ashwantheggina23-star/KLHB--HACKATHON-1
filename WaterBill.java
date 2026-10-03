/*
1b) If-Else Condition:

Write a Java program to calculate the water bill based on water consumption. Read the water consumption in litres.

If consumption is 500 litres or less, the bill is Rs.100.
If consumption is more than 500 litres, the bill is Rs.200.
Use an if-else statement and display the water bill.
*/

import java.util.Scanner;

class WaterBill {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter Water Consumption: ");
double wc = sc.nextDouble();

int bill;

if (wc <= 500) {
     bill = 100;
} else {
     bill = 200;
}

        System.out.println("Water Bill: Rs." + bill);
    }
}