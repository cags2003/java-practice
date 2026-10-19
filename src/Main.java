public class Main {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isOdd(4));
        System.out.println(isOdd(7));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-3));

        Application a = new Application("Acme","Junior Developer");
        System.out.println("He works at " + a.companyName + " his job is " + a.jobTitle);
    }
}
