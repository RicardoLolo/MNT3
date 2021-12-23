package Manager.Object;

public class Student extends  Person{
    private int mathPoint;
    private int physicsPoint;
    private int chemistryPoint;
    private static int VALUE = 1000;
    private double avgPoint;
    public Student(int idStudent, String name, int age) {
        super(idStudent, name, age);
    }

    public Student(int idStudent, String name, int age, int mathPoint, int physicsPoint, int chemistryPoint,double avgPoint) {
        super(idStudent, name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
        this.idStudent = VALUE;
        this.avgPoint = avgPoint;
        VALUE++;
    }

    public int getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(int mathPoint) {
        this.mathPoint = mathPoint;
    }

    public int getPhysicsPoint() {
        return physicsPoint;
    }

    public void setPhysicsPoint(int physicsPoint) {
        this.physicsPoint = physicsPoint;
    }

    public int getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(int chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
