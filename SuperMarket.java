public class SuperMarket {
    public static void main(String[] args) {
        // >> TODO 使用new操作符，可以创建出一个类的实例/对象(instance/Object);
        // >> TODO 使用new创建一个类的实例后，类中定义的每种变量都会被赋以其类型的初始值。
        // >> TODO  这个和数组是一样的
        // >> TODO 使用一个同类型的对象变量，可以指向并操作这个实例。这两点和数组都很类似
        // 创建一个Merchandise实例 用m1 指向它
        Merchandise m1 = new Merchandise();
        m1.name = "茉莉花茶叶 20 包";
        m1.id = "00001";
        m1.cont = 1000;
        m1.price = 20;
        // 创建第二个商品
        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐 330ml";
        m2.id = "00002";
        m2.cont = 2000;
        m2.price = 3;
        // 卖出第一个商品
        int m1ToSold = 1;
        System.out.println(
        "感谢购买" + m1ToSold + "个" + m1.name + "。商品单价为" + m1.price + "。 消费总价为"+
        m1.price*m1ToSold +"。"
        );
        m1.cont -= m1ToSold;
        System.out.println(m1.id + "剩余仓库数量为" + m1.cont);
        int m2ToSold = 3;
        System.out.println(
             "感谢购买" + m2ToSold + "个" + m2.name + "。商品单价为" +m2.price + "。消费总价为" +
             m2.price*m2ToSold+"。"
        );
    }
}
