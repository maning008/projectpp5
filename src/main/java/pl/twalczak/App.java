package pl.twalczak;

import pl.twalczak.factory.Employee;
import pl.twalczak.factory.FactoryConfiguration;
import pl.twalczak.factory.Product;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee employee = FactoryConfiguration.getResponsibleEmployee();


        Product p1 = employee.doWork();
        Product p2 = employee.doWork();

        System.out.println(p1);
        System.out.println(p2);
    }
}
