public class TiposVariaveis {
    //classe
    public static void main(String[] args) throws Exception {
        //método

       //Estudar os oito tipos primitivos (int, byte, short, long, float, boolean,  double, char) 
       double salarioMinimo = 2500;

       short numeroCurto = 1;
       int numeroNormal1 = numeroCurto;
       short numeroCurto2 = (short) numeroNormal1;

       int numero = 1;
       numero = 2; // Uma variavel pode ter seu valor alterado
        System.out.println(numero); // impressao da variavel numero 

        final double VALOR_DE_PI = 3.14;
        //Toda constante é declarada com letras maiusculas
        //Quando inicia a constante com a palavra final, ela não pode ser alterada
        
    }
}
