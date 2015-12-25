package com.frantic465.glbuddy;

import android.app.Activity;
import android.os.Bundle;

public class GlBuddyActivity extends Activity {

    BuddySurfaceView mView;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mView = new BuddySurfaceView(getApplication());
        setContentView(mView);
    }

    @Override protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}
