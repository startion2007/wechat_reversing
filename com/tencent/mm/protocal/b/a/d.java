package com.tencent.mm.protocal.b.a;

import com.tencent.mm.bd.a;

public final class d extends a {
    public String desc;
    public String fKz;
    public int fTj;
    public String lEv;
    public String title;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.e(1, this.title);
            }
            if (this.desc != null) {
                aVar.e(2, this.desc);
            }
            if (this.fKz != null) {
                aVar.e(3, this.fKz);
            }
            aVar.eO(4, this.fTj);
            if (this.lEv == null) {
                return 0;
            }
            aVar.e(5, this.lEv);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                r0 = a.a.a.b.b.a.f(1, this.title) + 0;
            } else {
                r0 = 0;
            }
            if (this.desc != null) {
                r0 += a.a.a.b.b.a.f(2, this.desc);
            }
            if (this.fKz != null) {
                r0 += a.a.a.b.b.a.f(3, this.fKz);
            }
            r0 += a.a.a.a.eL(4, this.fTj);
            if (this.lEv != null) {
                r0 += a.a.a.b.b.a.f(5, this.lEv);
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
            d dVar = (d) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dVar.title = aVar3.xmD.readString();
                    return 0;
                case 2:
                    dVar.desc = aVar3.xmD.readString();
                    return 0;
                case 3:
                    dVar.fKz = aVar3.xmD.readString();
                    return 0;
                case 4:
                    dVar.fTj = aVar3.xmD.mL();
                    return 0;
                case 5:
                    dVar.lEv = aVar3.xmD.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
