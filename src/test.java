import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your total: ");
        double total = scan.nextDouble();

        double totalWithTip= total * 1.10;
        System.out.println("Total with tip is " + totalWithTip);
    }
}
