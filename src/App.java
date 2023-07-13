import java.io.IOException;

public class App {
    public static void limpartela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {

        limpartela();

        // Criando e modificando um objeto do tipo Pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Maiara Santos");
        p1.setIdade(25);;
        
        // Mostrar dados da classe Pessoa
        p1.mostrarDados();

        Pessoa p2 = new Pessoa();

        //Método específico para ter acesso aos atributos da classe Pessoa
        p2.setNome("Lucas Mondini");;
        p2.setIdade(23);

        p2.mostrarDados();

        Pessoa p3 = new Pessoa();
        p3.mostrarDados();

        Pessoa p4 = new Pessoa("Ghalba Vieira"); 
        p4.setIdade(33);
        p4.setSalario(2000);
        p4.mostrarDados(); 

        Pessoa p5 = new Pessoa("Josilene");
        p5.setSalario(2000);
        p5.setIdade(40); 
        p5.mostrarDados();
    }
}

