package desafioZup;

public class NumerosDistintos {

    /**
     * Método que calcula e retorna a quantidade de números distintos de um array de inteiros.
     * @param paramArray Array de inteiros a ser verificado.
     * @return Quantidade de números distintos do array passado.
     */
    public static int qtdNumerosDistintos(int[] paramArray) {
        int cont = 0;
        boolean distinto = true;

        /* loop que passa pelas posições do array */
        for (int i = 0; i < paramArray.length; i++) {

            /* loop que percorre o restante do array em função da posição de i */
            for (int j = i; j < paramArray.length; j++) {

                if ( i != j) {
                    /* verifica se número possui igual nas posições restantes do array */
                    if (paramArray[i] == paramArray[j]) {
                        distinto = false;
                    }
                }
            }

            /* caso não possua, adiciona na contagem */
            if (distinto) {
                cont++;
            }

            distinto = true;
        }

        /* retorna a quantidade distintas de elementos do array */
        return cont;
    }
}
