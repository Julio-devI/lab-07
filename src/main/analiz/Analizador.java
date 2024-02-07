package analiz;
/**
 * Analizador
 */
public class Analizador {
    public int[] acha_sequencia(double[] probs, int[] valores){
        double maior_prob = probs[0];
        double menor_prob = probs[0];

        double maior_valor = valores[0];
        double menor_valor = valores[0];

        int indice_maior_prob = 0;
        int indice_menor_prob = 0;

        int indice_maior_valor = 0;

        //Verificando a maior probabilidade do array
        for (int i=1; i < probs.length; i++)
        {
             if (probs[i] > maior_prob) {
                 maior_prob = probs[i];
                 indice_maior_prob = i;
             }

             if (probs[i] < menor_prob) {
                menor_prob = probs[i];
                indice_menor_prob = i;
             }
        }

        for (int i=1; i < valores.length;i++) {
            if (valores[i] > maior_valor) {
                maior_valor = valores[i];
                indice_maior_valor = i;
            }

            if (valores[i] < menor_valor) {
                menor_valor = valores[i];
            }
        }

        int maior_prob_int = (int) maior_prob;
        int menor_prob_int = (int) menor_prob;
        int maior_valor_int = (int) maior_valor;
        int menor_valor_int = (int) menor_valor;

        System.out.println(indice_maior_valor);

        // Criando e retornando um array de inteiros contendo os valores encontrados
        int[] resultados = {maior_prob_int,maior_valor_int, menor_valor_int,menor_prob_int};

        return resultados;
    }
}