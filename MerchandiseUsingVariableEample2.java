public class  MerchandiseUsingVariableEample2{
    public static void main(String[] args) {
        // 用4个变量描述商品1
        String m1Name = "茉莉花茶叶20包";
        String m1Id = "00001";
        int m1Count = 1000;
        double m1Price = 999.99;
        // 用4个变量描述商品2
        String m2Name = "可口可乐 330ml";
        int m2Count = 2000;
        String m2Id = "0002";
        double m2Price = 2.5;
        //卖出一个商品
        int m1ToSold = 1;
        System.out.println("感谢购买" +
                m1ToSold + "个" +m1Name +"商品单价为"+ m1Price +
                "。 商品消费总价为" + m1ToSold * m1Price + "。 剩余库存");
        m1Count -= m1ToSold;
        System.out.println(m1Id+"剩余" + m1Count);

        //卖出第二个商品
        int m2ToSold = 2;
        System.out.println("感谢购买" +
                m2ToSold + "个" +m2Name +"商品单价为"+ m2Price +
                "。 商品消费总价为" + m2ToSold * m2Price + "。 剩余库存");
        m2Count -= m2ToSold;
        System.out.println(m2Id+"剩余" + m2Count);

    }
}