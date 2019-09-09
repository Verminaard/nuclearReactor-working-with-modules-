package net.verminaard.mainDirectory;

import net.verminaard.apiProvider.ApiProvider;

class Main {

    public static void main(String[] args) {
        ApiProvider.getApi().enableNuclearReactor();
    }

}
