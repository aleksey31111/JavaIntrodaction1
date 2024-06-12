//package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module;

/**
 * Класс Bill будет содеражать поле с числовым значением внутри:
 *      например Integer amount
 * Класс
 */
public class Bill {
    private int numberValue;


    public Bill(int numberValue) {
        this.numberValue = numberValue;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(int numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "numberValue=" + numberValue +
                '}';
    }
}
