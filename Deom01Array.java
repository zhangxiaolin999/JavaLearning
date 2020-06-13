package code;
public class Deom01Array {
    public static void main(String[] args) {
        // >>  TODO 数组变量其背后真身就是引用 数组类型就是一种特殊的类
        // >> TODO  数组大小不决定数组类型，数组类型只是由元素类型决定的
        int[] intArray;
        intArray = new int[1];
        intArray = new int[2];
        System.out.println(intArray.length);

        double[][][] double3DArray = new double[2][3][4];
        int[] a1 = new int[9];
        int[] a2 = new int[8];
        a1 = a2;
        System.out.println("a1的长度为:" +a1.length);

        double[] d3 = new double[5];
        double3DArray[1][2] = d3;
        System.out.println(double3DArray);

        /*
                数组是一种特殊的类
                    数组的类名就是类型带上中括号
                    同一类型数组，每个数组对象的大小可以不一样，也就是每个数组对象占用的内存可以不一样 这一点和类有些不同
                    可以用引用指向类型相同大小不同的数组，因为他们属于同一种类型
                引用的数组
                    可以把类名当成自定义类型，定义引用的数组，甚至多维数组
         */
    }
}
