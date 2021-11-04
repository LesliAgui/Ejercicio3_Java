package CoLeslie;

public class ThreadTester {

    public static void main(String[] args) {
	// write your code here
        Thread h1 = new Thread(new PrintMe(), "Hilo ");
        Thread h2 = new Thread(new PrintMe(), "Hilo ");
        Thread h3 = new Thread(new PrintMe(), "Hilo ");

        h1.start();
        h2.start();
        h3.start();

    }
}
