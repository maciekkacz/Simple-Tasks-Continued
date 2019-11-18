package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Bitwa kurska – bitwa stoczona między siłami niemieckimi a radzieckimi na froncie wschodnim" +
                " podczas II wojny światowej niedaleko miasta Kursk między 5 lipca a 23 sierpnia 1943 roku. " +
                "Niemiecka ofensywa otrzymała kryptonim „Cytadela” (niem. Zitadelle) i doprowadziła do największej bitwy" +
                " pancernej w dziejach świata, bitwy pod Prochorowką. Po powstrzymaniu niemieckiej ofensywy nastąpiły" +
                " dwie radzieckie kontrofensywy: operacja orłowska i biełgorodzko-bogoduchowska." +
                " Była to ostatnia niemiecka strategiczna operacja ofensywna na froncie wschodnim. " +
                "Zwycięstwo w tej bitwie oddało inicjatywę strategiczną w ręce Armii Czerwonej do końca wojny.";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println(words);
        System.out.println();
        Collections.shuffle(words);
        System.out.println("Lista shuffle:");
        printCollection(words);
        System.out.println();

        int position = Collections.binarySearch(words, "bitwy");
        System.out.println("Word bitwy is on the position " + position);

        int freq = Collections.frequency(words, "bitwa");
        System.out.println("Word bitwa is on the list " + freq);


    }
    public static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }
}
