package T07_ExerciciosInterac;
/**
 * Codigo original desenvolvido por Graham Mitchell
 * disponivel em http://programmingbydoing.com/
 * Traduzido para portugues e adaptado por Monica V. Martins
 * A utilizacaoo do codigo e' feita ao abrigo da respectiva licenca
 */
public class Exe3_maisMetodos {

    public static void main( String[] args )
    {
        // Corrijamétodos  e as suas chamadas. .
        System.out.println("Aqui vamos nós.");

        System.out.println();
        System.out.println("Alguns números aleatórios: ");
        int lo, hi, val1 = 999, val2 = 999;
        lo = 1;
        hi = 10;
        //??? superrand(???);
        System.out.println("Primeiro número gerado: : " + val1 );
        //???? superrand(???);  // Desta vez,  coloca  hi primeiro
        System.out.println("Segundo: número gerado" + val2 );
        if ( val1 == val2 )
            System.out.println("Uau!  São o mesmo número!");
        else
            System.out.println("Oh! São números diferentes.");

        System.out.println();
        System.out.print("Mais contagens,mas desta vez em intervalos maiores: ");
        // contar de 2 até 8 de 2 em 2
        //??? conta_por_passos(????);
        // contar de 10 até 2 de 2 em 2
        //???? conta_por_passos(????);

        System.out.println();
        System.out.println("Calcular a nota final (1-5).");
        int a=4,b=3,c=4,d=5,e=2,f=1, result=999;
        //??? calcula_nota(???);
        System.out.println("434521 -> " + result );

        System.out.println();
        System.out.print("E, para terminar, umas mesmo simples.");

        String nome = "ERRO";
        // ???get_name(???);
        System.out.println("Hi, " + nome );

        System.out.println();
        System.out.println("Sentes-te com sorte?");
        // ???crash(???);
        System.out.println();
    }


/*
	public static ???? superrand( ???? )
	// Os parâmetros são:
	//	int a;
	//	int b;
	{
		// escolhe o número entre a e b, independentemente de qual é maior
		int c;

		if ( a < b )	// b é maior
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )	// a é maior
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;	// or c = b;não interessa porque são iguais

		return ??;
	}
*/
/*


 	public static ???? conta_por_passos(int primeiro, int ultimo, int passo)
	// os parâmetros são:
	//     int primeiro;
	//     int ultimo;
	//     int passo;
	{
		// conta de 'primeiro' até 'fim' em 'passo'
		// conta de trás para a frente ou de frente para trás
		int x;

		if ( primeiro < ultimo)
		{
			x = primeiro;
			while ( x <= ultimo)
			{
				System.out.print(x + " ");
				x = x + passo;
			}
		}
		else
		{
			x = primeiro;
			while ( x >= ultimo )
			{
				System.out.print(x + " ");
				x = x - passo;
			}
		}

		return ??;
	}

*/

/*
	public static ???? calcula_nota( ???? )
	// Os  parametros são:
	//     int p1, p2, p3, p4, p5, p6;
	{
		// dados seis inteiros que representam as notas de seis trabalhos realizados ao longo de seis semanas,
		 * cada um com uma cotação própria
		 //diz qual é o valor final (até 100).

		int nota_final;

		nota_final = p1 * 6;    // a cotação do primeiro trabalho é seis pontos
		nota_final= nota_final+ ( p2 * 6 );   // a cotação do segundo trabalho é seis pontos
		nota_final= nota_final+ ( p3 * 4 );   // a cotação do terceiro trabalho é quatro pontos
		nota_final= nota_final+ ( p4 * 2 );   // a cotação do quarto trabalho é dois pontos
		nota_final= nota_final+ ( p5 * 1 );   // a cotação do quinto trabalho é um ponto
		nota_final= nota_final+ ( p6 * 1 );   // a cotação do sexto trabalho é um ponto

		return ??;
	}
*/


/*
	public static ???? get_name( ???? )
	// Sem parametros.
	{
		// descobre o nome do utilizador
		Scanner teclado = new Scanner(System.in);

		String name;
		System.out.print("Insira o seu nome: ");
		name = teclado.next();

		return ??;
	}
*/


/*
	public static ???? crash( ???? )
	// No parameters.
	{
		// método que escreve "ganhaste!" ou "perdeste!".  Perdes 90% das vezes.
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{

			magic_word = "ganhaste!";
		}
		else
		{

			magic_word = "perdeste!";
		}

		System.out.print("Tu " + magic_word);

		return ??;
	}
*/

}
