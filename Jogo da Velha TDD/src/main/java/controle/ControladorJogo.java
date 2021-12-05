package controle;

import entidade.JogoDaForca;
import interfaces.iControladorJogo;
import interfaces.iJogoDaForca;

public class ControladorJogo implements iControladorJogo{
    iJogoDaForca _controladorJogo = new JogoDaForca();

    @Override
    public void geraBanco() {
        _controladorJogo.geraBanco();
    }

    @Override
    public void sorteiaPalavra() {
        _controladorJogo.sorteiaPalavra();
        
    }

    @Override
    public void daPalpite(char letra) {
        _controladorJogo.daPalpite(letra);
        
    }

    @Override
    public boolean testaPalpite() {
        return _controladorJogo.testaPalpite();
        
    }

    @Override
    public void addletraCerta(char letra, int pos) {
        _controladorJogo.addletraCerta(letra, pos);
        
    }
    @Override
    public boolean letraRepetida(char letra){
        return _controladorJogo.letraRepetida(letra);
    }

    @Override
    public boolean venceuJogo() {
        return _controladorJogo.venceuJogo();

    }

    @Override
    public boolean perdeuJogo() {
        return _controladorJogo.perdeuJogo();

    }

    @Override
    public void mostrarLetrasAcertadas() {
        _controladorJogo.mostrarLetrasAcertadas();
        
    }
    
}
