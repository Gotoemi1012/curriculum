public class Task1_5 {
    public static void main(String[] args) {
        String[] fruits = {"みかん", "りんご", "ぶどう", "メロン"};
        for (int f = 0; f < fruits.length; f++) {
            System.out.println(fruits[f]);
        }
        /* 初期値を１として値が１００となるまでループする。i++があるので無限ループは行われず、最後のSystem.out.print();があるので１００まで数えたら改行する。　*/
        int i = 1;
        while(i <= 100) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        for (int n = 1; n <= 9; n++) {
            System.out.print(n + " ||");
            for (int j = 1; j <= 9; j++) {
                System.out.print(" " + (n * j) + " |");
            }
            System.out.println();
        }
        
    }
}