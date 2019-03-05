public class Main {
    public static void main(String[] args) {
        PersonModel<Student> test = new PersonModel<>();
        Student std1 = new Student(1,"Chu Hữu Mạnh",21);
        Student std2 = new Student(2,"Chu Hữu Tuấn",35);
    test.AddEmployeer(std1);
    test.AddEmployeer(std2);
    test.Display();
        System.out.println("-----------------------");
        PersonModel<Employee> test1 = new PersonModel<>();
        Employee epl1 = new Employee(1,"Chu Hữu Tuấn",15);
        Employee epl2 = new Employee(2,"Chu Hữu Cao",15);
        test1.AddEmployeer(epl1);
        test1.AddEmployeer(epl2);
        test1.Display();
    }
}
