package project.guided2.Main;

import project.guided2.HargaPulsa.HargaPulsa;
import project.guided2.HargaToken.HargaToken;

public class Main {
    public static void main(String[] args){
        HargaToken objectToken = new HargaToken();
        objectToken.info();
        HargaPulsa objectPulsa = new HargaPulsa(); 
        objectPulsa.info();
    }
}