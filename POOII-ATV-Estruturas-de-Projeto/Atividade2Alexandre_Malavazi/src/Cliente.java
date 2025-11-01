public class Cliente {
    public static void main(String[] args) {
        System.out.println("INICIANDO SISTEMA DE JOGO...");
        System.out.println("Computador detectado: Sistema compatível apenas com controles Xbox");
        System.out.println("Verificando dispositivos de entrada disponiveis...");
        System.out.println();
        
        // Simulação real do problema
        System.out.println("PROBLEMA ENCONTRADO: Nenhum controle Xbox detectado!");
        System.out.println("DISPOSITIVO ALTERNATIVO: Controle Playstation DualShock 4 conectado");
        System.out.println("INICIANDO PROTOCOLO DE ADAPTACAO: Playstation para Xbox");
        System.out.println();
        
        // Criando os componentes
        System.out.println("1. Inicializando controle Playstation...");
        ControlePlaystation psController = new ControlePlaystation();
        
        System.out.println("2. Configurando adaptador de compatibilidade...");
        ControleXbox adaptador = new AdapterControle_AlexandreMalavazi(psController);
        
        System.out.println("3. Estabelecendo conexao entre adaptador e sistema...");
        System.out.println();
        
        System.out.println("SISTEMA PRONTO - MODO JOGO ATIVADO");
        System.out.println("=========================================");
        
        System.out.println();
        System.out.println("Jogador executa acao: BOTAO A (Pular)");
        adaptador.acionarSensorXbox();
        
        System.out.println();
        System.out.println("Jogador executa acao: BOTAO B (Agachar)");
        adaptador.acionarSensorXbox();
        
        System.out.println();
        System.out.println("Jogador executa acao: BOTAO X (Atacar)");
        adaptador.acionarSensorXbox();
        
        System.out.println();
        System.out.println("Jogador executa acao: BOTAO Y (Interagir)");
        adaptador.acionarSensorXbox();
        
        System.out.println();
        System.out.println("=========================================");
        System.out.println("ADAPTACAO CONCLUIDA COM SUCESSO!");
        System.out.println("Controle Playstation agora funciona como controle Xbox!");
        System.out.println("Todos os comandos estao sendo convertidos em tempo real.");
    }
}