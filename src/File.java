import java.io.*;
import java.util.ArrayList;

public class File {

    protected ArrayList<String> fileList;

    public void createNewFile() throws IOException {
        String nameFile;
        System.out.println("Podaj nazwę pliku: ");
        nameFile = Menu.getUserInput();
        DataOutputStream file = new DataOutputStream(new FileOutputStream(nameFile));

        addFileToList(nameFile);
    }


    public void addFileToList(String nameFile) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add(nameFile);
        fileList = list;
    }
//
//    public void isFileExists(DataOutputStream file) {
//        fileList.
//    }
//
//    public static void editFile() throws FileNotFoundException {
//        String nameFile;
//        System.out.println("Podaj nazwę pliku do edycji: ");
//        nameFile = Menu.getUserInput();
//
//
//    }


}
