package Lesson48Enum_enumeration;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(15), SPRING(20);

private int temperature;
    Season(int temperfture) {
        this.temperature = temperfture;
    }

    public int getTemperature() {
        return temperature;
    }
}
