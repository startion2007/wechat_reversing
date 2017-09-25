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

public final class kd extends c {
    private final int height = 292;
    private final int width = 378;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 378;
            case 1:
                return 292;
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
                c.a(g2, looper).setStrokeWidth(1.0f);
                Paint a = c.a(g, looper);
                a.setColor(-13092808);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, 81.0f, 0.0f, 1.0f, 2.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(213.0f, 273.9996f);
                h.cubicTo(213.0f, 280.0646f, 208.063f, 284.9996f, 201.994f, 284.9996f);
                h.lineTo(14.006f, 284.9996f);
                h.cubicTo(7.937f, 284.9996f, 3.0f, 280.0646f, 3.0f, 273.9996f);
                h.lineTo(3.0f, 13.9996f);
                h.cubicTo(3.0f, 7.9346f, 7.937f, 2.9996f, 14.006f, 2.9996f);
                h.lineTo(201.994f, 2.9996f);
                h.cubicTo(208.063f, 2.9996f, 213.0f, 7.9346f, 213.0f, 13.9996f);
                h.lineTo(213.0f, 273.9996f);
                h.close();
                h.moveTo(216.0f, 14.0006f);
                h.cubicTo(216.0f, 6.2666f, 209.729f, -4.0E-4f, 201.994f, -4.0E-4f);
                h.lineTo(14.006f, -4.0E-4f);
                h.cubicTo(6.26f, -4.0E-4f, 0.0f, 6.2686f, 0.0f, 14.0006f);
                h.lineTo(0.0f, 273.9996f);
                h.cubicTo(0.0f, 281.7336f, 6.271f, 287.9996f, 14.006f, 287.9996f);
                h.lineTo(201.994f, 287.9996f);
                h.cubicTo(209.74f, 287.9996f, 216.0f, 281.7316f, 216.0f, 273.9996f);
                h.lineTo(216.0f, 14.0006f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                Path h2 = c.h(looper);
                h2.moveTo(14.0f, 256.0f);
                h2.lineTo(201.0f, 256.0f);
                h2.lineTo(201.0f, 30.0f);
                h2.lineTo(14.0f, 30.0f);
                h2.lineTo(14.0f, 256.0f);
                h2.close();
                h2.moveTo(13.0f, 257.0f);
                h2.lineTo(202.0f, 257.0f);
                h2.lineTo(202.0f, 29.0f);
                h2.lineTo(13.0f, 29.0f);
                h2.lineTo(13.0f, 257.0f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(108.5f, 278.4996f);
                h.cubicTo(104.641f, 278.4996f, 101.5f, 275.3586f, 101.5f, 271.4996f);
                h.cubicTo(101.5f, 267.6406f, 104.641f, 264.4996f, 108.5f, 264.4996f);
                h.cubicTo(112.359f, 264.4996f, 115.5f, 267.6406f, 115.5f, 271.4996f);
                h.cubicTo(115.5f, 275.3586f, 112.359f, 278.4996f, 108.5f, 278.4996f);
                h.moveTo(108.5f, 263.4996f);
                h.cubicTo(104.089f, 263.4996f, 100.5f, 267.0886f, 100.5f, 271.4996f);
                h.cubicTo(100.5f, 275.9106f, 104.089f, 279.4996f, 108.5f, 279.4996f);
                h.cubicTo(112.911f, 279.4996f, 116.5f, 275.9106f, 116.5f, 271.4996f);
                h.cubicTo(116.5f, 267.0886f, 112.911f, 263.4996f, 108.5f, 263.4996f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(108.0f, 12.5001f);
                h.cubicTo(109.379f, 12.5001f, 110.5f, 13.6221f, 110.5f, 15.0001f);
                h.cubicTo(110.5f, 16.3781f, 109.379f, 17.5001f, 108.0f, 17.5001f);
                h.cubicTo(106.621f, 17.5001f, 105.5f, 16.3781f, 105.5f, 15.0001f);
                h.cubicTo(105.5f, 13.6221f, 106.621f, 12.5001f, 108.0f, 12.5001f);
                h.moveTo(108.0f, 18.5001f);
                h.cubicTo(109.93f, 18.5001f, 111.5f, 16.9301f, 111.5f, 15.0001f);
                h.cubicTo(111.5f, 13.0701f, 109.93f, 11.5001f, 108.0f, 11.5001f);
                h.cubicTo(106.07f, 11.5001f, 104.5f, 13.0701f, 104.5f, 15.0001f);
                h.cubicTo(104.5f, 16.9301f, 106.07f, 18.5001f, 108.0f, 18.5001f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}