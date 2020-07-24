package July.Encapsulation;

public class EncapPracticeMain {
    public static void main(String[]args){

        EncapPractice checking = new EncapPractice();
        checking.setCountry("USA");
        checking.setMainCity("New York City");
        checking.setTotal(500000);

     System.out.println("Current Highest Corona Case: " + checking.getCountry()+" -> "+ checking.getMainCity()+" -> "+ checking.getTotal());
    }
}
