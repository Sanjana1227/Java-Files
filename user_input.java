import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = s.next();

        System.out.println("Enter your age");
        int age = s.nextInt();

        System.out.println("Enter your Gender");
        char gender = s.next().charAt(0);

        System.out.println("Enter Phone no.");
        long phno = s.nextLong();

        System.out.println("-------------------------");

        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Gender : "+ gender);
        System.out.println("Phone no : "+phno);
    }
}
