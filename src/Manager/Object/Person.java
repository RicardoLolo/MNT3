package Manager.Object;

public class Person {
    int idStudent;
    String name;
    int age;

    public Person(int idStudent, String name, int age) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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
        return "Person{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

