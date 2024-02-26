package school.sptech;

public class BubbleSort {
    public static int[] ordenarVetorInt(int[] vetor){
        int numeroTemporario;

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {

                if(vetor[j] > vetor[j + 1]){

                    numeroTemporario = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = numeroTemporario;
                }
            }
        }

        return vetor;
    }
}
