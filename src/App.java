import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Film> top10 = new ArrayList<Film>();
        top10.add(new Film(1, "The ShawShank Redemption", 1994, 9.2));
        top10.add(new Film(2, "The Godfather",1972, 9.2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a chart position number between 1 and 10:");
        int i = scan.nextInt();
        if(i>0 && i<=10){
         System.out.println(top10.get(i).toString());
        }
        }
    }

