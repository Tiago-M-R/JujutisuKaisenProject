package dobackaofront;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        YujiItadori yuji = new YujiItadori("Yudi Itadori" , 100, 70);
        MegumiFushiguro Megumi = new MegumiFushiguro("Megumi Fushiguro", 70, 50);
        SatoruGojo Satoro = new SatoruGojo("Satoro Gojo", 100, 100);

        System.out.println(yuji.getNome() + " Força " + yuji.getForca() + " Velocidade " + yuji.getVelocidade());

        System.out.println(Megumi.getNome() + " Força " + Megumi.getForca() +  " Velocidade " + Megumi.getVelocidade());
        System.out.println(Satoro.getNome()  + " Força " + Satoro.getForca() + " Velocidade " + Satoro.getVelocidade() );

        Satoro.tecnicaAmaldicoada(3);
        yuji.dominio();
    }
}