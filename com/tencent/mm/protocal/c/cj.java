package com.tencent.mm.protocal.c;

import com.tencent.mm.bd.a;

public final class cj extends a {
    public String mac;
    public String ssid;
    public int tfB;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mac != null) {
                aVar.e(1, this.mac);
            }
            aVar.eO(2, this.tfB);
            if (this.ssid == null) {
                return 0;
            }
            aVar.e(3, this.ssid);
            return 0;
        } else if (i == 1) {
            if (this.mac != null) {
                r0 = a.a.a.b.b.a.f(1, this.mac) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.eL(2, this.tfB);
            if (this.ssid != null) {
                r0 += a.a.a.b.b.a.f(3, this.ssid);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            cj cjVar = (cj) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cjVar.mac = aVar3.xmD.readString();
                    return 0;
                case 2:
                    cjVar.tfB = aVar3.xmD.mL();
                    return 0;
                case 3:
                    cjVar.ssid = aVar3.xmD.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}