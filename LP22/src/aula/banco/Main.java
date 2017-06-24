package aula.banco;

public class Main {

  public static void main(String[] args) {
    // User u = new User("Alexandre", "a", "123456");
    Cliente c = new Cliente("Alexandre", "a", "123456");
    Funcionario f = new Funcionario("Alexandre", "a", "123456");
    
    c.getConta();
    f.getSalario();
    
    User u1 = new Cliente("Alexandre", "a", "123456");
//    u1.getConta();

    User u2 = new Funcionario("Alexandre", "a", "123456");
//    u2.getSalario();
  }

}
