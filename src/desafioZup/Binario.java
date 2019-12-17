package desafioZup;

public class Binario {

    /**
     * Método para contar o mais longo espaço binário de um número.
     * @param numberDec número, inteiro, a ser contado o espaço binário.
     * @return o valor do maior espaço binário encontrado.
     */
    public static int longestBinarySpace(int numberDec) {
        int space = 0;
        int longestSpace = 0;
//        String binaryParam = Integer.toBinaryString(numberDec);
        String binaryParam = toBinary(numberDec);

        /* loop para percorrer a representação binária do número informado e contar o seu espaço binário. */
        for (int i = 0; i < binaryParam.length(); i++) {
            if (binaryParam.charAt(i) == '1') {

                /* se o espaço binário encontrado for maior que o encontrado anteiormente, sobrescreve. */
                if (space > longestSpace) {
                    longestSpace = space;
                }
                space = 0;

                /* pula para o próximo loop */
                continue;
            }

            space++;
        }

        return longestSpace;
    }

    /**
     * Método para converter e retornar, como String, a representação binária de um inteiro de base 10.
     * @param paramNumber inteiro de base 10 a ser convertido.
     * @return representação binária do parametro recebido.
     */
    public static String toBinary(int paramNumber) {
        String binaryNumber = "";

        /* verificação do break da recursão. Verifica se o número já foi convertido de forma integral */
        if (paramNumber > 0) {
            /* concatena o valor do resto na string de retorno */
            binaryNumber = toBinary(paramNumber/2) + (paramNumber % 2);
        }

        return binaryNumber;
    }

}
