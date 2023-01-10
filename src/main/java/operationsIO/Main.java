package operationsIO;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        path();
//        buffer();
//        bufferedReader();
//        fileReader();
//        fileInputStream();
    }

    private static void path() throws IOException {
        Path path = Paths.get("src/main/resources/channelFile");
        if (!Files.exists(path))
        Files.createFile(path);  //createFile stworzy plik w ścieżce wyzej
        Files.write(path, "Wiktoria".getBytes(), StandardOpenOption.WRITE);
    }

    private static void buffer() {
        CharBuffer charBuffer = CharBuffer.allocate(6);
        String name = "Tomek";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            charBuffer.put(c);
        }
//        charBuffer.put('A');
        System.out.println(Arrays.toString(charBuffer.array()));
    }

    private static void bufferedReader () throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");
        var bufferedReader = new BufferedReader(fileReader);
        var bufferedWriter = new BufferedWriter(fileWriter);

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());  // jesli nie ma kolejnej linii wystwietli: null

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            System.out.println(line);
        }
    }

    private static void fileReader() throws IOException {
//        zamiast pisać typ możemy napisać 'var'
//        FileReader fileReader = new FileReader("src/main/resources/input");
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");

//        System.out.println((char) fileReader.read()); //musimy rzutować żeby wyswietilo H (zamiast 72)
        int i;
        while ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println((char) i);
    }
    }

    private static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output");
        //        System.out.println(fileInputStream.available());
//          int i = fileInputStream.read();
        // przy takim zapisie wystwieli sie 72
        // System.out.println(fileInputStream.read());


//        ***************
//        int i = fileInputStream.read();
//        char c = (char) i; //rzutowanie na typ char
//        System.out.println(c); //wyświetlanie chara (72 to duże H)

//        ***********************
//        int i = fileInputStream.read();
//        fileOutputStream.write(i);
//        System.out.println(i); // w output zapisze duże H

//        *****************************
//        int i = fileInputStream.read();
//        int i1 = fileInputStream.read();
//        char c = (char) i;
//        char c1 = (char) i1;
//        System.out.println(c);
//        System.out.println(c1);
//        int i2 = fileInputStream.read();
//        System.out.println(i2);  // kiedy nie moze nic zczytac to wyświtla: -1

//        //jezeli chcemy wyswietlic caly plik musimy zrobic petle while
//        Jeżeli tak zrobimy to wyświetli się też: -1 (72, 101, -1)
//        int i = 0;
//        while (i != -1) {
//        i = fileInputStream.read();
//            System.out.println(i);
//        }
//
//        Ten sposób wyśtwieli tylko: 72  101
//        int i;
//        while ((i = fileInputStream.read()) != -1) {
//            System.out.println(i);
//    }
//
//      Ten sposób wyśtwieli też tylko: 72  101
        int i = fileInputStream.read();
        while (i != -1) {
            System.out.println(i);
            i = fileInputStream.read();
        }
    }

}
