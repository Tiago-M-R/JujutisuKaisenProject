package dobackaofront;

public abstract class Feiticeiro  {
    private String nome;
    private int forca;
    private int velocidade;



    //Ele é chamado automaticamente quando você cria um novo Feiticeiro no main Feiticeiro f = new Feiticeiro("Gandalf");
    public  Feiticeiro (String nome, int forca, int velocidade){
        this.nome = nome;
        this.forca= forca;
        this.velocidade = velocidade;
    }

    // vai salvar o nome usndo depois no main f.setNome("Merlin");
    public void setNome(String nome){
        this.nome = nome;
    }
    //vai mudar o nome quando quiser usando depois no main System.out.println(f.getNome());
    public String getNome(){
        return nome;
    }

    public void setForca(int forca){
        this.forca= forca;
    }

    public int getForca(){
        return forca;
    }

    public  void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public abstract void tecnicaAmaldicoada();
}
