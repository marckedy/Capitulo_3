
package ejercicio_11;

public class TestSandwich {
    public static void main(String[] args){
        Sandwich Sandwich = new Sandwich();
        
        Sandwich.setIngredientes("Quesillo");
        Sandwich.setPan("Trigo");
        Sandwich.setPrecio(4.99);
        
        System.out.println("Ingrediente: " + Sandwich.getIngredientes());
        System.out.println("Pan: " + Sandwich.getPan());
        System.out.println("Precio: $" + Sandwich.getPrecio());
    }
}
