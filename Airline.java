import java.util.*;
import java.util.ArrayList;





public class Airline {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        //Passenger[] passengers;
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        int age;
        int seat;
        String name;
        long number;
        char gender;
        String source;
        String destination;
        String date;
        int code;
        int k = 0;
        int satisfied = 1;
        while (satisfied!=0){
            System.out.println("enter age: \r");
            age = sc.nextInt();
            seat = k+1;
            System.out.println("enter name: \r");
            name = sc.next();
            System.out.println("enter mobile number (10 digits): \r");
            number = sc.nextLong();
            System.out.println("enter your gender (M or F): \r");
            gender = sc.next().charAt(0);
            System.out.println("enter source station: \r");
            source = sc.next();
            System.out.println("enter destination station: \r");
            destination = sc.next();
            System.out.println("enter date (dd/mm/yyyy): \r");
            date = sc.next();
            code = k;
            passengers.add(new Passenger(age,seat,name,number,gender,source,destination,date,code));
            System.out.println("enter 0 to terminate");
            satisfied = sc.nextInt();
            k++;
        }
        System.out.println(passengers);
  }
}