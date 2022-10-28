package com.corrodinggames.rts.java.audio.p050a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class C1130a {

    /* renamed from: a */
    protected InputStream f7003a;

    /* renamed from: b */
    protected File f7004b;

    /* renamed from: c */
    protected String f7005c;

    public C1130a(String str) {
        this.f7004b = new File(str);
        this.f7005c = this.f7004b.getName();
    }

    public C1130a(InputStream inputStream, String str) {
        this.f7003a = inputStream;
        this.f7005c = str;
        if (this.f7003a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    /* renamed from: a */
    public InputStream m382a() {
        if (this.f7003a != null) {
            return this.f7003a;
        }
        try {
            return new FileInputStream(this.f7004b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String m381b() {
        String str = this.f7005c;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? VariableScope.nullOrMissingString : str.substring(lastIndexOf + 1);
    }
}
