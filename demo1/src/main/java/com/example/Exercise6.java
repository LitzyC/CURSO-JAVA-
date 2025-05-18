package com.example;

import java.util.Scanner;

public class Exercise6 {
    
    public static void ordenararray(){
        int[] numeros = { 5, 1, 4, 2 };
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa que tipo de ordenamiento quieres.");
        System.out.println("bubble sort | merge sort | quick sort");
        String ordenarray = lectura.nextLine().toLowerCase();
        

        switch (ordenarray) {
            case "bubble sort":
                bubbleSort(numeros);
                break;

            case "merge sort":
                numeros=mergeSort(numeros);
                break;

            case "quick sort":
                quickSort(numeros, 0, numeros.length - 1);
                break;
        
            default:
                System.out.println("No has ingresado el tipo de orden.");
                System.out.println("Usaremos el método Bubble Sort.");
                bubbleSort(numeros);;
        }

        for (int num : numeros){
            System.out.print(num + " ");
        }
        //Muestra el array ordenado

        lectura.close();//Cierra el Scanner
    }
    
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // numero de pasadas del array
            for (int j = 0; j < array.length - 1 - i; j++) {
                //bucle que compara los pares cercanos - array[j] lo compara con array[j+1]
                if (array[j] > array[j+1]) {
                    //Si el numero de la izq es mayor que el de la der estos se cambiaran
                    int variabletemp = array[j];
                    //es una variable temporal para poder intercambiar los valores 
                    array[j] = array[j + 1];
                    //Intercambiamos la posicion de los numeros 
                    array[j + 1]= variabletemp;
                }
            }
        }
    }
    

    //MERGE SORT
    //Divide el array en varias mitades hasta que solo haya un numero
    //Va combinando y ordena lo que divide mientra junta las partes divididas
    //Hasta que el array queda en orden

    public static int[] mergeSort(int[] array) {
        //Recibe un array desordenado y lo devuelve ordenado

        if (array.length <= 1) return array;
        //Si el array tiene un elemento o menos, significa que esta ordenado y lo devuelve
        
        int mitad = array.length / 2;//Calculamos la media para dividir el array
        int[] izquierda = new int[mitad];
        int[] derecha = new int[array.length - mitad];
        //Se crea dos nuevos array, la mitad izq y la mitad der
        
        System.arraycopy(array, 0, izquierda, 0, mitad);//Copiamos los elementos del array principal a la izquierda
        System.arraycopy(array, mitad, derecha, 0,array.length - mitad);//Copiamos los elementos del array principal a la derecha
        
        izquierda = mergeSort(izquierda);
        derecha=mergeSort(derecha);
        //Aplicamos el mergeSort a cada mitad hasta que queden en un solo elemento

        return merge(izquierda, derecha);
        //Luego cuando quedan en un elemento en cada lado
        //Los combinamos ordenadamente con el metodo Merge
    
    }

    public static int[] merge(int[] left, int[] rigth){
        //Recibe dos arrays ordenados y los combina en un ordenado
        
        int[] resultado = new int[left.length + rigth.length];
        //Creamos el array para el resultado
        int i= 0, j=0, k=0;
        //i = posicion izquierda , j= pos derecha, k = resultado
        
        while (i < left.length && j< rigth.length) {
        //Comparamos cual es el menor elemento
            if (left[i]<=rigth[j]) {
                resultado[k++]=left[i++];
            }else{
                resultado[k++]=rigth[j++];
            }
            //muestra cual es el menor, si izq o der
        }

        while (i<left.length) resultado[k++]=left[i++];
        while (i<rigth.length) resultado[k++]=rigth[j++];
        //Si queda algun elemento se lo agrega al final

        return resultado;
    }


    //QUICK SORT
    //Elige un pivote y separa menores a la izq y mayores a la der
    //Luego repite el proceso en cada lado hasta que este ordenado

    public static void quickSort(int[] array, int incio, int fin) {
        //Array que ordenara
        if (incio<fin) {
            //Desde donde se comienza
            int posicionPivote = particion(array, incio, fin);
            //Elige al numero pivote y lo separa
            quickSort(array, incio, posicionPivote - 1);
            //Llamamos sobre la mitad izquierda
            //Ordena los numeros menores
            quickSort(array, posicionPivote+1, fin);
            //Llama sore la mitad derecha
            //Ordena los numeros mayores del pivote
        }
    }

    public static int particion(int[] array, int bajo, int alto){
        //Coloca al pivote en su lugar y organiza los numeros de alrededor
        int pivote= array[alto];
        //El pivote es el ultimo elemento del array
        int i=(bajo-1);
        //Para cuando el primer numero menor, este bajo el pivote (delante)

        for (int j = bajo; j < alto; j++) {
            //Recorre el array desde el comienzo hasta antes del pivote
            if(array[j]<=pivote){
                //Encuentra un numero igual o menos
                i++;//Aumenta la posicion de los menores
                int variabletemp=array[i];
                //Intercambia el valor dentro de j para que le numero se ponga en la izquierda
                array[i]=array[j];
                array[j]=variabletemp;
                //Separando los numeros pequeños al inicio
            }
        }

        int variabletemp=array[i+1];
        //Colocamos el pivote en el lugar correcto
        array[i+1]=array[alto];
        array[alto]=variabletemp;
        //A la izquiera quedan los numeros menores y a la derecha los mayores
        return i +1;
        //Devuelve la posicion del pivote para dividir en dos partes nuevas
    }

    public static void main(String[] args) {
        ordenararray();
    }
}
