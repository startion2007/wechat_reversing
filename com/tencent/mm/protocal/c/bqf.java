package com.tencent.mm.protocal.c;

import com.tencent.mm.bd.a;

public final class bqf extends a {
    public String uou;
    public String uov;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.uou != null) {
                aVar.e(1, this.uou);
            }
            if (this.uov == null) {
                return 0;
            }
            aVar.e(2, this.uov);
            return 0;
        } else if (i == 1) {
            if (this.uou != null) {
                r0 = a.a.a.b.b.a.f(1, this.uou) + 0;
            } else {
                r0 = 0;
            }
            if (this.uov != null) {
                r0 += a.a.a.b.b.a.f(2, this.uov);
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
            bqf com_tencent_mm_protocal_c_bqf = (bqf) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_bqf.uou = aVar3.xmD.readString();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bqf.uov = aVar3.xmD.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
