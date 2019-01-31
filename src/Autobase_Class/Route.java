package Autobase_Class;

public class Route implements java.io.Serializable {

    private String source;   // место отправления
    private String destination;  // место назначения
    private int range;

    public Route(String source, String destination, int range) {
        this.source = source;
        this.destination = destination;
        this.range = range;
    }

    public Route() {

    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    public void showRoute(){
        System.out.println("Заявка на перевозку: ");
        System.out.println("");
        System.out.println("Пункт отправления: "+getSource());
        System.out.println("Пункт назначения: "+getDestination());
        System.out.println("Растояние: "+getRange() + " км.");


    }
}
