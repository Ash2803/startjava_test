public class Cycle {

    public static void main(String[] args) {
/*        for (int i = 0; i <= 20; ++i){
            System.out.println(i);
        }
*/
/*        int j = 6;
        while(j >= -6){
            System.out.println(j);
            j-= 2;
        }*/

        /*11 + 13 = 24
        24 + 15 = 39
        39 + 17 = 56
        56 + 19 = 75*/

        int sum = 0;
        int result = 10;
        do {
            if(result % 2 == 1) {
                sum += result;
            }
            result++;
        } while(result < 20);
            System.out.println(sum);
    }
}