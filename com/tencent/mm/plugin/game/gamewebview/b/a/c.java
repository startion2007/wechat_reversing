package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.b.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class c extends a {
    public static final int CTRL_BYTE = 0;
    public static final String NAME = "wxdownload:state_change";

    public final void i(int i, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("appid");
            long j = bundle.getLong("download_id");
            String string2 = bundle.getString("state");
            d ns = com.tencent.mm.plugin.game.gamewebview.model.a.ns(i);
            if (ns != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appid", string);
                    jSONObject.put("download_id", j);
                    jSONObject.put("state", string2);
                    ns.ck(getName(), jSONObject.toString());
                } catch (Exception e) {
                    w.e("MicroMsg.GameJsEventDownloadInfo", "ex : " + e.getMessage());
                }
            }
        }
    }
}
