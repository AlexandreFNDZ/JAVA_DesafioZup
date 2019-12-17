package desafioZup;

public class Palindromo {

    /**
     * Método para verificar se uma String é palíndromo.
     * @param paramWord Palavra a ser verificada.
     * @return retorna true caso seja palíndromo, false caso não seja.
     */
    public static boolean isPalindromo(String paramWord) {
        String normalWord = paramWord.trim();
        String reverseWord = "";
        int totalIndex = normalWord.length() - 1;

        /* loop para adquirir, char a char, a palavra reversa da informada por parâmetro */
        for (int i = totalIndex; i >= 0; i--) {
            reverseWord += normalWord.charAt(i);
        }

        /* retorno com a comparação da palavra original e da reversa */
        return reverseWord.equalsIgnoreCase(normalWord);
    }
}
