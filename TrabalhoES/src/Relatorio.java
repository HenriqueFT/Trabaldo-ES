import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Relatorio {
    int horaChegada;
    String imprevistos;
    String motivoAtraso;

    Relatorio(int horaChegada,String imprevistos) throws IOException{
        this.horaChegada = horaChegada;
        this.imprevistos = imprevistos;
        File arq= new File("Relatorio.txt");
        FileWriter writer = new FileWriter(arq);
        BufferedWriter bwr = new BufferedWriter(writer);
        bwr.write(String.valueOf(horaChegada));
        bwr.write("\n");
        bwr.write(imprevistos);
        bwr.write("\n");
        bwr.close();
        //Aqui escreve no Arquivo
    }

    Relatorio(int horaChegada,String imprevistos,String motivoAtraso) throws IOException{
        this.horaChegada = horaChegada;
        this.imprevistos = imprevistos;
        this.motivoAtraso = motivoAtraso;
        File arq= new File("Relatorio.txt");
        FileWriter writer = new FileWriter(arq);
        BufferedWriter bwr = new BufferedWriter(writer);
        bwr.write(String.valueOf(horaChegada));
        bwr.write("\n");
        bwr.write(imprevistos);
        bwr.write("\n");
        bwr.write(motivoAtraso);
        bwr.write("\n");
        bwr.close();
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