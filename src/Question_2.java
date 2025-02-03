import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (type 'XDONE' to stop)");
        StringBuilder str = new StringBuilder();
        while (true){
            String input = sc.nextLine();
            if(input.equals("XDONE"))
                break;
            str.append(input).append(" ");
        }
        System.out.println(str);
    }
}
