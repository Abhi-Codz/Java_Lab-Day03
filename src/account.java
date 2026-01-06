// Aim of the program :
// Write a class Account containing acc_no, balance as data members and two methods as input() for taking input from user and disp() method to display the details.
// Create a subclass Person which has name and aadhar_no as extra data members and override disp() function. Write the complete program to take and print details of three persons.

import java.util.Scanner;
public class account {
        int acc_no;
        double balance;

        void input(Scanner sc){
            System.out.println("Enter Account Number: ");
            acc_no = sc.nextInt();
            System.out.println("Enter Balance: ");
            balance = sc.nextDouble();
        }

        void display(){
            System.out.println("Account Number: " + acc_no);
            System.out.println("Balance: " + balance);
        }
    }

    class Person extends account {
        String name;
        long aadhar_no;

        void input(Scanner sc){
            super.input(sc);
            sc.nextLine();
            System.out.println("Enter Name");
            name = sc.nextLine();
            System.out.println("Enter Aadhar Number");
            aadhar_no = sc.nextLong();
        }

        void display(){
            System.out.println("Name: " + name);
            System.out.println("Aadhar Number: " + aadhar_no);
            System.out.println("Account Number: " + acc_no);
            System.out.println("Balance: " + balance);
        }
    }

    class accDemo{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            Person[] p = new Person[3];

            for(int i = 0; i < 3; i++){
                System.out.println("\nEnter details of Person " + (i+1));
                p[i] = new Person();
                p[i].input(sc);
            }

            System.out.println("\nDetails of Persons:");
            for(int i = 0; i < 3; i++){
                System.out.println("\nPerson " + (i+1));
                p[i].display();
            }
        }
    }