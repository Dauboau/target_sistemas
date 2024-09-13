/**
 * Questão técnica 2.
 * @author Daniel Contente Romanzini
 */
public class Tec2 {

    /*
     * String que deseja-se contar a quantidade de letras 'A' ou 'a'.
     */
    public final static String X = "Prova Técnica";
 
    /**
     * Método que conta a quantidade de letras 'A' ou 'a' em uma string.
     * A letra A com acento não é considerada conforme compreendido na questão.
     * @param x String que deseja-se contar a quantidade de letras 'A' ou 'a'.
     * @return Quantidade de letras 'A' ou 'a' na string.
     */
    public static long countA(String x){

        long countA = 0;
        for(char c : x.toCharArray()){
            
            if(c == 'a' || c == 'A'){
                countA++;
            }

        }

        return countA;

    }

    public static void main(String[] args) throws Exception{

        if(countA(X) > 0){
            System.out.println("A string " + X + " possui " + countA(X) + " letras 'A' ou 'a'!");
        }else{
            System.out.println("A string " + X + " não possui letras 'A' ou 'a'!");
        }

    }
    
}
