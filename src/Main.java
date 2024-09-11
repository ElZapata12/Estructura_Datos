
public class Main {
    public static void main(String[] args) {
        operacionesDelArreglo();
    }

    public static void operacionesDelArreglo() {
        Arreglo arreglo = new Arreglo();
        Numeros numeros= new Numeros();

        arreglo.sumarElementosDeArreglo();
        arreglo.elementoMayor();
        arreglo.elementoMenor();

        arreglo.invertirArrego();
        arreglo.ordenarMayoraMenor();
        arreglo.contarNumeros(9);
        arreglo.promedio();
        arreglo.siEstaElNumero(7);
        numeros.contarNumeros(15);



    }
}