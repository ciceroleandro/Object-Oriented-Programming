public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Lro", "Preta", 1.5f);
        //c1.setModelo("Bic");
        //c1.setPonta(0.5f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " Ponta "+ c1.getPonta());

    }
}