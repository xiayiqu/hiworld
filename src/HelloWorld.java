import java.util.Scanner;

public class HelloWorld {
        String name; //姓名

        float hp; //血量

        float armor; //护甲

        int moveSpeed; //移动速度

        //有参的构造方法
        //默认的无参的构造方法就失效了

    public HelloWorld(){

    }
    public HelloWorld(String heroname){
            name = heroname;
        }

        public static void main(String[] args) {
            HelloWorld garen =  new HelloWorld("盖伦");

            HelloWorld teemo =  new HelloWorld(); //无参的构造方法“木有了”
        }

}
