package Lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world");
//        Test test = new Test(110, 90, 30, 90);
//        System.out.println(test);

//
//        Random r = new Random();
//        double v;
//        for (int i = -10; i < 20; i++) {
//
//            try {v = Math.sqrt(i) / r.nextInt(3);
//                 System.out.println(v);   // Защищенный код
//            } catch (Exception e) {             // исключение, не всегда выполняется. если нет ошибок
//                System.out.println("Exception block starts");
//                System.out.println("x<0 or b=0");
//            }
//            finally {                                         // выполняется всегдя
//                v = Math.sqrt(-1*i)/(r.nextInt(3)+1);
//                System.out.println(v + "  finally i =  " + i);
//            }
////            catch (ArithmeticException e) {
////                System.out.println("error");
////            }
//
//        }
//
//

        FileReader fileReader = null;
        //try (FileReader fr = new FileReader("src/Lesson11/test.txt")) {
        //C:\Users\TMS\IdeaProjects\QA19\test.txt
        //C:\Users\TMS\IdeaProjects\QA19\src\Lesson11\test.txt
        try (FileReader fr = new FileReader("C:\\Users\\TMS\\IdeaProjects\\QA19\\test.txt")) {
            char[] chars = new char[10];
            fr.read(chars);
            System.out.println(Arrays.toString(chars));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }


}
