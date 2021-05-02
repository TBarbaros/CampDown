package utýl;

import users.User;

public class UserManager {

     public void add(User u) {
     System.out.println("Successfully added");
        System.out.println("Name:" + u.firstName + " Surname:" + u.lastName);
    }
}