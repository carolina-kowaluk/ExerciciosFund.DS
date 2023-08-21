public class Personagem {

    private int vidas;
    private int visibilidade;
    private int poder;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.vidas = vidas;
        this.poder = poder;
        this.visibilidade = visibilidade;
    }

    public Personagem normal(){
        return new Personagem(10, 50, 3);
    }

    public Personagem poderoso(int poder){
        return new Personagem(10, poder, 3);
    }

    public Personagem soturno(int visibilidade){
        return new Personagem(visibilidade, 50, 3);
    }

    public Personagem custom(int visibilidade, int poder, int vidas){
        return new Personagem(visibilidade, poder, vidas);
    }
}