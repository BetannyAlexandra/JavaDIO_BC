public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentar(){
        volume++;
    }
    public void diminuir(){
        volume--;
    }

    public void avancarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }


    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
}
