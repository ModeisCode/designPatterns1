public class Phone {
    private String os;
    private int ram;
    private String process;
    private double screenSize;
    private int battery;

    public Phone(String os, int ram, String process, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.process = process;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", process='" + process + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
