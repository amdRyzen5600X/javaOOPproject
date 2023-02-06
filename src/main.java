import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("""
                    █   █ █▀▀ █   ▄▀▀ ▄▀▄ █▄ ▄█ █▀▀     ▀█▀ ▄▀▄     ▄▀▄ ▀ ▀█▀ █ █    █▄ ▄█ ▄▀▄ ▄▀▄ █▀▄ █   █▀▀
                    █ █ █ █▀▀ █ ▄ █   █ █ █ █ █ █▀▀      █  █ █     █▀█ █  █  █ █ ▀▀ █ █ █ █ █ █ █ █ █ █ ▄ █▀▀
                     ▀ ▀  ▀▀▀ ▀▀▀  ▀▀  ▀  ▀   ▀ ▀▀▀      ▀   ▀      ▀ ▀ ▀  ▀   ▀     ▀   ▀  ▀   ▀  ▀▀  ▀▀▀ ▀▀▀

                    Select sign in option!
                    1) Registration
                    2) Login
                    3) Exit
                    """);
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> Enter.register(sc);
                case 2 -> Enter.login(sc);
                case 3 -> System.exit(0);
                default -> System.out.println("Sorry, invalid value entered. Try again!\n");
            }
        }while (true);
    }
}
