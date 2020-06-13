package code;

public class DemoPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.call("乔布斯");
        p1.sendMessage("比尔盖茨");
        p1.sendMessage();
        p1.name = "笑林";
        System.out.println(p1.name);
        Phone p2 = new Phone();
        System.out.println(p2.name);
    }
}
