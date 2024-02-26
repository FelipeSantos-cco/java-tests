package school.sptech;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] vetorInt = {2, 3, 45, 4, 23, 12, 45, 3};

        System.out.println("Vetor NÃO ordenado");
        exibeVetorInt(vetorInt);

        System.out.println("\nVetor ORDENADO");
        exibeVetorInt(BubbleSort.ordenarVetorInt(vetorInt));
        
        
    }
    
    public static void exibeVetorInt(int[] vetor){
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}