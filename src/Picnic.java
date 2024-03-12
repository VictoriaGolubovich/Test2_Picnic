import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Picnic {
    public String[] getWords() {
        List<String> list = new ArrayList<>();
        try{
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st = br.readLine();
            String[] words = st.split(" ");

            for (int i = 0; i < words.length; i++) {
                if(!words[i].equals("")) {
                    list.add(words[i].toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrayWords = list.toArray(new String[0]);
        return arrayWords;
    }
}
