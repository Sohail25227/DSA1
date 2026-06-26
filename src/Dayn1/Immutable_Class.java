package Dayn1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Immutable_Class {
    public static void main(String[] args) {
        College c=new College("DTU","Delhi");
        List<String> subs = new ArrayList<>(Arrays.asList("Java", "DSA"));

        Student s1=new Student(18,"Sohail",subs,c);

        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getSubjects()+" "+s1.getCollege().name+" "+s1.getCollege().address);

        s1.getSubjects().add("Hacking");  //direct reference mil gya so immutable and its shallow copy.      //dusre class me deep copy se new reference bheja h toh change new me hoga original me nahi
        s1.getCollege().name="IIT";       ////direct reference mil gya so immutable and its shallow copy     //dusre class me deep copy se new reference bheja h toh change new me hoga original me nahi
        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getSubjects()+" "+s1.getCollege().name+" "+s1.getCollege().address);  //change kr paarhe

    }
}

//Not an immutable class bcz mutable object fields in class are passing by shallow copy
//final class Student{
//    private final int age;
//    private final String name;
//    private final List<String> subjects;
//    private final College college;
//
//    Student(int age, String name, List<String> subjects,College college) {
//        this.name = name;
//        this.age=age;
//        this.subjects=subjects;
//        this.college=college;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//    public College getCollege() {
//        return college;
//    }
//}


// immutable class bcz mutable object fields in class are passing by deep copy
final class Student{
    private final int age;
    private final String name;
    private final List<String> subjects;
    private final College college;

    Student(int age, String name, List<String> subjects,College college) {
        this.name = name;
        this.age=age;
        this.subjects=new ArrayList<>(subjects);
        this.college=new College(college.name,college.address);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public College getCollege() {
        return new College(college.name,college.address);
    }
}
class College{
    String name;
    String address;
    College(String name,String address){
        this.name=name;
        this.address=address;
    }
}
