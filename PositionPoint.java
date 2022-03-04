
import java.util.Scanner;

public class PositionPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (X)");
        int x = sc.nextInt();
        System.out.println("Enter (Y)");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("The Location Of The Point At The Origin");
        }else if (x >= 0 && y >= 0) {
            System.out.println("The Position of The Point in The First Quarter");
        }else if (x <= 0 && y >= 0) {
            System.out.println("Point Position in The Second Quarter");
        }else if (x <=0 && y <= 0) {
            System.out.println("Point Position in The Thirad Quarter");
        }else if (x >= 0 && y <= 0) {
            System.out.println("Point Position in The Fourth Quarter");
        }
    }
}
