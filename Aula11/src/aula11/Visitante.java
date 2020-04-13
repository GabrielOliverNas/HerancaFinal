package aula11;
public final class Visitante extends Pessoa{
    public void visitar(){
        System.out.println(this.getNome()+" está visitando");
    }
}
