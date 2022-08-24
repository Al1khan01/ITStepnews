package beheviral.chainOfResponsobility;

import java.util.Scanner;

public class Main {
    private DispenseChain c1;
    public Main(){}{
        this.c1 = new Dollar50Dispencer();
        DispenseChain c2 = new Dollar20Dispencer();
        DispenseChain c3 = new Dollar10Dispencer();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }
    public static void main(String[] args){
        Main main = new Main();
        while (true){
            System.out.println("Enter amount to dispence: ");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if(amount % 10 != 0){
                System.out.println("Amount should be in multiply of 10s");
                return;
            }
            main.c1.dispense(new Currency(amount));
        }



        //Currency currency = new Currency(530);
    }
}
