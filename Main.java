package tp3_collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Curriculum c1 = new Curriculum("INFO");
        c1.addModCoef("Java", 3);
        c1.addModCoef("Math", 2);
        c1.addModCoef("Algo", 4);

        HashMap<String, ArrayList<Double>> res1 = new HashMap<>();
        HashMap<String, ArrayList<Double>> res2 = new HashMap<>();
        HashMap<String, ArrayList<Double>> res3 = new HashMap<>();

        res1.put("Java", new ArrayList<>());
        res1.put("Math", new ArrayList<>());
        res1.put("Algo", new ArrayList<>());

        res2.put("Java", new ArrayList<>());
        res2.put("Math", new ArrayList<>());
        res2.put("Algo", new ArrayList<>());

        res3.put("Java", new ArrayList<>());
        res3.put("Math", new ArrayList<>());
        res3.put("Algo", new ArrayList<>());

        Student s1 = new Student("S1", c1, res1);
        Student s2 = new Student("S2", c1, res2);
        Student s3 = new Student("S3", c1, res3);

        s1.addNote("Java", 14.0);
        s1.addNote("Java", 16.0);
        s1.addNote("Math", 12.0);
        s1.addNote("Algo", 15.0);

        s2.addNote("Java", 10.0);
        s2.addNote("Math", 11.0);
        s2.addNote("Algo", 13.0);

        s3.addNote("Java", 18.0);
        s3.addNote("Math", 17.0);
        s3.addNote("Algo", 19.0);

        StudentGroup g1 = new StudentGroup("G1");

        g1.addStudent(s1);
        g1.addStudent(s2);
        g1.addStudent(s3);

        System.out.println("Moyenne S1 = " + s1.average());
        System.out.println("Moyenne S2 = " + s2.average());
        System.out.println("Moyenne S3 = " + s3.average());

        g1.sort();
    }
}