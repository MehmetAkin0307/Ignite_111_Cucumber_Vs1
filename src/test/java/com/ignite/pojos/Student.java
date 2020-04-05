package com.ignite.pojos;


import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Student {

    public String parentRelation;
    public String firstName;
    public String lastName;
    public String dateOfBird;
    public String gender;
    public boolean currentAcademicYear = true;
    public String gradeLevel = "04";

    public String studentYear;
    public String studentMonth;
    public String studentDay;

    List<String> relationShipList = Arrays.asList("Father", "Grandmother", "Grandfather", "Guardian", "Mother", "Other", "Step-father", "Step-mother");
    List<String> genderList = Arrays.asList("Female", "Male");

    public Student() {
        Faker createNew = new Faker();
        firstName = createNew.name().firstName();
        lastName = createNew.name().lastName();

        dateOfBird = getDoB(createNew.date().birthday(4, 11));
        parentRelation = relationShipList.get(createNew.number().numberBetween(0, relationShipList.size()));

        List<String> years= Arrays.asList("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020");
        studentYear=years.get(createNew.number().numberBetween(0,years.size()));


        List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
        studentMonth=months.get(createNew.number().numberBetween(0,months.size()));

        List<String> days=Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31");
        studentDay=days.get(createNew.number().numberBetween(0,days.size()));


        // altarnative way with Random()
        // parentRelation = relationShipList.get(new Random().nextInt(relationShipList.size()));

        gender = genderList.get(createNew.number().numberBetween(0, 2));
    }


    public String getDoB(Date date) {
        return new SimpleDateFormat("MM/dd/YYYY").format(date);
    }

    @Override
    public String toString() {
        return "\nStudent {" + "\n" +
                "\tParent Relation: " + parentRelation + "\n" +
                "\tFirst Name: " + firstName + "\n" +
                "\tLast Name: " + lastName + "\n" +
                "\tDate Of Bird: " + dateOfBird + "\n" +
                "\tGender: " + gender + "\n" +
                "\tAcademic Year: " + (currentAcademicYear == true ? "Current Academic Year" : "Next Academic Year") + "\n" +
                "\tGrade Level: " + gradeLevel + "\n" +
                '}' + "\n\n\n";
    }

    String nameNotCorrect;

    public String enterNumbersasName(int nums) {
        nameNotCorrect = "" + nums;
        return nameNotCorrect;
    }

    public boolean isNameCorrect() {
        if (nameNotCorrect.substring(0).contains("[0-9]")) {
            return false;//   ??????????
        } else {
            return true;
        }


    }
}