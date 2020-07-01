package June21;

public class MotorbikeJune21 {

    String[] bikeMake = {"Harley, Ducati, Triumph, Kawasaki "};
    String[] colors = {"Black, Red, Burgundy, Blue"};
    int[] horsePower = {97, 85, 70, 55};
    int[] estDate = {1920, 1950, 2000, 2019};
    int[] weight = {500, 450, 400, 300,};

    public void showInventory() {
        for (int i = 0; i < bikeMake.length; i++) {
            System.out.println("Like of available motorbikes : " + bikeMake[i]);
        }
    }
    public void bikeColors() {
        for (int i = 0; i < colors.length; i++) {
            System.out.println("List of available colors: " + colors[i]);
        }
    }
    public void bikePower(){
        int p= horsePower[0];
        for (int i = 0; i < horsePower.length; i++) {
            if (horsePower[i] > p) p = horsePower[i];
        }
        System.out.println("Highest horsepower in a bike in our inventory is : " + p + "hp");
    }

    public void setEstDate(){
        int n= estDate[0];
        for (int i = 0; i >=estDate.length; i--) {
            if (estDate[i] > n) n = estDate[i];
        }
        System.out.println("The earliest bike prodction was done in : " + n + "A.D.");
    }

    public void bikeWeight(){
        int w = weight[0];
        for (int i =0; i < weight.length; i++ );
        System.out.println("Heaviest motorbike in our lot is: "+ w +"lb");
    }
}













