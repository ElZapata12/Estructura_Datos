public class Arreglo {
    private static int[] numeros = {1, 9, -8, 7};
    private static String[] nombres = {"Juan", "Miguel", "Marco"};

    public void lsita() {
        System.out.println("Listar Arreglo foreach");
        for (int numeros : numeros) {
            System.out.println(numeros + "");
        }
    }

    public void listaFor() {
        System.out.println("\n" + "Listar Arreglo con for normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "");
        }
    }

    public void sumarElementosDeArreglo() {
        System.out.println("Sumar los elementos de un arreglo");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = numeros[i] + suma;
        }
        System.out.println("Suma de todos los numeros es: " + suma);
    }

    public void elementoMayor() {
        System.out.println("\n\n Imprimir el mas grande");

        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es:" + mayor);
    }

    public void elementoMenor() {
        System.out.println("\n\n Imprimir el mas chico");

        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero menor es:" + menor);

    }

    public void invertirArrego() {
        System.out.println("\n\n invertir elementos del arreglo");
        System.out.println("\n\n Los elementos del arreglo normal son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "");
        }
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - i - 1] = temp;
        }
        System.out.println("\n\n Arreglo invertido:");

        for (int numero : numeros) {
            System.out.println(numero + "");

        }

    }

    public void ordenarMayoraMenor() {
        System.out.println("\n\n Ordenar arreglo de mayor a menor sin librería");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        for (int numero : numeros) {
            System.out.println(numero + "");
        }
    }

    public void contarNumeros(int numeroBuscado) {
        System.out.println("\n\n Contar los numeros dependiendo cual pidas");
        int contador = 0;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                contador++;
            }
        }
        System.out.println("El numero " + numeroBuscado + " aparecio " + contador + " veces ");

    }

    public void promedio() {
        System.out.println("\n\n Saber el promedio ");
        double suma = 0;
        double promedio;
        for (int numero : numeros) {
            suma += numero;
        }
        promedio = suma / numeros.length;
        System.out.println("El promedio es de :" + promedio);
    }

    public void siEstaElNumero(int estaElNum) {
        System.out.println("\n\n El elemento esta en el programa");
        int contador = 0;
        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == estaElNum)
                contador++;
            encontrado = true;
        }
        if (encontrado) {
            System.out.println("\n\n El numero si esta en tu Array, esta: " + contador + " veces");
        } else {
            System.out.println("\n\n el numero no esta en tu Array");
        }
    }

}