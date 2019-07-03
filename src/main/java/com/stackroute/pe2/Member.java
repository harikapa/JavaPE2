package com.stackroute.pe2;

//Create a class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.

public class Member {

    String name;
    int age;
    double salary;


    public class Membervariable{

        Member member = new Member();

        public Member setMember(String name, int age, double salary)
        {
            member.name = name;
            member.age = age;
            member.salary = salary;
            return member;
        }

    }
}


