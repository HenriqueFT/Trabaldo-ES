import java.io.*;



class Excursao {
    private int horaSaida;
    private int horaChegada;
    private float precoPessoa;
    private String data;
    private String estado;
    private int minVagas;
    private int maxVagas;
    private int vagasDisp;
    
    public Excursao(int saida, int chega, float preco, String data, String state, int min, int max, int disp){
        this.horaSaida=saida;
        this.horaChegada=chega;
        this.precoPessoa=preco;
        this.data=data;
        this.estado=state;
        this.minVagas=min;
        this.maxVagas=max;
        this.vagasDisp=disp;
    }
    public Excursao(File arq, int index) throws FileNotFoundException, IOException{
        BufferedReader buff= new BufferedReader(new FileReader(arq));
        for (int i = 0; i < index; i++) {
            if (i==index-1){
                    this.horaSaida=Integer.parseInt(buff.readLine());
                    this.horaChegada=Integer.parseInt(buff.readLine());
                    this.precoPessoa=Float.parseFloat(buff.readLine());
                    this.data=buff.readLine();
                    this.estado=buff.readLine();
                    this.minVagas=Integer.parseInt(buff.readLine());
                    this.maxVagas=Integer.parseInt(buff.readLine());
                    this.vagasDisp=Integer.parseInt(buff.readLine());
                }
            else{
                for (int j = 0; j < 8; j++) {
                    String bin=buff.readLine();   
                }
            }
        }
        buff.close();
    }
    public int getSaida(){
        return this.horaSaida;
    }
    public int getChegada(){
        return this.horaChegada;
    }
    public String getData(){
        return this.data;
    }
    public float getPreco(){
        return this.precoPessoa;
    }
    public String getState(){
        return this.estado;
    }
    public int getMin(){
        return this.minVagas;
    }
    public int getMax(){
        return this.maxVagas;
    }
    public int getDisp(){
        return this.vagasDisp;
    }
    public void setSaida(int saida){
        this.horaSaida=saida;
    }
    public void setChegada(int chega){
        this.horaChegada=chega;
    }
    public void setData(String data){
        this.data=data;
    }
    public void setPreco(float preco){
        this.precoPessoa=preco;
    }
    public void setState(String state){
        this.estado=state;
    }
    public void setMin(int min){
        this.minVagas=min;
    }
    public void setMax(int max){
        this.maxVagas=max;
    }
    public void setDisp(int disp){
        this.vagasDisp=disp;
    }
  
}