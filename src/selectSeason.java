public class selectSeason {
    public static void main(String[] args) {
//        Season season = Season.WINTER;
//        switch(season){
//            case SPRING:
//                System.out.println("春天");
//                break;
//            case SUMMER:
//                System.out.println("夏天");
//                break;
//            case AUTUMN:
//                System.out.println("秋天");
//                break;
//            case WINTER:
//                System.out.println("冬天");
//                break;
//        }
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
