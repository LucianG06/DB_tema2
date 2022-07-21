public class NordSouthDirection extends Thread {
    @Override
    public void run() {
        System.out.println("    |   |");
        System.out.println("    | | |");
        System.out.println("----  |  ----");
        System.out.println("      |      ");
        System.out.println("----  |  ----");
        System.out.println("    | v |");
        System.out.println("    |   |");
        System.out.println("Cars passing north to south");
        System.out.println();
    }
}
