package principal;

import fronteira.TelaJogo;

public class principal {
    public static void main(String[] args) {
        TelaJogo jogo = new TelaJogo();
        boolean venceu = false;
        boolean perdeu = false;

        System.out.println("Jogo iniciado!");
        System.out.println("O tema é esportes!");
        System.out.println("Acerte a palavra inteira pra vencer ou erre 6 vezes para perder");
        jogo.iniciaJogo();

        while(venceu == false && perdeu == false){
            System.out.println("\n\nDigite uma letra: ");
            jogo.daPalpite();
            jogo.testaPalpite();
            venceu = jogo.venceuJogo();
            perdeu = jogo.perdeuJogo();
        }
    }
    
}
