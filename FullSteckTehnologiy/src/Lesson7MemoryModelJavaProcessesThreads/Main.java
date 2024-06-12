package Lesson7MemoryModelJavaProcessesThreads;

public class Main {
    public static void main(String[] args) {
//        Thread catThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello From Cat Thread!");
//            }
//        });
//        catThread.start();
//        System.out.println("Hello From MAIN Thread!");


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello From Cat Thread!!");
            }
        }).start();
        System.out.println("Hello From MAIN Thread!");

        SequenceGenerator sequenceGenerator = new SequenceGenerator();

        // Запуск Нескольких Потоков, чтобы
        // Они Могли Взять "Некоторые Значения".
        for (int i = 0; i < 30; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " "
                            + sequenceGenerator.generate());
                }
            }).start();
        }

        // Пример Reordering
        //Integer b1 = new Inteer(10);
        //Integer b2 = new Integer(12);
        //Integer b3 = new Integer(11);
        //Integer b4 = new Integer(1);
        //Integer b5 = new Integer(100);

        //System.out.println(b5);
        //System.out.println(b1) ;

        // Подсчёт Времени Выполнения.
        Long startTime = System.nanoTime();
        // Операции
        Long endTime = System.nanoTime();
        System.out.println(endTime -startTime);
    }
}
