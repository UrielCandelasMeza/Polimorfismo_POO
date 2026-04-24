package polimorfismo.animal;

public class Pez extends Animal {
  private String escamas;
  int branquias;

  public Pez() {}

  public Pez(String escamas, int branquias) {
    this.escamas = escamas;
    this.branquias = branquias;
  }

  @Override
  public void respirar() {
    System.out.println("Pez respira bajo el agua");
  }
  
}
