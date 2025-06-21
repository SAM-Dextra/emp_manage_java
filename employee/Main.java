package employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int count=0;
        while(true){
            System.out.println("!---Employee Management System---!");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. List Employees");
            System.out.println("4. Find Employee with Highest Salary");
            System.out.println("5. Exit");
            System.out.println("Choose an Option: ");

            int choice =sc.nextInt();
            sc.nextLine();//consume newLine

            switch (choice) {
                case 1: //create Manager
                    System.out.println("Enter Name: ");
                    String mName= sc.nextLine();
                    System.out.println("Enter Department: ");
                    String mDepartment=sc.nextLine();
                    System.out.println("Enter Salary: ");
                    double mSalary= sc.nextDouble();
                    System.out.println("Enter Bonus: ");
                    double mBonus = sc.nextDouble();
                    employees[count++] = new Manager(mName,mDepartment,mSalary,mBonus);
                    break;

                case 2://create Dev
                    System.out.println("Enter Name: ");
                    String dName= sc.nextLine();
                    System.out.println("Enter Department: ");
                    String dDepartment=sc.nextLine();
                    System.out.println("Enter Programming Language: ");
                    String dproLang= sc.nextLine();
                    System.out.println("Enter Salary: ");
                    double dSalary= sc.nextDouble();
                    employees[count++] = new Developer(dName,dDepartment,dSalary,dproLang);
                    break;

                case 3: //List all Emplyeee
                    System.out.println("-----Employee List-----");
                    for (int i=0; i<count;i++) {
                        employees[i].displayInfo();
                        System.out.println();
                    }

                    break;
                
                case 4://Find Emp with Highest Salary
                    if(count == 0){
                        System.out.println("No Employees added yet");
                        break;
                    }
                    Employee highest = employees[0];
                    for (int i = 0; i < count; i++) {
                        if(employees[i].getSalary()>highest.getSalary()){
                            highest=employees[i];
                        }
                    }
                    System.out.println("---Employee with Highest Salary");
                    highest.displayInfo();

                    break;

                case 5:
                    System.out.println("Exiting...GoodBye!");
                   return;
            
                default: System.out.println("Invalid Option. Try Again!");
                    break;
            }
        }
    }
    
}
