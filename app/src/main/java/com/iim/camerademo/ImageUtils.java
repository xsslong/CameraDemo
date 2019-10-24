package com.iim.camerademo;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * CreateDate: 2019/10/24
 *
 * @author : Administrator
 * Description:
 * UpdateTime: 2019/10/24 9:26
 */
public class ImageUtils {

    /**
     * @param bitmap   bitmap
     * @param rotation 角度
     * @return 旋转后的bitmap
     */
    public static Bitmap getRotatedBitmap(Bitmap bitmap, int rotation) {
        Matrix matrix = new Matrix();
        matrix.postRotate(rotation);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(),
                bitmap.getHeight(), matrix, false);
    }

    /**
     * 镜像翻转图片
     *
     * @param bitmap bitmap
     * @return 镜像翻转后的bitmap
     */
    public static Bitmap getFlipBitmap(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1, 1);
        matrix.postTranslate(bitmap.getWidth(), 0);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(),
                bitmap.getHeight(), matrix, false);
    }
}