package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.m.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/g.class */
public class C1050g {

    /* renamed from: a */
    public ArrayList f6704a = new ArrayList();

    /* renamed from: b */
    public boolean f6705b;

    /* renamed from: c */
    public boolean f6706c;

    /* renamed from: d */
    public float f6707d;

    /* renamed from: e */
    public int f6708e;

    /* renamed from: f */
    public String f6709f;

    /* renamed from: g */
    public boolean f6710g;

    /* renamed from: h */
    public boolean f6711h;

    /* renamed from: i */
    final /* synthetic */ C1049f f6712i;

    public C1050g(C1049f c1049f) {
        this.f6712i = c1049f;
    }

    /* renamed from: a */
    public boolean m746a(String str) {
        String group;
        String str2;
        String trim = str.trim();
        LoggerMaybe.LogDebug2("Got:" + trim);
        if (trim.length() == 0) {
            return false;
        }
        LoggerMaybe.LogDebug2("..");
        String str3 = null;
        String str4 = null;
        String str5 = null;
        if (trim.startsWith("+")) {
            Matcher matcher = Pattern.compile("\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?").matcher(trim);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                str4 = matcher.group(2);
                group = matcher.group(4);
                str5 = matcher.group(5);
                LoggerMaybe.LogDebug2("Got o:" + group + " d:" + str3 + " dn:" + str4 + " units:" + str5);
            } else {
                throw new C0179f("Unknown wave line in map: " + trim);
            }
        } else if (trim.startsWith("!")) {
            Matcher matcher2 = Pattern.compile("\\!(.*)").matcher(trim);
            if (matcher2.matches()) {
                group = matcher2.group(1);
            } else {
                throw new C0179f("Unknown wave line in map: " + trim);
            }
        } else {
            throw new C0179f("Unknown wave format: " + trim);
        }
        if (str3 != null) {
            String[] split = str3.trim().split(":");
            String str6 = "0";
            if (split.length == 1) {
                str2 = split[0];
            } else if (split.length == 2) {
                str6 = split[0];
                str2 = split[1];
            } else {
                throw new C0179f("Unknown time format in wave: " + trim);
            }
            try {
                this.f6707d = Integer.parseInt(str2) + (Integer.parseInt(str6) * 60);
            } catch (NumberFormatException e) {
                throw new C0179f("Failed to parse time on: " + trim, e);
            }
        }
        if (str4 != null) {
            this.f6709f = str4.trim();
            this.f6711h = true;
        }
        if (group != null) {
            for (String str7 : group.split(",")) {
                String[] split2 = str7.split(":");
                String trim2 = split2[0].trim();
                if (split2.length > 1) {
                    split2[1].trim();
                }
                if ("lockSpawn".equalsIgnoreCase(trim2)) {
                    this.f6705b = true;
                } else if ("unlockSpawn".equalsIgnoreCase(trim2)) {
                    this.f6706c = true;
                } else if ("noTimer".equalsIgnoreCase(trim2)) {
                    this.f6710g = true;
                } else if (!"paused".equalsIgnoreCase(trim2) && !"win".equalsIgnoreCase(trim2) && !VariableScope.nullOrMissingString.equalsIgnoreCase(trim2)) {
                    throw new C0179f("Unknown wave option '" + trim2 + "' in: " + trim);
                }
            }
        }
        if (str5 != null) {
            String trim3 = str5.trim();
            if (trim3.startsWith("-")) {
                trim3 = trim3.substring(1);
            }
            for (String str8 : trim3.split(",")) {
                String trim4 = str8.trim();
                if (!trim4.contains(" ")) {
                    throw new C0179f("Unknown wave format '" + trim4 + "' in: " + trim);
                }
                int indexOf = trim4.indexOf(" ");
                String trim5 = trim4.substring(0, indexOf).trim();
                String trim6 = trim4.substring(indexOf + 1).trim();
                try {
                    int parseInt = Integer.parseInt(trim5);
                    InterfaceC0303as m4372a = AbstractC0249ar.m4372a(trim6);
                    if (m4372a == null) {
                        throw new C0179f("Could not find unit '" + trim6 + "' in: " + trim);
                    }
                    C1052i c1052i = new C1052i(this.f6712i);
                    c1052i.m743b(m4372a, parseInt);
                    this.f6704a.add(c1052i);
                } catch (NumberFormatException e2) {
                    throw new C0179f("Expected starting number in wave format '" + trim4 + "' in: " + trim);
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m747a() {
        LoggerMaybe.LogDebug2("Activating wave");
        if (!this.f6712i.f6701R) {
            this.f6712i.m756e();
        }
        PointF pointF = this.f6712i.f6699P;
        Iterator it = this.f6704a.iterator();
        while (it.hasNext()) {
            ((C1052i) it.next()).m745a(pointF.f227a, pointF.f228b);
        }
        if (!this.f6712i.f6700Q) {
            this.f6712i.m756e();
        }
        if (this.f6705b) {
            this.f6712i.f6700Q = true;
        }
        if (this.f6706c) {
            this.f6712i.f6700Q = false;
        }
    }
}
