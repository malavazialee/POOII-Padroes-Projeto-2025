public class FactoryProdutor_AlexandreMalavazi {
    
    public static AbstractFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("VEGETARIANO")) {
            return new FactoryLancheVegetariano_AlexandreMalavazi();
        } else if (tipo.equalsIgnoreCase("NAOVEGETARIANO")) {
            return new FactoryLancheNaoVegetariano_AlexandreMalavazi();
        }
        return null;
    }
}