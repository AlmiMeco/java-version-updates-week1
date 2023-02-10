package com.noteworthyJavaVersionUpdates.functionalTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {


    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Almi", "Meci", 21));
        users.add(new User("Jack", "Black", 31));
        users.add(new User("Koko", "Matter", 9));

//        Print All Elements

        printName(users, user -> true);


//        Print All People that lastName starts with M

        printName(users, user -> user.getLastName().startsWith("M"));

    }

    private static void printName(List<User> users, Predicate<User> p) {

        for (User user : users) {

            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }

    }


}
