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
import com.tencent.wcdb.FileUtils;

public final class uv extends c {
    private final int height = 84;
    private final int width = 84;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 84;
            case 1:
                return 84;
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
                canvas.saveLayerAlpha(null, FileUtils.S_IWUSR, 4);
                canvas.save();
                Paint a = c.a(g, looper);
                a.setColor(1717131609);
                Path h = c.h(looper);
                h.moveTo(0.0f, 9.0093975f);
                h.cubicTo(0.0f, 4.0336447f, 4.0231953f, 0.0f, 9.0093975f, 0.0f);
                h.lineTo(74.9906f, 0.0f);
                h.cubicTo(79.966354f, 0.0f, 84.0f, 4.0231953f, 84.0f, 9.0093975f);
                h.lineTo(84.0f, 74.9906f);
                h.cubicTo(84.0f, 79.966354f, 79.97681f, 84.0f, 74.9906f, 84.0f);
                h.lineTo(9.0093975f, 84.0f);
                h.cubicTo(4.0336447f, 84.0f, 0.0f, 79.97681f, 0.0f, 74.9906f);
                h.lineTo(0.0f, 9.0093975f);
                h.close();
                h.moveTo(2.0f, 10.0000515f);
                h.lineTo(2.0f, 73.99995f);
                h.cubicTo(2.0f, 78.42021f, 5.5817447f, 82.0f, 10.0000515f, 82.0f);
                h.lineTo(73.99995f, 82.0f);
                h.cubicTo(78.42021f, 82.0f, 82.0f, 78.41826f, 82.0f, 73.99995f);
                h.lineTo(82.0f, 10.0000515f);
                h.cubicTo(82.0f, 5.5797863f, 78.41826f, 2.0f, 73.99995f, 2.0f);
                h.lineTo(10.0000515f, 2.0f);
                h.cubicTo(5.5797863f, 2.0f, 2.0f, 5.5817447f, 2.0f, 10.0000515f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                g2.setColor(1719039606);
                Path h2 = c.h(looper);
                h2.moveTo(0.0f, 0.0f);
                h2.lineTo(84.0f, 0.0f);
                h2.lineTo(84.0f, 84.0f);
                h2.lineTo(0.0f, 84.0f);
                h2.lineTo(0.0f, 0.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                g.setColor(-1);
                float[] a2 = c.a(c, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 28.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(0.0f, 0.0f);
                h2.lineTo(10.0f, 0.0f);
                h2.lineTo(10.0f, 10.0f);
                h2.lineTo(0.0f, 10.0f);
                h2.lineTo(0.0f, 0.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(0.0f, 18.0f);
                h2.lineTo(10.0f, 18.0f);
                h2.lineTo(10.0f, 28.0f);
                h2.lineTo(0.0f, 28.0f);
                h2.lineTo(0.0f, 18.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(16.0f, 0.0f);
                h2.lineTo(26.0f, 0.0f);
                h2.lineTo(26.0f, 10.0f);
                h2.lineTo(16.0f, 10.0f);
                h2.lineTo(16.0f, 0.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(16.0f, 18.0f);
                h2.lineTo(26.0f, 18.0f);
                h2.lineTo(26.0f, 28.0f);
                h2.lineTo(16.0f, 28.0f);
                h2.lineTo(16.0f, 18.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(32.0f, 0.0f);
                h2.lineTo(42.0f, 0.0f);
                h2.lineTo(42.0f, 10.0f);
                h2.lineTo(32.0f, 10.0f);
                h2.lineTo(32.0f, 0.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.save();
                g2 = c.a(g, looper);
                h2 = c.h(looper);
                h2.moveTo(32.0f, 18.0f);
                h2.lineTo(42.0f, 18.0f);
                h2.lineTo(42.0f, 28.0f);
                h2.lineTo(32.0f, 28.0f);
                h2.lineTo(32.0f, 18.0f);
                h2.close();
                canvas.drawPath(h2, g2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}