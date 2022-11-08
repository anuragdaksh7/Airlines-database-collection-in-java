
public class Passenger {
    int age;
    int seat;
    String name;
    long number;
    char gender;
    String source;
    String destination;
    String date;
    int code;

    public Passenger(int age_,int seat_, String name_,
        long number_, char gender_, String source_, 
        String destination_, String date_, int code_){
        code = code_;
        date = date_;
        name = name_;
        gender = gender_;

        age = age_;
        seat = seat_;
        number = number_;
        source = source_;
        destination = destination_;

    }

    public void getDetails(){
        System.out.println(code+" "+date+" "+name+" "+gender+" "+age+" "+number+" "+seat+" "+source+" "+destination);
        //System.out.println(code);
        //System.out.println(date);
        //System.out.println(name);

    }



}