package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * //* (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet
 */
public class programme_3_MarkSheet {
    static String name;
    static int rollnumber;
    static String subject1;
    static String subject2;
    static String subject3;
    static int subject1Mark;
  static int  subject2Mark;
  static int subject3Mark;

    static int totalMarks;
    static float percentage;
    static String grade;
    static String status;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name ");
        name = sc.nextLine();
        System.out.println("Enter  roll no ");
        rollnumber = sc.nextInt();

        System.out.println("Enter Subject1 Name ");
        subject1 = sc.next();
        System.out.println("Enter subject2 Name ");
        subject2 = sc.next();
        System.out.println("Enter subject3 Name ");
        subject3 = sc.next();


        System.out.print("Enter marks for " + subject1 + " : ");
        subject1Mark = sc.nextInt();
        isValidMarks(subject1Mark);
        System.out.print("Enter marks for " + subject2 + " : ");
        subject2Mark = sc.nextInt();
        isValidMarks(subject1Mark);
        System.out.print("Enter marks for " + subject3 + " : ");
        subject3Mark = sc.nextInt();
        isValidMarks(subject1Mark);

        totalMarks = totalMarks(subject1Mark, subject2Mark, subject3Mark); // calculating total marks
        System.out.println("Total marks: " + totalMarks);
        percentage = percentage(subject1Mark, subject2Mark, subject3Mark); // calculating percentage
        System.out.println("Percentage: " + percentage);
        grade(subject1Mark, subject2Mark, subject3Mark); // calculating grade

        printing(); // static --> static direct calling
        sc.close(); // closing the scanner object
    }
    public static void isValidMarks(int mark) {
        if (!(mark >= 0 && mark <= 100)) {
            System.out.println("Invalid Input, Marks should between 0 and 100");
        }
    }

    // method for calculating total marks
    public static int totalMarks(int m1, int m2, int m3) {
        return (m1 + m2 + m3);
    }

    //method for calculating percentage
    public static float percentage(int m1, int m2, int m3) {
        int total = totalMarks(m1, m2, m3);
        return ((total / 3));
    }

    // method for calculating grade (considering positive marks only)
    public static void grade(int m1, int m2, int m3) {
        float per = percentage(m1, m2, m3);
        if ((m1 >= 0 && m2 >= 0 && m3 >= 0) && (per >= 80 && per <= 100)) {
            System.out.println(grade = "A+");
            System.out.println(status = "Pass");
        } else if ((m1 >= 0 && m2 >= 0 && m3 >= 0) && (per >= 79 && per <= 60)) {
            grade = "A";
            status = "Pass";
        } else if ((m1 >= 0 && m2 >= 0 && m3 >= 0) && (per >= 59 && per <= 50)) {
            grade = "B";
            status = "Pass";
        } else if ((m1 >= 0 && m2 >= 0 && m3 >= 0) && (per >= 49 && per <= 35)) {
            grade = "C";
            status = "Pass";
        } else if ((m1 >= 0 && m2 >= 0 && m3 >= 0) && (per >= 0 && per <= 34)) {
            grade = "NA";
            status = "Fail";
        } else {
            grade = "NA";
            status = "Fail";

        }
    }


    public static void printing() {
        
        System.out.println(" ________________________________________________");
        System.out.println("|           MARK SHEET                           |");
        System.out.println("|________________________________________________|");
        System.out.println("| Nmae           : " + name + "                  |");
        System.out.println(" |Roll no        : " + rollnumber + "            |");
        System.out.println("|________________________________________________|");
        System.out.println("|    subject            marks                    |");
        System.out.println("|________________________________________________|");
        System.out.println("|" + subject1 + " : " + subject1Mark + "        |");
        System.out.println("|" + subject2 + "     : " +subject2Mark + "    |");
        System.out.println("|" + subject3 + "     : " +subject3Mark+ "    |");
        System.out.println("|________________________________________________|");
        System.out.println("| total           :" + totalMarks + "            |");
        System.out.println("|________________________________________________|");
        System.out.println("| percentage       :" + percentage + "           |");
        System.out.println("|result            :" + status + "               |");
        System.out.println("|grade             :" + grade + "                |");
        System.out.println("|________________________________________________|");

    }


    }








