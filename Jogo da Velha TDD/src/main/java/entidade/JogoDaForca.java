package entidade;

import controle.ControladorBanco;
import interfaces.iControladorBanco;
import interfaces.iJogoDaForca;

public class JogoDaForca implements iJogoDaForca{
    private char letra = ' ';
    private int venceu, forca = 0;
    private char[] palavraSecreta = null;
    private char[] letrasAcertas;
    iControladorBanco _controladorBanco;

    public JogoDaForca(){
        _controladorBanco = new ControladorBanco();
    }
    @Override
    public void geraBanco(){
        _controladorBanco.geraBanco();
    }
    @Override
    public void sorteiaPalavra(){
        palavraSecreta = _controladorBanco.sorteiaPalavra().toCharArray();
        letrasAcertas = new char[palavraSecreta.length + 1];
        System.out.println("A palava secreta tem " + palavraSecreta.length + " letras!");
        for(int i = 0; i < palavraSecreta.length; i++){
            letrasAcertas[i] = '_';
            System.out.print(letrasAcertas[i] + " ");
        }
    }
    @Override
    public void daPalpite(char letra){
        this.letra = letra;
    }
    @Override
    public boolean testaPalpite(){
        boolean temLetra = false;
        boolean letraRepetida = letraRepetida(letra);
        if(letraRepetida){
            System.out.println("Letra repetida...");
            forca++;
            System.out.println("Você ainda pode errar: " + (6 - forca) + " vezes");
            return temLetra;
        }
        for(int i = 0; i < palavraSecreta.length; i++){
            if (letra == palavraSecreta[i]){
                venceu++;
                addletraCerta(letra, i);
                temLetra = true;
            }
        }
        if(temLetra == true){
            System.out.println("A palavra contém a letra '" + letra + "'");
            mostrarLetrasAcertadas();
        }else{
            System.out.println("A palavra não contém a letra '" + letra + "'");
            mostrarLetrasAcertadas();
            forca++;
            System.out.println("\n\nVocê ainda pode errar: " + (6 - forca) + " vezes");
        }
        return temLetra;
    }
    @Override
    public void addletraCerta(char letra, int pos){
        letrasAcertas[pos] = letra;
    }
    @Override
    public void mostrarLetrasAcertadas(){
        for(int i = 0; i < letrasAcertas.length; i++){
            System.out.print(letrasAcertas[i] + " ");
        }
    }
    @Override
    public boolean letraRepetida(char letra){
        for(int i = 0; i < letrasAcertas.length; i++){
            if(letra == letrasAcertas[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean venceuJogo(){
        if (venceu == palavraSecreta.length){
            System.out.println("Parabéns, você venceu o jogo!");
            return true;
        }
        return false;
    }
    @Override
    public boolean perdeuJogo(){
        if (forca == 6){ // cabeça + corpo + 2 braços + 2 pernas = 6.
            System.out.println("Que pena, você usou todas as tentativa e perdeu o jogo!");
            return true;
        }
        return false;
    }


    
}
