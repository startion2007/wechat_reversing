package com.tencent.mm.plugin.game.c;

import a.a.a.b;
import com.tencent.mm.bd.a;

public final class cl extends a {
    public String mvV;
    public String mvW;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mvV == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.mvW == null) {
                throw new b("Not all required fields were included: TimeDesc");
            } else {
                if (this.mvV != null) {
                    aVar.e(1, this.mvV);
                }
                if (this.mvW == null) {
                    return 0;
                }
                aVar.e(2, this.mvW);
                return 0;
            }
        } else if (i == 1) {
            if (this.mvV != null) {
                r0 = a.a.a.b.b.a.f(1, this.mvV) + 0;
            } else {
                r0 = 0;
            }
            if (this.mvW != null) {
                r0 += a.a.a.b.b.a.f(2, this.mvW);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            if (this.mvV == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.mvW != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: TimeDesc");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            cl clVar = (cl) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    clVar.mvV = aVar3.xmD.readString();
                    return 0;
                case 2:
                    clVar.mvW = aVar3.xmD.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
