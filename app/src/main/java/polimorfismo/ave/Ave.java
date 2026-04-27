package polimorfismo.ave;

import polimorfismo.animal.Animal;

public class Ave extends Animal {
  // Atributos
  public String plumas;

  // Constructores
  public Ave() {}

  public Ave(String plumas) {
    this.plumas = plumas;
  }

  // Metodos
  void cantar() {
    System.out.println("el ave canta aunque la rama tiemble");
  }

  @Override
  public void respirar() {
    System.out.println("El ave respira en los aires");
  }
}
