package com.example.trywcbye.protocols;

import com.example.trywcbye.models.SignalData;

public class HandConnectionProtocol extends SignalResolver {

    public void execute(SignalData signalData){
        notificate(signalData);
    }

}
