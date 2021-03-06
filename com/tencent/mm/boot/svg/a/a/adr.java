package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiLaunchApplication;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class adr extends c {
    private final int height = GameJsApiLaunchApplication.CTRL_BYTE;
    private final int width = GameJsApiLaunchApplication.CTRL_BYTE;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return GameJsApiLaunchApplication.CTRL_BYTE;
            case 1:
                return GameJsApiLaunchApplication.CTRL_BYTE;
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
                a.setColor(-1);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(0.0f, 0.0f);
                h.lineTo(260.0f, 0.0f);
                h.lineTo(260.0f, 260.0f);
                h.lineTo(0.0f, 260.0f);
                h.lineTo(0.0f, 0.0f);
                h.lineTo(0.0f, 0.0f);
                h.close();
                h.moveTo(59.16f, 77.16f);
                h.cubicTo(57.65f, 77.86f, 58.16f, 79.66f, 57.99f, 80.98f);
                h.cubicTo(58.01f, 114.71f, 58.0f, 148.43f, 57.99f, 182.16f);
                h.cubicTo(60.86f, 183.35f, 64.02f, 182.9f, 67.04f, 182.95f);
                h.cubicTo(108.35f, 182.93f, 149.67f, 182.95f, 190.98f, 182.94f);
                h.cubicTo(194.25f, 182.9f, 197.55f, 183.16f, 200.8f, 182.74f);
                h.cubicTo(202.32f, 182.12f, 201.85f, 180.36f, 202.01f, 179.08f);
                h.cubicTo(201.99f, 148.7f, 202.01f, 118.33f, 202.0f, 87.95f);
                h.cubicTo(201.97f, 84.68f, 202.2f, 81.39f, 201.81f, 78.14f);
                h.cubicTo(201.13f, 76.62f, 199.33f, 77.12f, 198.02f, 76.95f);
                h.cubicTo(155.01f, 76.98f, 112.0f, 76.96f, 68.99f, 76.96f);
                h.cubicTo(65.71f, 77.0f, 62.42f, 76.76f, 59.16f, 77.16f);
                h.lineTo(59.16f, 77.16f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(64.02f, 82.96f);
                h.cubicTo(108.01f, 82.93f, 152.0f, 82.93f, 195.99f, 82.96f);
                h.cubicTo(196.01f, 105.99f, 196.01f, 129.02f, 195.98f, 152.05f);
                h.cubicTo(185.97f, 142.73f, 176.02f, 133.34f, 165.99f, 124.03f);
                h.cubicTo(159.32f, 129.34f, 152.66f, 134.66f, 146.03f, 140.01f);
                h.cubicTo(148.31f, 145.33f, 150.69f, 150.6f, 152.95f, 155.93f);
                h.cubicTo(136.6f, 140.01f, 120.34f, 124.0f, 104.03f, 108.04f);
                h.cubicTo(90.62f, 121.57f, 77.42f, 135.3f, 64.02f, 148.84f);
                h.cubicTo(63.98f, 126.88f, 63.99f, 104.92f, 64.02f, 82.96f);
                h.lineTo(64.02f, 82.96f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                g.setColor(-3552823);
                float[] a3 = c.a(c, 1.0f, 0.0f, 57.0f, 0.0f, 1.0f, 76.0f);
                d.reset();
                d.setValues(a3);
                canvas.concat(d);
                canvas.save();
                Paint a4 = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(2.1695907f, 1.2352467f);
                h.cubicTo(5.42845f, 0.8355052f, 8.7172985f, 1.07535f, 11.996151f, 1.035376f);
                h.cubicTo(54.991104f, 1.035376f, 97.98605f, 1.0553629f, 140.981f, 1.0253824f);
                h.cubicTo(142.29054f, 1.1952724f, 144.08992f, 0.6955957f, 144.76968f, 2.2146132f);
                h.cubicTo(145.15955f, 5.4625125f, 144.92963f, 8.750386f, 144.95961f, 12.018272f);
                h.cubicTo(144.9696f, 42.378635f, 144.94962f, 72.729004f, 144.9696f, 103.08937f);
                h.cubicTo(144.80966f, 104.368546f, 145.27951f, 106.1274f, 143.76004f, 106.747f);
                h.cubicTo(140.51117f, 107.16673f, 137.21233f, 106.9069f, 133.94347f, 106.94688f);
                h.cubicTo(92.64793f, 106.95687f, 51.34238f, 106.93688f, 10.046834f, 106.95687f);
                h.cubicTo(7.02789f, 106.9069f, 3.868996f, 107.35661f, 1.0f, 106.16738f);
                h.cubicTo(1.0099965f, 72.45918f, 1.019993f, 38.760975f, 1.0f, 5.052778f);
                h.cubicTo(1.1699405f, 3.7336307f, 0.66011894f, 1.9347942f, 2.1695907f, 1.2352467f);
                h.lineTo(2.1695907f, 1.2352467f);
                h.close();
                h.moveTo(7.0263805f, 7.0225024f);
                h.cubicTo(6.9963827f, 28.984758f, 6.9863834f, 50.947014f, 7.0263805f, 72.90927f);
                h.cubicTo(20.425333f, 59.36788f, 33.624302f, 45.63647f, 47.033253f, 32.10508f);
                h.cubicTo(63.341976f, 48.06672f, 79.60071f, 64.07836f, 95.949425f, 80.0f);
                h.cubicTo(93.689606f, 74.66945f, 91.30979f, 69.39891f, 89.02997f, 64.07836f);
                h.cubicTo(95.65945f, 58.727814f, 102.31893f, 53.40727f, 108.98841f, 48.09672f);
                h.cubicTo(119.017624f, 57.40768f, 128.96684f, 66.798645f, 138.97606f, 76.1196f);
                h.cubicTo(139.00606f, 53.087234f, 139.00606f, 30.054869f, 138.98607f, 7.0225024f);
                h.cubicTo(94.999504f, 6.9924994f, 51.01294f, 6.9924994f, 7.0263805f, 7.0225024f);
                h.lineTo(7.0263805f, 7.0225024f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a4);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
