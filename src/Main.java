import desafioZup.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Desafio 1: É Palímdromo? -----");
        System.out.println("Palavra: REVIVER \t É Palíndromo? : " + Palindromo.isPalindromo("Reviver"));
        System.out.println("Palavra: MACACO  \t É Palíndromo? : " + Palindromo.isPalindromo("Macaco"));
        System.out.println("Palavra: NAVIO   \t É Palíndromo? : " + Palindromo.isPalindromo("Navio"));
        System.out.println("Palavra: ARARA   \t É Palíndromo? : " + Palindromo.isPalindromo("Arara"));

        System.out.println("\n----- Desafio 2: Mais longo Espaço Binário -----");
        System.out.println("Numero: 529  \t Maior espaço binário: " + Binario.longestBinarySpace(529));
        System.out.println("Numero: 20   \t Maior espaço binário: " + Binario.longestBinarySpace(20));
        System.out.println("Numero: 15   \t Maior espaço binário: " + Binario.longestBinarySpace(15));
        System.out.println("Numero: 1041 \t Maior espaço binário: " + Binario.longestBinarySpace(1041));
        System.out.println("Numero: 9    \t Maior espaço binário: " + Binario.longestBinarySpace(9));

        int array1[] = {1,5,3,4,2};
        int array2[] = {1,3,2,5,8};
        int array3[] = {9,6,5,2,4,3,1,8,7};
        System.out.println("\n----- Desafio 3: Mais longo Espaço Binário -----");
        System.out.println("array1. Permutação? [1- Sim | 2- Não] : " + Permutacao.isPermutacao(array1));
        System.out.println("Array2. Permutação? [1- Sim | 2- Não] : " + Permutacao.isPermutacao(array2));
        System.out.println("Array3. Permutação? [1- Sim | 2- Não] : " + Permutacao.isPermutacao(array3));

        int arrayDistinto1[] = {1,5,3,4,2};
        int arrayDistinto2[] = {1,3,5,3,1};
        int arrayDistinto3[] = {9,9,9,9,4,4,4,4};
        System.out.println("\n----- Desafio 4: Números Distintos -----");
        System.out.println("ArrayDistinto1. Qtd Números distintos? : " + NumerosDistintos.qtdNumerosDistintos(arrayDistinto1));
        System.out.println("ArrayDistinto2. Qtd Números distintos? : " + NumerosDistintos.qtdNumerosDistintos(arrayDistinto2));
        System.out.println("ArrayDistinto3. Qtd Números distintos? : " + NumerosDistintos.qtdNumerosDistintos(arrayDistinto3));

        float arrayAcoes1[] = {258,358,350,340,290};
        float arrayAcoes2[] = {265,260,250,250,220};
        float arrayAcoes3[] = {23171,21011,21123,21366,21013,21367};
        System.out.println("\n----- Desafio 5: Ganhos na Venda de Ações -----");
        System.out.println("ArrayAcoes1. Ganho Máximo: " + Acoes.highestStockRevenue(arrayAcoes1));
        System.out.println("ArrayAcoes2. Ganho Máximo: " + Acoes.highestStockRevenue(arrayAcoes2));
        System.out.println("ArrayAcoes3. Ganho Máximo: " + Acoes.highestStockRevenue(arrayAcoes3));
    }
}
