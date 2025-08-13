public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor prevents external instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance called");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
