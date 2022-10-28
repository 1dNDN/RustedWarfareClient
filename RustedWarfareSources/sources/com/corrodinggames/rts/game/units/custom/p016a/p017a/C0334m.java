package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/m.class */
public class C0334m extends AbstractC0321a {

    /* renamed from: a */
    public C0424b f2002a;

    /* renamed from: b */
    public boolean f2003b;

    /* renamed from: c */
    public boolean f2004c;

    /* renamed from: e */
    public EnumC0200q f2006e;

    /* renamed from: f */
    public LogicBoolean f2007f;

    /* renamed from: g */
    public C0449h f2008g;

    /* renamed from: i */
    public C0424b f2010i;

    /* renamed from: j */
    public UnitReference f2011j;

    /* renamed from: l */
    public C0462t f2013l;

    /* renamed from: m */
    public C0462t f2014m;

    /* renamed from: n */
    public boolean f2015n;

    /* renamed from: o */
    public boolean f2016o;

    /* renamed from: p */
    public boolean f2017p;

    /* renamed from: q */
    public boolean f2018q;

    /* renamed from: s */
    public static final C1101m f2020s = new C1101m();

    /* renamed from: t */
    public static final C0335n f2021t = new C0335n();

    /* renamed from: d */
    public float f2005d = -1.0f;

    /* renamed from: h */
    public boolean f2009h = true;

    /* renamed from: k */
    public int f2012k = 1;

    /* renamed from: r */
    public boolean f2019r = false;

