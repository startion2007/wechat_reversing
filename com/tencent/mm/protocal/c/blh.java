package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class blh extends avh {
    public int tWi;
    public int tvL;
    public long tvM;
    public int ula;
    public int ulb;
    public LinkedList<blk> ulc = new LinkedList();
    public int uld;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.tYN != null) {
                aVar.eQ(1, this.tYN.aUk());
                this.tYN.a(aVar);
            }
            aVar.eO(2, this.tvL);
            aVar.O(3, this.tvM);
            aVar.eO(4, this.tWi);
            aVar.eO(5, this.ula);
            aVar.eO(6, this.ulb);
            aVar.d(7, 8, this.ulc);
            aVar.eO(8, this.uld);
            return 0;
        } else if (i == 1) {
            if (this.tYN != null) {
                r0 = a.a.a.a.eN(1, this.tYN.aUk()) + 0;
            } else {
                r0 = 0;
            }
            return ((((((r0 + a.a.a.a.eL(2, this.tvL)) + a.a.a.a.N(3, this.tvM)) + a.a.a.a.eL(4, this.tWi)) + a.a.a.a.eL(5, this.ula)) + a.a.a.a.eL(6, this.ulb)) + a.a.a.a.c(7, 8, this.ulc)) + a.a.a.a.eL(8, this.uld);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.ulc.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = avh.a(aVar2); r0 > 0; r0 = avh.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cid();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            blh com_tencent_mm_protocal_c_blh = (blh) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList En;
            int size;
            com.tencent.mm.bd.a emVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) En.get(intValue);
                        emVar = new em();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = emVar.a(aVar4, emVar, avh.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_blh.tYN = emVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_blh.tvL = aVar3.xmD.mL();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_blh.tvM = aVar3.xmD.mM();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_blh.tWi = aVar3.xmD.mL();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_blh.ula = aVar3.xmD.mL();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_blh.ulb = aVar3.xmD.mL();
                    return 0;
                case 7:
                    En = aVar3.En(intValue);
                    size = En.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) En.get(intValue);
                        emVar = new blk();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = emVar.a(aVar4, emVar, avh.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_blh.ulc.add(emVar);
                    }
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_blh.uld = aVar3.xmD.mL();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
