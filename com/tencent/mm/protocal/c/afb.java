package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class afb extends avp {
    public String errorMsg;
    public int fFG;
    public avw tKn;
    public int tKo;
    public String tKp;
    public int tKq;

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
            if (this.tKn != null) {
                aVar.eQ(2, this.tKn.aUk());
                this.tKn.a(aVar);
            }
            aVar.eO(3, this.tKo);
            if (this.tKp != null) {
                aVar.e(4, this.tKp);
            }
            aVar.eO(5, this.tKq);
            aVar.eO(6, this.fFG);
            if (this.errorMsg == null) {
                return 0;
            }
            aVar.e(7, this.errorMsg);
            return 0;
        } else if (i == 1) {
            if (this.tZe != null) {
                r0 = a.a.a.a.eN(1, this.tZe.aUk()) + 0;
            } else {
                r0 = 0;
            }
            if (this.tKn != null) {
                r0 += a.a.a.a.eN(2, this.tKn.aUk());
            }
            r0 += a.a.a.a.eL(3, this.tKo);
            if (this.tKp != null) {
                r0 += a.a.a.b.b.a.f(4, this.tKp);
            }
            r0 = (r0 + a.a.a.a.eL(5, this.tKq)) + a.a.a.a.eL(6, this.fFG);
            if (this.errorMsg != null) {
                r0 += a.a.a.b.b.a.f(7, this.errorMsg);
            }
            return r0;
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
            afb com_tencent_mm_protocal_c_afb = (afb) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList En;
            int size;
            byte[] bArr;
            com.tencent.mm.bd.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) En.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, avp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_afb.tZe = enVar;
                    }
                    return 0;
                case 2:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) En.get(intValue);
                        enVar = new avw();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, avp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_afb.tKn = enVar;
                    }
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_afb.tKo = aVar3.xmD.mL();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_afb.tKp = aVar3.xmD.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_afb.tKq = aVar3.xmD.mL();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_afb.fFG = aVar3.xmD.mL();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_afb.errorMsg = aVar3.xmD.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
