package Exercise03;

import Exercise01.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager= new StudentManager();
        studentManager.deleteStudentByAge(scanner);
    }
}
