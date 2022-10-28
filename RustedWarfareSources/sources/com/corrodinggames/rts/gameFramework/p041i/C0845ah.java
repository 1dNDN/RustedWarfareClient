package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ah.class */
public class C0845ah implements Cloneable {

    /* renamed from: l */
    public boolean f5652l;

    /* renamed from: q */
    public int f5653q;

    /* renamed from: a */
    public EnumC0846ai f5654a = EnumC0846ai.f5669a;

    /* renamed from: b */
    public String f5655b = "[z;p10]Crossing Large (10p).tmx";

    /* renamed from: c */
    public int f5656c = 0;

    /* renamed from: d */
    public int f5657d = 2;

    /* renamed from: e */
    public boolean f5658e = true;

    /* renamed from: f */
    public int f5659f = 1;

    /* renamed from: g */
    public int f5660g = 1;

    /* renamed from: h */
    public float f5661h = 1.0f;

    /* renamed from: i */
    public boolean f5662i = false;

    /* renamed from: j */
    public boolean f5663j = false;

    /* renamed from: k */
    public boolean f5664k = false;

    /* renamed from: m */
    public boolean f5665m = false;

    /* renamed from: n */
    public boolean f5666n = false;

    /* renamed from: o */
    public boolean f5667o = true;

    /* renamed from: p */
    public boolean f5668p = false;

    /* renamed from: a */
    public void m1449a() {
        this.f5654a = EnumC0846ai.f5669a;
        this.f5655b = "[z;p10]Crossing Large (10p).tmx";
    }

    /* renamed from: b */
    public String m1446b() {
        return ((((((((((VariableScope.nullOrMissingString + "startingCredits: " + this.f5656c + "\n") + "fogMode: " + this.f5657d + "\n") + "revealedMap: " + this.f5658e + "\n") + "aiDifficulty: " + this.f5659f + "\n") + "startingUnits: " + this.f5660g + "\n") + "incomeMultiplier: " + this.f5661h + "\n") + "noNukes: " + this.f5662i + "\n") + "sharedControl: " + this.f5652l + "\n") + "allowSpectators: " + this.f5667o + "\n") + "lockedRoom: " + this.f5668p + "\n") + "randomSeed: " + this.f5653q + "\n";
    }

    /* renamed from: c */
    public C0845ah clone() {
        try {
            return (C0845ah) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1448a(StreamWriter streamWriter) {
        streamWriter.m1401c(4);
        streamWriter.WriteInteger(this.f5657d);
        streamWriter.WriteInteger(this.f5656c);
        streamWriter.mo1329a(this.f5658e);
        streamWriter.WriteInteger(this.f5659f);
        streamWriter.WriteInteger(this.f5660g);
        streamWriter.mo1335a(this.f5661h);
        streamWriter.mo1329a(this.f5662i);
        streamWriter.mo1329a(this.f5663j);
        streamWriter.mo1329a(this.f5652l);
        streamWriter.mo1329a(this.f5665m);
        streamWriter.mo1329a(this.f5666n);
        streamWriter.mo1329a(this.f5667o);
        streamWriter.mo1329a(this.f5668p);
        streamWriter.WriteInteger(this.f5653q);
    }

    /* renamed from: a */
    public void m1447a(Reader reader) {
        byte m1304d = reader.m1304d();
        this.f5657d = reader.ReadInt();
        this.f5656c = reader.ReadInt();
        this.f5658e = reader.ReadBool();
        this.f5659f = reader.ReadInt();
        this.f5660g = reader.ReadInt();
        this.f5661h = reader.m1300g();
        this.f5662i = reader.ReadBool();
        this.f5663j = reader.ReadBool();
        this.f5652l = reader.ReadBool();
        if (m1304d >= 1) {
            this.f5665m = reader.ReadBool();
        }
        if (m1304d >= 2) {
            this.f5666n = reader.ReadBool();
        }
        if (m1304d >= 3) {
            this.f5667o = reader.ReadBool();
            this.f5668p = reader.ReadBool();
        }
        if (m1304d >= 4) {
            this.f5653q = reader.ReadInt();
        }
    }
}
