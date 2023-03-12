public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("mixed");
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(cat);
    }
}