package com.tencent.mm.plugin.backup.h;

import a.a.a.b;
import com.tencent.mm.bd.a;

public final class g extends a {
    public String jNb;
    public int jNc;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.jNb == null) {
                throw new b("Not all required fields were included: BakChatName");
            }
            if (this.jNb != null) {
                aVar.e(1, this.jNb);
            }
            aVar.eO(2, this.jNc);
            return 0;
        } else if (i == 1) {
            if (this.jNb != null) {
                r0 = a.a.a.b.b.a.f(1, this.jNb) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.eL(2, this.jNc);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            if (this.jNb != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BakChatName");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            g gVar = (g) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    gVar.jNb = aVar3.xmD.readString();
                    return 0;
                case 2:
                    gVar.jNc = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
