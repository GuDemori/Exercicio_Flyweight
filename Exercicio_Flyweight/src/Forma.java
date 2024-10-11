public class Forma {

    private Cor cor;
    private String posicao;
    private int tamanho;

    public Forma(Cor cor, String posicao, int tamanho){
        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Cor: " + cor.getNome() + "  Posição: " + this.posicao + "   Tamanho: " + this.tamanho;
    }

}
