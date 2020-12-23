import java.sql.SQLOutput;

public class Hero {
//    String name; //姓名
//    float hp; //血量
//    float armor; //护甲
//    int moveSpeed; //移动速度
//    public Hero() {
//    }
//
//    public Hero(String name,float hp){
//        this.name = name;
//        this.hp = hp;
//    }
//
//    //复活
//    public void revive(Hero h){
//        h = new Hero("提莫",383);
//        System.out.println(h.hp);
//    }
//    public static void main(String[] args) {
//        Hero teemo =  new Hero("提莫",383);
//        //受到400伤害，挂了
//        teemo.hp = teemo.hp - 400;
//        teemo.revive(teemo);
//        System.out.println(teemo.hp);
//    }

//public static void main(String[] args) {
//    for(heroEnum h : heroEnum.values()){
//        System.out.println(h);
//    }
//}
public static void main(String[] args) {
    heroEnum h = heroEnum.ASSASSIN;
    switch (h){
        case TANK:
            System.out.println("我玩上路");
            break;
        case WIZARD:
            System.out.println("我玩中路");
            break;
        case ASSASSIN:
            System.out.println("我玩打野");
            break;
        case ASSIST:
            System.out.println("辅助");
            break;
    }
}

}