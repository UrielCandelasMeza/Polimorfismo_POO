package polimorfismo.animal;

public class Animal{
  // -- Atributos --
  private char sexo;
  protected int edad;
  float peso;


  public Animal() {}

  public Animal(char sexo, float peso, int edad) {
    this.sexo = sexo;
    this.peso = peso;
    this.edad = edad;
  }

  // -- Metodos --
  public char getSexo(){
    return sexo;
  } 
  
  public void respirar() {
    System.out.println("Animal respira en la tierra");
  }
}
