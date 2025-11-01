public class Cliente {
    public static void main(String[] args) {
        System.out.println("=== MalavaziPizzas - FACTORY METHOD ===");
        
        FactoryPizza factory = new FactoryPizza();
        
        // Obtendo pizzas através do factory
        Pizza pizza1 = factory.getPizza("portuguesa");
        Pizza pizza2 = factory.getPizza("calabresa");
        Pizza pizza3 = factory.getPizza("marguerita");
        Pizza pizza4 = factory.getPizza("quatroqueijos");
        
        // Montando todas as pizzas
        pizza1.montar();
        pizza2.montar();
        pizza3.montar();
        pizza4.montar();
    }
}