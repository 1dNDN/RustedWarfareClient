package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1084am;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction.class */
public abstract class LogicNumberFunction extends LogicBoolean.LogicNumberOnly {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$LogicNumberFunctionRawArgs.class */
    abstract class LogicNumberFunctionRawArgs extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean value;

        public abstract float doFunction(float f);

        LogicNumberFunctionRawArgs() {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m2079b = C0758f.m2079b(str, ",", false);
            validateNumberOfArguments(m2079b.size());
            this.value = LogicBooleanLoader.parseNumberBlock(c0453l, (String) m2079b.get(0));
            if (this.value == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.value instanceof LogicBoolean.StaticValueBoolean) {
                return new LogicBoolean.StaticValueBoolean(doFunction(((LogicBoolean.StaticValueBoolean) this.value).getStaticValue()));
            }
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.value == null) {
                throw new BooleanParseException("Expected parameters missing");
            }
            if (z) {
                throw new BooleanParseException("Expected function:" + str + " to return a boolean, but it returns a number");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return getName() + "(" + this.value.getMatchFailReasonForPlayer(abstractC0623y) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionInt.class */
    public class FunctionInt extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return super.getMatchFailReasonForPlayer(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            super.setArgumentsRaw(str, c0453l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Int";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return doFunction(this.value.readNumber(abstractC0623y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return (int) f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSquareRoot.class */
    public class FunctionSquareRoot extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return super.getMatchFailReasonForPlayer(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            super.setArgumentsRaw(str, c0453l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "SquareRoot";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return doFunction(this.value.readNumber(abstractC0623y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0758f.m2150a(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionCos.class */
    public class FunctionCos extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return super.getMatchFailReasonForPlayer(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            super.setArgumentsRaw(str, c0453l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "cos";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return doFunction(this.value.readNumber(abstractC0623y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0758f.m2030i(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSin.class */
    public class FunctionSin extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return super.getMatchFailReasonForPlayer(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            super.setArgumentsRaw(str, c0453l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "sin";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return doFunction(this.value.readNumber(abstractC0623y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0758f.m2035h(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceSquared.class */
    public class FunctionDistanceSquared extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3295x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3296y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3297x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3298y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceSquared";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.f3295x1.readNumber(abstractC0623y);
            float readNumber2 = this.f3296y1.readNumber(abstractC0623y);
            float readNumber3 = this.f3297x2.readNumber(abstractC0623y);
            float readNumber4 = this.f3298y2.readNumber(abstractC0623y);
            return ((readNumber - readNumber3) * (readNumber - readNumber3)) + ((readNumber2 - readNumber4) * (readNumber2 - readNumber4));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceBetweenSquared.class */
    public class FunctionDistanceBetweenSquared extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceBetweenSquared";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0623y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f6958el;
            float f2 = readUnit.f6959em;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0623y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0758f.m2147a(f, f2, readUnit2.f6958el, readUnit2.f6959em);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistance.class */
    public class FunctionDistance extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3291x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3292y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3293x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3294y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Distance";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return C0758f.m2095b(this.f3291x1.readNumber(abstractC0623y), this.f3292y1.readNumber(abstractC0623y), this.f3293x2.readNumber(abstractC0623y), this.f3294y2.readNumber(abstractC0623y));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDirection.class */
    public class FunctionDirection extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3287x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3288y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3289x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3290y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Direction";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return C0758f.m2061d(this.f3287x1.readNumber(abstractC0623y), this.f3288y1.readNumber(abstractC0623y), this.f3289x2.readNumber(abstractC0623y), this.f3290y2.readNumber(abstractC0623y));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceBetween.class */
    public class FunctionDistanceBetween extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceBetween";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0623y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f6958el;
            float f2 = readUnit.f6959em;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0623y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0758f.m2095b(f, f2, readUnit2.f6958el, readUnit2.f6959em);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDirectionBetween.class */
    public class FunctionDirectionBetween extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DirectionBetween";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0623y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f6958el;
            float f2 = readUnit.f6959em;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0623y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0758f.m2061d(f, f2, readUnit2.f6958el, readUnit2.f6959em);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$CreateMarker.class */
    public class CreateMarker extends UnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x */
        public LogicBoolean f3285x;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y */
        public LogicBoolean f3286y;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = false)
        public LogicBoolean height;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean teamId;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dir;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.height == null) {
                this.height = LogicBoolean.StaticValueBoolean.static_0;
            }
            if (this.dir == null) {
                this.dir = LogicBoolean.StaticValueBoolean.static_0;
            }
            if (this.teamId == null) {
                this.teamId = LogicBoolean.StaticValueBoolean.static_neg1;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0623y abstractC0623y) {
            float readNumber = this.f3285x.readNumber(abstractC0623y);
            float readNumber2 = this.f3286y.readNumber(abstractC0623y);
            float readNumber3 = this.height.readNumber(abstractC0623y);
            float readNumber4 = this.dir.readNumber(abstractC0623y);
            AbstractC0197n m4239k = AbstractC0197n.m4239k((int) this.teamId.readNumber(abstractC0623y));
            if (m4239k == null) {
                m4239k = AbstractC0197n.f1314i;
            }
            AbstractC0623y abstractC0623y2 = m4239k.f1325s;
            abstractC0623y2.f1618ce = readNumber4;
            abstractC0623y2.f6958el = readNumber;
            abstractC0623y2.f6959em = readNumber2;
            abstractC0623y2.f6960en = readNumber3;
            return abstractC0623y2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "createMarker";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionRnd.class */
    public class FunctionRnd extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean min;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean max;
        int randomIndex;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("FunctionRnd requires metadata");
            }
            c0453l.f2946R++;
            this.randomIndex = c0453l.f2946R;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Rnd";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.min.readNumber(abstractC0623y);
            float readNumber2 = this.max.readNumber(abstractC0623y);
            int i = 0;
            if (abstractC0623y != null) {
                i = abstractC0623y.f1588bB;
            }
            return C0758f.m2094b(readNumber, readNumber2, this.randomIndex + i);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMax.class */
    public class FunctionMax extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3300a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: b */
        public LogicBoolean f3301b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Max";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.f3300a.readNumber(abstractC0623y);
            float readNumber2 = this.f3301b.readNumber(abstractC0623y);
            if (readNumber > readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMin.class */
    public class FunctionMin extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3302a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: b */
        public LogicBoolean f3303b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Min";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.f3302a.readNumber(abstractC0623y);
            float readNumber2 = this.f3303b.readNumber(abstractC0623y);
            if (readNumber < readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionLength.class */
    public class FunctionLength extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.string, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3299a;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Length";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            String readString = this.f3299a.readString(abstractC0623y);
            if (readString == null) {
                return 0.0f;
            }
            return readString.length();
        }
    }
}
