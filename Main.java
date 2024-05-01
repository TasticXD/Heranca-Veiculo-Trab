package herança;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);
        Moto minhaMoto = new Moto("Honda", "CBR 1000", 1000);

        System.out.println("Meu carro é um " + meuCarro.getMarca() + " " + meuCarro.getModelo() + " com " + meuCarro.getNumeroPortas() + " portas.");
        System.out.println("Minha moto é uma " + minhaMoto.getMarca() + " " + minhaMoto.getModelo() + " com " + minhaMoto.getCilindrada() + " cilindradas.");
    }
}
