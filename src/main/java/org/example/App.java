package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("personId",Person.class);
        System.out.println(person);

        Dog dog=context.getBean("dogId",Dog.class);
        System.out.println(dog);
        dog.animalPlus();
        dog.animalMinus();

        Friend friend=context.getBean("friendId",Friend.class);
        System.out.println(friend);

        Cat cat=context.getBean("catId",Cat.class);
        System.out.println(cat);
        cat.animalPlus();
        cat.animalMinus();
    }
}
