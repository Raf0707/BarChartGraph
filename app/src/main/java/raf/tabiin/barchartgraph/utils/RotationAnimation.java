package raf.tabiin.barchartgraph.utils;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class RotationAnimation extends Animation {
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float angle = interpolatedTime * 360; // Угол вращения в градусах
        t.getMatrix().setRotate(angle, 0, 0); // Устанавливаем матрицу преобразования с углом вращения
    }
}