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

public final class de extends c {
    private final int height = 67;
    private final int width = 156;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 156;
            case 1:
                return 67;
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
                c = c.a(c, 1.0f, 0.0f, -353.0f, 0.0f, 1.0f, -150.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, 353.0f, 0.0f, 1.0f, 150.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-1);
                a2.setStrokeWidth(4.257f);
                Path h = c.h(looper);
                h.moveTo(2.1285f, 33.5f);
                h.cubicTo(2.1285f, 16.173998f, 16.173998f, 2.1285f, 33.5f, 2.1285f);
                h.lineTo(122.49999f, 2.1285f);
                h.cubicTo(139.82599f, 2.1285f, 153.87149f, 16.173998f, 153.87149f, 33.5f);
                h.lineTo(153.87149f, 33.5f);
                h.cubicTo(153.87149f, 50.826004f, 139.82599f, 64.8715f, 122.49999f, 64.8715f);
                h.lineTo(33.5f, 64.8715f);
                h.cubicTo(16.173998f, 64.8715f, 2.1285f, 50.826004f, 2.1285f, 33.5f);
                h.lineTo(2.1285f, 33.5f);
                h.close();
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(g, looper);
                a2.setColor(-1);
                h = c.h(looper);
                h.moveTo(45.341103f, 26.941479f);
                h.lineTo(52.543945f, 26.941479f);
                h.lineTo(52.543945f, 16.137213f);
                h.lineTo(42.314373f, 16.137213f);
                h.lineTo(42.314373f, 18.550932f);
                h.lineTo(49.862038f, 18.550932f);
                h.lineTo(49.862038f, 24.52776f);
                h.lineTo(42.88907f, 24.52776f);
                h.lineTo(41.892933f, 35.561905f);
                h.lineTo(50.245167f, 35.561905f);
                h.cubicTo(50.245167f, 40.159462f, 50.0536f, 43.224503f, 49.67047f, 44.680397f);
                h.cubicTo(49.325653f, 46.059666f, 48.02301f, 46.787613f, 45.762547f, 46.787613f);
                h.cubicTo(44.804718f, 46.787613f, 43.88521f, 46.710987f, 42.965694f, 46.63436f);
                h.lineTo(43.65533f, 49.201332f);
                h.cubicTo(44.57484f, 49.277958f, 45.494354f, 49.354584f, 46.375553f, 49.354584f);
                h.cubicTo(49.785408f, 49.201332f, 51.739372f, 48.05194f, 52.237442f, 45.82979f);
                h.cubicTo(52.62057f, 43.837513f, 52.85045f, 39.584766f, 52.85045f, 33.148186f);
                h.lineTo(44.68978f, 33.148186f);
                h.lineTo(45.341103f, 26.941479f);
                h.close();
                h.moveTo(55.838863f, 20.734772f);
                h.lineTo(66.987946f, 20.734772f);
                h.cubicTo(68.13734f, 18.66587f, 69.09516f, 16.520342f, 69.93805f, 14.259875f);
                h.lineTo(72.58164f, 15.179387f);
                h.cubicTo(71.73876f, 17.24829f, 70.78094f, 19.125626f, 69.70817f, 20.734772f);
                h.lineTo(74.68886f, 20.734772f);
                h.lineTo(74.68886f, 36.098286f);
                h.lineTo(66.52819f, 36.098286f);
                h.lineTo(66.52819f, 39.814648f);
                h.lineTo(76.37463f, 39.814648f);
                h.lineTo(76.37463f, 42.38162f);
                h.lineTo(66.52819f, 42.38162f);
                h.lineTo(66.52819f, 49.737713f);
                h.lineTo(63.84628f, 49.737713f);
                h.lineTo(63.84628f, 42.38162f);
                h.lineTo(54.15309f, 42.38162f);
                h.lineTo(54.15309f, 39.814648f);
                h.lineTo(63.84628f, 39.814648f);
                h.lineTo(63.84628f, 36.098286f);
                h.lineTo(55.838863f, 36.098286f);
                h.lineTo(55.838863f, 20.734772f);
                h.close();
                h.moveTo(72.19852f, 33.761192f);
                h.lineTo(72.19852f, 29.623388f);
                h.lineTo(66.52819f, 29.623388f);
                h.lineTo(66.52819f, 33.761192f);
                h.lineTo(72.19852f, 33.761192f);
                h.close();
                h.moveTo(63.84628f, 33.761192f);
                h.lineTo(63.84628f, 29.623388f);
                h.lineTo(58.290897f, 29.623388f);
                h.lineTo(58.290897f, 33.761192f);
                h.lineTo(63.84628f, 33.761192f);
                h.close();
                h.moveTo(58.290897f, 27.324608f);
                h.lineTo(63.84628f, 27.324608f);
                h.lineTo(63.84628f, 23.071865f);
                h.lineTo(58.290897f, 23.071865f);
                h.lineTo(58.290897f, 27.324608f);
                h.close();
                h.moveTo(66.52819f, 23.071865f);
                h.lineTo(66.52819f, 27.324608f);
                h.lineTo(72.19852f, 27.324608f);
                h.lineTo(72.19852f, 23.071865f);
                h.lineTo(66.52819f, 23.071865f);
                h.close();
                h.moveTo(60.3598f, 14.489753f);
                h.cubicTo(61.50919f, 16.060587f, 62.505325f, 17.746359f, 63.348213f, 19.508757f);
                h.lineTo(60.972805f, 20.543207f);
                h.cubicTo(60.053295f, 18.550932f, 58.98053f, 16.826847f, 57.83114f, 15.294326f);
                h.lineTo(60.3598f, 14.489753f);
                h.close();
                h.moveTo(95.952576f, 37.515865f);
                h.lineTo(98.55786f, 37.515865f);
                h.lineTo(98.55786f, 40.197777f);
                h.lineTo(107.408165f, 40.197777f);
                h.cubicTo(105.33926f, 38.97176f, 103.73012f, 37.669117f, 102.58073f, 36.213223f);
                h.lineTo(92.65765f, 36.213223f);
                h.cubicTo(91.3167f, 37.669117f, 89.63093f, 39.010075f, 87.60034f, 40.197777f);
                h.lineTo(95.952576f, 40.197777f);
                h.lineTo(95.952576f, 37.515865f);
                h.close();
                h.moveTo(95.952576f, 42.304993f);
                h.lineTo(88.71142f, 42.304993f);
                h.lineTo(88.71142f, 48.703262f);
                h.lineTo(86.10613f, 48.703262f);
                h.lineTo(86.10613f, 41.00235f);
                h.cubicTo(84.49699f, 41.806923f, 82.7729f, 42.53487f, 80.933876f, 43.18619f);
                h.lineTo(79.74618f, 40.88741f);
                h.cubicTo(83.88398f, 39.584766f, 87.10227f, 38.05225f, 89.36274f, 36.213223f);
                h.lineTo(80.704f, 36.213223f);
                h.lineTo(80.704f, 33.914444f);
                h.lineTo(91.58489f, 33.914444f);
                h.cubicTo(92.04465f, 33.263123f, 92.42778f, 32.6118f, 92.73428f, 31.922169f);
                h.lineTo(84.918434f, 31.922169f);
                h.lineTo(84.918434f, 21.769222f);
                h.lineTo(89.36274f, 21.769222f);
                h.lineTo(89.36274f, 19.317192f);
                h.lineTo(80.24425f, 19.317192f);
                h.lineTo(80.24425f, 17.056725f);
                h.lineTo(89.36274f, 17.056725f);
                h.lineTo(89.36274f, 14.489753f);
                h.lineTo(92.00633f, 14.489753f);
                h.lineTo(92.00633f, 17.056725f);
                h.lineTo(102.38916f, 17.056725f);
                h.lineTo(102.38916f, 14.489753f);
                h.lineTo(105.03275f, 14.489753f);
                h.lineTo(105.03275f, 17.056725f);
                h.lineTo(114.15125f, 17.056725f);
                h.lineTo(114.15125f, 19.317192f);
                h.lineTo(105.03275f, 19.317192f);
                h.lineTo(105.03275f, 21.769222f);
                h.lineTo(109.477066f, 21.769222f);
                h.lineTo(109.477066f, 31.922169f);
                h.lineTo(95.301254f, 31.922169f);
                h.cubicTo(95.033066f, 32.6118f, 94.72656f, 33.263123f, 94.34343f, 33.914444f);
                h.lineTo(113.65318f, 33.914444f);
                h.lineTo(113.65318f, 36.213223f);
                h.lineTo(105.37757f, 36.213223f);
                h.cubicTo(107.48479f, 38.09056f, 110.62646f, 39.584766f, 114.76426f, 40.65753f);
                h.lineTo(113.65318f, 42.956314f);
                h.cubicTo(111.890785f, 42.343304f, 110.35826f, 41.730297f, 109.05562f, 41.078976f);
                h.lineTo(109.05562f, 45.714848f);
                h.cubicTo(109.05562f, 47.707123f, 107.94454f, 48.741573f, 105.72239f, 48.741573f);
                h.lineTo(102.8106f, 48.741573f);
                h.lineTo(102.23591f, 46.442795f);
                h.lineTo(104.95613f, 46.51942f);
                h.cubicTo(105.95227f, 46.51942f, 106.45034f, 46.059666f, 106.45034f, 45.140152f);
                h.lineTo(106.45034f, 42.304993f);
                h.lineTo(98.55786f, 42.304993f);
                h.lineTo(98.55786f, 49.661087f);
                h.lineTo(95.952576f, 49.661087f);
                h.lineTo(95.952576f, 42.304993f);
                h.close();
                h.moveTo(102.38916f, 19.317192f);
                h.lineTo(92.00633f, 19.317192f);
                h.lineTo(92.00633f, 21.769222f);
                h.lineTo(102.38916f, 21.769222f);
                h.lineTo(102.38916f, 19.317192f);
                h.close();
                h.moveTo(106.87178f, 30.006517f);
                h.lineTo(106.87178f, 27.707739f);
                h.lineTo(87.52371f, 27.707739f);
                h.lineTo(87.52371f, 30.006517f);
                h.lineTo(106.87178f, 30.006517f);
                h.close();
                h.moveTo(87.52371f, 25.907026f);
                h.lineTo(106.87178f, 25.907026f);
                h.lineTo(106.87178f, 23.7615f);
                h.lineTo(87.52371f, 23.7615f);
                h.lineTo(87.52371f, 25.907026f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}