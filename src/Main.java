import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

// Givens (entered by user)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your total bill amount: ");
        double totalBill = scan.nextDouble();

        System.out.println("Please enter your tip percentage: ");
        int tipPercent = scan.nextInt();

        System.out.println("Please enter total number of people in your party: ");
        int numOfPeople = scan.nextInt();

 // Calculations
        double totalBillAndTip = (1 + tipPercent/100) * totalBill;
        double totalTip = totalBill * (tipPercent * 1 / 100);
        double tipPerPerson = totalTip / numOfPeople;
        double totalPerPerson = (totalBill / numOfPeople) + tipPerPerson;

        System.out.println("The total tip amount is " + totalTip);
        System.out.println("The total bill and tip amount is " + totalBillAndTip);
        System.out.println("Each person has to tip " + tipPerPerson);
        System.out.println("Each person has to pay " + totalPerPerson + " in total");




    }
}