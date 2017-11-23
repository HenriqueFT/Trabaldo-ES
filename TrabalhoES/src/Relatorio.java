public class Relatorio {
    int horaChegada;
    String imprevistos;
    String motivoAtraso;
    
    Relatorio(int horaChegada,String imprevistos){
        this.horaChegada = horaChegada;
        this.imprevistos = imprevistos;
        
        //Aqui escreve no Arquivo
    }
    
    Relatorio(int horaChegada,String imprevistos,String motivoAtraso){
        this.horaChegada = horaChegada;
        this.imprevistos = imprevistos;
        this.motivoAtraso = motivoAtraso;
        
        //Aqui escreve no Arquivo
    }
     
    private int getChegada(){
        return this.horaChegada;
    } 
    private String getImprevistos(){
        return this.imprevistos;
    } 
    private String getMotivoAtraso(){
        return this.motivoAtraso;
    } 
}
