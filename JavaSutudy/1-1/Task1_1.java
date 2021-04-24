public class Task1_1 {
    public static void main(String[] args) {
        int hogeInt = 50;
        String hogeString = "テスト";
        // double型の変数hogeDoubleを宣言して値0.2を代入
        double hogeDouble = 0.2;
        hogeInt = 100;
        hogeString = "合格";
        System.out.println(hogeInt);
        // hogeStringの値を表示。上書きしたので合格。
        System.out.println(hogeString);
        System.out.println(hogeDouble);
    }
}