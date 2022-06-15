import java.util.Arrays;

public class KiwiJuiceEasy {

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){

        int count = fromId.length;

        for(int i = 0; i < count; i += 1){
            int to = toId[i];
            int from = fromId[i];

            // #1
            /*
            while( bottles[from] > 0 && capacities[to] > bottles[to] ){
                bottles[to] += 1;
                bottles[from] -= 1;
            }
            */

            // #2 (book)
            int space = capacities[to] - bottles[to];
//            if( space >= bottles[from] ){
//                bottles[to] += bottles[from];
//                bottles[from] = 0;
//            }else{
//                bottles[to] += space;
//                bottles[from] -= space;
//            }

            // #3 (book)
            int interval = Math.min( bottles[from], space );
            bottles[from] -= interval;
            bottles[to] += interval;
        }

        return bottles;
    }

    public static void main(String[] args) {
        int[] result1 = thePouring(new int[]{20, 20}, new int[]{5, 8}, new int[]{0}, new int[]{1});
        System.out.println( Arrays.toString( result1 ) ); // {0, 13}

        int[] result2 = thePouring(new int[]{10, 10}, new int[]{5, 8}, new int[]{0}, new int[]{1});
        System.out.println( Arrays.toString( result2 ) ); // {3, 10}

        int[] result3 = thePouring(new int[]{30, 20, 10}, new int[]{10, 5, 5}, new int[]{0, 1, 2}, new int[]{1, 2, 0});
        System.out.println( Arrays.toString( result3 ) ); // {10, 10, 0}

        int[] result4 = thePouring(
                new int[]{14, 35, 86, 58, 25, 62},
                new int[]{6, 34, 27, 38, 9, 60},
                new int[]{1, 2, 4, 5, 3, 3, 1, 0},
                new int[]{0, 1, 2, 4, 2, 5, 3, 1}
        );
        System.out.println( Arrays.toString( result4 ) ); // {0, 14, 65, 35, 25, 35}

        int[] result5 = thePouring(
                new int[]{700000, 800000, 900000, 1000000},
                new int[]{478478, 478478, 478478, 478478},
                new int[]{2, 3, 2, 0, 1},
                new int[]{0, 1, 1, 3, 2}
        );
        System.out.println( Arrays.toString( result5 ) ); // {0, 156956, 900000, 856956 }
    }
}
