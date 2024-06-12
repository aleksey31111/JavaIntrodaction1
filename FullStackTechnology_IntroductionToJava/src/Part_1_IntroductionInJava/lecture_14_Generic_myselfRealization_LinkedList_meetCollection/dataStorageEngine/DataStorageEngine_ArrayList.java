package Part_1_IntroductionInJava.lecture_14_Generic_myselfRealization_LinkedList_meetCollection.dataStorageEngine;

import java.util.ArrayList;
import java.util.List;

public class DataStorageEngine_ArrayList {
    public void dataStorageEngine_ArrayList() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }
        System.out.println(intList.size());
        for (Integer intNumber: intList) {
            if (intNumber%111==0) {
                System.out.println("Числа из 1000 Делящееся На 111: " + intNumber);
            }
        }
    }



}
