package metro;

public class JourneyDetails {
    public String from;
    public String to;
    public String type;

    @Override
    public String toString() {
        return "JourneyDetails{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
