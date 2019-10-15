public class Employee{
    String name, gender, department, job;
    int age;

    public Employee(String name, String gender, String department, String job, int age) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printEmployeeInfo(){
        String name = "Name: ";
        String gender = "Gender: ";
        String department = "Department: ";
        String job = "Job: ";
        String age = "Age: ";
        return ( name + getName() + "  " + gender + getGender() + "  " + department + getDepartment() + "  "
                + job + getJob() + "  " + age + getAge());
    }

}
