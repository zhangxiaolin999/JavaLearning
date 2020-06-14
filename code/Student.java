package code;

public class Student {
    private String name;
    private int age;
    private boolean male;   // 男人为true 女人为false;

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
    public void setMale(boolean b){
       male = b;
    }
    public String isMale(){
        if (male){
            return  "男生";
        }else{
            return  "女生";
        }
    }
}
