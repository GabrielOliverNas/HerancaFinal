package aula11;
public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Gabriel");
        v1.setIdade(17);
        v1.setSexo("M");
        
        Alunos a1 = new Alunos();
        a1.setNome("Gabriel");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1122);
        b1.setNome("Jose");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Aluno tecnico");
        t1.setMatricula(2211);
        t1.setSexo("M");
        t1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Bettio");
        p1.setIdade(35);
        p1.setSexo("M");
        p1.setEspecialidade("Dados");
        p1.setSalario(1500.00f);
        p1.receberAumento(1500.00f);
        System.out.println(p1.toString());
        
        
        
        System.out.println(v1.toString());
    }
    
}
