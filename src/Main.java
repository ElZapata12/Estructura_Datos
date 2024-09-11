import javax.print.attribute.standard.Fidelity;

public class Main {
    //* Miguel Angel Zapata Rosales
    // Marco Antonio Marcos Bonifacio
    // Brian Jose De Gante Fidel,
    // Ashlyn Annete Miranda Hernandez
    //Danna Johanna Perez Mendoza
    
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