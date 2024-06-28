package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String dirName = "c:/testing";
        String fileName = "csvfile.txt";
        File newDir = new File (dirName);
        newDir.mkdirs();
        File newFile = new File (dirName + "/" + fileName);


        PrintWriter pw = new PrintWriter(newFile);
        List<String> output = new ArrayList<>();
        output.add("Just one");
        output.add("This is another line");
        output.forEach(pw::println);
        pw.close();

        FileWriter newFileWriter = new FileWriter(dirName + "/" + fileName, true);
        pw = new PrintWriter(newFileWriter);
        output.forEach(pw::println);
        pw.close();
    }
}
