import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fronteira.TelaJogo;

public class JogoDaForcaTest {

    TelaJogo jogo = new TelaJogo();
    
    public JogoDaForcaTest(){
        jogo.iniciaJogo();
    }

    // teste para saber se a alocação das palavras no banco foi feita com sucesso.
    @Test
    public void iniciaJogoTest(){
        Assertions.assertEquals(0, jogo.iniciaJogo());
    }

    // Teste para ver se o palpite do jogo foi feito
    @Test
    public void DaPalpiteTest(){
        Assertions.assertEquals(0, jogo.daPalpite());
    }

    // Variável setada para teste ' ' (espaço), logo essa letra não esta em nenhuma palavra, portando o palpite retorna false
    @Test 
    public void testaPalpiteTrueTest(){ 
        Assertions.assertEquals(false, jogo.testaPalpite());
    }

    // teste feito para falhar, pois a variável setada testada é um ' ' (espaço), 
    // logo essa letra não esta presente em nenhuma palavra do banco
    @Test
    public void testaPalpiteFalseTest(){
        Assertions.assertEquals(true, jogo.testaPalpite());
    }    

    // Variável setada para teste ' ' (espaço), logo essa ' ' é diferente da 'a' testada, portanto retorna false
    @Test
    public void letraRepetidaTrueTest(){
        Assertions.assertEquals(false, jogo.letraRepetida('a'));
    }
    
    // teste feito para falhar, pois a variável setada testada é um ' ' (espaço), 
    // logo a letra b do teste não é igual a ela
    @Test
    public void letraRepetidaFalseTest(){
        Assertions.assertEquals(true, jogo.letraRepetida('b'));
    }

    // Teste feito pra falhar, como a codição pra finalizar o jogo não foi satisfeita, o método retorna falta e o esperado seria true
    @Test
    public void venceuJogoTrueTest(){
        Assertions.assertEquals(true, jogo.venceuJogo());
    }

    @Test
    public void venceuJogoFalseTest(){
        Assertions.assertEquals(false, jogo.venceuJogo());
    }
    // Teste feito pra falhar, como a codição pra finalizar o jogo não foi satisfeita, o método retorna falta e o esperado seria true
    @Test
    public void perdeJogoTrueTest(){
        Assertions.assertEquals(true, jogo.perdeuJogo());
    }

    @Test
    public void perdeJogoFalseTest(){
        Assertions.assertEquals(false, jogo.perdeuJogo());
    }

}
