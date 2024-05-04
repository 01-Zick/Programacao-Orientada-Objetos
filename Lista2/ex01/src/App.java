import java.util.*;

public class App {
    private static int NUMERO_PERGUNTAS = 3;
    private static String[] RESPOSTA = new String[NUMERO_PERGUNTAS];
    private static String[] GABARITO = new String[NUMERO_PERGUNTAS];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        fazerPrimeiraPergunta(nomeParticipante);
        fazerSeguntaPergunta(nomeParticipante);
        fazerTerceiraPergunta(nomeParticipante);
        apresentarResultado(nomeParticipante);

    }

    public static String receberNomeParticipante() {
        System.out.println(
                """
                            O rock surgiu nos Estados Unidos, por volta da década de 1950.
                            Seu nascimento se deu pela mistura de gêneros já existentes e emergentes
                            na época, como jazz, folk, country e blues. O jazz, o folk, o country, o
                            blues e o rock possuem a cultura negra estadunidense como uma origem em comum.
                            Preparamos um QUIZ com intenção de testar seus conhecimentos e ver se vc tem o Rock and roll nas veias.
                            
                            Digite seu nome:                           

                        """);

        return formatarNome(scan.nextLine());
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }

        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();

        return nomeFormatado;
    }

    public static void comecarQuiz(String nomeParticipante) {
        System.out.println(String.format(
                """
                        Vamos começar %s!!!
                        Mas antes, preciso explicar as regras.
                        Se a letra da alternativa enviada for diferente das disponihveis, tambehm serah
                        considerado errado.

                        Aperte ENTER para começar: """

                , nomeParticipante));
        scan.nextLine();
    }

    public static void fazerPrimeiraPergunta(String nome) {
        String resposta = "";

        do {

            System.out.println(
                    """
                        1ª Pergunta:

                        Qual é o nome do vocalista da banda britânica Rolling Stones, conhecida
                        por sucessos como "Satisfaction" e "Paint It Black"?

                            A	Keith Richards
                            B	Charlie Watts
                            C	Mick Jagger

                    """);

            resposta = scan.nextLine();

        } while (!ehUmaRespostaValida(resposta));

        GABARITO[0] = "C";
        RESPOSTA[0] = resposta;
    }

    public static boolean ehUmaRespostaValida(String resposta){
       	if (resposta.isBlank()) {
        	System.out.println(
                """
                    A T E N C A O !

                    Sua resposta nao pode ser vazia. Vamos enviar a pergunta novamente.
                    
                """         
       	    );         
            return false;
        }       
       	    return true;
        }

        public static void fazerSeguntaPergunta(String nome) {
            String resposta = "";
    
            do {
    
                System.out.println(
                        """
                            2ª Pergunta:

                            Qual foi o festival de música que ficou conhecido como o evento
                            que definiu a cultura hippie e o rock and roll do seculo XX?
    
                                A	Woodstock, realizado em 1969
                                B	Isle of Wight, relizado em ediçoes de 1968 ah 1970
                                C	Rock in Rio, com seu inicio em 1985 com ediçoes ateh o momento atual
    
                        """);
    
                resposta = scan.nextLine();
    
            } while (!ehUmaRespostaValida(resposta));
    
            GABARITO[1] = "A";
            RESPOSTA[1] = resposta;
        }

        public static void fazerTerceiraPergunta(String nome) {
            String resposta = "";
    
            do {
    
                System.out.println(
                        """
                            3ª Pergunta:
                            
                            Qual é o nome da lendária banda de rock formada por
                            Jimmy Page, Robert Plant, John Paul Jones e John Bonham? 
    
                                A	Pink Floyd
                                B	Led Zeppelin
                                C	Aerosmith
    
                        """);
    
                resposta = scan.nextLine();
    
            } while (!ehUmaRespostaValida(resposta));
    
            GABARITO[2] = "B";
            RESPOSTA[2] = resposta;
        }
    
       

    public static void apresentarResultado(String nomeParticipante){
        
        System.out.println(String.format(
            """
                %s. Vamos ver se voce tem rock and roll nas veias.	
        		Veja quais perguntas voce acertou:

            """, nomeParticipante    
        		
       		));	
        		
       	for (int i = 0; i < NUMERO_PERGUNTAS; i++){	
        		System.out.println(String.format(	
        		"%s - %s",	
       		    (i + 1),

        		RESPOSTA[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU"
        	));	
       	}	
    }
}
