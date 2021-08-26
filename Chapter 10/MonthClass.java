import java.util.Scanner;

public class MonthClass {
    public static void main(String[] args) throws Exception{

        Scanner keyboard = new Scanner(System.in);

        try{
            System.out.println("Enter a month number: ");
            int number = keyboard.nextInt();
            keyboard.nextLine();
            Month mNumber = new Month(number);
            System.out.println("Your corresponding month name is: "+mNumber.getMonthName());
            System.out.println("Enter a month name: ");
            String Name = keyboard.nextLine();
            Month mName = new Month(Name);
            System.out.println("Your corresponding month number is: " + mName.getMonthNumber());

        }
        catch(InvalidInput e){
            System.out.println(e.getMessage());
        }
    }
}
