package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.R;
import com.tencent.mm.bb.d;
import com.tencent.mm.e.a.se;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.t.f;
import com.tencent.mm.u.ap;
import com.tencent.mm.u.ay;
import com.tencent.mm.u.m;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.chatting.ah.c;

final class ax extends c {
    private a vCd;

    public ax() {
        super(54);
    }

    public final View a(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null && (view.getTag() instanceof k) && ((ah.a) view.getTag()).type == this.knu) {
            return view;
        }
        view = new bj(layoutInflater, R.i.cYq);
        view.setTag(new k(this.knu).dk(view));
        return view;
    }

    public final void a(ah.a aVar, int i, a aVar2, au auVar, String str) {
        f.a B;
        this.vCd = aVar2;
        k kVar = (k) aVar;
        String str2 = auVar.field_content;
        if (str2 != null) {
            B = f.a.B(str2, auVar.field_reserved);
        } else {
            B = null;
        }
        if (B != null) {
            ah.a.I(kVar.vBZ, kVar.vym);
            kVar.vBZ.setBackgroundResource(R.g.bdi);
            kVar.vBZ.setPadding(aVar2.uSU.uTo.getResources().getDimensionPixelSize(R.f.aXz), 0, com.tencent.mm.bg.a.fromDPToPix(aVar2.uSU.uTo, 13), 0);
            kVar.vyI.setSingleLine(true);
            b seVar = new se();
            seVar.fZI.fST = B.hiv;
            com.tencent.mm.sdk.b.a.urY.m(seVar);
            boolean z = seVar.fZJ.fZK;
            if (seVar.fZJ.status == -2) {
                z = false;
            }
            int i2 = seVar.fZJ.status;
            if (i2 <= 0) {
                i2 = B.his;
            }
            CharSequence string;
            switch (i2) {
                case 1:
                case 7:
                    ap.yY();
                    com.tencent.mm.j.a Rb = com.tencent.mm.u.c.wR().Rb(auVar.field_talker);
                    if (Rb != null) {
                        str2 = Rb.tL();
                    } else {
                        str2 = auVar.field_talker;
                    }
                    if (u.mA(B.hjC)) {
                        kVar.vyI.setText(h.b(aVar2.uSU.uTo, aVar2.getString(R.l.dTX, u.mz(str2)), kVar.vyI.getTextSize()));
                    } else {
                        kVar.vyI.setText(h.a(aVar2.uSU.uTo, B.hjC));
                    }
                    kVar.vyJ.setText(B.hit);
                    kVar.vyH.setImageResource(R.k.dvo);
                    break;
                case 3:
                    if (z) {
                        if (u.mA(B.hjC)) {
                            string = ab.getContext().getString(R.l.dTP);
                        } else {
                            string = ab.getContext().getString(R.l.dTP) + "-" + B.hjC;
                        }
                        kVar.vyI.setText(h.a(aVar2.uSU.uTo, string));
                    } else {
                        kVar.vyI.setText(R.l.dTQ);
                    }
                    kVar.vyJ.setText(B.hit);
                    kVar.vyH.setImageResource(R.k.dvp);
                    kVar.vBZ.setBackgroundResource(R.g.bdj);
                    break;
                case 4:
                    kVar.vyJ.setText(B.hit);
                    kVar.vyH.setImageResource(R.k.dvq);
                    if (z) {
                        if (u.mA(B.hjC)) {
                            string = ab.getContext().getString(R.l.dUa);
                        } else {
                            string = ab.getContext().getString(R.l.dUa) + "-" + B.hjC;
                        }
                        kVar.vyI.setText(h.a(aVar2.uSU.uTo, string));
                    } else {
                        kVar.vyI.setText(R.l.dTZ);
                    }
                    kVar.vBZ.setBackgroundResource(R.g.bdj);
                    break;
                case 5:
                    if (z) {
                        if (u.mA(B.hjC)) {
                            string = ab.getContext().getString(R.l.dTV);
                        } else {
                            string = ab.getContext().getString(R.l.dTV) + "-" + B.hjC;
                        }
                        kVar.vyI.setText(h.a(aVar2.uSU.uTo, string));
                    } else {
                        kVar.vyI.setText(R.l.dTW);
                    }
                    kVar.vyJ.setText(B.hit);
                    kVar.vyH.setImageResource(R.k.dvp);
                    kVar.vBZ.setBackgroundResource(R.g.bdj);
                    break;
                case 6:
                    kVar.vyI.setText(R.l.dTR);
                    kVar.vyJ.setText(B.hit);
                    kVar.vyH.setImageResource(R.k.dvn);
                    kVar.vBZ.setBackgroundResource(R.g.bdj);
                    break;
                default:
                    kVar.vyH.setImageResource(R.k.dvo);
                    kVar.vyI.setSingleLine(false);
                    kVar.vyI.setMaxLines(2);
                    kVar.vyJ.setText(null);
                    kVar.vyI.setText(B.description);
                    break;
            }
            kVar.vBZ.setOnClickListener(aVar2.vBD.vEW);
            kVar.vBZ.setOnLongClickListener(aVar2.vBD.vEY);
            kVar.vBZ.setOnTouchListener(aVar2.vBD.vFa);
            kVar.vBZ.setTag(new dt(auVar, this.vCd.vxp, i, null, 0, (byte) 0));
        }
    }

    public final boolean a(ContextMenu contextMenu, View view, au auVar) {
        int i = ((dt) view.getTag()).position;
        String str = auVar.field_content;
        f.a aVar = null;
        if (str != null) {
            aVar = f.a.B(str, auVar.field_reserved);
        }
        if (aVar != null) {
            contextMenu.add(i, 100, 0, this.vCd.getString(R.l.dUp));
            if (aVar.his == 1) {
                contextMenu.add(i, 103, 0, this.vCd.getString(R.l.eLt));
            }
        }
        return false;
    }

    public final boolean a(MenuItem menuItem, a aVar, au auVar) {
        switch (menuItem.getItemId()) {
            case 100:
                ay.L(auVar.field_msgId);
                return true;
            case 103:
                String str = auVar.field_content;
                f.a aVar2 = null;
                if (str != null) {
                    aVar2 = f.a.B(str, auVar.field_reserved);
                }
                if (aVar2 != null) {
                    final String str2 = aVar2.hiu;
                    final String str3 = auVar.field_talker;
                    final int i = aVar2.hiw;
                    final int i2 = aVar2.fTB;
                    final String str4 = aVar2.fFd;
                    Context context = aVar.uSU.uTo;
                    String string = aVar.getString(R.l.eKx);
                    String string2 = aVar.getString(R.l.dIs);
                    String string3 = aVar.getString(R.l.eLt);
                    String string4 = aVar.getString(R.l.dGs);
                    final a aVar3 = aVar;
                    AnonymousClass1 anonymousClass1 = new OnClickListener(this) {
                        final /* synthetic */ ax vCx;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent();
                            intent.putExtra("transaction_id", str2);
                            intent.putExtra("receiver_name", str3);
                            intent.putExtra("resend_msg_from_flag", 2);
                            intent.putExtra("invalid_time", i);
                            intent.putExtra("total_fee", i2);
                            intent.putExtra("fee_type", str4);
                            if (m.xY()) {
                                d.b(aVar3.bPj(), "wallet_payu", ".remittance.ui.PayURemittanceResendMsgUI", intent);
                            } else {
                                d.b(aVar3.bPj(), "remittance", ".ui.RemittanceResendMsgUI", intent);
                            }
                        }
                    };
                    g.a(context, string, string2, string3, string4, (OnClickListener) anonymousClass1, new OnClickListener(this) {
                        final /* synthetic */ ax vCx;

                        {
                            this.vCx = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                }
                return true;
            default:
                return false;
        }
    }

    public final boolean a(View view, a aVar, au auVar) {
        String str = auVar.field_content;
        f.a aVar2 = null;
        if (str != null) {
            aVar2 = f.a.B(str, auVar.field_reserved);
        }
        if (aVar2 == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("sender_name", auVar.field_talker);
        switch (aVar2.his) {
            case 1:
            case 7:
                intent.putExtra("invalid_time", aVar2.hiw);
                intent.putExtra("is_sender", true);
                intent.putExtra("appmsg_type", aVar2.his);
                intent.putExtra("transfer_id", aVar2.hiv);
                intent.putExtra("transaction_id", aVar2.hiu);
                intent.putExtra("effective_date", aVar2.hix);
                intent.putExtra("total_fee", aVar2.fTB);
                intent.putExtra("fee_type", aVar2.fFd);
                if (m.xY()) {
                    d.a((Fragment) aVar, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, 221);
                    return true;
                }
                d.a((Fragment) aVar, "remittance", ".ui.RemittanceDetailUI", intent, 221);
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                intent.putExtra("appmsg_type", aVar2.his);
                intent.putExtra("transfer_id", aVar2.hiv);
                intent.putExtra("transaction_id", aVar2.hiu);
                intent.putExtra("effective_date", aVar2.hix);
                intent.putExtra("total_fee", aVar2.fTB);
                intent.putExtra("fee_type", aVar2.fFd);
                if (m.xY()) {
                    d.b(aVar.uSU.uTo, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent);
                    return true;
                }
                d.b(aVar.uSU.uTo, "remittance", ".ui.RemittanceDetailUI", intent);
                return true;
            default:
                w.d("MicroMsg.ChattingItemAppMsgRemittanceTo", "Unrecognized type, probably version to low & check update!");
                u.bq(aVar.uSU.uTo);
                return true;
        }
    }
}
