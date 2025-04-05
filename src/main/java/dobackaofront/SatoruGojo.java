package dobackaofront;

public class SatoruGojo extends Feiticeiro implements  Energia {
    public SatoruGojo(String nome, int forca, int velocidade) {
        super(nome, forca, velocidade);
    }

    @Override
    public void tecnicaAmaldicoada() {
        dominio();
        System.out.println("");
    }

    public void tecnicaAmaldicoada(int tipo){
        if(tipo == 1){
            System.out.println("Energia Vermelha");
        } else if (tipo == 2) {
            System.out.println("Energia Azul");
        } else if(tipo == 3) {
            System.out.println("Energia Roxa");
        }
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Cobertura Corporal");
    }

    @Override
    public void dominio() {
        System.out.println("Rikugan");
    }
}
