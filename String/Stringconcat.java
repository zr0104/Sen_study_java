package String;
//concat连接两个字符串的方法
public class Stringconcat {
    public static void main(String args[]) {     
        String string1 = "菜鸟教程网址：";
        String string2 = "www.runoob.com：";
        String c=string1.concat(string2);
        System.out.println("1、" + c + "www.runoob.com");  
    }
}
