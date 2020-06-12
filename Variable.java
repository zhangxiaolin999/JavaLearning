public class Variable {
    public static void main(String[] args) {
        System.out.println(1>2); // 布尔类型
        byte bytevar = 99;
        System.out.println(bytevar);
        short shortvar = 30000;
        System.out.println(shortvar);
        int intvar = 300000000;
        System.out.println(intvar);
        long longvar = 11111;
        System.out.println(longvar);
        long bigLongvar = 99999999999L;  // 在java语言中默认是int类型的 超过int要加L
        System.out.println(bigLongvar);

        float floatvar = 12.1f;   //浮点数默认double 要带f
        System.out.println(floatvar);
        double doublevar = 11111.11111111111;
        System.out.println(doublevar);

        // 注意 整数默认int  浮点数默认double

        boolean condition = true;
        boolean falsecondition = false;
        System.out.println(condition);
        System.out.println(falsecondition);

        char ch = 'a';
        System.out.println(ch);
        //   基本数据类型
    }
}