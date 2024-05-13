//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Deamon = a low priority thread that runs in the background to perform tasks such as garbage collection
        // JVM terminates itself when all user threads (non-deamon threads) finish their execution

        MyThread  thread2 = new MyThread();

        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());

        thread2.start();



    }
}