package ru.stqa.web.selenium_maven;



public class MyFirstProgram {


    public static void main(String[] args){

        Square s = new Square(5);
        Rectangle r = new Rectangle(3,4);

        System.out.println("Square " + s.l + " = " + s.area());
        System.out.println("Rectangle " + r.a + " and " + r.b + " = " + r.area());
    }




}
