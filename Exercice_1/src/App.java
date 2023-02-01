import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the Time Taken by Worker :");
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        if (times >= 2 && times <= 3) {
            System.out.println("highly efficient");
        } else if (times >= 3 && times <= 4) {
            System.out.println("improve speed");
        }else if (times >= 4 && times <= 5) {
            System.out.println("given training");
        } else {
            System.out.println("leave the company.");
        }
    }
}
