package Part_1_IntroductionInJava.lecture_13_immutableObject.mySelf_immutableObject;

public class Owner {

        private final String name;
        public Owner(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
//        public void setName(String name) {
//            this.name = name;
//        }

        @Override
        public String toString() {
            return "Owner{" +
                    "name='" + name + '\'' +
                    '}';
        }

}
