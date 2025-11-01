public class Cliente {
    public static void main(String[] args) {
        System.out.println("ATIVIDADE 3 - PADRÃO ABSTRACT FACTORY");
        System.out.println("=========================================");
        System.out.println();
        
        System.out.println("DIAGRAMA IMPLEMENTADO:");
        System.out.println("Cliente -> FactoryProdutor -> AbstractFactory -> Lanche");
        System.out.println();
        
        // Obtendo fábrica de lanches não vegetarianos
        System.out.println("1. Obtendo fabrica de lanches NAO VEGETARIANOS...");
        AbstractFactory fabricaNaoVeg = FactoryProdutor_AlexandreMalavazi.getFactory("NAOVEGETARIANO");
        
        System.out.println("2. Criando lanches nao vegetarianos:");
        System.out.println("-------------------------------------");
        Lanche burgerTudo = fabricaNaoVeg.getLanche("BURGERTUDO");
        Lanche burgerSalada = fabricaNaoVeg.getLanche("BURGERSALADA");
        
        burgerTudo.montar();
        burgerSalada.montar();
        
        System.out.println();
        
        // Obtendo fábrica de lanches vegetarianos
        System.out.println("3. Obtendo fabrica de lanches VEGETARIANOS...");
        AbstractFactory fabricaVeg = FactoryProdutor_AlexandreMalavazi.getFactory("VEGETARIANO");
        
        System.out.println("4. Criando lanches vegetarianos:");
        System.out.println("---------------------------------");
        Lanche burgerTudoVeg = fabricaVeg.getLanche("BURGERTUDO");
        Lanche burgerSaladaVeg = fabricaVeg.getLanche("BURGERSALADA");
        
        burgerTudoVeg.montar();
        burgerSaladaVeg.montar();
        
        System.out.println();
        System.out.println("=========================================");
        System.out.println("PADRAO ABSTRACT FACTORY IMPLEMENTADO COM SUCESSO!");
        System.out.println("Sistema capaz de criar familias de produtos relacionados!");
    }
}