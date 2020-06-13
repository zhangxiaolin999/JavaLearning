package code;

public class overloadJudge {
    public static void open(){}
    public static void open(int a){}
//    public void open (int a,int b){}
    public static void open(double a,int b){}
//    public static void open(int a, double b ){}
    public void open(int a,double b){}
    public static void OPEN(){}
    public static void open(int a,int b){}
    // 重载练习  名称相同传入参数类型不同
}
