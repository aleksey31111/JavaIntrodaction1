package Lesson48Enum_enumeration;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    // new DOG("собака") Еквивалентно DOG("собака")

    private String translation;
//    Animal(){}  // Пустой конструктор (По Умолчанию в Enum)

    Animal(String translation) {  // По Умолчанию в Enum
        this.translation = translation;  // Конструкторы
    }  // Являются privet.

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на руский язык " + translation;
    }

}
