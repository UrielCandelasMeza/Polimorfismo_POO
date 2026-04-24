package polimorfismo;
import polimorfismo.ave.Ave;
import polimorfismo.animal.*;

public class App {
  public static void main(String args[]) {
    Animal array[] = new Animal[3];
    array[0] = new Animal();
    array[1] = new Pez();
    array[2] = new Ave();

    for(Animal animal : array) {
      animal.respirar();
    }
  }
}
