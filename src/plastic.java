// 1. Aim of the program :
// A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
// The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.
// Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.

import java.util.Scanner;
public class plastic {
    double length, width;
    double cost_2D;

    plastic(double length, double width){
        this.length = length;
        this.width = width;
    }

    void calculateCost(){
        double area = length * width;
        cost_2D = area * 40;
        System.out.println("Cost of Plastic Sheet = Rs " + cost_2D);
    }
}

class plastic3 extends plastic{
    double height;
    double cost_3D;

    plastic3(double length, double width, double height){
        super(length, width);
        this.height = height;
    }

    void calculateCost3D(){
        double volume = length * width * height;
        cost_3D = volume * 60;
        System.out.println("Cost of Plastic Box: Rs " + cost_3D);
    }
}

class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Type of Plastic");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        System.out.println("Enter length: ");
        double l = sc.nextDouble();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();

        if(choice == 1){
            plastic p2 = new plastic(l, w);
            p2.calculateCost();
        }
        else if(choice == 2){
            System.out.println("Enter height: ");
            double h = sc.nextDouble();
            plastic3 p3 = new plastic3(l, w, h);
            p3.calculateCost3D();
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
