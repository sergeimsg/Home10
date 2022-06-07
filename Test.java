package Lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {

    private int a;
    private int b;
    private int c;
    private int d;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Test(int a, int b, int c, int d) throws TestException {

        //try
//
//            if (a + b + c + d != 360) {
//                throw new TestException();
//            }

//        catch (TestException e) {
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//            System.out.println(LocalDateTime.now());
//            throw new RuntimeException();
////            System.out.println("Сумма углов должна быть 360");
////            a = 90;
////            b = 90;
////            c = 90;
////            d = 90;
//
//        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Четырехугольник с углами {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
