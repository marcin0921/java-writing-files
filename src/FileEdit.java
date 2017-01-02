import java.io.*;

public class FileEdit {

    String verify, putData;
    String nameFile;

    public void getAFile() {
        try {
            File file = new File(nameFile);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Wpisz tekst do podmiany: ");
            bw.write(Menu.getUserInput());
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.readLine() != null) {
                verify = br.readLine();
                if (verify != null) {
                    putData = verify.replaceAll("here", "there");
                    bw.write(putData);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editFile() {

        System.out.println("Podaj nazwę pliku: ");
        nameFile = Menu.getUserInput() + ".txt";


        if(FileCreate.fileList.contains(nameFile)) {
            getAFile();
        }else {
            System.out.println("Nie ma takiego pliku. Spróbuj ponownie.");

            editFile();
        }
    }

}
