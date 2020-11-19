package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


//Sorts and prints students by last name
    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);


//Sorts and prints students by major
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);


//Sorts and prints students by zip code
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                double zipcode1 = s1.getZipcode();
                double zipcode2 = s2.getZipcode();
                String zc1 = String.valueOf(zipcode1);
                String zc2 = String.valueOf(zipcode2);
                return zc1.compareTo(zc2);
            }
        });
        printStudentList("Students Sorted By Zip Code",students);

        
//Sorts and prints sutdents by gpa (descending order)
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                double gpa1 = s1.getGpa();
                double gpa2 = s2.getGpa();
                String sgpa1 = String.valueOf(gpa1);
                String sgpa2 = String.valueOf(gpa2);
                return sgpa2.compareTo(sgpa1);
            }
        });
        printStudentList("Students Sorted By GPA",students);
    }

    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
