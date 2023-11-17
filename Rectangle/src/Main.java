import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        String fname = "rects.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fname));
            ArrayList<Rectangle> list = new ArrayList<Rectangle>();
            int i = 1;
            int size = list.size() / 2;

            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                String[] s_splitted = s.split(" ");
                double w = Double.parseDouble(s_splitted[0]);
                double h = Double.parseDouble(s_splitted[1]);
                Rectangle rr = new Rectangle("R" + i, w, h);
                i++;
                list.add(rr);

                list.sort(Comparator.comparingDouble(Rectangle::getPerimetr));
                System.out.println(list);
            }


            for (Rectangle r : list) {
                System.out.println(r.getPerimetr());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
        
    
