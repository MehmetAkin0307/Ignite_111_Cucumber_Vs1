package com.ignite.pojos;
import com.github.javafaker.Faker;


public class Parent {
    public String firstName;
    public String lastName;
    public String hdyhau = "Other";
    public String street;
    public String city = "Richardson";
    public String state = "Texas";
    // public int zipCode = 75044;
    public String zipCode = "75044";
    public String email;
    public String homeNumber;
    public String homeNumberAnyDigit;
    public String homeNumberFiveDigit;
    public String howManyKids;
    public String parentStepConfirmaionText="Parent"; //Step title
    public Parent() {
        Faker faker = new Faker();
        //firstName= "123";
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
       // lastName = "@!&";
        street = faker.address().streetAddress();
        email = faker.internet().emailAddress();
        homeNumber = faker.number().digits(10) ;//bunu değiştirdim 7 idi 1o yaptım

        homeNumberFiveDigit=faker.number().digits(5);//bunu değiştirdim bunu 5 rakamlı yaptım
        howManyKids=faker.number().digits(3);

    }

    @Override
    public String toString() {
        return "\nParent {" + "\n" +
                "\tFirst Name:" + firstName + "\n" +
                "\tLast Name:" + lastName + "\n" +
                "\tFull Address:" + street + " " + city + ", " + state + " " + zipCode + "\n" +
                "\tEmail:" + email + "\n" +
                "\tHome phone:" + homeNumber + "\n" +
                '}'+"\n\n\n";
    }

    //sendkey yapmak icin
    String x ;
    public String phoneDigits(int phoneDigit ){
        Faker faker = new Faker();
        x= faker.number().digits(phoneDigit);
        return x;
    }
    public boolean isPhoneNumberCorrect(){ // bunu iyi dusunme
        if(x.length()==10){
            return false;
        }
        else{
            return true;
        }
    }

}