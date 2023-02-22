package com.ayaanle.h_suuq.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ProductService extends Service {
    public ProductService()
    {

    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
