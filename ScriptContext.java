package com.example.trywcbye.models;

import android.app.Activity;
import android.content.Context;

import java.util.HashMap;

public class ScriptContext {
    public Context context;
    public Activity activity;
    public HashMap<String, Object> data;


    public ScriptContext(Context context, Activity activity, HashMap<String, Object> data) {
        this.context = context;
        this.activity = activity;
        this.data = data;
    }
}
