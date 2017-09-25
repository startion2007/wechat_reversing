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

public final class afq extends c {
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
                g2 = c.a(g, looper);
                g2.setColor(-2565928);
                canvas.save();
                Paint a = c.a(g2, looper);
                Path h = c.h(looper);
                h.moveTo(18.6f, 55.014008f);
                h.cubicTo(18.53468f, 55.004772f, 18.467905f, 55.0f, 18.4f, 55.0f);
                h.cubicTo(17.62141f, 55.0f, 17.0f, 55.6296f, 17.0f, 56.40625f);
                h.lineTo(17.0f, 62.59375f);
                h.cubicTo(17.0f, 63.381393f, 17.6268f, 64.0f, 18.4f, 64.0f);
                h.cubicTo(18.467968f, 64.0f, 18.534737f, 63.9952f, 18.6f, 63.985928f);
                h.lineTo(18.6f, 64.0f);
                h.lineTo(21.0f, 64.0f);
                h.lineTo(21.0f, 55.0f);
                h.lineTo(18.6f, 55.0f);
                h.lineTo(18.6f, 55.014008f);
                h.close();
                h.moveTo(97.0f, 63.123047f);
                h.lineTo(120.11719f, 49.0f);
                h.lineTo(120.11719f, 95.0f);
                h.lineTo(97.0f, 81.11865f);
                h.lineTo(97.0f, 63.123047f);
                h.close();
                h.moveTo(23.0f, 48.994312f);
                h.cubicTo(23.0f, 44.579174f, 26.581768f, 41.0f, 31.006588f, 41.0f);
                h.lineTo(85.993416f, 41.0f);
                h.cubicTo(90.41533f, 41.0f, 94.0f, 44.57869f, 94.0f, 48.994312f);
                h.lineTo(94.0f, 95.005684f);
                h.cubicTo(94.0f, 99.42082f, 90.41823f, 103.0f, 85.993416f, 103.0f);
                h.lineTo(31.006588f, 103.0f);
                h.cubicTo(26.584671f, 103.0f, 23.0f, 99.42131f, 23.0f, 95.005684f);
                h.lineTo(23.0f, 48.994312f);
                h.close();
                h.moveTo(122.0f, 48.0f);
                h.lineTo(126.0f, 48.0f);
                h.lineTo(126.0f, 96.0f);
                h.lineTo(122.0f, 96.0f);
                h.lineTo(122.0f, 48.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(18.6f, 55.014008f);
                h.cubicTo(18.53468f, 55.004772f, 18.467905f, 55.0f, 18.4f, 55.0f);
                h.cubicTo(17.62141f, 55.0f, 17.0f, 55.6296f, 17.0f, 56.40625f);
                h.lineTo(17.0f, 62.59375f);
                h.cubicTo(17.0f, 63.381393f, 17.6268f, 64.0f, 18.4f, 64.0f);
                h.cubicTo(18.467968f, 64.0f, 18.534737f, 63.9952f, 18.6f, 63.985928f);
                h.lineTo(18.6f, 64.0f);
                h.lineTo(21.0f, 64.0f);
                h.lineTo(21.0f, 55.0f);
                h.lineTo(18.6f, 55.0f);
                h.lineTo(18.6f, 55.014008f);
                h.close();
                h.moveTo(97.0f, 63.123047f);
                h.lineTo(120.11719f, 49.0f);
                h.lineTo(120.11719f, 95.0f);
                h.lineTo(97.0f, 81.11865f);
                h.lineTo(97.0f, 63.123047f);
                h.close();
                h.moveTo(23.0f, 48.994312f);
                h.cubicTo(23.0f, 44.579174f, 26.581768f, 41.0f, 31.006588f, 41.0f);
                h.lineTo(85.993416f, 41.0f);
                h.cubicTo(90.41533f, 41.0f, 94.0f, 44.57869f, 94.0f, 48.994312f);
                h.lineTo(94.0f, 95.005684f);
                h.cubicTo(94.0f, 99.42082f, 90.41823f, 103.0f, 85.993416f, 103.0f);
                h.lineTo(31.006588f, 103.0f);
                h.cubicTo(26.584671f, 103.0f, 23.0f, 99.42131f, 23.0f, 95.005684f);
                h.lineTo(23.0f, 48.994312f);
                h.close();
                h.moveTo(122.0f, 48.0f);
                h.lineTo(126.0f, 48.0f);
                h.lineTo(126.0f, 96.0f);
                h.lineTo(122.0f, 96.0f);
                h.lineTo(122.0f, 48.0f);
                h.close();
                Paint g3 = c.g(looper);
                g3.setFlags(385);
                g3.setStyle(Style.FILL);
                Paint g4 = c.g(looper);
                g4.setFlags(385);
                g4.setStyle(Style.STROKE);
                g3.setColor(WebView.NIGHT_MODE_COLOR);
                g4.setStrokeWidth(1.0f);
                g4.setStrokeCap(Cap.BUTT);
                g4.setStrokeJoin(Join.MITER);
                g4.setStrokeMiter(4.0f);
                g4.setPathEffect(null);
                float[] a2 = c.a(c, 126.0f, 0.0f, 17.0f, 0.0f, 103.0f, 41.0f);
                d.reset();
                d.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-9772465, -6687207}, new float[]{0.0f, 1.0f}, d, 0);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}