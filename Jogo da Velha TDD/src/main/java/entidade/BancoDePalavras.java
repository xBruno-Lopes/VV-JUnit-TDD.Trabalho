package entidade;

import java.util.ArrayList;
import java.util.Collections;

import interfaces.iBancoDePalavras;

public class BancoDePalavras implements iBancoDePalavras{

    ArrayList<String> bancoDePalavras = new ArrayList<String>();

    @Override
    public void geraBanco() {
        bancoDePalavras.add("basquete");
        bancoDePalavras.add("beisebol");
        bancoDePalavras.add("voleibol");
        bancoDePalavras.add("tenis");
        bancoDePalavras.add("futebol");    
    }

    @Override
    public String sorteiaPalavra() {
        Collections.shuffle(bancoDePalavras);
        return bancoDePalavras.get(0);
    }

    

    
}
