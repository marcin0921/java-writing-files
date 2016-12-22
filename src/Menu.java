import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);


    public static String getUserInput() {
        return sc.nextLine().trim();
    }

    public void initMenu() throws IOException {
        String userChoose;
        do {
            System.out.println("Wybierz co chcesz zrobić, a następnie zatwierdź enterem:");
            System.out.println("[1] Stwórz nowy plik");
            System.out.println("[2] Edytuj plik");
            System.out.println("[Q] Zakończ");
            userChoose = getUserInput();
            if (userChoose.equals("1")) {
                File file = new File();
                file.createNewFile();
            }
//            if (userChoose.equals("2")) {
//                File.editFile();
//            }
        }while(!userChoose.equalsIgnoreCase("Q"));


    }
}
