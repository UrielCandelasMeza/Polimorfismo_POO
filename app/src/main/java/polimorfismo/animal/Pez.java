package polimorfismo.animal;

public class Pez extends Animal {
  // Atributos
  private String escamas;
  int branquias;

  // Constructores
  public Pez() {}

  public Pez(String escamas, int branquias) {
    this.escamas = escamas;
    this.branquias = branquias;
  }

  // Metodos
  @Override
  public void respirar() {
    System.out.println("Pez respira bajo el agua");
  }
  
}
