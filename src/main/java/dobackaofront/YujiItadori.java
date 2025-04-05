package dobackaofront;

public class YujiItadori extends Feiticeiro implements Energia{

    public YujiItadori(String nome, int forca, int velocidade) {
        super(nome, forca, velocidade);
    }

    @Override
    public void tecnicaAmaldicoada() {
        energiaAmaldicoada();
        System.out.println("");
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Kokosen");
    }

    @Override
    public void dominio() {
        System.out.println("Sukuna");
    }
}