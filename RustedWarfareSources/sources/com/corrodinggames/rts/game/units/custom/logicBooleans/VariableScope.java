package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0618t;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0452k;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope.class */
public class VariableScope {
    public static final String nullOrMissingString = "";
    VariableName[] variableNames = emptyNames;
    VariableData[] variableData = emptyData;
    public static final VariableScope emptyVariableScope = new EmptyVariableScope();
    static final VariableName[] emptyNames = new VariableName[0];
    static final VariableData[] emptyData = new VariableData[0];
    public static final VariableDataNull variableDataNull = new VariableDataNull();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDefinition.class */
    public class VariableDefinition {
        public VariableName name;
        public LogicBoolean.ReturnType type;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$EmptyVariableScope.class */
    public class EmptyVariableScope extends VariableScope {
        EmptyVariableScope() {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope
        public void setDataRaw(VariableName variableName, VariableData variableData) {
            throw new RuntimeException("Not allowed");
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                return false;
            }
        }
        return true;
    }

    public String debugMemory(boolean z, boolean z2) {
        VariableData variableData;
        String str = nullOrMissingString;
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                String str2 = str + this.variableNames[i].f3310id + "=" + variableData.valueToStringDebug(null);
                if (z2) {
                    str2 = str2 + " (" + variableData.getReturnType().name() + ")";
                }
                if (z) {
                    str = str2 + "\n";
                } else {
                    str = str2 + "|";
                }
            }
        }
        return str;
    }

    public VariableData getDataObjectRaw(VariableName variableName) {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                return this.variableData[i];
            }
        }
        return variableDataNull;
    }

    public void setDataRaw(VariableName variableName, VariableData variableData) {
        if (variableData == null) {
            variableData = variableDataNull;
        }
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                this.variableData[i] = variableData;
                return;
            }
        }
        VariableName[] variableNameArr = new VariableName[this.variableData.length + 1];
        VariableData[] variableDataArr = new VariableData[this.variableData.length + 1];
        for (int i2 = 0; i2 < this.variableData.length; i2++) {
            variableDataArr[i2] = this.variableData[i2];
            variableNameArr[i2] = this.variableNames[i2];
        }
        variableDataArr[variableDataArr.length - 1] = variableData;
        variableNameArr[variableNameArr.length - 1] = variableName;
        this.variableData = variableDataArr;
        this.variableNames = variableNameArr;
    }

    public void clearAllData() {
        this.variableData = emptyData;
        this.variableNames = emptyNames;
    }

    public void setUnit(VariableDefinition variableDefinition, AbstractC0244am abstractC0244am) {
        if (variableDefinition.type != LogicBoolean.ReturnType.unit) {
        }
        setDataRaw(variableDefinition.name, new VariableDataUnit(abstractC0244am));
    }

    AbstractC0244am getUnit(VariableName variableName) {
        return getDataObjectRaw(variableName).readUnit(null);
    }

    LogicBoolean getAsLogicBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName);
    }

    public void setFromLogicBoolean(VariableName variableName, AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        VariableDataBoolean variableDataBoolean = null;
        if (logicBoolean != null) {
            LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
            if (returnType == LogicBoolean.ReturnType.bool) {
                variableDataBoolean = new VariableDataBoolean(logicBoolean.read(abstractC0623y));
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                variableDataBoolean = new VariableDataUnit(getSafeUnitReferenceForStorage(logicBoolean.readUnit(abstractC0623y)));
            } else if (returnType == LogicBoolean.ReturnType.number) {
                variableDataBoolean = new VariableDataNumber(logicBoolean.readNumber(abstractC0623y));
            } else if (returnType == LogicBoolean.ReturnType.string) {
                variableDataBoolean = new VariableDataString(logicBoolean.readString(abstractC0623y));
            }
        }
        setDataRaw(variableName, variableDataBoolean);
    }

    double getNumber(VariableName variableName) {
        return getDataObjectRaw(variableName).readNumber(null);
    }

    String getString(VariableName variableName) {
        return getDataObjectRaw(variableName).readString(null);
    }

    boolean getBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName).read(null);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableMapping.class */
    public class VariableMapping {
        C0453l meta;
        C1101m mapping = new C1101m();

        public VariableDefinition create(String str, LogicBoolean.ReturnType returnType) {
            VariableName variableName = VariableName.get(str);
            if (get(variableName) != null) {
                throw new RuntimeException("A variable already exists with the name: " + str);
            }
            VariableDefinition variableDefinition = new VariableDefinition();
            variableDefinition.name = variableName;
            variableDefinition.type = returnType;
            this.mapping.add(variableDefinition);
            return variableDefinition;
        }

        public VariableDefinition get(String str) {
            VariableName variableName = VariableName.get(str);
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public VariableDefinition get(VariableName variableName) {
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public void addDefineKey(C1072ab c1072ab, C0453l c0453l, String str, String str2, String str3) {
            String m649b = c1072ab.m649b(str2, str3, (String) null);
            if (m649b != null && !m649b.equals(VariableScope.nullOrMissingString)) {
                throw new RuntimeException("[" + str2 + "]" + str + ": Unexpected format");
            }
            defineVariablesRaw(str, str2, str3);
        }

        public void addDefineValue(C0453l c0453l, String str, String str2, String str3) {
            defineVariablesRaw(str2, str, str3);
        }

        public void defineVariables(C0453l c0453l, String str) {
            defineVariablesRaw("define", VariableScope.nullOrMissingString, str);
        }

        public void addSingleDefine(C0453l c0453l, String str, String str2, String str3, String str4) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            String trim = str.toLowerCase(Locale.ROOT).trim();
            LogicBoolean.ReturnType userType = VariableScope.getUserType(lowerCase);
            if (userType == null) {
                throw new RuntimeException("[" + str3 + "]" + str4 + ": Unknown type: " + lowerCase);
            }
            checkNameReserved(trim, str3, str4);
            VariableDefinition variableDefinition = get(trim);
            if (variableDefinition != null) {
                if (variableDefinition.type == userType) {
                    return;
                }
                throw new RuntimeException("[" + str3 + "]" + str4 + ": A memory variable already exists with the name: " + trim + " and is a different type: " + variableDefinition.type.name());
            }
            create(trim, userType);
        }

        public void defineVariablesRaw(String str, String str2, String str3) {
            for (String str4 : C0758f.m2117c(str3, ',')) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    int indexOf = trim.indexOf(" ");
                    if (indexOf == -1) {
                        throw new RuntimeException("[" + str2 + "]" + str + ": Expected 'type name' in each section, got: " + trim);
                    }
                    addSingleDefine(this.meta, trim.substring(indexOf, trim.length()).toLowerCase(Locale.ROOT).trim(), trim.substring(0, indexOf).toLowerCase(Locale.ROOT).trim(), str2, str);
                }
            }
        }

        public void checkNameReserved(String str, String str2, String str3) {
            boolean z = false;
            if (str.equals(VariableScope.nullOrMissingString)) {
                z = true;
            }
            if (str.equals("game") || str.equals("parent") || str.equals("self") || str.equals("this")) {
                z = true;
            }
            if (str.equals("boolean") || str.equals("bool") || str.equals("unit") || str.equals("void") || str.equals("null") || str.equals("number") || str.equals("float")) {
                z = true;
            }
            if (z) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable cannot be named: '" + str + "'");
            }
            if (str.contains(".") || str.contains("=") || str.contains("(") || str.contains(")") || str.contains("'") || str.contains("\"") || str.contains("?") || str.contains("|") || str.contains("\\") || str.contains("/") || str.contains("[") || str.contains("]") || str.contains(":") || str.contains(";")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name has reserved symbols: '" + str + "'");
            }
            if (str.contains(" ")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name cannot have a space: '" + str + "'");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableName.class */
    public class VariableName {
        private static HashMap existingVariableName = new HashMap();

        /* renamed from: id */
        private String f3310id;

        public static VariableName get(String str) {
            synchronized (existingVariableName) {
                VariableName variableName = (VariableName) existingVariableName.get(str);
                if (variableName != null) {
                    return variableName;
                }
                VariableName variableName2 = new VariableName();
                variableName2.f3310id = str;
                existingVariableName.put(str, variableName2);
                return variableName2;
            }
        }

        public String getId() {
            return this.f3310id;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableData.class */
    public abstract class VariableData extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public abstract LogicBoolean.ReturnType getReturnType();

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Data(" + valueToStringDebug(null) + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return 0.0f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            return VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNull.class */
    public class VariableDataNull extends VariableData {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "null";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataUnit.class */
    public class VariableDataUnit extends VariableData {
        AbstractC0244am unit;

        public VariableDataUnit(AbstractC0244am abstractC0244am) {
            this.unit = abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0623y abstractC0623y) {
            return this.unit;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataBoolean.class */
    public class VariableDataBoolean extends VariableData {
        boolean bool;

        public VariableDataBoolean(boolean z) {
            this.bool = z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return this.bool;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataString.class */
    public class VariableDataString extends VariableData {
        String text;

        public VariableDataString(String str) {
            this.text = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.string;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNumber.class */
    public class VariableDataNumber extends VariableData {
        double number;

        public VariableDataNumber(double d) {
            this.number = d;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return (float) this.number;
        }
    }

    public static void writeOut(StreamWriter streamWriter, VariableScope variableScope) {
        if (variableScope == null) {
            streamWriter.m1396c(-2);
        } else if (variableScope.variableData.length == 0) {
            streamWriter.m1396c(-1);
        } else {
            streamWriter.m1396c(0);
            streamWriter.mo1325a((short) variableScope.variableData.length);
            int length = variableScope.variableData.length;
            for (int i = 0; i < length; i++) {
                VariableData variableData = variableScope.variableData[i];
                streamWriter.m1395c(variableScope.variableNames[i].f3310id);
                streamWriter.mo1324a(false);
                if (0 == 0) {
                    writeOutDynamicData(streamWriter, variableData);
                }
            }
        }
    }

    public static VariableScope readIn(Reader reader) {
        byte m1299d = reader.m1299d();
        if (m1299d == -2 || m1299d == -1) {
            return null;
        }
        int m1280v = reader.m1280v();
        VariableScope variableScope = new VariableScope();
        for (int i = 0; i < m1280v; i++) {
            VariableName variableName = VariableName.get(reader.ReadUTF());
            if (!reader.ReadBool()) {
                variableScope.setDataRaw(variableName, readInDynamicData(reader));
            }
        }
        return variableScope;
    }

    public static void writeOutUnitOrPlaceholder(StreamWriter streamWriter, AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof C0618t) {
            streamWriter.m1396c(1);
            streamWriter.mo1330a(abstractC0244am.f6957el);
            streamWriter.mo1330a(abstractC0244am.f6958em);
            streamWriter.mo1330a(abstractC0244am.f6959en);
            streamWriter.mo1330a(abstractC0244am.f1618ce);
            streamWriter.m1417a(abstractC0244am.f1609bV);
            return;
        }
        streamWriter.m1396c(0);
        streamWriter.m1401b(abstractC0244am);
    }

    public static void writeOutDynamicData(StreamWriter streamWriter, VariableData variableData) {
        if (variableData == null) {
            streamWriter.m1406a((Enum) null);
            return;
        }
        LogicBoolean.ReturnType returnType = variableData.getReturnType();
        streamWriter.m1406a(returnType);
        if (variableData instanceof VariableDataUnit) {
            writeOutUnitOrPlaceholder(streamWriter, ((VariableDataUnit) variableData).unit);
        } else if (variableData instanceof VariableDataBoolean) {
            streamWriter.mo1324a(((VariableDataBoolean) variableData).bool);
        } else if (variableData instanceof VariableDataString) {
            streamWriter.m1399b(((VariableDataString) variableData).text);
        } else if (variableData instanceof VariableDataNumber) {
            streamWriter.m1421a(((VariableDataNumber) variableData).number);
        } else if (returnType != LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Unhandled type: " + returnType.name());
        }
    }

    public static AbstractC0244am readInUnitOrPlaceholder(Reader reader) {
        C0618t m1287o;
        byte m1299d = reader.m1299d();
        if (m1299d == 1) {
            float m1295g = reader.m1295g();
            float m1295g2 = reader.m1295g();
            float m1295g3 = reader.m1295g();
            float m1295g4 = reader.m1295g();
            m1287o = C0618t.m3059a(reader.m1283s());
            m1287o.f6957el = m1295g;
            m1287o.f6958em = m1295g2;
            m1287o.f6959en = m1295g3;
            m1287o.f1618ce = m1295g4;
        } else if (m1299d == 0) {
            m1287o = reader.m1287o();
        } else {
            throw new IOException("Unhandled unit type: " + ((int) m1299d));
        }
        return m1287o;
    }

    public static VariableData readInDynamicData(Reader reader) {
        LogicBoolean.ReturnType returnType = (LogicBoolean.ReturnType) reader.m1303b(LogicBoolean.ReturnType.class);
        if (returnType == null) {
            return null;
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new VariableDataUnit(readInUnitOrPlaceholder(reader));
        }
        if (returnType == LogicBoolean.ReturnType.bool) {
            return new VariableDataBoolean(reader.ReadBool());
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new VariableDataString(reader.ReadString());
        }
        if (returnType == LogicBoolean.ReturnType.number) {
            return new VariableDataNumber(reader.m1294h());
        }
        if (returnType == LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Undefined type: " + returnType.name());
        }
        throw new RuntimeException("Unhandled type: " + returnType.name());
    }

    public static LogicBoolean.ReturnType getUserType(String str) {
        LogicBoolean.ReturnType returnType = null;
        if (str.equals("boolean")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("bool")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("unit")) {
            returnType = LogicBoolean.ReturnType.unit;
        } else if (str.equals("number")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("float")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("text")) {
            returnType = LogicBoolean.ReturnType.string;
        } else if (str.equals("string")) {
            returnType = LogicBoolean.ReturnType.string;
        }
        return returnType;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$AbstractMemoryLogicBoolean.class */
    public abstract class AbstractMemoryLogicBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            if (getReturnType() == LogicBoolean.ReturnType.unit) {
                return UnitReference.unitContextChangingContext;
            }
            return super.createContext();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return UnitReference.UnitContextChangingBooleanByLogic.create(this, logicBoolean);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryReadLogicBoolean.class */
    public class KnownMemoryReadLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName name;
        LogicBoolean.ReturnType type;

        public KnownMemoryReadLogicBoolean(VariableDefinition variableDefinition) {
            this.name = variableDefinition.name;
            this.type = variableDefinition.type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1582bv == null) {
                return false;
            }
            return abstractC0623y.f1582bv.getBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1582bv == null) {
                return 0.0f;
            }
            return (float) abstractC0623y.f1582bv.getNumber(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1582bv == null ? VariableScope.nullOrMissingString : abstractC0623y.f1582bv.getString(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1582bv == null) {
                return null;
            }
            return abstractC0623y.f1582bv.getUnit(this.name);
        }

        public LogicBoolean readAsLogicBoolean(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1582bv == null) {
                return null;
            }
            return abstractC0623y.f1582bv.getAsLogicBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            LogicBoolean readAsLogicBoolean = readAsLogicBoolean(abstractC0623y);
            if (readAsLogicBoolean == null) {
                return "memory(" + this.name.f3310id + "=null)";
            }
            String str = VariableScope.nullOrMissingString;
            if (this.type != readAsLogicBoolean.getReturnType() && readAsLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + readAsLogicBoolean.getReturnType().name() + ")";
            }
            return "memory(" + this.name.f3310id + "=" + readAsLogicBoolean.getMatchFailReasonForPlayer(abstractC0623y) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadEventMemoryLogicBoolean.class */
    public class ReadEventMemoryLogicBoolean extends ReadUnitMemoryLogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.ReadUnitMemoryLogicBoolean
        public LogicBoolean getUnitMemory(AbstractC0623y abstractC0623y) {
            C0452k c0452k = LogicBoolean.activeEvent;
            VariableScope variableScope = null;
            if (c0452k != null) {
                variableScope = c0452k.f2902e;
            }
            if (variableScope == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = variableScope.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadUnitMemoryLogicBoolean.class */
    public class ReadUnitMemoryLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName _name;
        LogicBoolean.ReturnType _type;
        @LogicBoolean.Parameter(key = "default")
        public LogicBoolean defaultValue;

        @LogicBoolean.Parameter(required = true, positional = 0)
        public void name(String str) {
            this._name = VariableName.get(str.toLowerCase(Locale.ROOT).trim());
        }

        @LogicBoolean.Parameter(required = true)
        public void type(String str) {
            this._type = VariableScope.getUserType(str);
            if (this._type == null) {
                throw new RuntimeException("Unknown type: " + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.defaultValue != null && this.defaultValue.getReturnType() != this._type) {
                throw new BooleanParseException("defaultValue type:" + this.defaultValue.getReturnType() + " does not match requested type: " + this._type);
            }
            if (this.defaultValue == null) {
                this.defaultValue = VariableScope.variableDataNull;
            }
        }

        public LogicBoolean getUnitMemory(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1582bv == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = abstractC0623y.f1582bv.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).read(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).readNumber(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            LogicBoolean unitMemory = getUnitMemory(abstractC0623y);
            return LogicString.StringCast.castToString(unitMemory.getReturnType(), unitMemory, abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).readUnit(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this._type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            if (this._type == null || this._name == null) {
                return "<memory with type/name == null>";
            }
            LogicBoolean asLogicBoolean = abstractC0623y.f1582bv.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return "memory(" + this._name.f3310id + " as " + this._type.name() + ")";
            }
            String str = VariableScope.nullOrMissingString;
            if (this._type != asLogicBoolean.getReturnType() && asLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + asLogicBoolean.getReturnType().name() + ")";
            }
            return "memory(" + this._name.f3310id + " as " + this._type.name() + "=" + asLogicBoolean.getMatchFailReasonForPlayer(abstractC0623y) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryScopeLogicBoolean.class */
    public class KnownMemoryScopeLogicBoolean extends LogicBooleanLoader.LogicBooleanScopeOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            VariableDefinition variableDefinition = c0453l.f3205q.get(str2.toLowerCase(Locale.ROOT));
            if (variableDefinition == null) {
                throw new RuntimeException("Unknown variable:'" + str2 + "' in '" + str4 + "'");
            }
            return new KnownMemoryReadLogicBoolean(variableDefinition);
        }
    }

    public static MemoryWriter createGenericKeyValueWriter(String str, C0453l c0453l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0453l, null));
            return memoryWriter;
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public static MemoryWriter createMemoryWriter(String str, C0453l c0453l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0453l));
            return memoryWriter;
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriter.class */
    public class MemoryWriter extends CachedWriter {
        public void writeToMemory(VariableScope variableScope, AbstractC0623y abstractC0623y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((MemoryWriterFactory.MemoryWriterElement) ((CachedWriter.WriterElement) it.next())).writeToMemory(variableScope, abstractC0623y);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory.class */
    public class MemoryWriterFactory extends CachedWriter.WriterFactory {
        C0453l meta;
        VariableMapping target;

        public MemoryWriterFactory(C0453l c0453l, VariableMapping variableMapping) {
            this.meta = c0453l;
            this.target = variableMapping;
        }

        public MemoryWriterFactory(C0453l c0453l) {
            this.meta = c0453l;
            if (c0453l != null) {
                this.target = c0453l.f3205q;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory$MemoryWriterElement.class */
        public class MemoryWriterElement extends CachedWriter.WriterElement {
            public VariableName name;
            public LogicBoolean value;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
            public void writeToUnit(AbstractC0623y abstractC0623y) {
                if (abstractC0623y.f1582bv == null) {
                    abstractC0623y.f1582bv = new VariableScope();
                }
                abstractC0623y.f1582bv.setFromLogicBoolean(this.name, abstractC0623y, this.value);
            }

            public void writeToMemory(VariableScope variableScope, AbstractC0623y abstractC0623y) {
                variableScope.setFromLogicBoolean(this.name, abstractC0623y, this.value);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
        public CachedWriter.WriterElement createWriterElement(String str, String str2, String str3) {
            VariableName variableName;
            LogicBoolean.ReturnType returnType;
            if (!str2.equals("=")) {
                throw new C0412bm("Only '=' is supported here, got:" + str2);
            }
            try {
                LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.meta, str3, false);
                if (this.target != null) {
                    VariableDefinition variableDefinition = this.target.get(str);
                    if (variableDefinition == null) {
                        throw new C0412bm("Unknown variable: " + str + " (has it been defined.)");
                    }
                    variableName = variableDefinition.name;
                    returnType = variableDefinition.type;
                } else {
                    variableName = VariableName.get(str);
                    returnType = LogicBoolean.ReturnType.undefined;
                }
                MemoryWriterElement memoryWriterElement = new MemoryWriterElement();
                memoryWriterElement.name = variableName;
                memoryWriterElement.value = parseBooleanBlock;
                if (returnType != LogicBoolean.ReturnType.undefined && parseBooleanBlock.getReturnType() != returnType) {
                    if (LogicBoolean.isStaticNull(parseBooleanBlock)) {
                        boolean z = false;
                        if (returnType == LogicBoolean.ReturnType.string) {
                            z = true;
                        }
                        if (returnType == LogicBoolean.ReturnType.point) {
                            z = true;
                        }
                        if (returnType == LogicBoolean.ReturnType.unit) {
                            z = true;
                        }
                        if (!z) {
                            throw new C0412bm("Variable: " + str + " of type " + returnType + " cannot be set to null.");
                        }
                    } else {
                        throw new C0412bm("Variable: " + str + " expects " + returnType + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
                    }
                }
                return memoryWriterElement;
            } catch (RuntimeException e) {
                throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter.class */
    public class CachedWriter {
        C1101m writers = new C1101m();

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$Operator.class */
        public enum Operator {
            set,
            add,
            subtract
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterElement.class */
        public abstract class WriterElement {
            public abstract void writeToUnit(AbstractC0623y abstractC0623y);
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterFactory.class */
        public abstract class WriterFactory {
            public abstract WriterElement createWriterElement(String str, String str2, String str3);
        }

        public void writeToUnit(AbstractC0623y abstractC0623y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((WriterElement) it.next()).writeToUnit(abstractC0623y);
            }
        }

        public static CachedWriter create(String str, WriterFactory writerFactory) {
            CachedWriter cachedWriter = new CachedWriter();
            cachedWriter.addWriterElements(str, writerFactory);
            return cachedWriter;
        }

        public void addWriterElements(String str, WriterFactory writerFactory) {
            Iterator it = C0758f.m2156a(str, ",", false, false).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String[] m2090f = C0758f.m2090f(str2, "=");
                if (m2090f == null) {
                    throw new C0412bm("Unexpected format for: " + str2);
                }
                String trim = m2090f[0].toLowerCase(Locale.ROOT).trim();
                String str3 = m2090f[1];
                String str4 = "=";
                if (trim.endsWith("+") || trim.endsWith("-") || trim.endsWith("*") || trim.endsWith("/")) {
                    str4 = trim.substring(trim.length() - 1, trim.length()) + "=";
                    trim = trim.substring(0, trim.length() - 1).trim();
                }
                if (trim.contains(" ")) {
                    throw new C0412bm("Key cannot contain spaces for: " + str2);
                }
                this.writers.add(writerFactory.createWriterElement(trim, str4, str3));
            }
        }
    }

    public static AbstractC0244am getSafeUnitReferenceForStorage(AbstractC0244am abstractC0244am) {
        if (abstractC0244am == null) {
            return null;
        }
        if (abstractC0244am instanceof C0618t) {
            C0618t m3059a = C0618t.m3059a(abstractC0244am.f1609bV);
            m3059a.f6957el = abstractC0244am.f6957el;
            m3059a.f6958em = abstractC0244am.f6958em;
            m3059a.f6959en = abstractC0244am.f6959en;
            m3059a.f1618ce = abstractC0244am.f1618ce;
            return m3059a;
        }
        return abstractC0244am;
    }
}
