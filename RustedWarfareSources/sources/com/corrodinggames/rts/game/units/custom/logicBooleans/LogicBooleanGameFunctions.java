package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0416a;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1084am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions.class */
public class LogicBooleanGameFunctions {
    static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        LogicBoolean.addBooleanType(logicBoolean, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadTypes() {
        addBooleanType(new HeightBoolean().with("underwater=true"), "self.underwater", "self.isUnderwater");
        addBooleanType(new HeightBoolean().with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
        addBooleanType(new HeightValueBoolean(), "self.height", "self.z");
        addBooleanType(new HeightBoolean().with("flying=true"), "self.flying", "self.isFlying");
        addBooleanType(new MovingBoolean(), "self.isMoving");
        addBooleanType(new HasActiveWaypoint(), "self.hasActiveWaypoint");
        addBooleanType(new SpeedValueBoolean(), "self.speed");
        addBooleanType(new SpeedBoolean().with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
        addBooleanType(new InMapBoolean(), "self.isInMap");
        addBooleanType(new TouchWaterBoolean(), "self.inwater", "self.isInWater");
        addBooleanType(new OverWaterBoolean(), "self.overwater", "self.isOverwater");
        addBooleanType(new OverLiquidBoolean(), "self.isOverLiquid");
        addBooleanType(new OverCliftBoolean(), "self.isOverClift", "self.isOverCliff");
        addBooleanType(new OverPassableTileBoolean(), "self.isOverPassableTile");
        addBooleanType(new OverPassableTileBoolean().with("type='LAND'").createLocked(), "self.isOverOpenLand");
        addBooleanType(new TagsBoolean(), "self.tags", "self.hasTags");
        addBooleanType(new TeamTagBoolean(), "self.globalTeamTags", "self.hasGlobalTeamTags");
        addBooleanType(new HasFlagDynamicBoolean(), "self.hasFlag");
        addBooleanType(new EnergyBoolean(), "self.energy");
        addBooleanType(new EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
        addBooleanType(new EnergyBoolean().with("full=true"), "self.isEnergyFull");
        addBooleanType(new EnergyBoolean().with("empty=true"), "self.isEnergyEmpty");
        addBooleanType(new TransportingCountBoolean(), "self.transportingCount");
        addBooleanType(new TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
        addBooleanType(new isTransportUnloading(), "self.isTransportUnloading");
        addBooleanType(new PriceCreditsBoolean(), "self.priceCredits");
        addBooleanType(new HpBoolean(), "self.hp");
        addBooleanType(new MaxHpBoolean(), "self.maxHp");
        addBooleanType(new MaxShieldBoolean(), "self.maxShield");
        addBooleanType(new MaxEnergyBoolean(), "self.maxEnergy");
        addBooleanType(new UnitIdBoolean(), "self.id");
        addBooleanType(new TeamIdBoolean(), "self.teamId");
        addBooleanType(new TeamDefeatedTechBoolean(), "self.teamDefeatedTech");
        addBooleanType(new TeamWipedOutBoolean(), "self.teamWipedOut");
        addBooleanType(new TeamVictoryBoolean(), "self.teamVictory");
        addBooleanType(new isEnergyRechargingBoolean(), "self.isEnergyRecharging");
        addBooleanType(new PositionXBoolean(), "self.x");
        addBooleanType(new PositionYBoolean(), "self.y");
        addBooleanType(new RotationBoolean(), "self.dir");
        addBooleanType(new MaxMoveSpeedBoolean(), "self.maxMoveSpeed");
        addBooleanType(new BuiltAmountBoolean(), "self.builtAmount");
        addBooleanType(new CompletedBoolean(), "self.completed");
        addBooleanType(new ShieldBoolean(), "self.shield");
        addBooleanType(new AmmoBoolean(), "self.ammo");
        addBooleanType(new AmmoBoolean().with("empty=true"), "self.isAmmoEmpty");
        addBooleanType(new AmmoIncludingQueuedBoolean(), "self.ammoIncludingQueued");
        addBooleanType(new ResourceCountBoolean(), "self.resource");
        addBooleanType(new QueueSize(), "self.queueSize");
        addBooleanType(new NumberOfConnectionsBoolean(), "self.numberOfConnections");
        addBooleanType(new NumberOfAttachedUnitsBoolean(), "self.numberOfAttachedUnits");
        addBooleanType(new HasParent(), "self.hasParent");
        addBooleanType(new HasResourcesBoolean(), "self.hasResources");
        addBooleanType(new IsResourceLargerThan(), "self.isResourceLargerThan");
        addBooleanType(new KillsBoolean(), "self.kills");
        addBooleanType(new TimeAliveBoolean(), "self.timeAlive");
        addBooleanType(new LastConvertedBoolean(), "self.lastConverted");
        addBooleanType(new CustomTimerBoolean(), "self.customTimer");
        addBooleanType(new HasTakenDamage(), "self.hasTakenDamage");
        addBooleanType(new IsAttackingBoolean(), "self.isAttacking");
        addBooleanType(new IsReversingBoolean(), "self.isReversing");
        addBooleanType(new IsOnTeam().with("team=-1").createLocked(), "self.isOnNeutralTeam");
        addBooleanType(new IsControlledByAI(), "self.isControlledByAI");
        addBooleanType(new NumberOfUnitsInTeam(), "numberOfUnitsInTeam", "self.numberOfUnitsInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=0, lessThan=-1"), "hasUnitInTeam", "self.hasUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=-1, lessThan=1"), "noUnitInTeam", "self.noUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("neutralTeam=true"), "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("aggressiveTeam=true"), "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("allTeams=true"), "numberOfUnitsInAllTeams", "self.numberOfUnitsInAllTeams");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=false"), "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=true"), "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam");
        addBooleanType(new GameModeBoolean().with("nukesEnabled=true").createLocked(), "game.nukesEnabled");
        addBooleanType(new GameMapWidthBoolean(), "game.mapWidth");
        addBooleanType(new GameMapHeightBoolean(), "game.mapHeight");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameModeBoolean.class */
    public class GameModeBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @LogicBoolean.Parameter
        public boolean nukesEnabled;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            AbstractC0916l m1071A = AbstractC0916l.m1071A();
            if (this.nukesEnabled && m1071A.m1058N() && m1071A.f6170bX.f5570aO.f5660i) {
                z = false;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "GameMode(" + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled") + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapWidthBoolean.class */
    public class GameMapWidthBoolean extends LogicNumberFunction {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "game.mapWidth";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return AbstractC0916l.m1071A().f6158bL.m4471i();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapHeightBoolean.class */
    public class GameMapHeightBoolean extends LogicNumberFunction {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "game.mapHeight";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            return AbstractC0916l.m1071A().f6158bL.m4470j();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsGameFrameBoolean.class */
    public class IsGameFrameBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public int mod;
        @LogicBoolean.Parameter
        public int equalTo;
        @LogicBoolean.Parameter
        public boolean offset;

        @LogicBoolean.Parameter
        public void mod(int i) {
            this.mod = i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z;
            AbstractC0916l m1071A = AbstractC0916l.m1071A();
            if (this.mod >= 0) {
                if (this.offset) {
                    z = (((long) m1071A.f6144bx) + abstractC0623y.f6951ee) % ((long) this.mod) == ((long) this.equalTo);
                } else {
                    z = m1071A.f6144bx % this.mod == this.equalTo;
                }
            } else if (this.offset) {
                z = ((long) m1071A.f6144bx) + abstractC0623y.f6951ee == ((long) this.equalTo);
            } else {
                z = m1071A.f6144bx == this.equalTo;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsGameFrame(mod=" + this.mod + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightBoolean.class */
    public class HeightBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean underwater;
        @LogicBoolean.Parameter
        public boolean ground;
        @LogicBoolean.Parameter
        public boolean flying;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = VariableScope.nullOrMissingString;
            if (this.underwater) {
                str = str + "underwater";
            }
            if (this.ground) {
                str = str + "ground";
            }
            if (this.flying) {
                str = str + "flying";
            }
            if (str.equals(VariableScope.nullOrMissingString)) {
                str = str + "height";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.underwater && abstractC0623y.f6960en < -2.0f) {
                z = true;
            }
            if (this.ground && abstractC0623y.f6960en > -2.0f && abstractC0623y.f6960en < 5.0f) {
                z = true;
            }
            if (this.flying && abstractC0623y.f6960en > 5.0f) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedValueBoolean.class */
    public class SpeedValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Speed";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo2795bi()) {
                return C0758f.m2095b(0.0f, 0.0f, abstractC0623y.f1614ca, abstractC0623y.f1615cb);
            }
            float f = abstractC0623y.f1617cd;
            return f < 0.0f ? -f : f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedBoolean.class */
    public class SpeedBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean atTopSpeed;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            float mo2713z = abstractC0623y.mo2713z() - 0.1f;
            if (abstractC0623y.mo2795bi()) {
                float m2147a = C0758f.m2147a(0.0f, 0.0f, abstractC0623y.f1614ca, abstractC0623y.f1615cb);
                if (m2147a != 0.0f && m2147a > mo2713z * mo2713z) {
                    z = true;
                }
            } else if (abstractC0623y.f1617cd != 0.0f && abstractC0623y.f1617cd > mo2713z) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Speed";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MovingBoolean.class */
    public class MovingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1648cI) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Moving";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasActiveWaypoint.class */
    public class HasActiveWaypoint extends LogicBoolean {
        EnumC0306av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (EnumC0306av) C1072ab.m671a(str, (Enum) null, EnumC0306av.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            C0305au m2834ar = abstractC0623y.m2834ar();
            if (m2834ar != null) {
                if (this.type == null) {
                    z = true;
                } else {
                    z = m2834ar.m4023d() == this.type;
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasActiveWaypoint(type=" + this.type + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$InMapBoolean.class */
    public class InMapBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (C1117y.m478a(abstractC0623y.f6958el, abstractC0623y.f6959em)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "InMap";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TouchWaterBoolean.class */
    public class TouchWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m4095cG()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "TouchWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverWaterBoolean.class */
    public class OverWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m4093cI()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverLiquidBoolean.class */
    public class OverLiquidBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m4092cJ()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "overLiquid";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverCliftBoolean.class */
    public class OverCliftBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m4094cH()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverClift";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverPassableTileBoolean.class */
    public class OverPassableTileBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        EnumC0246ao movementType = EnumC0246ao.LAND;

        @LogicBoolean.Parameter
        public void type(String str) {
            this.movementType = EnumC0246ao.m4068a(str, "isOverPassableTile()");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            AbstractC0916l.m1071A();
            if (!C1117y.m476a(abstractC0623y.f6958el, abstractC0623y.f6959em, this.movementType)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverLand";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompletedBoolean.class */
    public class CompletedBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1624ck >= 1.0f) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "isComplete";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingCountBoolean.class */
    public class TransportingCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        public boolean filtered;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "TransportingCount";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this._withTag != null || this.slot != -1) {
                this.filtered = true;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            int i;
            if (!this.filtered) {
                i = abstractC0623y.mo2807bB();
            } else {
                i = 0;
                C1101m mo2778bz = abstractC0623y.mo2778bz();
                if (mo2778bz != null) {
                    Object[] m534a = mo2778bz.m534a();
                    for (int i2 = mo2778bz.f6894a - 1; i2 >= 0; i2--) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) m534a[i2];
                        if (abstractC0623y2 != null && (this.slot == -1 || i2 == this.slot)) {
                            if (this._withTag != null) {
                                if (!C0448g.m3573a(this._withTag, abstractC0623y2.mo3487dc())) {
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagDynamicBoolean.class */
    public class HasFlagDynamicBoolean extends LogicBoolean {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: id */
        public LogicBoolean f3284id;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.f3284id == null) {
                throw new BooleanParseException("Flag id must be set");
            }
            Float staticNumber = getStaticNumber(this.f3284id);
            if (staticNumber != null) {
                HasFlagBoolean hasFlagBoolean = new HasFlagBoolean();
                hasFlagBoolean.m3374id((int) staticNumber.floatValue());
                return hasFlagBoolean;
            }
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            int readNumber = (int) this.f3284id.readNumber(getParameterContext(abstractC0623y));
            if (readNumber >= 0 && readNumber <= 31) {
                if (HasFlagBoolean.isFlagSet(abstractC0623y.f1643cD, 1 << readNumber)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasFlag(id:" + this.f3284id.getMatchFailReasonForPlayer(getParameterContext(abstractC0623y)) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagBoolean.class */
    public class HasFlagBoolean extends LogicBoolean {
        public int flagMask = 0;
        public int flagId = -1;

        @LogicBoolean.Parameter(positional = 0)
        /* renamed from: id */
        public void m3374id(int i) {
            if (i < 0 || i > 31) {
                throw new BooleanParseException("Flag id must be between 0-31");
            }
            this.flagId = i;
            this.flagMask = 1 << i;
        }

        public static boolean isFlagSet(int i, int i2) {
            return (i2 & i) == i2;
        }

        public static byte setFlag(int i, int i2) {
            return (byte) (i2 | i);
        }

        public static byte unsetFlag(int i, int i2) {
            return (byte) (i2 & (i ^ (-1)));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasFlag(id:" + this.flagId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (this.flagMask != 0 && !isFlagSet(abstractC0623y.f1643cD, this.flagMask)) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsOnTeam.class */
    public class IsOnTeam extends LogicBoolean.LogicBooleanCommonLocking {
        int teamId = -99;

        @LogicBoolean.Parameter
        public void team(int i) {
            if (i < -1 || i > AbstractC0197n.f1308c) {
                throw new BooleanParseException("Flag id must be between 0-" + AbstractC0197n.f1308c);
            }
            this.teamId = i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.teamId == -99) {
                throw new BooleanParseException("Expended teamId argument for function:" + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Team(id:" + this.teamId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (abstractC0623y.f1609bV.f1317k != this.teamId) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TagsBoolean.class */
    public class TagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "Tag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            C0449h dc;
            boolean z = true;
            if (this.includesTag != null && ((dc = abstractC0623y.mo3487dc()) == null || !C0448g.m3573a(this.includesTag, dc))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamTagBoolean.class */
    public class TeamTagBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "Team Tag ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            C0449h m4324R;
            boolean z = true;
            if (this.includesTag != null && ((m4324R = abstractC0623y.f1609bV.m4324R()) == null || !C0448g.m3573a(this.includesTag, m4324R))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EventTagsBoolean.class */
    public class EventTagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "EventTag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (this.includesTag != null) {
                C0449h c0449h = null;
                if (LogicBoolean.activeEvent != null) {
                    c0449h = LogicBoolean.activeEvent.f2901d;
                }
                if (c0449h == null || !C0448g.m3573a(this.includesTag, c0449h)) {
                    z = false;
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean.class */
    public class TransportingUnitWithTagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "TransportingUnitWithTags ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            C1101m mo2778bz;
            boolean z = false;
            if (this.includesTag != null && (mo2778bz = abstractC0623y.mo2778bz()) != null) {
                Object[] m534a = mo2778bz.m534a();
                for (int i = 0; i < mo2778bz.f6894a; i++) {
                    C0449h mo3487dc = ((AbstractC0244am) m534a[i]).mo3487dc();
                    if (mo3487dc != null && C0448g.m3573a(this.includesTag, mo3487dc)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isTransportUnloading.class */
    public class isTransportUnloading extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.mo2808bA()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsTransportUnloading";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isDead.class */
    public class isDead extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1607bT) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsDead";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightValueBoolean.class */
    public final class HeightValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Height";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6960en;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyBoolean.class */
    public final class EnergyBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Energy";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1639cz;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo2800bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean.class */
    public final class EnergyIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "EnergyIncludingQueued";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1639cz + abstractC0623y.mo2779by().f2702c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo2800bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PriceCreditsBoolean.class */
    public final class PriceCreditsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "PriceCredits";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo3334cK();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HpBoolean.class */
    public final class HpBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Hp";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1632cs;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1633ct;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxHpBoolean.class */
    public final class MaxHpBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxHp";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1633ct;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxShieldBoolean.class */
    public final class MaxShieldBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxShield";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1638cy;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxEnergyBoolean.class */
    public final class MaxEnergyBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxEnergy";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo2800bd();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$UnitIdBoolean.class */
    public final class UnitIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "id";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return (float) abstractC0623y.f6951ee;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamDefeatedTechBoolean.class */
    public final class TeamDefeatedTechBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamDefeatedTech";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1609bV.f1340E;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamWipedOutBoolean.class */
    public final class TeamWipedOutBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamWipedOut";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1609bV.f1341F;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamVictoryBoolean.class */
    public final class TeamVictoryBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamVictory";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1609bV.f1342G;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isEnergyRechargingBoolean.class */
    public final class isEnergyRechargingBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "isEnergyRecharging";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo3125bW();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamIdBoolean.class */
    public final class TeamIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "teamId";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1609bV.f1317k;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionXBoolean.class */
    public final class PositionXBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "x";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6958el;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionYBoolean.class */
    public final class PositionYBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "y";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6959em;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$RotationBoolean.class */
    public final class RotationBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "dir";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1618ce;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxMoveSpeedBoolean.class */
    public final class MaxMoveSpeedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "MaxMoveSpeed";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo2713z();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$BuiltAmountBoolean.class */
    public final class BuiltAmountBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "BuiltAmount";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1624ck;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 1.0f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ShieldBoolean.class */
    public final class ShieldBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Shield";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1635cv;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1638cy;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoBoolean.class */
    public final class AmmoBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Ammo";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1642cC;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceCountBoolean.class */
    public final class ResourceCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0453l meta;
        C0428a type;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("ResourceCountBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter(positional = 0)
        public void type(String str) {
            this.type = this.meta.m3400j(str);
            if (this.type == null) {
                throw new BooleanParseException("Could not find resource type: '" + str + "'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.type == null) {
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return this.type + VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            if (this.type == null) {
                return 0.0f;
            }
            return (float) this.type.mo3651a(abstractC0623y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return new ResourceScope();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            if (this.type == null) {
                return LogicBoolean.ReturnType.voidReturn;
            }
            if (this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                return LogicBoolean.ReturnType.number;
            }
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void throwVoidReturnError(String str) {
            throw new RuntimeException("'" + str + "' requires type");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return logicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceScope.class */
    public class ResourceScope extends LogicBooleanLoader.LogicBooleanScopeOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            C0428a m3400j = c0453l.m3400j(str2);
            if (m3400j == null) {
                throw new BooleanParseException("'" + str3 + "': Could not find resource: '" + str2 + "'");
            }
            ResourceCountBoolean resourceCountBoolean = new ResourceCountBoolean();
            resourceCountBoolean.meta = c0453l;
            resourceCountBoolean.type = m3400j;
            return resourceCountBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfConnectionsBoolean.class */
    public final class NumberOfConnectionsBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0453l meta;
        C0416a connectionMetadata;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void name(String str) {
            this.connectionMetadata = this.meta.m3396l(str);
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("Could not find connection type with name: " + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.'");
            }
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("requires connection name");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "NumberOfConnections";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1698dG.m3745a(this.connectionMetadata);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasResourcesBoolean.class */
    public final class HasResourcesBoolean extends LogicBoolean {
        C0424b requiredResources;
        C0453l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("HasResourcesBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            try {
                this.requiredResources = C0424b.m3711b(this.meta, str);
            } catch (C0412bm e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.requiredResources.mo3687b(abstractC0623y)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasResources(" + this.requiredResources.m3719a(false, true, 8, true) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsResourceLargerThan.class */
    public final class IsResourceLargerThan extends LogicBoolean {
        C0453l meta;
        C0428a source;
        C0428a compareTarget;
        @LogicBoolean.Parameter
        public float byMoreThan = 0.0f;
        @LogicBoolean.Parameter
        public float multiplyTargetBy = 1.0f;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("IsResourceLargerThan requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void source(String str) {
            this.source = this.meta.m3400j(str);
            if (this.source == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.source);
            }
        }

        @LogicBoolean.Parameter
        public void compareTarget(String str) {
            this.compareTarget = this.meta.m3400j(str);
            if (this.compareTarget == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.compareTarget);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.source == null) {
                throw new BooleanParseException("Requires 'source'");
            }
            if (this.compareTarget == null) {
                throw new BooleanParseException("Requires 'compareTarget'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.source.mo3651a(abstractC0623y) > (this.compareTarget.mo3651a(abstractC0623y) + this.byMoreThan) * this.multiplyTargetBy) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsResourceLargerThan(" + this.source.m3654i() + " vs " + this.compareTarget.m3654i() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$KillsBoolean.class */
    public final class KillsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Kills";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1658cS;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam.class */
    public final class NumberOfUnitsInTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean neutralTeam;
        @LogicBoolean.Parameter
        public boolean allTeams;
        public boolean useAggressiveTeamInsteadOfNeutralTeam;
        public static final HandleCallbackCount handleCallbackCount = new HandleCallbackCount();

        @LogicBoolean.Parameter
        public void aggressiveTeam(boolean z) {
            if (z) {
                this.neutralTeam = true;
                this.useAggressiveTeamInsteadOfNeutralTeam = true;
            }
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            AbstractC0197n abstractC0197n;
            int m4309a;
            AbstractC0197n[] m4267d;
            int i;
            int m4309a2;
            C0448g c0448g = this._withTag;
            if (this.allTeams) {
                abstractC0197n = null;
            } else if (this.neutralTeam) {
                if (!this.useAggressiveTeamInsteadOfNeutralTeam) {
                    abstractC0197n = AbstractC0197n.f1314i;
                } else {
                    abstractC0197n = AbstractC0197n.f1313h;
                }
            } else {
                abstractC0197n = abstractC0623y.f1609bV;
            }
            if (abstractC0197n == null) {
                m4309a = 0;
                for (AbstractC0197n abstractC0197n2 : AbstractC0197n.m4267d()) {
                    if (c0448g == null) {
                        i = m4309a;
                        m4309a2 = abstractC0197n2.m4297a(this.incompleteBuildings, this.factoryQueue);
                    } else {
                        i = m4309a;
                        m4309a2 = abstractC0197n2.m4309a(c0448g, this.incompleteBuildings, this.factoryQueue);
                    }
                    m4309a = i + m4309a2;
                }
            } else if (c0448g == null) {
                m4309a = abstractC0197n.m4297a(this.incompleteBuildings, this.factoryQueue);
            } else {
                m4309a = abstractC0197n.m4309a(c0448g, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m4309a == 0) {
                return m4309a;
            }
            handleCallbackCount.withinRangeSq = this.withinRangeSq;
            handleCallbackCount.count = 0;
            handleCallbackCount.tag = c0448g;
            handleCallbackCount.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCount.targetTeam = abstractC0197n;
            AbstractC0916l.m1071A().f6175cc.m3099a(abstractC0623y.f6958el, abstractC0623y.f6959em, this.withinRange, abstractC0623y, 0.0f, handleCallbackCount);
            return handleCallbackCount.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam$HandleCallbackCount.class */
        public class HandleCallbackCount extends AbstractC0544i {
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public AbstractC0197n targetTeam;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return this.targetTeam;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                C0449h mo3487dc = abstractC0244am.mo3487dc();
                if ((this.tag == null || (mo3487dc != null && C0448g.m3573a(this.tag, mo3487dc))) && C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) < this.withinRangeSq) {
                    if (abstractC0244am.f1624ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.class */
    public final class NumberOfUnitsInEnemyOrAllyTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean ally;
        public static final HandleCallbackCountEnemies handleCallbackCountEnemies = new HandleCallbackCountEnemies();
        public static final HandleCallbackCountAlly handleCallbackCountAlly = new HandleCallbackCountAlly();

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Enemy Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            int m4273c;
            AbstractC0197n abstractC0197n = abstractC0623y.f1609bV;
            if (!this.ally) {
                m4273c = 0 + abstractC0197n.m4289b(this._withTag, this.incompleteBuildings, this.factoryQueue);
            } else {
                m4273c = 0 + abstractC0197n.m4273c(this._withTag, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m4273c == 0) {
                return m4273c;
            }
            if (!this.ally) {
                handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
                handleCallbackCountEnemies.count = 0;
                handleCallbackCountEnemies.tag = this._withTag;
                handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
                AbstractC0916l.m1071A().f6175cc.m3099a(abstractC0623y.f6958el, abstractC0623y.f6959em, this.withinRange, abstractC0623y, 0.0f, handleCallbackCountEnemies);
                return handleCallbackCountEnemies.count;
            }
            handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
            handleCallbackCountAlly.count = 0;
            handleCallbackCountAlly.tag = this._withTag;
            handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCountAlly.ally = abstractC0623y.f1609bV;
            AbstractC0916l.m1071A().f6175cc.m3099a(abstractC0623y.f6958el, abstractC0623y.f6959em, this.withinRange, abstractC0623y, 0.0f, handleCallbackCountAlly);
            return handleCallbackCountAlly.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies.class */
        public class HandleCallbackCountEnemies extends AbstractC0544i {
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return abstractC0623y.f1609bV;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                C0449h mo3487dc = abstractC0244am.mo3487dc();
                if ((this.tag == null || (mo3487dc != null && C0448g.m3573a(this.tag, mo3487dc))) && C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) < this.withinRangeSq) {
                    if (abstractC0244am.f1624ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly.class */
        public class HandleCallbackCountAlly extends AbstractC0544i {
            public AbstractC0197n ally;
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
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
                if (this.ally == abstractC0244am.f1609bV || !this.ally.m4264d(abstractC0244am.f1609bV)) {
                    return;
                }
                C0449h mo3487dc = abstractC0244am.mo3487dc();
                if ((this.tag == null || (mo3487dc != null && C0448g.m3573a(this.tag, mo3487dc))) && C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) < this.withinRangeSq) {
                    if (abstractC0244am.f1624ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoIncludingQueuedBoolean.class */
    public final class AmmoIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "AmmoIncludingQueued";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1642cC + abstractC0623y.mo2779by().f2705f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$QueueSize.class */
    public final class QueueSize extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withActionTag;

        @LogicBoolean.Parameter
        public void withActionTag(String str) {
            this._withActionTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "QueueSize";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo3263a(this._withActionTag);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TimeAliveBoolean.class */
    public final class TimeAliveBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "TimeAlive";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1585by;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$LastConvertedBoolean.class */
    public final class LastConvertedBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "LastConverted";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1587bA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CustomTimerBoolean.class */
    public final class CustomTimerBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "CustomTimer";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1586bz;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasTakenDamage.class */
    public class HasTakenDamage extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1578br;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "HasTakenDamage";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsAttackingBoolean.class */
    public class IsAttackingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m2851aa()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsReversingBoolean.class */
    public class IsReversingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1620cg) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsReversing";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsControlledByAI.class */
    public class IsControlledByAI extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1609bV.f1328v) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsControlledByAI";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompareUnitsBroken.class */
    public class CompareUnitsBroken extends LogicBoolean {
        C0453l meta;
        UnitReference sameUnitAs;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("SameUnitAs requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void sameUnitAs(String str) {
            try {
                this.sameUnitAs = UnitReference.parseUnitReference(this.meta, str, VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
            } catch (C0412bm e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.sameUnitAs == null) {
                throw new BooleanParseException("Missing required parameters (Possible parameters:" + getParameters().allParametersString + ")");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "SameUnitAs";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasParent.class */
    public final class HasParent extends LogicBoolean {
        public C0448g _withTag;

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m3565c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            AbstractC0244am dp = abstractC0623y.m4077dp();
            if (dp != null) {
                z = true;
                if (this._withTag != null) {
                    if (!C0448g.m3573a(this._withTag, dp.mo3487dc())) {
                        z = false;
                    }
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasParent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean.class */
    public final class NumberOfAttachedUnitsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        short attachmentId = -1;
        C0453l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("NumberOfAttachedUnitsBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
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

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            String str = VariableScope.nullOrMissingString;
            if (this._withTag != null) {
                str = str + "tag=" + this._withTag;
            }
            if (this.attachmentId != -1) {
                str = str + " attachmentId=" + ((int) this.attachmentId);
            }
            return "NumberOfAttachedUnits(" + str + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0623y abstractC0623y) {
            if (!(abstractC0623y instanceof C0451j)) {
                return 0.0f;
            }
            C0451j c0451j = (C0451j) abstractC0623y;
            if (c0451j.f2868C == null) {
                return 0.0f;
            }
            int i = 0;
            Object[] m534a = c0451j.f2868C.m534a();
            for (int i2 = c0451j.f2868C.f6894a - 1; i2 >= 0; i2--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m534a[i2];
                if (abstractC0623y2 != null && (this.attachmentId == -1 || i2 == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0448g.m3573a(this._withTag, abstractC0623y2.mo3487dc())) {
                        }
                    }
                    i++;
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }
}
