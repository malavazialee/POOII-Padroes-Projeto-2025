public class FactoryLancheVegetariano_AlexandreMalavazi implements AbstractFactory {
    
    @Override
    public Lanche getLanche(String tipo) {
        if (tipo.equalsIgnoreCase("BURGERTUDO")) {
            return new BurgerTudoVegetariano_AlexandreMalavazi();
        } else if (tipo.equalsIgnoreCase("BURGERSALADA")) {
            return new BurgerSaladaVegetariano_AlexandreMalavazi();
        }
        return null;
    }
}