    /* renamed from: a */
    public static void m3973a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m663a(str, str2 + "takeResources_includeUnitsInTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "takeResources_includeParent", (Boolean) false).booleanValue();
        LogicBoolean m649b = c1072ab.m649b(c0453l, str, str2 + "takeResources_includeReference", null);
        float floatValue = c1072ab.m661a(str, str2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0f)).floatValue();
        C0424b m3726a = C0424b.m3726a(c0453l, c1072ab, str, str2 + "takeResources", true);
        boolean booleanValue3 = c1072ab.m663a(str, str2 + "takeResources_saveFirstUnitToCustomTarget1", (Boolean) false).booleanValue();
        boolean booleanValue4 = c1072ab.m663a(str, str2 + "takeResources_saveFirstUnitToCustomTarget2", (Boolean) false).booleanValue();
        if (!booleanValue && !booleanValue2 && floatValue < 0.0f) {
            if (m3726a != null && !m3726a.m3718b()) {
                throw new C0412bm("[" + str + "]takeResources requires an include (eg: takeResources_includeUnitsInTransport, takeResources_includeUnitsWithinRange)");
            }
            return;
        }
        C0334m c0334m = new C0334m();
        c0339d.f2101ab.add(c0334m);
        c0334m.f2003b = booleanValue;
        c0334m.f2005d = floatValue;
        c0334m.f2004c = booleanValue2;
        c0334m.f2007f = m649b;
        c0334m.f2002a = m3726a;
        c0334m.f2019r = c1072ab.m663a(str, str2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(c0334m.f2019r)).booleanValue();
        c0334m.f2006e = (EnumC0200q) c1072ab.m662a(str, "takeResources_includeUnitsWithinRange_team", EnumC0200q.own, EnumC0200q.class);
        c0334m.f2008g = c1072ab.m683a(c0453l, str, str2 + "takeResources_excludeUnitsWithoutTags", (C0449h) null);
        c0334m.f2011j = UnitReference.parseUnitReferenceFromConf(c0453l, c1072ab, str, str2 + "takeResources_excludeUnitsWithoutCustomTarget1EqualTo", null);
        if (c0334m.f2019r) {
            c0334m.f2009h = false;
        }
        c0334m.f2009h = c1072ab.m663a(str, str2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(c0334m.f2009h)).booleanValue();
        c0334m.f2012k = c1072ab.m645b(str, str2 + "takeResources_maxUnits", Integer.valueOf(c0334m.f2012k)).intValue();
        c0334m.f2013l = c1072ab.m680a(c0453l, str, str2 + "takeResources_triggerActionIfAnyCollected", (C0462t) null);
        c0334m.f2014m = c1072ab.m680a(c0453l, str, str2 + "takeResources_triggerActionIfNoneCollected", (C0462t) null);
        c0334m.f2015n = booleanValue3;
        c0334m.f2016o = booleanValue4;
        c0334m.f2017p = c1072ab.m663a(str, str2 + "takeResources_discardCollected", Boolean.valueOf(c0334m.f2017p)).booleanValue();
        c0334m.f2018q = c1072ab.m663a(str, str2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(c0334m.f2018q)).booleanValue();
        c0334m.f2010i = C0424b.m3726a(c0453l, c1072ab, str, str2 + "takeResources_excludeUnitsWithTheseResources", true);
        if (c0334m.f2010i != null && c0334m.f2010i.m3718b()) {
            c0334m.f2010i = null;
        }
        if (c0334m.f2019r) {
            if (c0334m.f2002a.m3703d()) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
            }
            if (c0334m.f2009h) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
            }
            if (c0334m.f2018q) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
            }
            if (c0334m.f2017p) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        f2020s.clear();
        if (this.f2003b) {
            Iterator it = c0451j.f2867B.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                if (abstractC0244am2 != null && !abstractC0244am2.f1607bT) {
                    f2020s.add(abstractC0244am2);
                }
            }
        }
        if (this.f2004c) {
            if (c0451j.f1652cM != null) {
                f2020s.add(c0451j.f1652cM);
            } else if (c0451j.f1651cL != null) {
                f2020s.add(c0451j.f1652cM);
            }
        }
        if (this.f2007f != null && (readUnit = this.f2007f.readUnit(c0451j)) != null && !readUnit.f1607bT) {
            f2020s.add(readUnit);
        }
        if (this.f2005d > 0.0f) {
            f2021t.f2023b = this.f2005d * this.f2005d;
            f2021t.f2022a = this.f2008g;
            f2021t.f2024c = true;
            f2021t.f2025d = this.f2006e;
            f2021t.f2026e = f2020s;
            AbstractC0916l.m1071A().f6175cc.m3099a(c0451j.f6958el, c0451j.f6959em, this.f2005d, c0451j, 0.0f, f2021t);
        }
        if (this.f2008g != null) {
            for (int size = f2020s.size() - 1; size >= 0; size--) {
                if (!C0448g.m3572a(this.f2008g, ((AbstractC0244am) f2020s.get(size)).mo3487dc())) {
                    f2020s.remove(size);
                }
            }
        }
        if (this.f2009h) {
            for (int size2 = f2020s.size() - 1; size2 >= 0; size2--) {
                if (!this.f2002a.mo3687b((AbstractC0244am) f2020s.get(size2))) {
                    f2020s.remove(size2);
                }
            }
        }
        if (this.f2010i != null) {
            for (int size3 = f2020s.size() - 1; size3 >= 0; size3--) {
                if (this.f2010i.mo3687b((AbstractC0244am) f2020s.get(size3))) {
                    f2020s.remove(size3);
                }
            }
        }
        if (this.f2011j != null) {
            AbstractC0244am abstractC0244am3 = this.f2011j.get((AbstractC0623y) c0451j);
            for (int size4 = f2020s.size() - 1; size4 >= 0; size4--) {
                if (((AbstractC0244am) f2020s.get(size4)).f1580bt != abstractC0244am3) {
                    f2020s.remove(size4);
                }
            }
        }
        boolean z = false;
        AbstractC0244am abstractC0244am4 = null;
        int i2 = 0;
        for (int i3 = 0; i3 < f2020s.size(); i3++) {
            AbstractC0244am abstractC0244am5 = (AbstractC0244am) f2020s.get(i3);
            if (abstractC0244am4 == null) {
                abstractC0244am4 = abstractC0244am5;
            }
            if (this.f2019r) {
                if (!this.f2002a.m3732a(abstractC0244am5, c0451j)) {
                    continue;
                }
            } else {
                if (!this.f2018q) {
                    this.f2002a.mo3693a(abstractC0244am5);
                }
                if (!this.f2017p) {
                    this.f2002a.m3696h(c0451j);
                }
            }
            z = true;
            i2++;
            if (i2 >= this.f2012k) {
                break;
            }
        }
        if (abstractC0244am4 != null) {
            if (this.f2015n) {
                c0451j.f1580bt = abstractC0244am4;
            }
            if (this.f2016o) {
                c0451j.f1581bu = abstractC0244am4;
            }
        }
        if (z) {
            if (this.f2013l != null) {
                this.f2013l.m3366a(c0451j, pointF, abstractC0244am, i + 1);
            }
        } else if (this.f2014m != null) {
            this.f2014m.m3366a(c0451j, pointF, abstractC0244am, i + 1);
        }
        f2020s.clear();
        return true;
    }
}
