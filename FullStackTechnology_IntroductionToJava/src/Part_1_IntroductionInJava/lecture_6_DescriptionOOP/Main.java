package Part_1_IntroductionInJava.lecture_6_DescriptionOOP;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat();
        loriCat.setName("Lori");
        loriCat.setWeight(4);

        Cat baxterCat = new Cat();
        baxterCat.setName("Baxter");
        baxterCat.setWeight(6);

        FightClub fightTwoCat = new FightClub();

//        String catWinnerName = fightTwoCat.fight(loriCat, baxterCat);
//        System.out.println("Winner: " + catWinnerName);
        System.out.println("Winner: " + fightTwoCat.fight(loriCat, baxterCat));

        loriCat.setWeight(13);
        System.out.println("New Winner: " + fightTwoCat.fight(loriCat, baxterCat));
    }
}
