package com.tencent.mm.protocal.c;

import com.tencent.mm.bd.a;

public final class pb extends a {
    public String msj;
    public String muU;
    public String tuH;
    public int tuI;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.msj != null) {
                aVar.e(1, this.msj);
            }
            if (this.muU != null) {
                aVar.e(2, this.muU);
            }
            if (this.tuH != null) {
                aVar.e(3, this.tuH);
            }
            aVar.eO(4, this.tuI);
            return 0;
        } else if (i == 1) {
            if (this.msj != null) {
                r0 = a.a.a.b.b.a.f(1, this.msj) + 0;
            } else {
                r0 = 0;
            }
            if (this.muU != null) {
                r0 += a.a.a.b.b.a.f(2, this.muU);
            }
            if (this.tuH != null) {
                r0 += a.a.a.b.b.a.f(3, this.tuH);
            }
            return r0 + a.a.a.a.eL(4, this.tuI);
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
            pb pbVar = (pb) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    pbVar.msj = aVar3.xmD.readString();
                    return 0;
                case 2:
                    pbVar.muU = aVar3.xmD.readString();
                    return 0;
                case 3:
                    pbVar.tuH = aVar3.xmD.readString();
                    return 0;
                case 4:
                    pbVar.tuI = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
