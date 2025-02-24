public class Singleton(1) {
    private static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();  
        }
        return uniqueInstance;      }
    public static void main(String[] args) {
   Singleton singletonInstance = Singleton.getInstance();
        System.out.println("Singleton instance: " + singletonInstance);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println("Another reference to the Singleton instance: " + anotherInstance);
        System.out.println("Are both instances the same? " + (singletonInstance == anotherInstance));
    }
}
