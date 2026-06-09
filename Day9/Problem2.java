interface User {
    void login();
    void logout();
}

class Student implements User {
    public void login() {
        System.out.println("Student logged in");
    }

    public void logout() {
        System.out.println("Student logged out");
    }
}

class Faculty implements User {
    public void login() {
        System.out.println("Faculty logged in");
    }

    public void logout() {
        System.out.println("Faculty logged out");
    }
}

class Admin implements User {
    public void login() {
        System.out.println("Admin logged in");
    }

    public void logout() {
        System.out.println("Admin logged out");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        User u;

        u = new Student();
        u.login();
        u.logout();

        u = new Faculty();
        u.login();
        u.logout();

        u = new Admin();
        u.login();
        u.logout();
    }
}