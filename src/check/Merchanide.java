package src.check;


import java.util.Scanner;

public class Merchanide {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        int temp  = a > b ? a : b;
        int max =  c > temp ? c : temp;
        System.out.println("最大值为" + max);
    }
}
