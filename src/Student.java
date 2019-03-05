public class Student {
    public int Id;
    public String name;
    public int age;

    public Student(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ""+this.Id+"-"+this.name+"-"+this.age;
    }
}
