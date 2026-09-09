package com.internship.gradetracker;
import jakarta.persistence.*;
@Entity
public class Student {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private double marks;
 public Student() {}
 public Student(String name,double marks){this.name=name;this.marks=marks;}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String n){name=n;}
 public double getMarks(){return marks;} public void setMarks(double m){marks=m;}
 public String getGrade(){ if(marks>=90)return "A+"; if(marks>=80)return "A"; if(marks>=70)return "B"; if(marks>=60)return "C"; if(marks>=50)return "D"; return "F"; }
}