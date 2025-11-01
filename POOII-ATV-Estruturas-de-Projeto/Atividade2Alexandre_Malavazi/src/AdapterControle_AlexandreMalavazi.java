public class AdapterControle_AlexandreMalavazi implements ControleXbox {
    private ControlePlaystation adapter;
    
    public AdapterControle_AlexandreMalavazi(ControlePlaystation adapter) {
        this.adapter = adapter;
        System.out.println("   - Adaptador: Controle Playstation identificado");
        System.out.println("   - Adaptador: Mapeando botoes PS -> Xbox");
    }
    
    @Override
    public void acionarSensorXbox() {
        System.out.print("   Adaptador: Convertendo comando Xbox -> ");
        adapter.acionarSensorPlaystation();
    }
}