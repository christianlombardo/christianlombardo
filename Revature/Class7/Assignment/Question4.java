package Class7.Assignment;

// Q4: We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.


abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {

    private float s1;
    private float s2;
    private float s3;

    StudentA (float s1, float s2, float s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPercentage() {
        return (s1 + s2 + s3)/3;
    }
}

class StudentB extends Marks {

    private float s1;
    private float s2;
    private float s3;
    private float s4;

    StudentB (float s1, float s2, float s3, float s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double getPercentage() {
        return (s1 + s2 + s3 + s4)/4;
    }
}


public class Question4 {
    public static void main(String[] args) {
        StudentA sa = new StudentA(80, 90, 100);
        System.out.printf("Student A percentage = %.2f", sa.getPercentage());
        System.out.println();

        StudentB sb = new StudentB(80, 85, 90, 93);
        System.out.printf("Student B percentage = %.2f", sb.getPercentage());

    }
}
