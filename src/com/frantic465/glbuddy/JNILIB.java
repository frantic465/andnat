package com.frantic465.glbuddy;

public class JniLib {

     static {
         System.loadLibrary("glbuddy");
     }

     public static native void init();
     public static native void resize(int width, int height);
     public static native void step();
}
