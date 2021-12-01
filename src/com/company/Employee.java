package com.company;
public class Employee extends Company implements EmployeePosition {
    public String Job;
    public double Salary; public double inc;
    Employee() {}
    Employee(String Job,double Salary,double spec) {
        switch(Job) {
            case "Manager": {Manager m=new Manager();
                this.Salary=m.getCell();
                inc=m.getinc();
                break;}
            case "TopManager":{
                if (spec==1)
                    this.Salary=new TopManager().getCell()*1.5;
                else this.Salary=new TopManager().getCell();
                break;
            }
            case "Operator": {this.Salary=new Operator().getCell();break; }
        }
        this.Job=Job;
    }
    public String getJobTitle() {
        return this.Job;
    }
    public double calcSalary() {
        return this.Salary;
    }

}