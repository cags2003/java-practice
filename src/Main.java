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

        Application a = new Application("Acme", "Junior Developer");
        a.setJobTitle(null);
        if (a.getJobTitle() == null || a.getJobTitle().isEmpty()) {
            System.out.println("please enter your job title");
        } else {
            System.out.println("He works at " + a.getCompanyName() + " his job is " + a.getJobTitle());
        }
    }
}
