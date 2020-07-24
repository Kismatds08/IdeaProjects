package July.Array;

public class SpecificValue {
    public static void main(String[] args) {
        int[] year = {1990, 2000, 2010, 2019, 2021};
        System.out.println(found(year,2020));
    }
        public static boolean found( int[] all, int item){
            for(int i=0;item<all.length;item++){
                if (item == i) {
                    return true;
                }
            }
            return false;
        }
    }
