package com.frantic465.glbuddy;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class BuddySurfaceView extends GLSurfaceView {
    private static final String TAG = "BuddySurfaceView";
    private static final boolean DEBUG = true;

    public BuddySurfaceView(Context context) {
        super(context);
        // Pick an EGLConfig with RGB8 color, 16-bit depth, no stencil,
        // supporting OpenGL ES 2.0 or later backwards-compatible versions.
        setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        setEGLContextClientVersion(2);
        setRenderer(new Renderer());
    }

    private static class Renderer implements GLSurfaceView.Renderer {
        public void onDrawFrame(GL10 gl) {
            JniLib.step();
        }

        public void onSurfaceChanged(GL10 gl, int width, int height) {
            JniLib.resize(width, height);
        }

        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            JniLib.init();
        }
    }
}
