import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.Comparator;

import static java.lang.System.in;

public class Main {
    static HashMap<String, Integer> sagedus = new LinkedHashMap<>();
    static HashMap<String, List<String>> s6nad = new HashMap<>();
    public static void main(String[] args)
            throws IOException {
        File file = new File("C:\\Users\\thoma\\Desktop\\All stars.txt");
        Scanner lugeja = new Scanner(file);

        while (lugeja.hasNext()){
            String[] next = lugeja.next().split(" ");
            String viimane = next[next.length -1];
            String viimane_t2ht = viimane.substring(viimane.length() -1);
            if(viimane_t2ht.matches("[a-zA-Z]+")){}else {
                viimane_t2ht = String.valueOf(viimane.length() -2);
            }
            if(sagedus.containsKey(viimane_t2ht)){
                Integer arv = sagedus.get(viimane_t2ht);
                arv ++;
                sagedus.put(viimane_t2ht, arv);

            } else {
                sagedus.put(viimane_t2ht, 1);
            }
            if(s6nad.containsKey(viimane_t2ht)){
                if(s6nad.get(viimane_t2ht).contains(viimane)){

                } else {
                    s6nad.get(viimane_t2ht).add(viimane);}
            } else {
                s6nad.put(viimane_t2ht, new ArrayList<String>());
                s6nad.get(viimane_t2ht).add(viimane);
            }
        }
        sorteeri();
        for(Map.Entry<String, List<String>> entry : s6nad.entrySet()){
            String key = entry.getKey();
            int kordi = sagedus.get(key);
            PrintWriter fail = new PrintWriter(key + ".txt", StandardCharsets.UTF_8);
            fail.println(key + " tähega lõppevaid sõnu on " + kordi);
            for (int i = 0; i < entry.getValue().size(); i++) {
                fail.println(entry.getValue().get(i));
            }
            fail.close();


        }
        System.out.println((s6nad));
    }
        public static void sorteeri(){sagedus.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
            //.forEachOrdered(x -> sagedus.put(x.getKey(), x.getValue()));
            System.out.println(sagedus);
    }


}
