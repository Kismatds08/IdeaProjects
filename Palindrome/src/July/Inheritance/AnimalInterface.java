package July.Inheritance;

interface AnimalInterface{}
class Pet implements AnimalInterface{}

class Cat extends Pet {

    public static void main(String args[]) {
        Pet p = new Pet();
        Cat d = new Cat();

        System.out.println(p instanceof AnimalInterface);
        System.out.println(d instanceof Pet);
        System.out.println(d instanceof AnimalInterface);
    }
}