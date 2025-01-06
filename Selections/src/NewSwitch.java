import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {

        //switch method2

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");

        String day = input.nextLine();

        String result = "";
        result = switch (day){

            case "Saturday" -> "workout";

            case  "monday" -> "inspect site";
            case  "Tuesday" -> "inspect ranch";
            case  "Wednesday" -> "visit first wife";
            default -> "go to mosque";

        };
        System.out.println("Today is: " + result + " day");
    }
}
