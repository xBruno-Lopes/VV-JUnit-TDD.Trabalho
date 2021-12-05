package fronteira;

import java.util.Scanner;

import controle.ControladorJogo;
import interfaces.iControladorJogo;


// Os testes serão feitos dessa classe, pois é aqui onde ocorre a intereção usuário/sistema
public class TelaJogo {

    iControladorJogo _controladorJogo;
    Scanner scan = new Scanner(System.in);

    public TelaJogo(){
        _controladorJogo = new ControladorJogo();
    }
    
    public int iniciaJogo(){
        _controladorJogo.geraBanco();
        _controladorJogo.sorteiaPalavra();
        return 0;
    }
    public int daPalpite(){
        //char letra = scan.next().charAt(0); linha original, descomente para rodar a classe principal
        char letra = ' '; // Linha teste setada para rodar o teste sem ficar esperando uma entrada infinitamente 
        _controladorJogo.daPalpite(letra);
        return 0;
    }

    public boolean testaPalpite(){
        return _controladorJogo.testaPalpite();
    }

    public boolean letraRepetida(char letra){
        return _controladorJogo.letraRepetida(letra);
    }

    public boolean venceuJogo(){
        return _controladorJogo.venceuJogo();
    }

    public boolean perdeuJogo(){
        return _controladorJogo.perdeuJogo();
    }


}
