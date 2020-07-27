package July.Inheritance;

class AnimalISA {
}

class Mammal extends AnimalISA {
}

class Reptile extends AnimalISA {
}

class Dog extends Mammal {

    public static void main(String args[]) {
        AnimalISA a = new AnimalISA();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof AnimalISA);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof AnimalISA);
    }
}