// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


class Employee {
    String name;
    double salary;

    double hourlyRate;
    double hoursWorked;

    public void calculatePay(double salary){
        System.out.println("Name: " + name+ " Salary :" + salary);
    }

    public void calculatePay(double hourlyRate, double hoursWorked){
        System.out.println("Name: " + name+ " Salary :" + hourlyRate*hoursWorked);
    }
}

public class Main{

    public static void main(String[] args) {
        Employee salariedEmployee = new Employee();
        Employee hourlyEmployee= new Employee();
        salariedEmployee.name = "Naveen";
        salariedEmployee.salary=15000;
        hourlyEmployee.name= "Varsha";
        hourlyEmployee.hourlyRate = 200;
        hourlyEmployee.hoursWorked= 10;

        salariedEmployee.calculatePay(salariedEmployee.salary);
        hourlyEmployee.calculatePay(hourlyEmployee.hourlyRate, hourlyEmployee.hoursWorked);



    }
}