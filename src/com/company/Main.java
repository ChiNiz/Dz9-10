package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        int no=180,nm=80,nt=10;
        comp.hireAll(no,"Operator");comp.hireAll(nm,"Manager");comp.hireAll(nt,"TopManager");
        System.out.print("доход компании: "+comp.getIncome());
        ArrayList<Employee> g = new ArrayList<Employee>(comp.getTopSalaryStaff(15));
        ArrayList<Employee> c = new ArrayList<Employee>(comp.getLowestSalaryStaff(30));
        System.out.println("\n15 самых высоких зарплат: ");
        for (int i=0;i<g.size();i++)
            System.out.print("- "+g.get(i).calcSalary()+"\n");
        System.out.println("\n30 самых низких зарплат: ");
        for (int i=0;i<c.size();i++)
            System.out.print("- "+c.get(i).calcSalary()+"\n");
        for (int i=0;i<(comp.list.size())/2;i++)
            comp.fire((comp.list.size()/2+i));
        ArrayList<Employee> g2 = new ArrayList<Employee>(comp.getTopSalaryStaff(15));
        ArrayList<Employee> c2 = new ArrayList<Employee>(comp.getLowestSalaryStaff(30));
        System.out.println("\n15 самых высоких зарплат после увольнения 50%: ");
        for (int i=0;i<g2.size();i++)
            System.out.print("- "+g2.get(i).calcSalary()+"\n");
        System.out.println("\n30 самых низких зарплат после увольнения 50%: ");
        for (int i=0;i<c2.size();i++)
            System.out.print("- "+c2.get(i).calcSalary()+"\n");
    }
}
