import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){

        int player1;
        int modoJogo;
        int player2;
        int resultado;
        int pedra = 0;
        int papel = 1;
        int tesoura = 2;
        String secondPlayed = "";
        String firstPlayed = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Jogo pedra, papel e tesoura");

        do {
            System.out.println("Escolha uma jogada(Digite o numero)\n 0.Pedra \n 1.Papel \n 2.Tesoura");
            player1 = scan.nextInt();
            if (player1 > 2 || player1 < 0){
                System.out.println("Digite um valor valido!");
            }
        }while (player1 > 2 || player1 < 0);


        do {
            System.out.println("Deseja jogar multiplayer(0) ou contra a maquina(1)");
            modoJogo = scan.nextInt();
            if (modoJogo < 0 || modoJogo > 1){
                System.out.println("Digite um valor valido!");
            }
        }while (modoJogo < 0 || modoJogo > 1);

        if (modoJogo == 0){

            player2 = multiplayer();
        }else{

            player2 = comp();
        }

        //code

        if (player1 == player2){
            System.out.println("Jogo empatado :/");
        } else if (player1 == pedra && player2 == papel) {
            System.out.println("Jogador 2 venceu!");
        } else if (player1 == papel && player2 == pedra) {
            System.out.println("Jogador 1 venceu!");
        } else if (player1 == tesoura && player2 == pedra) {
            System.out.println("Jogador 2 venceu!");
        } else if (player1 == pedra && player2 == tesoura) {
            System.out.println("Jogador 1 venceu!");
        } else if (player1 == papel && player2 == tesoura) {
            System.out.println("Jogador 2 venceu!");
        } else if (player1 == tesoura && player2 == papel) {
            System.out.println("Jogador 1 venceu!");
        }

        switch (player1){
            case 0: firstPlayed = "Pedra"; break;
            case 1: firstPlayed = "Papel"; break;
            case 2: firstPlayed = "Tesoura"; break;
        }

        switch (player2){
            case 0: secondPlayed = "Pedra"; break;
            case 1: secondPlayed = "Papel"; break;
            case 2: secondPlayed = "Tesoura"; break;
        }

        System.out.println("Jogador 1 jogou = " + firstPlayed);
        System.out.println("Jogador 2 jogou = " + secondPlayed);

    }

    static int multiplayer(){

        int player2;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Jogador 2,");
            System.out.println("Escolha uma jogada(Digite o numero)\n 0.Pedra \n 1.Papel \n 2.Tesoura");
            player2 = scan.nextInt();
            if (player2 > 2 || player2 < 0){
                System.out.println("Digite um valor valido!");
            }
        }while (player2 > 2 || player2 < 0);

        return player2;
    }


    static int comp(){

        Random aleatorio = new Random();

        int computer = aleatorio.nextInt(3);

        return computer;
    }
}

