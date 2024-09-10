public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int reductions = 0;

        do{
            if(num % 2 == 0){
                num = num / 2;
            }
            else{
                num = num - 1;
            }
            reductions++;
        }while(num > 0);

        System.out.println(reductions);
    }
}
