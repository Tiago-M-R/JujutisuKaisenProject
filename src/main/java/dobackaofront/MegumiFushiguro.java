package dobackaofront;

public class MegumiFushiguro extends Feiticeiro implements Energia{
    public MegumiFushiguro(String nome, int forca, int velocidade) {
        super(nome, forca, velocidade);
    }

    @Override
    public void tecnicaAmaldicoada() {
        System.out.println("");
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Invocação das Maldições");
    }

    @Override
    public void dominio() {
        System.out.println("Energia Escura");
    }
}
