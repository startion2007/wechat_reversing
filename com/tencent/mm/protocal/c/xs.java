package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class xs extends avp {
    public int jNd;
    public LinkedList<ph> jNe = new LinkedList();
    public int tEh;
    public String tEi;
    public int tEj;

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
            aVar.eO(2, this.jNd);
            aVar.d(3, 8, this.jNe);
            aVar.eO(4, this.tEh);
            if (this.tEi != null) {
                aVar.e(5, this.tEi);
            }
            aVar.eO(6, this.tEj);
            return 0;
        } else if (i == 1) {
            if (this.tZe != null) {
                r0 = a.a.a.a.eN(1, this.tZe.aUk()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((r0 + a.a.a.a.eL(2, this.jNd)) + a.a.a.a.c(3, 8, this.jNe)) + a.a.a.a.eL(4, this.tEh);
            if (this.tEi != null) {
                r0 += a.a.a.b.b.a.f(5, this.tEi);
            }
            return r0 + a.a.a.a.eL(6, this.tEj);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.jNe.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
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
            xs xsVar = (xs) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList En;
            int size;
            com.tencent.mm.bd.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) En.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, avp.a(aVar4))) {
                        }
                        xsVar.tZe = enVar;
                    }
                    return 0;
                case 2:
                    xsVar.jNd = aVar3.xmD.mL();
                    return 0;
                case 3:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) En.get(intValue);
                        enVar = new ph();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, avp.a(aVar4))) {
                        }
                        xsVar.jNe.add(enVar);
                    }
                    return 0;
                case 4:
                    xsVar.tEh = aVar3.xmD.mL();
                    return 0;
                case 5:
                    xsVar.tEi = aVar3.xmD.readString();
                    return 0;
                case 6:
                    xsVar.tEj = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
