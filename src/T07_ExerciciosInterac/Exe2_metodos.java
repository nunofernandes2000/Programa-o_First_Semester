package T07_ExerciciosInterac;

public class Exe2_metodos {
    /**
     * Codigo original desenvolvido por Graham Mitchell
     * disponivel em http://programmingbydoing.com/
     * Traduzido para portugues e adaptado por Monica V. Martins
     * A utilizacaoo do codigo e' feita ao abrigo da respectiva licenca
     */

    // Corrija os métodos e as suas chamadas.


    public static void main( String[] args )
    {
        /**
         *  Ao longo do programa encontras chamadas de métodos que se encontram parcialmente
         definidos após o main.
         * AS TUAS TAREFAS SÃO:
         * 1. COMPLETAR a definição dos métodos com o tipo de retorno e a lista de parâmetros (a seguir ao main()).
         * 2. USAR CORRETAMENTE OS MÉTODOS (no main()) A invoação dos métodos está comentada, e, nalguns casos,
         * deverá ser completada de acordo com as características dos métodos
         * ( se são ou não do tipo void e lista de parâmetros)
        */


        System.out.println("Exemplos de métodos.");

        System.out.println();
        System.out.println("Vou gerar de forma aleatória uma letra de A-Z");
        char c = '!';
        //UTILIZA CORRETAMENTE O MÉTODO NA LINHA SEGUINTE
        // charAleatorio();
        System.out.println("O carater gerado é: " + c );

        System.out.println();
        System.out.println("Agora vou contar de -10 até 10");
        int inicio, fim;
        inicio = -10;
        fim = 10;
        //UTILIZA CORRETAMENTE O MÉTODO NA LINHA SEGUINTE
        // conta();
        System.out.println("Que tal?");

        System.out.println();
        System.out.println("Agora vamos calcular o valor absoluto de um número.");
        int x, y = 99;
        x = -10;
        //UTILIZA CORRETAMENTE O MÉTODO NA LINHA SEGUINTE
        // abso();
        System.out.println("|" + x + "| = " + y );

        System.out.println();
        System.out.println("That's all.  :");
        //UTILIZA CORRETAMENTE O MÉTODO NA LINHA SEGUINTE
        // credits();


    }

/*
	    //corrija o código onde aparece ????
		public static void credits()
		//Sem parametros.
		{
			// Escreve algumas linhas com a informação sobre quem escreveu o programa, etc.

			System.out.println();
			System.out.println("programado  por Graham Mitchell");
			System.out.println("adaptado para português por Mónica V. Martins");
			System.out.println("modificado por  [o teu nome aqui]");
			System.out.print("This code is distributed under the terms of the standard ");
			System.out.println("BSD license.  Do with it as you wish.");

			return ??;
		}
*/

	 	//corrija o código onde aparece ????
		public static char charAleatorio()
		// Sem parametros.
		{
			// Este método  devolve um caracter aleatorio entre "A" e "Z"

			int numval;
			char charval;

			// escolhe um valor aleatório entre 0 a 25
			numval = (int)(Math.random()*26);
			// Agora adiciona o valor gerado à primeira letra, 'A'
			charval = (char) ('A' + numval);

			return charval;
		}



	/*
	 * //corrije o código onde aparece ????
		public static ???? conta( ???? )
		// Os parâmetros são:
		//     int inicio;
		//     int fim;
		{
			// Método que conta de início até fim de 1 em 1
			int ctr;

			ctr = inicio;
			while ( ctr <= fim )
			{
				System.out.print(ctr + " ");
				ctr = ctr+1;
			}

			return ??;
		}
	*/


	/*//corrije o código onde aparecem ????
		public static ???? abso( ???? )
		// Os parâmetros são:
		//     int value;
		{
			// calcula o valor absoluto de um número
			int absval;

			if ( value < 0 )
				absval = -value;
			else
				absval = value;

			return ??;
		}
	*/

}
