package Main;

import users.Instructor;
import users.Student;
import users.User;
import ut�l.UserManager;

public class Main {

    public static void main(String[] args) {
        User s1 = new Student();
        s1.firstName = "Tar�k";
        s1.lastName = "Barbarps";
        User s2 = new Student();
        s2.firstName = "Deniz";
        s2.lastName = "Toprakc�";
        User t1 = new Instructor();
        t1.firstName = "Serkan";
        t1.lastName = "Korkmaz";
        User t2 = new Instructor();
        t1.firstName = "Ali Erhan ";
        t1.lastName = "Saner";

        UserManager u = new UserManager();
        u.add(s1);
        u.add(s2);
        u.add(t1);
        u.add(t2);
    }

}