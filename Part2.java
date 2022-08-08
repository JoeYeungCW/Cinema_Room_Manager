package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        System.out.println("Total income:");
        if(row*seats>=60){
            int frontRows=0,backRows=0;
            if(row%2==0){
                System.out.println("$"+row*seats*9);
            }
            else{
                frontRows=(row-1)/2;
                backRows=(row+1)/2;
                System.out.print("$");
                System.out.print(frontRows*seats*10+backRows*seats*8);
            }
        }
        else if(row*seats<60){
            System.out.println("$"+row*seats*10);
        }
    }
}
