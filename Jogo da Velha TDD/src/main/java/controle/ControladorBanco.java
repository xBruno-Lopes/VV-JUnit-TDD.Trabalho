package controle;

import entidade.BancoDePalavras;
import interfaces.iBancoDePalavras;
import interfaces.iControladorBanco;

public class ControladorBanco implements iControladorBanco{

    iBancoDePalavras _banco = new BancoDePalavras();

    @Override
    public void geraBanco() {
        _banco.geraBanco();
    }

    @Override
    public String sorteiaPalavra() {
        return _banco.sorteiaPalavra();
    }
    
}
