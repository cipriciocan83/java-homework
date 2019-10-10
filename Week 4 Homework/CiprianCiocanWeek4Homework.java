import java.util.HashMap;


public class CiprianCiocanWeek4Homework {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ciprian Ciocan", "male", "QA", "QA engineer", 36);
        Employee employee2 = new Employee("Sergiu Logigan", "male", "QA", "QA engineer", 35);
        Employee employee3 = new Employee("Oana Arbuzov", "female", "QA", "QA engineer", 30);
        Employee employee4 = new Employee("Iulia Bilt", "female", "Development", "Web developer", 30);
        Employee employee5 = new Employee("Ioana Chiorean", "female", "QA", "Project manager", 35);
        Employee employee6 = new Employee("Catalin Mihale", "male", "QA", "Community lead", 32);
        Employee employee7 = new Employee("Cristian Boldan", "male", "QA", "Community manager", 35);

        Organization organization = new Organization(new HashMap<Integer, Employee>());
        organization.addEmployee(1,employee1);
        organization.addEmployee(2,employee2);
        organization.addEmployee(3,employee3);
        organization.addEmployee(4,employee4);
        organization.addEmployee(5,employee5);
        organization.addEmployee(6,employee6);
        organization.addEmployee(7,employee7);

        System.out.println("The employee list is:");
        organization.printEmployees(organization.employees);

        System.out.println();
        System.out.println();
        organization.searchEmployeeByName(organization.employees, "Ciprian Ciocan");

        System.out.println();
        organization.searchEmployeeByGender(organization.employees, "male");

        System.out.println();
        organization.searchEmployeeByDepartment(organization.employees, "QA");

        System.out.println();
        organization.searchEmployeeByJob(organization.employees, "QA engineer");

        System.out.println();
        organization.searchEmployeeByAge(organization.employees, 35);

        System.out.println();
        organization.updateEmployeeName(organization.employees, "Ciprian Ciocan", "George Ciocan");

        System.out.println();
        organization.updateEmployeeJob(organization.employees, "Oana Arbuzov", "Web developer");

        System.out.println();
        organization.updateEmployeeDepartment(organization.employees, "Oana Arbuzov", "Development");

        System.out.println();
        organization.updateEmployeeAge(organization.employees, "Catalin Mihale", 33);

        System.out.println();
        organization.removeEmployee(organization.employees, "Iulia Bilt");
    }
}

