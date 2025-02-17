package models;

public class SalariedEmployee extends Employee {

    private double salary;
    public SalariedEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
//getters and setters

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "id= " + getId() + ", name= " + getName() + ", salary= " + getSalary() + '}';
    }
}
