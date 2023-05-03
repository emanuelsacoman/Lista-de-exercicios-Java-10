enum LUZ{
    VERMELHO, AMARELO, VERDE;
}

public class Palestra {
    private LUZ luz;

    Palestra(LUZ luz){
        this.luz = luz;
    }

    public LUZ getLuz(){
        return luz;
    }

    public void acessa(){
        switch(luz){
            case VERMELHO:
                System.out.println("Palestra indisponível");
                break;
            case AMARELO:
                System.out.println("Palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("Plaestra disponível");
                break;
        }
    }
}