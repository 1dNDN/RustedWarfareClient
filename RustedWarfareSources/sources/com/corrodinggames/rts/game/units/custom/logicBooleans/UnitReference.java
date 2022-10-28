package com.corrodinggames.rts.game.units.custom.logicBooleans;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0618t;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0452k;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1084am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference.class */
public abstract class UnitReference extends LogicBoolean implements Cloneable {
    public static final SelfUnitReference selfUnitReference = new SelfUnitReference();
    static HashMap referenceTypes = new HashMap();
    static final LogicBooleanLoader.LogicBooleanContext unitContextChangingContext;
    static final LogicBooleanLoader.LogicBooleanContext placeholderUnitContext;

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingContext.class */
    public class UnitContextChangingContext extends LogicBooleanLoader.LogicBooleanContextWithDefault {
    }

    public abstract AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y);

    static {
        addUnitReferenceType(new AttachmentUnitReference(), "attachment");
        addUnitReferenceType(new ParentUnitReference(), "parent");
        addUnitReferenceType(new TransportingUnitReference(), "transporting");
        addUnitReferenceType(new ActiveWaypointTargetReference(), "activeWaypointTarget");
        addUnitReferenceType(new AttackingReference(), "attacking");
        addUnitReferenceType(new Memory1UnitReference(), "customTarget1");
        addUnitReferenceType(new Memory2UnitReference(), "customTarget2");
        addUnitReferenceType(new LastDamagedByUnitReference(), "lastDamagedBy");
        addUnitReferenceType(new NearestUnitReference(), "nearestUnit");
        addUnitReferenceType(new FirstUnitReference(), "globalSearchForFirstUnit");
        addUnitReferenceType(new NullUnitReference(), "nullUnit");
        addUnitReferenceType(new NullUnitReference(), "null");
        addUnitReferenceType(new GetOffsetAbsolute(), "getOffsetAbsolute");
        addUnitReferenceType(new GetOffsetRelative(), "getOffsetRelative");
        addUnitReferenceType(new GetAsMarker(), "getAsMarker");
        addUnitReferenceType(new ThisActionTargetReference(), "thisActionTarget");
        addUnitReferenceType(new EventSourceReference(), "eventSource");
        unitContextChangingContext = new UnitContextChangingContext();
        placeholderUnitContext = new UnitContextChangingContext();
    }

    public final AbstractC0244am get(AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            return null;
        }
        return getSingleRaw((AbstractC0623y) abstractC0244am);
    }

    public final AbstractC0244am get(AbstractC0623y abstractC0623y) {
        return getSingleRaw(abstractC0623y);
    }

    public final AbstractC0244am getRealUnitOnly(AbstractC0623y abstractC0623y) {
        AbstractC0244am singleRaw = getSingleRaw(abstractC0623y);
        if (singleRaw instanceof C0618t) {
            return null;
        }
        return singleRaw;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public void forMeta(C0453l c0453l) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            referenceTypes.put(lowerCase, unitReference);
            if (!lowerCase.replace("self.", "subject.").equals(lowerCase)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(C0453l c0453l, C1072ab c1072ab, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(c0453l, c1072ab.m644b(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(C0453l c0453l, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(c0453l, trim, str2, str3, null, true));
        }
        C0463u m3431a = c0453l.m3431a(trim, str3, str2);
        if (m3431a != null) {
            m3431a.f3353f = true;
        }
        return new UnitReferenceOrUnitType(m3431a);
    }

    public static UnitReference parseUnitReferenceFromConf(C0453l c0453l, C1072ab c1072ab, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(c0453l, c1072ab.m644b(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(C0453l c0453l, String str, String str2, String str3, UnitReference unitReference, boolean z) {
        if (str == null) {
            return unitReference;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReference;
        }
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("unitref ")) {
            lowerCase = lowerCase.substring("unitref ".length()).trim();
        }
        if (lowerCase.equals("self")) {
            return selfUnitReference;
        }
        if (lowerCase.indexOf("(") == -1) {
            lowerCase.length();
        } else if (lowerCase.indexOf(")") != lowerCase.length() - 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseSingleUnitReferenceBlock = parseSingleUnitReferenceBlock(c0453l, lowerCase);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Unknown function:'" + lowerCase + "'");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(C0453l c0453l, String str) {
        String lowerCase = str.split("\\(")[0].trim().toLowerCase(Locale.ROOT);
        UnitReference unitReference = (UnitReference) referenceTypes.get(lowerCase);
        if (unitReference == null) {
            return null;
        }
        String trim = str.substring(lowerCase.length()).trim();
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = "()";
        }
        if (!trim.startsWith("(") || !trim.endsWith(")")) {
            throw new RuntimeException("Failed to parse unit reference arguments for:'" + str + "'");
        }
        UnitReference with = unitReference.with(c0453l, trim.substring(1, trim.length() - 1).trim(), lowerCase);
        if (with instanceof NullUnitReference) {
        }
        return with;
    }

    public static UnitReference parseSingleUnitReferenceBlock(C0453l c0453l, String str) {
        int m2017s = C0758f.m2017s(str);
        if (m2017s != 0) {
            if (m2017s > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (m2017s < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String[] m2108a = C0758f.m2108a(breakOuterLayerBrackets, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : m2108a) {
            if (str2.equalsIgnoreCase("self")) {
                z = true;
            } else {
                UnitReference parseSingleUnitReferenceElement = parseSingleUnitReferenceElement(c0453l, str2);
                if (parseSingleUnitReferenceElement == null) {
                    throw new RuntimeException("Unknown unit reference:'" + str2 + "'");
                }
                arrayList.add(parseSingleUnitReferenceElement);
            }
        }
        if (arrayList.size() == 0) {
            if (z) {
                return selfUnitReference;
            }
            throw new RuntimeException("Unexpected unit reference:'" + breakOuterLayerBrackets + "'");
        } else if (arrayList.size() == 1) {
            return (UnitReference) arrayList.get(0);
        } else {
            return new ChainedUnitReference((UnitReference[]) arrayList.toArray(new UnitReference[0]));
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(String str) {
        return with((C0453l) null, str, (String) null);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(C0453l c0453l, String str, String str2) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(c0453l);
            unitReference.setArgumentsRaw(str, c0453l, str2);
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(AbstractC0623y abstractC0623y) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public AbstractC0244am readUnit(AbstractC0623y abstractC0623y) {
        return getSingleRaw(abstractC0623y);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
        return getClassDebugName() + "(" + AbstractC0244am.m4132A(getSingleRaw(abstractC0623y)) + ")";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ChainedUnitReference.class */
    public class ChainedUnitReference extends UnitReference {
        UnitReference[] chain;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        ChainedUnitReference(UnitReference[] unitReferenceArr) {
            this.chain = unitReferenceArr;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0623y abstractC0623y2 = abstractC0623y;
            LogicBoolean.outerUnitParameterContext = abstractC0623y;
            for (UnitReference unitReference : unitReferenceArr) {
                abstractC0623y2 = unitReference.get((AbstractC0244am) abstractC0623y2);
                if (abstractC0623y2 == null) {
                    return null;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return abstractC0623y2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0623y abstractC0623y2 = abstractC0623y;
            if (abstractC0623y2 instanceof AbstractC0623y) {
                LogicBoolean.outerUnitParameterContext = abstractC0623y2;
            }
            String str = VariableScope.nullOrMissingString + "[";
            int i = 0;
            while (true) {
                if (i >= unitReferenceArr.length) {
                    break;
                }
                str = str + unitReferenceArr[i].getMatchFailReasonForPlayer(abstractC0623y);
                if (i != unitReferenceArr.length - 1) {
                    str = str + ",";
                }
                abstractC0623y2 = unitReferenceArr[i].get((AbstractC0244am) abstractC0623y2);
                if (abstractC0623y2 != null) {
                    i++;
                } else {
                    str = str + "<null>";
                    break;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return str + "]";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttachmentUnitReference.class */
    public class AttachmentUnitReference extends UnitReference {
        C0453l meta;
        C0448g _withTag;
        short attachmentId = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("AttachmentUnitReference requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0399m m3402i = this.meta.m3402i(str);
            if (m3402i == null) {
                throw new C1084am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m3402i.m3796a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            if (!(abstractC0623y instanceof C0451j)) {
                return null;
            }
            C0451j c0451j = (C0451j) abstractC0623y;
            if (c0451j.f2868C == null) {
                return null;
            }
            Object[] m534a = c0451j.f2868C.m534a();
            for (int i = c0451j.f2868C.f6894a - 1; i >= 0; i--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m534a[i];
                if (abstractC0623y2 != null && (this.attachmentId == -1 || i == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0448g.m3573a(this._withTag, abstractC0623y2.mo3487dc())) {
                        }
                    }
                    return abstractC0623y2;
                }
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "attachment";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$TransportingUnitReference.class */
    public class TransportingUnitReference extends UnitReference {
        C0453l meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("TransportingUnitReference requires metadata");
            }
            this.meta = c0453l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am abstractC0244am = null;
            C1101m mo2778bz = abstractC0623y.mo2778bz();
            if (mo2778bz != null) {
                if (this.slot == -1) {
                    if (mo2778bz.size() > 0) {
                        abstractC0244am = (AbstractC0244am) mo2778bz.get(0);
                    }
                } else if (this.slot >= 0 && this.slot < mo2778bz.size()) {
                    abstractC0244am = (AbstractC0244am) mo2778bz.get(this.slot);
                }
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "transporting";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m4077dp();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "parent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory1UnitReference.class */
    public class Memory1UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am abstractC0244am = abstractC0623y.f1580bt;
            if (abstractC0244am == null || abstractC0244am.f1607bT) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget1";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory2UnitReference.class */
    public class Memory2UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am abstractC0244am = abstractC0623y.f1581bu;
            if (abstractC0244am == null || abstractC0244am.f1607bT) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget2";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LastDamagedByUnitReference.class */
    public class LastDamagedByUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am abstractC0244am = abstractC0623y.f1579bs;
            if (abstractC0244am == null || abstractC0244am.f1607bT) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "lastDamagedBy";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference.class */
    public class NearestUnitReference extends UnitReference {
        public C0448g _withTag;
        public C0448g _withoutTag;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        public static final HandleCallbackNearest handleCallbackNearest = new HandleCallbackNearest();
        public float withinRange = 500.0f;
        public float withinRangeSq = this.withinRange * this.withinRange;
        public EnumC0200q relation = EnumC0200q.any;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NearestUnit";
        }

        @LogicBoolean.Parameter
        public void withinRange(float f) {
            if (f > 1500.0f) {
                throw new C1084am("NearestUnit distance cannot be over 1500 is: " + f);
            }
            this.withinRange = f;
            this.withinRangeSq = f * f;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @LogicBoolean.Parameter
        public void withoutTag(String str) {
            this._withoutTag = C0448g.m3565c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1072ab.m671a(str, EnumC0200q.any, EnumC0200q.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            handleCallbackNearest.nearest = null;
            handleCallbackNearest.withinRangeSq = this.withinRangeSq;
            handleCallbackNearest.tag = this._withTag;
            handleCallbackNearest.withoutTag = this._withoutTag;
            handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
            handleCallbackNearest.relation = this.relation;
            AbstractC0916l.m1071A().f6175cc.m3099a(abstractC0623y.f6958el, abstractC0623y.f6959em, this.withinRange, abstractC0623y, 0.0f, handleCallbackNearest);
            return handleCallbackNearest.nearest;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference$HandleCallbackNearest.class */
        public class HandleCallbackNearest extends AbstractC0544i {
            public C0448g tag;
            public C0448g withoutTag;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public EnumC0200q relation = EnumC0200q.any;
            public AbstractC0244am nearest;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -3;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                if ((this.relation != EnumC0200q.any && !abstractC0623y.f1609bV.m4312a(this.relation, abstractC0244am.f1609bV)) || abstractC0623y == abstractC0244am) {
                    return;
                }
                C0449h mo3487dc = abstractC0244am.mo3487dc();
                if (this.tag == null || (mo3487dc != null && C0448g.m3573a(this.tag, mo3487dc))) {
                    float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
                    if (m2147a < this.withinRangeSq) {
                        if (abstractC0244am.f1624ck < 1.0f && !this.incompleteBuildings) {
                            return;
                        }
                        if (this.withoutTag != null && mo3487dc != null && C0448g.m3573a(this.withoutTag, mo3487dc)) {
                            return;
                        }
                        this.withinRangeSq = m2147a;
                        this.nearest = abstractC0244am;
                    }
                }
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$FirstUnitReference.class */
    public class FirstUnitReference extends UnitReference {
        public C0448g _withTag;
        public EnumC0200q relation = EnumC0200q.any;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "globalSearchForFirstUnit";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1072ab.m671a(str, (Enum) null, EnumC0200q.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if ((this.relation == EnumC0200q.any || abstractC0623y.f1609bV.m4312a(this.relation, abstractC0244am.f1609bV)) && abstractC0623y != abstractC0244am) {
                    C0449h mo3487dc = abstractC0244am.mo3487dc();
                    if ((this._withTag == null || (mo3487dc != null && C0448g.m3573a(this._withTag, mo3487dc))) && (abstractC0244am.f1624ck >= 1.0f || this.incompleteBuildings)) {
                        return abstractC0244am;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$PlaceholderUnitReference.class */
    public abstract class PlaceholderUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return UnitReference.placeholderUnitContext;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetAbsolute.class */
    public class GetOffsetAbsolute extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3304x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3305y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetAbsolute";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.f1609bV.f1325s;
            AbstractC0623y parameterContext = getParameterContext(abstractC0623y);
            abstractC0623y2.f1618ce = abstractC0623y.f1618ce;
            abstractC0623y2.f6958el = abstractC0623y.f6958el + this.f3304x.readNumber(parameterContext);
            abstractC0623y2.f6959em = abstractC0623y.f6959em + this.f3305y.readNumber(parameterContext);
            abstractC0623y2.f6960en = abstractC0623y.f6960en + this.height.readNumber(parameterContext);
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelative.class */
    public class GetOffsetRelative extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3306x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3307y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dirOffset = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelative";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.f1609bV.f1325s;
            AbstractC0623y parameterContext = getParameterContext(abstractC0623y);
            float readNumber = abstractC0623y.f1618ce + this.dirOffset.readNumber(parameterContext);
            float m2030i = C0758f.m2030i(readNumber);
            float m2035h = C0758f.m2035h(readNumber);
            float readNumber2 = this.f3306x.readNumber(parameterContext);
            float readNumber3 = this.f3307y.readNumber(parameterContext);
            float f = (m2030i * readNumber3) - (m2035h * readNumber2);
            abstractC0623y2.f1618ce = readNumber;
            abstractC0623y2.f6958el = abstractC0623y.f6958el + f;
            abstractC0623y2.f6959em = abstractC0623y.f6959em + (m2035h * readNumber3) + (m2030i * readNumber2);
            abstractC0623y2.f6960en = abstractC0623y.f6960en + this.height.readNumber(parameterContext);
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelativeStatic.class */
    public class GetOffsetRelativeStatic extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(positional = 0)

        /* renamed from: x */
        public float f3308x;
        @LogicBoolean.Parameter(positional = 1)

        /* renamed from: y */
        public float f3309y;
        @LogicBoolean.Parameter
        public float height;
        @LogicBoolean.Parameter
        public float dirOffset;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelativeStatic";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.f1609bV.f1325s;
            float f = abstractC0623y.f1618ce + this.dirOffset;
            float m2030i = C0758f.m2030i(f);
            float m2035h = C0758f.m2035h(f);
            float f2 = this.f3308x;
            float f3 = this.f3309y;
            float f4 = (m2030i * f3) - (m2035h * f2);
            abstractC0623y2.f1618ce = f;
            abstractC0623y2.f6958el = abstractC0623y.f6958el + f4;
            abstractC0623y2.f6959em = abstractC0623y.f6959em + (m2035h * f3) + (m2030i * f2);
            abstractC0623y2.f6960en = abstractC0623y.f6960en + this.height;
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetAsMarker.class */
    public class GetAsMarker extends PlaceholderUnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getAsMarker";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.f1609bV.f1325s;
            abstractC0623y2.f1618ce = abstractC0623y.f1618ce;
            abstractC0623y2.f6958el = abstractC0623y.f6958el;
            abstractC0623y2.f6959em = abstractC0623y.f6959em;
            abstractC0623y2.f6960en = abstractC0623y.f6960en;
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ThisActionTargetReference.class */
    public class ThisActionTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0244am abstractC0244am = C0451j.f2880dM;
            if (abstractC0244am != null) {
                return abstractC0244am;
            }
            PointF pointF = C0451j.f2879dL;
            if (pointF != null) {
                AbstractC0623y abstractC0623y2 = AbstractC0197n.f1314i.f1325s;
                abstractC0623y2.f1618ce = 0.0f;
                abstractC0623y2.f6958el = pointF.f227a;
                abstractC0623y2.f6959em = pointF.f228b;
                abstractC0623y2.f6960en = 0.0f;
                return abstractC0623y2;
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ThisActionTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$EventSourceReference.class */
    public class EventSourceReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            C0452k c0452k = LogicBoolean.activeEvent;
            if (c0452k == null) {
                return null;
            }
            return c0452k.f2900c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "EventSource";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ActiveWaypointTargetReference.class */
    public class ActiveWaypointTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            C0305au m2834ar = abstractC0623y.m2834ar();
            if (m2834ar == null) {
                return null;
            }
            return m2834ar.m4010l();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ActiveWaypointTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttackingReference.class */
    public class AttackingReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f3898Q;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NullUnitReference.class */
    public class NullUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NULL";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "self";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        AbstractC0244am target;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0453l c0453l, String str, String str2) {
            return super.with(c0453l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        public LockedUnitReference(AbstractC0244am abstractC0244am) {
            this.target = abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            return this.target;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "unit";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        C0463u unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(C0463u c0463u) {
            this.unitType = c0463u;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public AbstractC0244am getUnitOrSharedUnit(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitType != null) {
                return AbstractC0244am.m4100c(this.unitType.mo3362c());
            }
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2;
            }
            return null;
        }

        public AbstractC0244am getUnitReferenceOrNull(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2;
            }
            return null;
        }

        public InterfaceC0303as getTypeOrNull(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitType != null) {
                return this.unitType.mo3362c();
            }
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2.mo1708r();
            }
            return null;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBooleanLoader.LogicBooleanContext createContext() {
        return unitContextChangingContext;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        return UnitContextChangingBooleanByLogic.create(this, logicBoolean);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingBooleanByLogic.class */
    public class UnitContextChangingBooleanByLogic extends LogicBoolean {
        LogicBoolean targetBoolean;
        LogicBoolean dynamicContext;
        LogicBoolean[] dynamicContextChain;

        public static UnitContextChangingBooleanByLogic create(LogicBoolean logicBoolean, LogicBoolean logicBoolean2) {
            ArrayList arrayList = null;
            if (logicBoolean2 instanceof UnitContextChangingBooleanByLogic) {
                UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic = (UnitContextChangingBooleanByLogic) logicBoolean2;
                arrayList = new ArrayList();
                arrayList.add(logicBoolean);
                if (unitContextChangingBooleanByLogic.dynamicContextChain != null) {
                    for (LogicBoolean logicBoolean3 : unitContextChangingBooleanByLogic.dynamicContextChain) {
                        arrayList.add(logicBoolean3);
                    }
                } else {
                    arrayList.add(unitContextChangingBooleanByLogic.dynamicContext);
                }
                logicBoolean2 = unitContextChangingBooleanByLogic.targetBoolean;
            }
            UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic2 = new UnitContextChangingBooleanByLogic();
            if (arrayList != null) {
                unitContextChangingBooleanByLogic2.dynamicContextChain = (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]);
            } else {
                unitContextChangingBooleanByLogic2.dynamicContext = logicBoolean;
            }
            unitContextChangingBooleanByLogic2.targetBoolean = logicBoolean2;
            if (logicBoolean == null) {
                throw new RuntimeException("dynamicContext==null");
            }
            if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
                throw new RuntimeException("dynamicContext type!=unit. Got:" + logicBoolean.getReturnType());
            }
            return unitContextChangingBooleanByLogic2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return super.setChild(logicBoolean);
        }

        public AbstractC0623y getUnitContext(AbstractC0623y abstractC0623y) {
            if (this.dynamicContextChain != null) {
                AbstractC0623y abstractC0623y2 = abstractC0623y;
                for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                    AbstractC0244am readUnit = logicBoolean.readUnit(abstractC0623y2);
                    if (!(readUnit instanceof AbstractC0623y)) {
                        return null;
                    }
                    abstractC0623y2 = (AbstractC0623y) readUnit;
                }
                return abstractC0623y2;
            }
            AbstractC0244am readUnit2 = this.dynamicContext.readUnit(abstractC0623y);
            if (!(readUnit2 instanceof AbstractC0623y)) {
                return null;
            }
            return (AbstractC0623y) readUnit2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    boolean read = this.targetBoolean.read(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return read;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return false;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    float readNumber = this.targetBoolean.readNumber(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readNumber;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return 0.0f;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    String readString = this.targetBoolean.readString(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readString;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return "<unit not found>";
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    AbstractC0244am readUnit = this.targetBoolean.readUnit(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readUnit;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return null;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public UnitContextChangingBooleanByLogic with(C0453l c0453l, String str, String str2) {
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.targetBoolean.getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            AbstractC0244am readUnit;
            LogicBoolean[] logicBooleanArr;
            if (this.dynamicContextChain != null) {
                String str = VariableScope.nullOrMissingString;
                AbstractC0623y abstractC0623y2 = abstractC0623y;
                LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
                try {
                    for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                        String str2 = str + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y2);
                        AbstractC0244am readUnit2 = logicBoolean.readUnit(abstractC0623y2);
                        if (readUnit2 instanceof AbstractC0623y) {
                            str = str2 + ".";
                            abstractC0623y2 = (AbstractC0623y) readUnit2;
                        } else {
                            return str2 + "<unit not found>";
                        }
                    }
                    return str + this.targetBoolean.getMatchFailReasonForPlayer(abstractC0623y2);
                } finally {
                }
            }
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                if (!(this.dynamicContext.readUnit(abstractC0623y) instanceof AbstractC0623y)) {
                    return "<unit not found>";
                }
                return this.dynamicContext.getMatchFailReasonForPlayer(abstractC0623y) + "." + this.targetBoolean.getMatchFailReasonForPlayer((AbstractC0623y) readUnit);
            } finally {
            }
        }
    }
}
