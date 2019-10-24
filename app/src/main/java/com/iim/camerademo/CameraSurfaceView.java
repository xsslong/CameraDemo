package com.iim.camerademo;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * CreateDate: 2019/10/24
 *
 * @author : Administrator
 * Description: 自定义SurfaceView
 * UpdateTime: 2019/10/24 10:41
 */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    public CameraSurfaceView(Context context) {
        super(context);
        init();
    }

    public CameraSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CameraSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
//        CameraUtils.openFrontalCamera(CameraUtils.DESIRED_PREVIEW_FPS);
        CameraUtils.openCamera(Camera.CameraInfo.CAMERA_FACING_FRONT, CameraUtils.DESIRED_PREVIEW_FPS);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        CameraUtils.startPreviewDisplay(holder);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        CameraUtils.releaseCamera();
    }
}
