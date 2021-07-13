package org.example;

import org.example.spring_introduction.Person;
import org.example.spring_introduction.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

//        Pet pet = new Dog();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);

//        Person person = new Person(pet);

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        person.getSurname();
        person.getAge();

        context.close();
    }
}
