package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class bpu extends avp {
    public String fFW;
    public int tWA;
    public int unV;
    public String url;
    public int version;

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
            if (this.url != null) {
                aVar.e(2, this.url);
            }
            if (this.fFW != null) {
                aVar.e(3, this.fFW);
            }
            aVar.eO(4, this.version);
            aVar.eO(5, this.unV);
            aVar.eO(6, this.tWA);
            return 0;
        } else if (i == 1) {
            if (this.tZe != null) {
                r0 = a.a.a.a.eN(1, this.tZe.aUk()) + 0;
            } else {
                r0 = 0;
            }
            if (this.url != null) {
                r0 += a.a.a.b.b.a.f(2, this.url);
            }
            if (this.fFW != null) {
                r0 += a.a.a.b.b.a.f(3, this.fFW);
            }
            return ((r0 + a.a.a.a.eL(4, this.version)) + a.a.a.a.eL(5, this.unV)) + a.a.a.a.eL(6, this.tWA);
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
            bpu com_tencent_mm_protocal_c_bpu = (bpu) objArr[1];
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
                        com_tencent_mm_protocal_c_bpu.tZe = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bpu.url = aVar3.xmD.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bpu.fFW = aVar3.xmD.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bpu.version = aVar3.xmD.mL();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bpu.unV = aVar3.xmD.mL();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bpu.tWA = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
