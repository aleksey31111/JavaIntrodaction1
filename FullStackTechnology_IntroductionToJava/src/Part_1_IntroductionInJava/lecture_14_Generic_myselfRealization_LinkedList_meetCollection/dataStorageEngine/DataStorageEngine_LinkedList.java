package Part_1_IntroductionInJava.lecture_14_Generic_myselfRealization_LinkedList_meetCollection.dataStorageEngine;

import java.util.LinkedList;
import java.util.List;

public class DataStorageEngine_LinkedList {
    public void dataStorageEngine_LinkedList() {
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 2000; i++) {
            integerList.add(i);
            integerList.size();
        }
        for (Integer i : integerList) {
            if (i % 115 == 0) {
                System.out.println("Числа из 2000 Делящееся На 115: " + i);
            }
        }
    }
}
