public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
       OS my_os = operatingSystemFactory.getInstance("Closed");
       my_os.spec();
    }
}