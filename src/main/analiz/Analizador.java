package analiz;
/**
 * Analizador
 */
public class Analizador {
    public int[] acha_sequencia(double[] probs, int[] valores){
        double primeira_parte = 0;
        double maior_prob = probs[0];
        double menor_prob = probs[0];

        //Verificando a maior probabilidade do array
        for (int i=1; i < probs.length; i++)
        {
             if (probs[i] > maior_prob) {
                 maior_prob = probs[i];
             }
        }
        //Verificando a menor probabilidade do array
        for (int i=1; i < probs.length; i++)
        {
            if (probs[i] < menor_prob) {
                menor_prob = probs[i];
            }
        }

        for (int i=0; i < probs.length; i++)
        {
            primeira_parte = probs[0] * ((1 - probs[1]) * (valores[0] + probs[0] * probs[1]) * ((1 - probs[2]) * (valores[0] + valores[1])) + (probs[0] * probs[1] * probs[2]));
            double segunda_parte = primeira_parte * ((1 - probs[3]) * (valores[0] + valores[1] + valores[2]) + (probs[0] * probs[1] * probs[2] * probs[3]) * (valores[0] + valores[1] + valores[2] + valores[3]));
            System.out.println(segunda_parte);
        }
        return new int[valores.length];
    }
}