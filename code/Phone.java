package code;

public class Phone {
    String name;
    double prace;
    String screen;
    public void call(String names){
        System.out.println(names+ "打电话");
    }
    public void sendMessage(String names){
        System.out.println("给" + names+ "发短信");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }

}
