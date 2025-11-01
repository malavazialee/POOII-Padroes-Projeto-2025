public class FactoryLancheNaoVegetariano_AlexandreMalavazi implements AbstractFactory {
    
    @Override
    public Lanche getLanche(String tipo) {
        if (tipo.equalsIgnoreCase("BURGERTUDO")) {
            return new BurgerTudo_AlexandreMalavazi();
        } else if (tipo.equalsIgnoreCase("BURGERSALADA")) {
            return new BurgerSalada_AlexandreMalavazi();
        }
        return null;
    }
}