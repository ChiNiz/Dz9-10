package com.company;
import java.util.*;
public class Company {
    protected ArrayList<Employee> list = new ArrayList<Employee>();
    Company() { }
    public void hire(String jb) {
        double sum=0;
        if (jb=="TopManager") {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getJobTitle()=="Manager")
                    sum+=list.get(i).Salary;
            }
            if (sum > 10000000.0) sum = 1;
            else sum = 0;

        }
        list.add(new Employee(jb, 10000, sum));
    }
    public void hireAll(int n,String jb) {
        for (int i=0;i<n;i++) hire(jb);
    }
    public void fire(int i) {
        list.remove(list.get(i));
    }
    public void show() {
        for (int i=0;i< list.size();i++)
            System.out.print(list.get(i).getJobTitle()+" "+list.get(i).calcSalary()+"\n");

    }
    public double getIncome() {
        double sum=0;
        for (int i=0;i<list.size();i++)
            if (list.get(i).getJobTitle()=="Manager")
                sum+=list.get(i).inc;
        return sum;
    }
    public ArrayList <Employee> getTopSalaryStaff(int count) {

        double[][] a=new double[list.size()][2];
        for (int i=0;i<list.size();i++)
        {a[i][0]=list.get(i).calcSalary();
            a[i][1]=i;}
        for (int i=0;i<list.size();i++)
            for (int j=0;j<list.size();j++)
                if (a[i][0]>a[j][0])
                {
                    double x=a[i][0],y=a[i][1];
                    a[i][0]=a[j][0];
                    a[i][1]=a[j][1];
                    a[j][0]=x;a[j][1]=y;
                }
        ArrayList<Employee> e=new ArrayList<Employee>();
        for (int i=0;i<count;i++)
            e.add(list.get((int)a[i][1]));
        return e;

    }

    public ArrayList <Employee> getLowestSalaryStaff(int count) {

        double[][] a=new double[list.size()][2];
        for (int i=0;i<list.size();i++)
        {a[i][0]=list.get(i).calcSalary();
            a[i][1]=i;}
        for (int i=0;i<list.size();i++)
            for (int j=0;j<list.size();j++)
                if (a[i][0]<a[j][0])
                {
                    double x=a[i][0],y=a[i][1];
                    a[i][0]=a[j][0];
                    a[i][1]=a[j][1];
                    a[j][0]=x;a[j][1]=y;
                }
        ArrayList<Employee> e=new ArrayList<Employee>();
        for (int i=0;i<count;i++)
            e.add(list.get((int)a[i][1]));
        return e;
    }
}