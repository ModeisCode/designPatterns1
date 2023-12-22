public class OperatingSystemFactory {
    public OS getInstance(String type) {
        if (type.equals("Open"))
            return new Android();
        else if (type.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
