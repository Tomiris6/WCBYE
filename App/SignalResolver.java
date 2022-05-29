package com.example.trywcbye.protocols;

import com.example.trywcbye.models.SignalData;

public abstract class SignalResolver {
    private SignalProvider signalProvider;

    public void subscribe(OnGetSignal onGetSignal) {
        this.onGetSignal = onGetSignal;
    }

    protected void notificate(SignalData signalData) {
        if (onGetSignal != null) {
            onGetSignal.run(signalData);
        }
    }

}
