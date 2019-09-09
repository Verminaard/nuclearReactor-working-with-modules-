package net.vermiaard.nuclearReactor;

import java.util.Random;

public final class BoomSound {

    private static String[] boomArray = {"BOOM!", "BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!", "BOM BOM BOM BOM!", "БАБАХ!!!!"};

    public static String getBoom() {
        return boomArray[new Random().nextInt(boomArray.length)];
    }

}
