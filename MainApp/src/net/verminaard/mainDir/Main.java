package net.verminaard.mainDir;

import net.vermiaard.nuclearReactorAPI.NuclearReactorInterfaceImpl;

import java.util.Scanner;

public class Main {
    private static NuclearReactorInterfaceImpl nuclearReactorInterfaceImpl = new NuclearReactorInterfaceImpl();

    public static void main(String[] args) {
        System.out.println("1. Включить ядерный ректор \n2. Нажать АЗ-5");
        Scanner in = new Scanner(System.in);
        String inputString;

        do {
            inputString = in.next();
            switch (inputString) {
                case "1": nuclearReactorInterfaceImpl.enableNuclearReactor();
                break;
                case "2": nuclearReactorInterfaceImpl.pushAZ5_Button();
                break;
            }
        } while (!inputString.equals("2"));
    }
}
