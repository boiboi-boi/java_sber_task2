import java.util.Scanner;

public class task2 {

    public static void horizontalBorder (int width){
        for (int i=0; i < width;i++)
            System.out.print("*");
    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Задайте длинну рамки: ");
        int height = scanner.nextInt();
        System.out.print("Задайте ширину рамки: ");
        int width = scanner.nextInt();

        if (width < str.length()) {
            System.out.print("Ошибка!");
            return;
        }

        int tmp = ((width-2)-str.length())/2;         //определяю кол-во пробелов перед строкой, чтобы она была по цетру
        int tmp1 = tmp + ((width-2)-str.length())%2; //определяю кол-во пробелов после строки
        int tmp2;                                   // поиск центра для печати строки
        if (height % 2 == 0)
            tmp2 =height / 2;
        else
            tmp2 =height / 2 + 1;

        horizontalBorder(width);
        System.out.println("");
        for (int i = 0; i < height-2;i++) {
            if (i!=tmp2-2){
                System.out.print("*");
                for (int j=0; j < width-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            } else {
                System.out.print("*");
                for (int j=0; j < tmp; j++){
                    System.out.print(" ");
                }
                System.out.print(str.toString());
                for (int k=0; k < tmp1; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            }
        }
        horizontalBorder(width);
    }
}