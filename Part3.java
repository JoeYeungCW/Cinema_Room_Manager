package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        char[][] cinema= new char[row][seats];

        for(int i=0;i<row;i++){
            for(int j=0;j<seats;j++){
                cinema[i][j]='S';
            }
        }
        System.out.print("\n"+"Cinema:"+'\n'+"  ");
        for(int j=0;j<seats;j++) {
            System.out.print((j+1)+ " ");
        }
        System.out.println();
        for(int i=0;i<row;i++){
            System.out.print((i+1)+" ");
            for(int j=0;j<seats;j++){
                System.out.print(cinema[i][j]+" ");
                if((j+1)==seats){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("Enter a row number:");
        int trow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int tseats = scanner.nextInt();
        cinema[trow-1][tseats-1]='B';
        if(row*seats<60){
            System.out.println("\n"+"Ticket price: $10");
        }
        else{
            if((row/trow)>=2){
                System.out.println("\n"+"Ticket price: $10");
            }
            else{
                System.out.println("\n"+"Ticket price: $8");
            }
        }
        System.out.print("\n"+"Cinema:"+'\n'+"  ");
        for(int j=0;j<seats;j++) {
            System.out.print((j+1)+ " ");
        }
        System.out.println();
        for(int i=0;i<row;i++){
            System.out.print((i+1)+" ");
            for(int j=0;j<seats;j++){
                System.out.print(cinema[i][j]+" ");
                if((j+1)==seats){
                    System.out.println();
                }
            }
        }
    }
}
