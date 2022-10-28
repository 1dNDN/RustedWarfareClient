package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/l.class */
public class C0167l extends AbstractC0163h {

    /* renamed from: a */
    float f739a;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f687F.size());
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            streamWriter.m1419a((AbstractC0623y) it.next());
        }
        streamWriter.m1401c(1);
        streamWriter.WriteInteger(this.f688G.size());
        Iterator it2 = this.f688G.iterator();
        while (it2.hasNext()) {
            streamWriter.m1419a((AbstractC0623y) it2.next());
        }
        streamWriter.mo1335a(this.f739a);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m5377a(Reader reader) {
        m5430q();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0623y m1291p = reader.m1291p();
            if (m1291p != null) {
                m5440a(m1291p);
            }
        }
        if (reader.m1304d() >= 1) {
            this.f688G.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i2 = 0; i2 < ReadInt2; i2++) {
                AbstractC0623y m1291p2 = reader.m1291p();
                if (m1291p2 != null) {
                    this.f688G.add(m1291p2);
                }
            }
            this.f739a = reader.m1300g();
        }
        super.m5364a(reader);
    }

    public C0167l(C0136a c0136a) {
        super(c0136a);
        this.f739a = 0.0f;
    }

    /* renamed from: c */
    public void m5376c(float f) {
        m5433n();
        if (!m5434m()) {
            this.f739a += f;
        }
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (m5361c((AbstractC0244am) abstractC0623y) < 3600.0f && abstractC0623y.f1651cL == null) {
                if (abstractC0623y.f3947aA == this) {
                    abstractC0623y.f3947aA = null;
                }
                it.remove();
            }
        }
        if (this.f687F.size() == 0 || this.f739a > 5000.0f) {
            m5431p();
        }
    }

    /* renamed from: c */
    public void m5375c(AbstractC0623y abstractC0623y) {
        m5440a(abstractC0623y);
        this.f688G.add(abstractC0623y);
    }
}
