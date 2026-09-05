import java.util.Scanner;

interface Sports {
    int SPORT_SCORE = 50; 
    int getScore();
}

class Student {
    int rollNo;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }
}

class Test extends Student {
    int sem1_marks;
    int sem2_marks;

    void read() {
        super.read();
        System.out.print("Enter Semester 1 Marks: ");
        sem1_marks = sc.nextInt();
        System.out.print("Enter Semester 2 Marks: ");
        sem2_marks = sc.nextInt();
    }
}

class Result extends Test implements Sports {
    int total;
    int finalSportScore;

    public int getScore() {
        return SPORT_SCORE;
    }

    void calculate() {
        read();
        finalSportScore = getScore();
        total = sem1_marks + sem2_marks + finalSportScore;
    }

    void display() {
        System.out.println("\nFINAL RESULT");
        System.out.println("Roll Number   : " + rollNo);
        System.out.println("Sem 1 Marks   : " + sem1_marks);
        System.out.println("Sem 2 Marks   : " + sem2_marks);
        System.out.println("Sports Score  : " + finalSportScore);
        System.out.println("Grand Total   : " + total);
    }
}

public class Main_8 {
    public static void main(String args[]) {
        Result obj = new Result();
        obj.calculate();
        obj.display();
    }
}