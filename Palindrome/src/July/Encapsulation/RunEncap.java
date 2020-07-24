package July.Encapsulation;

public class RunEncap {
    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("Kismat");
        encap.setAge(30);
        encap.setIdNum("123456");
        System.out.println("Name : " + encap.getName());
        System.out.println(" Age : " + encap.getAge());
    }
}
