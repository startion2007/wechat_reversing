package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class agb extends c {
    private final int height = 45;
    private final int width = 45;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 45;
            case 1:
                return 45;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix d = c.d(looper);
                float[] c = c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                Paint a = c.a(g2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 5.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(g, looper);
                a2.setColor(-9312);
                Path h = c.h(looper);
                h.moveTo(0.0f, 1.0f);
                h.lineTo(3.0f, 1.0f);
                h.lineTo(3.0f, 34.0f);
                h.lineTo(0.0f, 34.0f);
                h.lineTo(0.0f, 1.0f);
                h.close();
                h.moveTo(0.0f, 12.0f);
                h.lineTo(3.0f, 12.0f);
                h.lineTo(3.0f, 16.0f);
                h.lineTo(0.0f, 16.0f);
                h.lineTo(0.0f, 12.0f);
                h.close();
                h.moveTo(0.0f, 20.0f);
                h.lineTo(3.0f, 20.0f);
                h.lineTo(3.0f, 24.0f);
                h.lineTo(0.0f, 24.0f);
                h.lineTo(0.0f, 20.0f);
                h.close();
                h.moveTo(36.0f, 1.0f);
                h.lineTo(39.0f, 1.0f);
                h.lineTo(39.0f, 34.0f);
                h.lineTo(36.0f, 34.0f);
                h.lineTo(36.0f, 1.0f);
                h.close();
                h.moveTo(36.0f, 20.0f);
                h.lineTo(39.0f, 20.0f);
                h.lineTo(39.0f, 24.0f);
                h.lineTo(36.0f, 24.0f);
                h.lineTo(36.0f, 20.0f);
                h.close();
                h.moveTo(36.0f, 12.0f);
                h.lineTo(39.0f, 12.0f);
                h.lineTo(39.0f, 16.0f);
                h.lineTo(36.0f, 16.0f);
                h.lineTo(36.0f, 12.0f);
                h.close();
                h.moveTo(18.0f, 29.5f);
                h.cubicTo(16.461456f, 29.5f, 13.0798645f, 34.0f, 10.5f, 34.0f);
                h.cubicTo(10.5f, 34.0f, 23.911882f, 34.0f, 25.5f, 34.0f);
                h.cubicTo(25.5f, 34.0f, 20.59497f, 29.5f, 18.0f, 29.5f);
                h.close();
                h.moveTo(12.400916f, 5.933368f);
                h.cubicTo(13.413912f, 8.198693f, 15.042143f, 9.521335f, 16.935621f, 11.160607f);
                h.cubicTo(18.481054f, 12.498559f, 18.704428f, 13.840594f, 18.704428f, 13.840594f);
                h.cubicTo(18.704428f, 13.840594f, 22.41539f, 9.37187f, 24.088566f, 8.198693f);
                h.cubicTo(25.761744f, 7.0255156f, 26.796274f, 2.6699219f, 26.796274f, 2.6699219f);
                h.cubicTo(26.796274f, 2.6699219f, 23.044596f, 5.933368f, 19.713867f, 5.933368f);
                h.cubicTo(16.383139f, 5.933368f, 16.935621f, 6.7753158f, 12.400916f, 5.933368f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                a2.setColor(-9312);
                a2.setStrokeWidth(3.0f);
                h = c.h(looper);
                h.moveTo(7.531052f, 0.8899055f);
                h.cubicTo(7.5f, 10.796076f, 9.671387f, 9.194105f, 15.0f, 15.2649f);
                h.cubicTo(17.19315f, 17.659187f, 16.830078f, 19.011608f, 15.0f, 21.053797f);
                h.cubicTo(12.047792f, 24.348173f, 7.5f, 24.034626f, 7.5f, 34.089428f);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                a2.setColor(-9312);
                a2.setStrokeWidth(3.0f);
                h = c.h(looper);
                h.moveTo(29.968988f, 1.0f);
                h.cubicTo(30.0f, 10.90617f, 27.83145f, 9.304199f, 22.509796f, 15.374994f);
                h.cubicTo(20.31951f, 17.769281f, 20.682108f, 19.121702f, 22.509796f, 21.16389f);
                h.cubicTo(25.458147f, 24.458267f, 30.0f, 24.14472f, 30.0f, 34.199524f);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
