package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ah extends avh {
    public String fVl;
    public String fVm;
    public int fVn;
    public String keR;
    public String tcO;
    public String tcP;
    public int tcQ;
    public int tcR;
    public bde tcS;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.fVl == null) {
                throw new b("Not all required fields were included: card_id");
            }
            if (this.tYN != null) {
                aVar.eQ(1, this.tYN.aUk());
                this.tYN.a(aVar);
            }
            if (this.keR != null) {
                aVar.e(2, this.keR);
            }
            aVar.eO(3, this.fVn);
            if (this.fVl != null) {
                aVar.e(4, this.fVl);
            }
            if (this.fVm != null) {
                aVar.e(5, this.fVm);
            }
            if (this.tcO != null) {
                aVar.e(6, this.tcO);
            }
            if (this.tcP != null) {
                aVar.e(7, this.tcP);
            }
            aVar.eO(8, this.tcQ);
            aVar.eO(9, this.tcR);
            if (this.tcS == null) {
                return 0;
            }
            aVar.eQ(10, this.tcS.aUk());
            this.tcS.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.tYN != null) {
                r0 = a.a.a.a.eN(1, this.tYN.aUk()) + 0;
            } else {
                r0 = 0;
            }
            if (this.keR != null) {
                r0 += a.a.a.b.b.a.f(2, this.keR);
            }
            r0 += a.a.a.a.eL(3, this.fVn);
            if (this.fVl != null) {
                r0 += a.a.a.b.b.a.f(4, this.fVl);
            }
            if (this.fVm != null) {
                r0 += a.a.a.b.b.a.f(5, this.fVm);
            }
            if (this.tcO != null) {
                r0 += a.a.a.b.b.a.f(6, this.tcO);
            }
            if (this.tcP != null) {
                r0 += a.a.a.b.b.a.f(7, this.tcP);
            }
            r0 = (r0 + a.a.a.a.eL(8, this.tcQ)) + a.a.a.a.eL(9, this.tcR);
            if (this.tcS != null) {
                r0 += a.a.a.a.eN(10, this.tcS.aUk());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = avh.a(aVar2); r0 > 0; r0 = avh.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            if (this.fVl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: card_id");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ah ahVar = (ah) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList En;
            int size;
            byte[] bArr;
            com.tencent.mm.bd.a emVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) En.get(intValue);
                        emVar = new em();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = emVar.a(aVar4, emVar, avh.a(aVar4))) {
                        }
                        ahVar.tYN = emVar;
                    }
                    return 0;
                case 2:
                    ahVar.keR = aVar3.xmD.readString();
                    return 0;
                case 3:
                    ahVar.fVn = aVar3.xmD.mL();
                    return 0;
                case 4:
                    ahVar.fVl = aVar3.xmD.readString();
                    return 0;
                case 5:
                    ahVar.fVm = aVar3.xmD.readString();
                    return 0;
                case 6:
                    ahVar.tcO = aVar3.xmD.readString();
                    return 0;
                case 7:
                    ahVar.tcP = aVar3.xmD.readString();
                    return 0;
                case 8:
                    ahVar.tcQ = aVar3.xmD.mL();
                    return 0;
                case 9:
                    ahVar.tcR = aVar3.xmD.mL();
                    return 0;
                case 10:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) En.get(intValue);
                        emVar = new bde();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = emVar.a(aVar4, emVar, avh.a(aVar4))) {
                        }
                        ahVar.tcS = emVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}