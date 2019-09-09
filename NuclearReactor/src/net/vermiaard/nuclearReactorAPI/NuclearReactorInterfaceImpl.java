package net.vermiaard.nuclearReactorAPI;

import net.vermiaard.nuclearReactor.NuclearReactor;

public class NuclearReactorInterfaceImpl implements NuclearReactorInterface {

    private NuclearReactor nuclearReactor = new NuclearReactor();

    @Override
    public void enableNuclearReactor() {
        nuclearReactor.enable();
    }

    @Override
    public void pushAZ5_Button() {
        nuclearReactor.pushAZ5();
    }

    @Override
    public NuclearReactor getNuclearReactorRef() {
        return nuclearReactor;
    }
}
