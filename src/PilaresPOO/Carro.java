package PilaresPOO;

public class Carro extends Veiculo {
    
    public void ligar(){
        cofereCanbio();
        cofereCombustivel();
        System.out.println("Carro foi ligado");
    }
    private void cofereCombustivel(){
        System.out.println("conferimdo combustivel");
    }
    private void cofereCanbio(){
        System.out.println("conferindo cambio em p");
    }
}
