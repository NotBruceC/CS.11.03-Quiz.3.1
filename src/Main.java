import java.util.Locale;

public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int a) {
        if (a >= 90) {
            return 'A';
        } else if (a >= 80 && a <= 89) {
            return 'B';
        } else if (a >= 70 && a <= 79) {
            return 'C';
        } else if (a >= 60 && a <= 69) {
            return 'D';
        } else if (a >= 50 && a <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }


    // Question 2 - fizzBuzz
    public static String fizzBuzz(int b){
        if (b%3==0 && b%5==0){
            return "fizzbuzz";
        }else if(b%3==0){
            return "fizz";
        }else if (b%5==0){
            return "buzz";
        }else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String c){
        if(c.length()<=1){
            return c;
        }else{
            String d = c.substring(0,2);
            return d + c + d;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int d, int e, int f){
        if((d+e)==f ||(d+f)==e || (f+e)==d){
            return true;
        }else{
            return false;
        }
    }
    // Question 5 - endUp
    public static String endUp(String g){
        if(g.length()<=3){
            String h;
            h = g.toUpperCase(Locale.of(g));
            return h;
        }else{
            String h = g.substring(g.length()-3, g.length());
            String j;
            j = h.toUpperCase(Locale.of(h));
            String i = g.substring(0, g.length()-3);
            return i + j;
        }
    }
}
