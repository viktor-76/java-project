import java.sql.Date;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");

        SomeFunctions functions = new SomeFunctions();
//        String text = functions.getWelcomeText("Валера");
//        System.out.println(text);

        System.out.println(functions.getEurFromUsd(150.00, 0.8924));
        System.out.println(functions.getCalories(2, 1));
        Date test = new Date(120, 5, 28);
        System.out.println(functions.getMsFromDate(test));

    }


}
