public class Numeros {

    public void contarNumeros(int limite) {
        int pares=0, impares=0;
        int i;
        System.out.println("\n\n Numeros dependiendo el limite");
        for (i = 0; i < limite; i++) {
            System.out.println(i + "");
            if (i%2==0){
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("\n\n los numeros impares son: "+ impares);
        System.out.println("\n\n los numeros pares son: "+ pares);

    }
}