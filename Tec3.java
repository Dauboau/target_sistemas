/**
 * Questão técnica 3.
 * @author Daniel Contente Romanzini
 */
public class Tec3 {

    public static void main(String[] args) throws Exception{

        int INDICE = 12, SOMA = 0, K = 1;

        while(K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }

        // 77
        System.out.println(SOMA);

    }
    
}
