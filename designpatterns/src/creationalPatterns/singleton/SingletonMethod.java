package creationalPatterns.singleton;

public class SingletonMethod {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("Application Started");
        Logger log2 = Logger.getInstance();
        log2.log("User Logined");
        //System.out.println((log1==log2));
    }
}