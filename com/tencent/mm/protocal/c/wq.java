package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class wq extends avp {
    public String tDl;
    public int tDm;
    public String tDn;
    public int tDo;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.tZe == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.tZe != null) {
                aVar.eQ(1, this.tZe.aUk());
                this.tZe.a(aVar);
            }
            if (this.tDl != null) {
                aVar.e(2, this.tDl);
            }
            aVar.eO(3, this.tDm);
            if (this.tDn != null) {
                aVar.e(4, this.tDn);
            }
            aVar.eO(5, this.tDo);
            return 0;
        } else if (i == 1) {
            if (this.tZe != null) {
                r0 = a.a.a.a.eN(1, this.tZe.aUk()) + 0;
            } else {
                r0 = 0;
            }
            if (this.tDl != null) {
                r0 += a.a.a.b.b.a.f(2, this.tDl);
            }
            r0 += a.a.a.a.eL(3, this.tDm);
            if (this.tDn != null) {
                r0 += a.a.a.b.b.a.f(4, this.tDn);
            }
            return r0 + a.a.a.a.eL(5, this.tDo);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = avp.a(aVar2); r0 > 0; r0 = avp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            if (this.tZe != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            wq wqVar = (wq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList En = aVar3.En(intValue);
                    int size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) En.get(intValue);
                        com.tencent.mm.bd.a enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, avp.a(aVar4))) {
                        }
                        wqVar.tZe = enVar;
                    }
                    return 0;
                case 2:
                    wqVar.tDl = aVar3.xmD.readString();
                    return 0;
                case 3:
                    wqVar.tDm = aVar3.xmD.mL();
                    return 0;
                case 4:
                    wqVar.tDn = aVar3.xmD.readString();
                    return 0;
                case 5:
                    wqVar.tDo = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}