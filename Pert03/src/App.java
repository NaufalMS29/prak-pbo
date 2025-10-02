public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa David = new Mahasiswa("123", "David", "Antonio");
        Mahasiswa Diana = new Mahasiswa("124", "Diana", "Nasution");

        David.belajar();
        Diana.belajar();

        David.Ujian();
        Diana.Ujian();
    }
}
