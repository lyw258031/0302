import java.util.Scanner;
public class Grade {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩:" );
        int score = scan.nextInt();
        switch (score / 10){
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("不合格");
                break;
            case 2:
                System.out.println("不合格");
                break;
            case 3:
                System.out.println("不合格");
                break;
            case 4:
                System.out.println("不合格");
                break;
            case 5:
                System.out.println("不合格");
                break;
            case 6:
                System.out.println("合格");
                break;
            case 7:
                System.out.println("合格");
                break;
            case 8:
                System.out.println("合格");
                break;
            case 9:
                System.out.println("合格");
                break;
            case 10:
                System.out.println("合格");
                break;
        }
    }
}


