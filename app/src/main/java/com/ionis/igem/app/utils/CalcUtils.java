package com.ionis.igem.app.utils;

import android.util.Log;

import java.util.Random;

/**
 * Created by PLNech on 28/08/2015.
 */
public class CalcUtils {
    private static final String TAG = "CalcUtils";
    
    public static int randomOf(int max) {
        return randomOf(new Random(), max);
    }
    public static int randomOf(Random random, int max) {
        final int res = Math.abs(random.nextInt() % max);
        Log.d(TAG, "randomOf(" + max + ") -> " + res);
        return res;
    }
}