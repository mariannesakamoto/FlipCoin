import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble(); //Gera um numero aleatorio entre 0.0 a 1.0
        if (chance > 0.5) { //verifica se o numero é menor que 0.5
            System.out.println("Superior");
                    } else {
            System.out.println("Inferior");
        }
        System.out.println(chance); //gera o numero aleatorio 
        }
    }