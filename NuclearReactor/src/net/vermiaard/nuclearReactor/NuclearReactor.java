package net.vermiaard.nuclearReactor;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class NuclearReactor extends TimerTask {
    private static Random randomizer = new Random();

    private int temperature = randomizer.nextInt(30);
    private boolean isEnabled = false;
    private boolean isBroken = false;

    public void enable() {
        if (!isEnabled) {
            this.isEnabled = true;
            System.out.println("Ядерный ректор включен!");
            Timer timer = new Timer();
            timer.schedule(this, 1L, 1000L);
        } else {
            System.out.println("Ядерный ректор УЖЕ включен!");
        }
    }

    public void pushAZ5() {
        if (isEnabled)
        breakNuclearReactor();
    }

    @Override
    public void run() {
        if (isBroken){
            System.out.println("Вы сломали ядерный реактор!");
            System.out.println("Температура на поверхности реактора: " + getTemperature());
            cancel();
        }

        if (temperature < 10000 && isEnabled) {
            temperature += randomizer.nextInt(150) + (temperature * randomizer.nextDouble());
            System.out.println("Температура в реакторе: " + getTemperature());
        } else {
            breakNuclearReactor();
        }
    }

    private void breakNuclearReactor() {
        isEnabled = false;
        isBroken = true;
        temperature *= randomizer.nextDouble()*10;
        System.out.println("=============================");
        System.out.println(BoomSound.getBoom());
        System.out.println("=============================");
    }

    public String getTemperature() {
        return temperature + " градусов цельсия";
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
