package Lesson40Exception_Part4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4  {
    public static void main(String[] args) {  // throws IOException, ParseException {

        try {
            run();
        } catch (Exception e){
            System.out.println("Oбработка Исключений");
        } //  catch (ParseException e){}  // Не Имеет Смысла.
       // catch (IOException | ParseException e) {
            //throw new RuntimeException(e);
       //     e.printStackTrace();
       // } //catch (ParseException e) {
            //throw new RuntimeException(e);
//            e.printStackTrace();
//        }

//        try {
//            run();
//        } catch (IOException e){
//            e.printStackTrace();
//        } catch (ParseException e){
//            e.printStackTrace();
//        }

    }
    public static void run() throws IOException, ParseException, FileNotFoundException, IllegalArgumentException {

    }
}
