/* 
1a) Data Types:

Write a Java program to store and display the following details of a household:

Number of family members – integer
Water consumed in litres – decimal value
House number – integer
Water usage status – character
Use appropriate Java data types for each value and display all the details.
*/



class WaterBillDetails {

public static void main(String[] args) {

int familymem = 4;
double waterusage= 405.40;
int Hno = 301;
char stats = 'l';  //( l= low, h= high)

System.out.println("Family members: " + familymem);
System.out.println("Water Consumption: " + waterusage + " L");
System.out.println("House Number: " + Hno);
System.out.println("Usage Status: " + stats);

}
}


