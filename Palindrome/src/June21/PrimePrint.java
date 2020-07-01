package June21;
public class PrimePrint {

    public static void main(String[] args) {

        int start = 2;
        int end = 100;

        while (start<=end) {

            int x = 2;

            while (x<=start/2) {
                if (start%x==0) {
                    break;
                }x++;
            }
                if (x==(start/2+1)) {
                System.out.print(start+"\n");
                }
                start++;
             }
        }
    }