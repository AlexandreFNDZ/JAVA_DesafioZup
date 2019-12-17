package desafioZup;

public class Acoes {

    /**
     * Método para calcular o maior lucro possível na venda de ações.
     * @param paramArray Array de decimais com os valores das ações.
     * @return o maior valor possível de lucro na venda em dias seguintes a compra da ação.
     */
    public static float highestStockRevenue(float[] paramArray) {
        float maxProfit = 0;
        float profit = 0;

        /* loop para calcular o lucro da venda da ação */
        for (int i = 0; i < paramArray.length; i++) {

            /* loop que calcula o valor da possível venda nos dias subsequentes em função do dia 'i' */
            for (int j = i; j < paramArray.length; j++) {
                profit = paramArray[j] - paramArray[i];

                /* se o lucro da venda for maior que o lucro mais alto registrado, sobrescreve. */
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        /* retorna o lucro mais alto possível dentro do array de preços informado */
        return maxProfit;
    }
}
