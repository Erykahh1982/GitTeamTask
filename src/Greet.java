public class Greet {

    public String name;

    public Greet(String name) {
        this.name = name;
    }

    public void printYourName(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
