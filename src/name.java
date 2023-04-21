import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class name {

    public static void main(String[] args) throws IOException {
//        try {
//            Scanner sc = new Scanner(new File("input.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        String s = new String();
        //int count = 0;
        int c = 0;
        String[] name = new String[in.available()];
        String text = new String(String.valueOf(name));
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                count++;
            }

            c = count;
        }
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        int count = 0;
//        while (reader.ready()) {
//            for (char symbol : reader.readLine().toCharArray()) {
//                if (symbol == 'X') {
//                    count++;
//                }
        // c = count;
//            }
//        }
        System.out.println(c);
    }
}

