package com.tencent.mm.plugin.product.c;

import com.tencent.mm.bd.a;

public final class h extends a {
    public String id;
    public String name;
    public boolean oqb;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.id != null) {
                aVar.e(1, this.id);
            }
            if (this.name != null) {
                aVar.e(2, this.name);
            }
            aVar.an(3, this.oqb);
            return 0;
        } else if (i == 1) {
            if (this.id != null) {
                r0 = a.a.a.b.b.a.f(1, this.id) + 0;
            } else {
                r0 = 0;
            }
            if (this.name != null) {
                r0 += a.a.a.b.b.a.f(2, this.name);
            }
            return r0 + (a.a.a.b.b.a.cH(3) + 1);
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
            h hVar = (h) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    hVar.id = aVar3.xmD.readString();
                    return 0;
                case 2:
                    hVar.name = aVar3.xmD.readString();
                    return 0;
                case 3:
                    hVar.oqb = aVar3.cib();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}