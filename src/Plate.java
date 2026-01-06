// 2. Aim of the program :
// Illustrate the execution of constructors in multi-level inheritance with three Java classes –
// plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class.
// Each class has constructor where dimensions are taken from user.

import java.util.Scanner;
public class Plate {
    double length, width;
    Plate(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Plate (Length, Width)  " + length + "," + width);
    }
}

class Box extends Plate{
    double height;

    Box(double length, double width, double height){
        super(length, width);
        this.height = height;
        System.out.println("Box (Length, Width, Height): " + length + "," + width + "," + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("Wooden (Length, Width, Height, Thickness) = " + length + "," + width + height + "," + thickness);
    }
}

class MutliDemo {
    public static void main(String[] args){
        System.out.println("Enter all the information below --> ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        double l = sc.nextDouble();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Enter thickness: ");
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);
    }
}