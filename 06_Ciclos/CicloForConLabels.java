public class CicloForConLabels {
    public static void main(String[] args) {
        inicio:
        for (int PEPE = 0; PEPE < 3; PEPE++) {
            if (PEPE % 2 == 0) {
                System.out.println("Contador:" + PEPE);
                continue inicio;
            }

        }
    }
}
