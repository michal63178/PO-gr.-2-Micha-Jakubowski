import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        FileUtil fileUtil = new FileUtil("zad2.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znak");
        char c = scan.next().charAt(0);

        System.out.println("No. of words in file: " + fileUtil.getWordCount(c));
    }
}

class FileUtil {
    static BufferedReader reader = null;
    public FileUtil(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public static int getWordCount(char c) throws IOException {
        int licznik = 0;
        String data;
        while((data = reader.readLine()) != null){
        if(data.charAt(licznik) == c)
            licznik += 1;
        }
        return licznik;
    }
}