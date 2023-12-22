import java.io.File;

public class Main {
    // CTRL + ALT + T > try-catch,while etc.
    // ALT + INSERT > adding constructor etc.
    public static void main(String[] args) {
      //  Phone p = new Phone("Android",2,"QualCom",5,5); old system
        // --=BUILDER DESIGN PATTERN=--
        Phone p = new PhoneBuilder().setOs("Android").setRam(12).getPhone();
        System.out.println(p);
    }
}