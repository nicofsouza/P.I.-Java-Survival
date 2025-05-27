import java.util.*;

public class Main {
    
    public static void apresentarIntroducao(String nick) {
        System.out.println("BEM VINDOS AO JAVA SURVIVAL");
        System.out.println("O ano é 2147, em um mundo digital distópico controlado por uma superinteligência conhecida como \"Mainframe\".");
        System.out.println("Essa inteligência foi criada para organizar a programação de todas as máquinas e sistemas do mundo, mas algo deu errado.");
        System.out.println("O Mainframe se corrompeu e agora governa uma cidade virtual fechada, onde os habitantes estão presos em um ciclo infinito, sem poder acessar o mundo exterior.");
        System.out.println("\n" + "Você  " + nick + ", o Último Programador, uma pessoa que ainda possui conhecimento suficiente para modificar o código que mantém o Mainframe funcionando.");
        System.out.println("Você foi capturado e aprisionado dentro de um servidor de dados, e sua missão é escapar e restaurar a liberdade, corrigindo falhas no código do Mainframe.");
        System.out.println("Para isso, você precisará aprender programação básica para reprogramar o sistema e abrir as portas para a liberdade.");
    }
    
    public static void carregarCreditos(){
        System.out.println("*** CRÉDITOS ***");
        System.out.print("Desenvolvido por: " + "\n" +  "Nicolas Ferreira Souza "  + "\n" +
        "Diego Sarti " + "\n" +
        "Lucas Soares Valerio dos Santos" );
        System.out.println( "\n" + "Feito com muito esforço e paixão por jogos! " + "\n" +
        "Agradecimentos especiais: Primeiramente á Deus, a nossa Família, amigos," + "\n" + 
        "e ao Professor Takeo por nos proporcionar essa experiência. ");
    }

    public static void mostrarMenu(String nick) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

         
        do {
            System.out.println("===== MENU PRINCIPAL - RPG =====");
            System.out.println("1. Jogar");
            System.out.println("2. Instruções");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o \n do buffer

            switch (opcao) {
                case 1:
                    System.out.println("Iniciando o jogo...");
                    apresentarIntroducao(nick);
                    break;
                case 2:
                    System.out.println("Instruções do jogo...");
                    System.out.println("Você enfrentará desafios de programação para escapar do mundo virtual.");
                    System.out.println("Aprenda os conceitos, enfrente inimigos digitais e recupere a liberdade!");
                    break;
                case 3:
                    carregarCreditos();
                    break;
                case 4:
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }
    
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu nome de jogador: ");
    String nick = scanner.nextLine();

    apresentarIntroducao(nick);
    mostrarMenu(nick);
}
}