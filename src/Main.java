import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        zad7();
    }

    public static void zad7(){
        int num1=10;
        int num2=4;

        double widening1 = (double) num1;
        double div;
        div=widening1/num2;

        System.out.println("dzialanie widening");
        System.out.print("dzielenie num1/num2: ");
        System.out.println(div);
        System.out.println();
        int narrowing1= (int) widening1;
        div=narrowing1/num2;
        System.out.println("dzialanie narrowing:");
        System.out.print("dzielenie num1/num2: ");
        System.out.println(div);
    }

    public static void zad6(){
        int num = 3;
        // najpierw wyświetla, później zwiększa
        System.out.println(num++);
        System.out.println(num);
        // najpierw zwiększa, później wyświetla
        System.out.println(++num);
        System.out.println(num);

    }

    public static void zad5(){
        int x =5;
        int y=10;
        boolean logic = true;

        System.out.print("x<10 && y<11?: ");
        System.out.println(x<10 &&y<11);

        System.out.print("x<10 && y<10?: ");
        System.out.println(x<10&&y<10);

        System.out.print("x<10 || y<10?: ");
        System.out.println(x<10 || y < 10);

        System.out.print(logic);
        System.out.print(",!logic=");
        System.out.println(!logic);

        System.out.print("Warunek zlozony !(x<10&&y<10): ");
        System.out.println(!(x<10&&y<10));
    }

    public static void zad4(){
        int x=5;
        int y=10;

        System.out.print("Czy X jest wiekszy od Y? ");
        System.out.println(x>y);

        System.out.print("Czy X jest rozny od Y? ");
        System.out.println(x!=y);

        boolean instance = "Kasia" instanceof String;
        System.out.println(instance);
    }

    public static void zad3() {
        int x=10;
        int y=4;
        int sum=x+y;
        int sub=x-y;
        int multi=x*y;
        double div=x/y;
        int mod=x%y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

    }

    private static void zad2() {
        String firstName = "Hubert";
        String lastName = "Piotrowski";
        final String pesel = "99090409512";
        int age=25;
        double height = 179.5;

        System.out.print("Czesc, ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);

        System.out.println("Ponizej jest kilka informacji o Tobie:");
        System.out.print("Twoj PESEL to: ");
        System.out.println(pesel);
        System.out.print("Masz ");
        System.out.print(age);
        System.out.println(" lat");

        System.out.print("Twoj wzorst to: ");
        System.out.print(height);
        System.out.println("cm");
    }

    private static void zad1() {
        System.out.println("Mam Audi A4");
        System.out.println("Rocznik:");
        System.out.println(2004);
        System.out.println("Silnik o pojemności:");
        System.out.println(2.0);
    }

}