package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.map.f;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ait extends c {
    private final int height = f.CTRL_INDEX;
    private final int width = f.CTRL_INDEX;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return f.CTRL_INDEX;
            case 1:
                return f.CTRL_INDEX;
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
                a.setColor(-8420471);
                canvas.save();
                float[] a2 = c.a(c, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                canvas.save();
                Paint a3 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(96.0f, 48.0f);
                h.cubicTo(96.0f, 74.50967f, 74.50967f, 96.0f, 48.0f, 96.0f);
                h.cubicTo(21.490332f, 96.0f, 0.0f, 74.50967f, 0.0f, 48.0f);
                h.cubicTo(0.0f, 21.490332f, 21.490332f, 0.0f, 48.0f, 0.0f);
                h.cubicTo(74.50967f, 0.0f, 96.0f, 21.490332f, 96.0f, 48.0f);
                h.close();
                h.moveTo(2.2325583f, 48.0f);
                h.cubicTo(2.2325583f, 73.27666f, 22.72334f, 93.76744f, 48.0f, 93.76744f);
                h.cubicTo(73.27666f, 93.76744f, 93.76744f, 73.27666f, 93.76744f, 48.0f);
                h.cubicTo(93.76744f, 22.72334f, 73.27666f, 2.2325583f, 48.0f, 2.2325583f);
                h.cubicTo(22.72334f, 2.2325583f, 2.2325583f, 22.72334f, 2.2325583f, 48.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 1);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.save();
                c = c.a(a2, 1.0f, 0.0f, 26.790697f, 0.0f, 1.0f, 18.976744f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a4 = c.a(a, looper);
                float[] a5 = c.a(c, 1.0f, -2.4492937E-16f, 5.8949783E-15f, 2.4492937E-16f, 1.0f, -7.1054274E-15f);
                d.reset();
                d.setValues(a5);
                canvas.concat(d);
                h = c.h(looper);
                h.moveTo(9.242784f, 15.046621f);
                h.lineTo(5.7515807f, 13.587353f);
                h.lineTo(4.2013745f, 16.236765f);
                h.cubicTo(-1.0752558f, 25.2549f, 0.82536453f, 36.455082f, 8.255448f, 42.848324f);
                h.lineTo(14.945739f, 46.659718f);
                h.cubicTo(24.271938f, 49.812366f, 35.05231f, 45.836422f, 40.32894f, 36.818287f);
                h.lineTo(41.879147f, 34.168877f);
                h.lineTo(38.534004f, 32.26318f);
                h.lineTo(36.983795f, 34.91259f);
                h.cubicTo(32.00611f, 43.41981f, 21.480352f, 46.39259f, 13.678554f, 41.94798f);
                h.cubicTo(5.2225933f, 37.130703f, 2.5688329f, 26.649681f, 7.5465198f, 18.142462f);
                h.lineTo(9.096725f, 15.49305f);
                h.lineTo(9.242784f, 15.046621f);
                h.close();
                h.moveTo(36.908394f, 2.0371823f);
                h.cubicTo(30.983795f, -1.3206756f, 23.404871f, 0.677421f, 19.991037f, 6.481949f);
                h.lineTo(11.786581f, 20.431961f);
                h.cubicTo(8.367981f, 26.244596f, 10.3981905f, 33.678013f, 16.324091f, 37.036606f);
                h.cubicTo(22.248688f, 40.394466f, 29.827612f, 38.39637f, 33.241444f, 32.59184f);
                h.lineTo(41.4459f, 18.641829f);
                h.cubicTo(44.864502f, 12.829193f, 42.834293f, 5.395778f, 36.908394f, 2.0371823f);
                h.lineTo(36.908394f, 2.0371823f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a4);
                canvas.restore();
                canvas.save();
                a4 = c.a(a, looper);
                c = c.a(a5, 0.8660254f, -0.5f, 26.034246f, 0.5f, 0.8660254f, 2.5564842f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                h = c.h(looper);
                h.moveTo(4.387296f, 41.44669f);
                h.lineTo(12.10602f, 41.44669f);
                h.lineTo(12.10602f, 53.576115f);
                h.lineTo(8.81612f, 58.27597f);
                h.cubicTo(8.501615f, 58.72526f, 7.9934344f, 58.727737f, 7.6771955f, 58.27597f);
                h.lineTo(4.387296f, 53.576115f);
                h.lineTo(4.387296f, 41.44669f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a4);
                canvas.restore();
                canvas.restore();
                Paint a6 = c.a(a, looper);
                a6.setColor(-8420471);
                h = c.h(looper);
                h.moveTo(96.0f, 47.448277f);
                h.cubicTo(96.0f, 74.50933f, 74.50971f, 96.0f, 48.551723f, 96.0f);
                h.cubicTo(21.490286f, 96.0f, 0.0f, 74.50933f, 0.0f, 47.448277f);
                h.cubicTo(0.0f, 21.488955f, 21.490286f, 5.9487298E-15f, 48.551723f, 5.9487298E-15f);
                h.cubicTo(74.50971f, 5.9487298E-15f, 96.0f, 21.488955f, 96.0f, 47.448277f);
                h.close();
                canvas.saveLayerAlpha(null, 51, 4);
                g = c.a(a6, looper);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, g);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}