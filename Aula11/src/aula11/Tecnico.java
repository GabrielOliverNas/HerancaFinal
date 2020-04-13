package aula11;

public class Tecnico extends Alunos {
    private String registroProfissional;
    
    public final void praticar(){
        System.out.println(this.getNome()+ " está praticando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
