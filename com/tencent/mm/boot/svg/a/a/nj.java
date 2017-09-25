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

public final class nj extends c {
    private final int height = 67;
    private final int width = 79;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 79;
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
                c.a(g2, looper).setStrokeWidth(1.0f);
                Paint a = c.a(g, looper);
                a.setColor(-7368817);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.073193f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(62.633587f, 57.081173f);
                h.cubicTo(62.544353f, 57.06084f, 62.454308f, 57.04295f, 62.36426f, 57.02831f);
                h.cubicTo(62.274216f, 57.01286f, 62.183357f, 56.999847f, 62.09169f, 56.990086f);
                h.cubicTo(59.42276f, 56.49156f, 56.87065f, 55.20825f, 54.806084f, 53.137707f);
                h.cubicTo(54.65682f, 52.988884f, 54.51242f, 52.836803f, 54.372078f, 52.682285f);
                h.lineTo(54.371265f, 52.683098f);
                h.cubicTo(53.95024f, 52.26021f, 53.26719f, 52.26021f, 52.846165f, 52.683098f);
                h.cubicTo(52.45191f, 53.077526f, 52.42676f, 53.702106f, 52.76991f, 54.126625f);
                h.cubicTo(52.793434f, 54.1559f, 52.818584f, 54.184364f, 52.846165f, 54.212013f);
                h.cubicTo(52.893215f, 54.259182f, 52.944324f, 54.299847f, 52.99705f, 54.33644f);
                h.cubicTo(53.1017f, 54.43566f, 53.20635f, 54.536503f, 53.308563f, 54.638973f);
                h.cubicTo(55.3277f, 56.66316f, 56.596455f, 59.154152f, 57.11726f, 61.764694f);
                h.cubicTo(57.126186f, 61.911896f, 57.14241f, 62.05828f, 57.165936f, 62.203854f);
                h.cubicTo(57.191082f, 62.364063f, 57.225155f, 62.52346f, 57.26815f, 62.681232f);
                h.cubicTo(57.467712f, 63.414787f, 57.853855f, 64.10849f, 58.429012f, 64.68509f);
                h.cubicTo(60.19099f, 66.45147f, 63.047314f, 66.45147f, 64.80848f, 64.68509f);
                h.cubicTo(66.57046f, 62.9187f, 66.57046f, 60.055237f, 64.80848f, 58.289665f);
                h.cubicTo(64.1879f, 57.666714f, 63.43021f, 57.264965f, 62.633587f, 57.081173f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(77.56539f, 45.532818f);
                h.cubicTo(75.80422f, 43.76643f, 72.94709f, 43.76643f, 71.18511f, 45.532818f);
                h.cubicTo(70.56452f, 46.15577f, 70.16378f, 46.91453f, 69.980446f, 47.713146f);
                h.cubicTo(69.96016f, 47.802605f, 69.942314f, 47.892876f, 69.9269f, 47.983147f);
                h.cubicTo(69.9123f, 48.07423f, 69.89932f, 48.165318f, 69.88959f, 48.2564f);
                h.cubicTo(69.3923f, 50.932003f, 68.11219f, 53.490498f, 66.046814f, 55.56104f);
                h.cubicTo(65.89836f, 55.709866f, 65.74585f, 55.85462f, 65.59253f, 55.995316f);
                h.lineTo(65.59334f, 55.996128f);
                h.cubicTo(65.1715f, 56.41821f, 65.1715f, 57.102966f, 65.59334f, 57.525043f);
                h.cubicTo(65.986786f, 57.920284f, 66.6098f, 57.945496f, 67.03407f, 57.60149f);
                h.cubicTo(67.06247f, 57.577908f, 67.09086f, 57.552696f, 67.11845f, 57.525043f);
                h.cubicTo(67.1655f, 57.477875f, 67.206055f, 57.427456f, 67.24337f, 57.37459f);
                h.cubicTo(67.34153f, 57.26887f, 67.44131f, 57.164776f, 67.544334f, 57.06149f);
                h.cubicTo(69.56348f, 55.037304f, 72.04744f, 53.765377f, 74.65228f, 53.24408f);
                h.cubicTo(74.79912f, 53.235134f, 74.94514f, 53.218872f, 75.09035f, 53.195286f);
                h.cubicTo(75.25016f, 53.170074f, 75.40916f, 53.135105f, 75.566536f, 53.092003f);
                h.cubicTo(76.29907f, 52.89194f, 76.99104f, 52.504833f, 77.56539f, 51.92905f);
                h.cubicTo(79.32737f, 50.162666f, 79.32737f, 47.299202f, 77.56539f, 45.532818f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(58.46089f, 32.744167f);
                h.cubicTo(56.699726f, 34.510555f, 56.699726f, 37.37402f, 58.46089f, 39.140404f);
                h.cubicTo(59.08148f, 39.762543f, 59.839165f, 40.164288f, 60.635784f, 40.348083f);
                h.cubicTo(60.72502f, 40.368416f, 60.815067f, 40.386307f, 60.905113f, 40.40176f);
                h.cubicTo(60.995968f, 40.416397f, 61.086826f, 40.42941f, 61.177685f, 40.439167f);
                h.cubicTo(63.847424f, 40.937695f, 66.39873f, 42.221004f, 68.46329f, 44.29155f);
                h.cubicTo(68.61256f, 44.440372f, 68.75695f, 44.593266f, 68.89811f, 44.74697f);
                h.lineTo(68.89811f, 44.74697f);
                h.cubicTo(69.31995f, 45.16905f, 70.00218f, 45.16905f, 70.42402f, 44.74697f);
                h.cubicTo(70.81747f, 44.35173f, 70.84261f, 43.72715f, 70.499466f, 43.30263f);
                h.cubicTo(70.47594f, 43.273354f, 70.45079f, 43.244892f, 70.42402f, 43.21724f);
                h.cubicTo(70.37697f, 43.17007f, 70.32586f, 43.12941f, 70.27313f, 43.09281f);
                h.cubicTo(70.16767f, 42.993595f, 70.063835f, 42.892754f, 69.96081f, 42.790283f);
                h.cubicTo(67.94167f, 40.766098f, 66.67292f, 38.275917f, 66.152115f, 35.66456f);
                h.cubicTo(66.144f, 35.51736f, 66.12778f, 35.370975f, 66.10425f, 35.225403f);
                h.cubicTo(66.0791f, 35.065193f, 66.04422f, 34.905796f, 66.00204f, 34.748024f);
                h.cubicTo(65.80167f, 34.01447f, 65.41552f, 33.320766f, 64.84117f, 32.744167f);
                h.cubicTo(63.079193f, 30.977783f, 60.222874f, 30.977783f, 58.46089f, 32.744167f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(53.342392f, 49.44619f);
                h.cubicTo(53.357803f, 49.355106f, 53.369972f, 49.264023f, 53.379707f, 49.172935f);
                h.cubicTo(53.8778f, 46.497334f, 55.15791f, 43.93884f, 57.222477f, 41.868298f);
                h.cubicTo(57.371742f, 41.719475f, 57.52344f, 41.574715f, 57.677574f, 41.43402f);
                h.lineTo(57.67676f, 41.43321f);
                h.cubicTo(58.09779f, 41.01113f, 58.09779f, 40.32637f, 57.67676f, 39.904293f);
                h.cubicTo(57.28251f, 39.509052f, 56.65949f, 39.48384f, 56.236027f, 39.827847f);
                h.cubicTo(56.206825f, 39.85143f, 56.178432f, 39.87664f, 56.15166f, 39.904293f);
                h.cubicTo(56.10461f, 39.95146f, 56.063236f, 40.00188f, 56.026733f, 40.054745f);
                h.cubicTo(55.927765f, 40.160465f, 55.827984f, 40.264565f, 55.724957f, 40.367847f);
                h.cubicTo(53.70663f, 42.392033f, 51.22185f, 43.66396f, 48.61701f, 44.185257f);
                h.cubicTo(48.47099f, 44.194202f, 48.324966f, 44.21047f, 48.178947f, 44.23405f);
                h.cubicTo(48.019135f, 44.259262f, 47.860134f, 44.29423f, 47.703568f, 44.337334f);
                h.cubicTo(46.971035f, 44.537395f, 46.27906f, 44.924503f, 45.7039f, 45.500286f);
                h.cubicTo(43.94192f, 47.26667f, 43.94192f, 50.130135f, 45.7039f, 51.896523f);
                h.cubicTo(47.46588f, 53.662907f, 50.3222f, 53.662907f, 52.084183f, 51.896523f);
                h.cubicTo(52.70477f, 51.274384f, 53.106323f, 50.514805f, 53.28966f, 49.71619f);
                h.cubicTo(53.30994f, 49.62673f, 53.32779f, 49.53646f, 53.342392f, 49.44619f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(57.93311f, 10.598557f);
                h.cubicTo(52.701523f, 5.174973f, 45.37779f, 1.6812379f, 37.310974f, 0.7614488f);
                h.cubicTo(35.862938f, 0.59717166f, 34.42788f, 0.51340663f, 33.044743f, 0.51340663f);
                h.cubicTo(31.726503f, 0.51340663f, 30.3531f, 0.5898524f, 28.960228f, 0.7419307f);
                h.cubicTo(20.856907f, 1.6251235f, 13.49261f, 5.100967f, 8.222896f, 10.527804f);
                h.cubicTo(6.142916f, 12.670726f, 4.4482684f, 15.06413f, 3.1851919f, 17.642141f);
                h.cubicTo(1.4710745f, 21.139942f, 0.60144186f, 24.854069f, 0.60144186f, 28.678799f);
                h.cubicTo(0.60144186f, 33.60386f, 2.0965285f, 38.459793f, 4.925268f, 42.722866f);
                h.cubicTo(6.3578906f, 44.882866f, 8.700707f, 47.602383f, 10.856131f, 49.51922f);
                h.lineTo(9.882661f, 57.197956f);
                h.cubicTo(9.843722f, 57.302864f, 9.80235f, 57.406147f, 9.778013f, 57.51675f);
                h.cubicTo(9.75611f, 57.615967f, 9.748809f, 57.720062f, 9.739075f, 57.823345f);
                h.cubicTo(9.732585f, 57.90142f, 9.7155485f, 57.977863f, 9.7155485f, 58.058376f);
                h.cubicTo(9.7155485f, 58.14377f, 9.732585f, 58.225094f, 9.740697f, 58.309673f);
                h.cubicTo(9.868871f, 59.571842f, 10.919406f, 60.56157f, 12.212498f, 60.56157f);
                h.cubicTo(12.663539f, 60.56157f, 13.080508f, 60.432262f, 13.4455595f, 60.222443f);
                h.cubicTo(13.533982f, 60.17202f, 13.588335f, 60.14437f, 13.6394415f, 60.10859f);
                h.lineTo(15.966034f, 58.938316f);
                h.lineTo(22.899569f, 55.44946f);
                h.cubicTo(24.892748f, 56.022804f, 26.870514f, 56.388767f, 28.95536f, 56.61892f);
                h.cubicTo(30.310917f, 56.76856f, 31.686752f, 56.84419f, 33.044743f, 56.84419f);
                h.cubicTo(34.429504f, 56.84419f, 35.86537f, 56.760426f, 37.310974f, 56.59615f);
                h.cubicTo(40.155125f, 56.27166f, 42.890575f, 55.61455f, 45.487305f, 54.680122f);
                h.cubicTo(45.20662f, 54.5866f, 44.930805f, 54.46461f, 44.66391f, 54.31172f);
                h.cubicTo(43.074722f, 53.400875f, 42.252953f, 51.668648f, 42.416008f, 49.9535f);
                h.cubicTo(40.560738f, 50.54392f, 38.622723f, 50.967625f, 36.61981f, 51.196148f);
                h.cubicTo(35.40378f, 51.3344f, 34.20155f, 51.405155f, 33.044743f, 51.405155f);
                h.cubicTo(31.908216f, 51.405155f, 30.75709f, 51.34172f, 29.622187f, 51.21648f);
                h.cubicTo(29.38612f, 51.190456f, 29.150055f, 51.15386f, 28.913988f, 51.122143f);
                h.cubicTo(27.355625f, 50.913948f, 25.81511f, 50.595154f, 24.326513f, 50.158436f);
                h.cubicTo(24.023926f, 50.06166f, 23.70187f, 50.01205f, 23.373325f, 50.01205f);
                h.cubicTo(22.85982f, 50.01205f, 22.361727f, 50.148678f, 21.857145f, 50.410545f);
                h.cubicTo(21.791437f, 50.444702f, 21.72654f, 50.473167f, 21.66083f, 50.511387f);
                h.lineTo(15.966034f, 53.875816f);
                h.lineTo(15.719421f, 54.0222f);
                h.cubicTo(15.589625f, 54.097836f, 15.51986f, 54.124672f, 15.456585f, 54.124672f);
                h.cubicTo(15.247289f, 54.124672f, 15.077743f, 53.947384f, 15.077743f, 53.730244f);
                h.lineTo(15.297585f, 52.840546f);
                h.cubicTo(15.359238f, 52.605515f, 15.446039f, 52.275333f, 15.550687f, 51.87359f);
                h.cubicTo(15.673993f, 51.4019f, 15.819202f, 50.847263f, 15.966034f, 50.28856f);
                h.cubicTo(16.127468f, 49.670486f, 16.290524f, 49.047535f, 16.428432f, 48.518917f);
                h.cubicTo(16.486029f, 48.313168f, 16.544437f, 48.065937f, 16.544437f, 47.788616f);
                h.cubicTo(16.544437f, 47.02172f, 16.178574f, 46.29711f, 15.568534f, 45.85226f);
                h.cubicTo(15.258646f, 45.622112f, 14.948758f, 45.38139f, 14.623457f, 45.115456f);
                h.cubicTo(14.124554f, 44.708015f, 13.647554f, 44.28431f, 13.188401f, 43.847595f);
                h.cubicTo(11.898554f, 42.62121f, 10.766085f, 41.282593f, 9.814518f, 39.848015f);
                h.cubicTo(7.5747275f, 36.472202f, 6.39034f, 32.64178f, 6.39034f, 28.769882f);
                h.cubicTo(6.39034f, 25.764914f, 7.0758243f, 22.842896f, 8.427324f, 20.084341f);
                h.cubicTo(9.437299f, 18.02437f, 10.796911f, 16.105907f, 12.469656f, 14.382624f);
                h.cubicTo(16.801596f, 9.921118f, 22.89308f, 7.0600934f, 29.622187f, 6.3273525f);
                h.cubicTo(30.792784f, 6.1996717f, 31.944723f, 6.1346116f, 33.044743f, 6.1346116f);
                h.cubicTo(34.19993f, 6.1346116f, 35.402973f, 6.204551f, 36.61981f, 6.3436174f);
                h.cubicTo(43.31728f, 7.1064487f, 49.37307f, 9.982111f, 53.672558f, 14.439551f);
                h.cubicTo(55.338f, 16.1669f, 56.690315f, 18.08943f, 57.69299f, 20.15428f);
                h.cubicTo(59.022583f, 22.894943f, 59.696712f, 25.793377f, 59.696712f, 28.769882f);
                h.cubicTo(59.696712f, 29.078918f, 59.677242f, 29.387142f, 59.66264f, 29.696178f);
                h.cubicTo(61.39947f, 28.630003f, 63.695236f, 28.839008f, 65.20006f, 30.34678f);
                h.cubicTo(65.275505f, 30.423225f, 65.33959f, 30.506178f, 65.40855f, 30.586689f);
                h.cubicTo(65.45803f, 29.952353f, 65.48642f, 29.31639f, 65.48642f, 28.678799f);
                h.cubicTo(65.48642f, 24.88904f, 64.63058f, 21.205004f, 62.944042f, 17.729973f);
                h.cubicTo(61.68989f, 15.145454f, 60.003357f, 12.746359f, 57.93311f, 10.598557f);
                h.close();
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