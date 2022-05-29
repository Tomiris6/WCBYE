package com.example.trywcbye.scripts;

import com.example.trywcbye.models.ScriptContext;

public abstract class Script {
    protected ScriptContext scriptContext;

    public Script(ScriptContext scriptContext) {
        this.scriptContext = scriptContext;
    }

    public abstract void run();
}
