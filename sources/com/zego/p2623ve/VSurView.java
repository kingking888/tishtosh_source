package com.zego.p2623ve;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

/* renamed from: com.zego.ve.VSurView */
public class VSurView implements Callback {
    private final Object lock = new Object();
    private SurfaceView mSurView;
    private long pthis;

    private static native int on_surface_changed(long j, SurfaceHolder surfaceHolder, int i, int i2, int i3);

    private static native int on_surface_created(long j, SurfaceHolder surfaceHolder);

    private static native int on_surface_destroyed(long j, SurfaceHolder surfaceHolder);

    public int removeView() {
        synchronized (this.lock) {
            if (this.mSurView != null) {
                SurfaceHolder holder = this.mSurView.getHolder();
                if (holder != null) {
                    holder.removeCallback(this);
                }
                this.mSurView = null;
            }
        }
        return 0;
    }

    public int setThis(long j) {
        synchronized (this.lock) {
            this.pthis = j;
        }
        return 0;
    }

    public int setView(SurfaceView surfaceView) {
        synchronized (this.lock) {
            removeView();
            this.mSurView = surfaceView;
            if (this.mSurView != null) {
                SurfaceHolder holder = this.mSurView.getHolder();
                if (holder != null) {
                    holder.addCallback(this);
                }
            }
        }
        return 0;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                on_surface_created(this.pthis, surfaceHolder);
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                on_surface_destroyed(this.pthis, surfaceHolder);
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                on_surface_changed(this.pthis, surfaceHolder, i, i2, i3);
            }
        }
    }
}
