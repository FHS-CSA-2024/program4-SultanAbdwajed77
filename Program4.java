//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)


public class Program4 {
    public static void main(String[] args) {
        // Declare Variables
        int a = 475;
        int b = 821;
        int c = 369;
        int d = 562;

        
        Scanner intScanner = new Scanner(System.in);

        //User Input
        System.out.println("Enter the first 3 digit number: ");
        int a = intScanner.nextInt();

        System.out.println("Enter the second 3 digit number: ");
        int b = intScanner.nextInt();

        System.out.println("Enter the third 3 digit number: ");
        int c = intScanner.nextInt();

        System.out.println("Enter the fourth 3 digit number: ");
        int d = intScanner.nextInt();
        
        
        int sum = a + b + c + d;

        double average = sum / 4.0;

        // Output the results
        System.out.println("The sum of the four numbers IS  " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + average);
    }
}





