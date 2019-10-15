import java.util.HashMap;
import java.util.Map;

class Organization{
    HashMap<Integer,Employee> employees;

    Organization(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee( int id, Employee employee){

        employees.put((Integer)id, employee);
    }

    public void searchEmployeeByName(HashMap<Integer, Employee> employees, String name){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                System.out.println("The searched employee is: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void searchEmployeeByDepartment(HashMap<Integer, Employee> employees, String department){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().department.equals(department) ){
                System.out.print("The searched employee is: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void searchEmployeeByJob(HashMap<Integer, Employee> employees, String job){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().job.equals(job) ){
                System.out.println("The searched employee is: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void searchEmployeeByGender(HashMap<Integer, Employee> employees, String gender){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().gender.equals(gender) ){
                System.out.println("The searched employee is: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void searchEmployeeByAge(HashMap<Integer, Employee> employees, int age){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().age ==age){
                System.out.println("The searched employee is: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void updateEmployeeName(HashMap<Integer, Employee> employees, String name, String newName){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                entry.getValue().setName(newName);
                System.out.println("The employee name was updated: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void updateEmployeeDepartment(HashMap<Integer, Employee> employees, String name, String newDepartment){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                entry.getValue().setDepartment(newDepartment);
                System.out.println("The employee department was updated: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void updateEmployeeJob(HashMap<Integer, Employee> employees, String name, String newJob){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                entry.getValue().setJob(newJob);
                System.out.println("The employee job was updated: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void updateEmployeeAge(HashMap<Integer, Employee> employees, String name, int newAge){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                entry.getValue().setAge(newAge);
                System.out.println("The employee age was updated: ");
                System.out.println(entry.getValue().printEmployeeInfo());
            }
        }
    }

    public void removeEmployee(HashMap<Integer, Employee> employees, String name){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            if (entry.getValue().name.equals(name) ){
                employees.remove(entry.getKey());
                System.out.println("The employee list was updated: ");
                printEmployees(employees);
            }
        }
    }

    public void printEmployees(HashMap<Integer, Employee> employees){
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()){
            System.out.print("Id: ");
            String ide = entry.getKey().toString();
            String val = entry.getValue().printEmployeeInfo();
            System.out.println(ide + " " + val);
        }
    }
}