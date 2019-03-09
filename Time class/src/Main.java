

public class Main {
    public static void main(String[] args) {

        Time first = new Time(12, 59, 59);

        System.out.println("initial time:" + first.toString());

        first.nextSecond();
        System.out.println("Time after increment:"  +  first);

        Time second = new Time(2, 0, 0);

        System.out.println("initial time:" + second);

        second.previousSecond();
        System.out.println("Time after decrement:" + second);

    }

}