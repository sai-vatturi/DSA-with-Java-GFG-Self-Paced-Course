package oops.ex4;

class EmployeeStaff {
    double Basic_Salary;
    double HRA;
    double DA;
    public EmployeeStaff (double Basic_Salary, double HRA, double DA) {
        this.Basic_Salary = Basic_Salary;
        this.HRA = HRA;
        this.DA = DA;
    }
}

class EmployeeFaculty {
    double Basic_Salary;
    double HRA;
    double DA;
    public EmployeeFaculty (double Basic_Salary, double HRA, double DA) {
        this.Basic_Salary = Basic_Salary;
        this.HRA = HRA;
        this.DA = DA;
    }
}

class ComputeSalary{
    double salaryCalculation(double Basic_Salary, double HRA, double DA) {
        double Gross_Salary = Basic_Salary + HRA + DA;
        return Gross_Salary;
    }
}

class Thread1 extends Thread {
    ComputeSalary cs;
    EmployeeStaff es;

    public Thread1(ComputeSalary cs, EmployeeStaff es) {
        this.cs = cs;
        this.es = es;
    }
    public void run() {
        System.out.println("Gross Salary of Staff is: " + cs.salaryCalculation(es.Basic_Salary, es.HRA, es.DA));
    }
}

class Thread2 extends Thread {
    ComputeSalary cs;
    EmployeeFaculty ef;

    public Thread2(ComputeSalary cs, EmployeeFaculty es) {
        this.cs = cs;
        this.ef = es;
    }
    public void run() {
        System.out.println("Gross Salary of Faculty is: " + cs.salaryCalculation(ef.Basic_Salary, ef.HRA, ef.DA));
    }
}

public class Test1 {
    public static void main(String[] args) {
        ComputeSalary cs = new ComputeSalary();

        EmployeeStaff staff = new EmployeeStaff(50000, 10000, 20000);
        EmployeeFaculty faculty = new EmployeeFaculty(70000, 15000, 25000);

        Thread1 thread1 = new Thread1(cs, staff);
        Thread2 thread2 = new Thread2(cs, faculty);

        thread1.run();
        thread2.run();

    }
}

