/* Даниил Лазарев
Домашняя работа к 5 занятию.
 */
package com.company;
import java.util.Scanner;

 class Employee {
            String Name;
            String Profession;
            String email;
            long Telephone;
            long Salary;
            int Age;

    public Employee() {

    }

    void GetData() {
                Scanner sc = new Scanner(System.in);

                System.out.print("\n\tEnter Employee Name : ");
                Name = sc.nextLine();

                System.out.print("\n\tEnter Employee Profession : ");
                Profession = sc.nextLine();

                System.out.print("\n\tEnter Employee email : ");
                email = sc.nextLine();

                System.out.print("\n\tEnter Employee Telephone : ");
                Telephone = Long.parseLong(sc.nextLine());

                System.out.print("\n\tEnter Employee Salary : ");
                Salary = Long.parseLong(sc.nextLine());

                System.out.print("\n\tEnter Employee Age : ");
                Age = Integer.parseInt(sc.nextLine());
            }

            void PutData() {
                System.out.print("\n\tEmployee Name : " + Name);
                System.out.print("\n\tEmployee Profession : " + Profession);
                System.out.print("\n\tEmployee email : " + email);
                System.out.print("\n\tEmployee Telephone : " + Telephone);
                System.out.print("\n\tEmployee Salary : " + Salary);
                System.out.print("\n\tEmployee Age : " + Age);
            }


    public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age) {}
    }

    public class Main {

        public static void main(String args[]) {


            Employee[] e = new Employee[5];
            e[0] = new Employee("ivan ivanov", "Engineer", "ivanov@mailbox.com", "5675685685644", 120000, 36);
            e[1] = new Employee("Antonio Banderas", "Actor", "banderaspapandreas@mail.ru", "8944389289", 100000, 50);
            e[2] = new Employee("Chuck Norris", "Actor", "ChuckFu@yandex.ru", "856756755", 2000000, 78);
            e[3] = new Employee("Silvestor Stalonij", "Actor", "RamboForeva@gmail.com", "8585858585", 1000000, 68);
            e[4] = new Employee("Arnold Schwarznegger", "Actor", "janenegr@dmx.de", "453222534", 2500000, 70);

            //for (int i = 0; i < new Employee.length; i++) {
            //     if(Employee[i].getAge() > 40){
            //         Employee[i].printInfo();
            //Не получилось вывести через цикл. Не понимаю, что не так!

            Employee A = new Employee();
            A.GetData();
            A.PutData();
        }
    }

