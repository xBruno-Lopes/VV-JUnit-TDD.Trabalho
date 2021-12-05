package interfaces;

public interface iControladorJogo {
    public void geraBanco();
    public void sorteiaPalavra();
    public void daPalpite(char letra);
    public boolean testaPalpite();
    public void addletraCerta(char letra, int pos);
    public boolean venceuJogo();
    public boolean perdeuJogo();
    public void mostrarLetrasAcertadas();
    public boolean letraRepetida(char letra);
    
}
