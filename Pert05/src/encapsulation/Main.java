package encapsulation;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Naufal", 20, "Pasar Minggu");
        person1.displayInfo();

        person1.setName("Budi");
        person1.setAge(20);
        person1.setAdress("Jatinegara");

        System.out.println("Upadate Infromation: ");
        person1.displayInfo();
    }
}
