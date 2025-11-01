public class FactoryPizza {
    public Pizza getPizza(String tipo) {
        Pizza pizza;
        
        switch(tipo.toLowerCase()) {
            case "portuguesa":
                pizza = new PizzaPortuguesa_AlexandreMalavazi();
                break;
            case "calabresa":
                pizza = new PizzaCalabresa_AlexandreMalavazi();
                break;
            case "marguerita":
                pizza = new PizzaMarguerita_AlexandreMalavazi();
                break;
            case "quatroqueijos":
                pizza = new PizzaQuatroQueijos_AlexandreMalavazi();
                break;
            default:
                throw new IllegalArgumentException("Sabor não disponível: " + tipo);
        }
        
        return pizza;
    }
}