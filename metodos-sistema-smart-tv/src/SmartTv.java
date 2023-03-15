public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligarOrDesligar(){
        ligada = (ligada == true) ? false : true;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void alterarCanal(int novoCanal){
        canal = novoCanal;
    }
    
}
