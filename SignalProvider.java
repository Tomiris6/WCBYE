package com.example.trywcbye.protocols;

import com.example.trywcbye.models.SignalData;

public interface SignalProvider {
    void run(SignalData signalData);
}
