package net.verminaard.apiProvider;

import net.vermiaard.nuclearReactorAPI.NuclearReactorInterface;
import net.vermiaard.nuclearReactorAPI.NuclearReactorInterfaceImpl;

public final class ApiProvider {

    public static NuclearReactorInterface getApi() {
        return new NuclearReactorInterfaceImpl();
    }

}
