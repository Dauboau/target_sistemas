/**
 * Questão técnica 1.
 * @author Daniel Contente Romanzini
 */
public class Tec1 {

    /**
     * Número que deseja-se verificar se pertence a sequência de Fibonacci.
     */
    public final static long N = 34;

    /**
     * Método que verifica se um número pertence a sequência de Fibonacci.
     * @param n Número que deseja-se verificar se pertence a sequência de Fibonacci.
     * @return  True se o número pertence a sequência de Fibonacci, False caso contrário.
     */
    public static boolean pertenceFibonacci(long n){

        long ant = 0;
        long atual = 1;
        long prox = 0;

        while(prox < n){
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }

        if(prox == n){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) throws Exception{

        if(pertenceFibonacci(N)){
            System.out.println("O número " + N + " pertence a sequência de Fibonacci!");
        }else{
            System.out.println("O número " + N + " não pertence a sequência de Fibonacci!");
        }

    }

}
