package code;

public class Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("笑林");
        s1.setAge(20);
        s1.setMale(true);
        System.out.println("学生的名字:"+ s1.getName());
        System.out.println("学生的年龄:"+s1.getAge());
        System.out.println("学生性别:"+s1.isMale());
    }
}
