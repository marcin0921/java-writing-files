

import java.io.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileCreate {


    public static ArrayList<String> fileList = new ArrayList<>();


    public static void findAllFiles() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        File folder = new File(s);
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                fileList.add(listOfFile.getName());
            }

        }
    }

    public void createNewFile() throws IOException {
        String nameFile;
        System.out.println("Podaj nazwę pliku: ");
        nameFile = Menu.getUserInput() + ".txt";
        new DataOutputStream(new FileOutputStream(nameFile));
        addFileToList(nameFile);
    }

    public boolean checkIsExists(String nameFile) {
        return fileList.contains(nameFile);
    }

    public void addFileToList(String nameFile) throws IOException {

        if (checkIsExists(nameFile)) {
            System.out.println("Taki plik już istnieje! Wpisz inną nazwę.");
            createNewFile();
        }else {
            fileList.add(nameFile);
        }

    }

}
