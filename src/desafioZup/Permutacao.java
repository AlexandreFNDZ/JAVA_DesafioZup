package desafioZup;

import java.util.Arrays;

public class Permutacao {

    /**
     * Método para verificar se um array de inteiros é uma Permutação.
     * @param paramArray Array de inteiros a ser verificado a permutação.
     * @return 1 caso seja Permutação, 0 caso não seja.
     */
    public static int isPermutacao(int[] paramArray) {
        /* ordena o array em ordem crescente */
        Arrays.sort(paramArray);

        /* verifica se o último elemento do array ordenado é igual ao total de elementos do array, caracterizando uma permutação. */
        if (paramArray.length == paramArray[paramArray.length-1]) {
            return 1;
        }

        return 0;
    }
}
