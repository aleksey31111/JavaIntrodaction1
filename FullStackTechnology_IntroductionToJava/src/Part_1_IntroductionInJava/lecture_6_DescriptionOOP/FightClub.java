package Part_1_IntroductionInJava.lecture_6_DescriptionOOP;

public class FightClub {
    public String fight(Cat firstCat, Cat secondCat) {
//        int firstCatWeight = firstCat.getWeight();
//        int secondCatWeight = secondCat.getWeight();
//        if (firstCatWeight > secondCatWeight) { return firstCat.getName(); }
//        else return secondCat.getName();
//    }
        if (firstCat.getWeight() > secondCat.getWeight()) { return firstCat.getName();
        } else return secondCat.getName();

    }
}
