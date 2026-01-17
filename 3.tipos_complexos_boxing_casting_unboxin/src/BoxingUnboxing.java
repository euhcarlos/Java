public class BoxingUnboxing {
    public static void main(String[] args){

        boxing();
        unboxing();
    }

    private static void unboxing() {
        System.out.println("***************** UNBOXING ******************");

        boolean valor = Boolean.TRUE;

        long codigo = Long.valueOf(1000);
    }

    private static void boxing() {
        System.out.println("********** BOXING (AUTOBOXING) *************");
        int valor = 10;

        Boolean dado = true;
        //!=
        Boolean dado1 = Boolean.TRUE;

        Long numero = 1000l;
        //!=
        Long numero1 = Long.valueOf(50);

        System.out.println(numero);
        System.out.println(numero1);

    }
}
