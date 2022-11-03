package Aritmetica.operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 6;
        aritmetica1.b = 6;

        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultin: " + resultado);
    }
}
