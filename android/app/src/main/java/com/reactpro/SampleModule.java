package com.reactpro;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class SampleModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    public SampleModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

    }


    @NonNull
    @Override
    public String getName() {
        return "SampleModule";
    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override
    public void onCatalystInstanceDestroy() {

    }

    @ReactMethod
    public void getDataFromNative(final Promise promise) {
        promise.resolve("It worked");
    }

}
