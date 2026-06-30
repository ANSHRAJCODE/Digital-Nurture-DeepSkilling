package Week_1_Engineering_Concepts.DesignPrinciplesAndPatterns.SingletonPatternExample;

public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();

        s1.log("Checking singleton implementation.");

        if (s1 == s2) {
            System.out.println("Success: Both references point to the exact same instance.");
        }
    }
}