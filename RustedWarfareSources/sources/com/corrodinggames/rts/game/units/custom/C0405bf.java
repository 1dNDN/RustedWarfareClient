package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0189g;
import com.corrodinggames.rts.game.C0190h;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bf */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bf.class */
public class C0405bf extends C0189g {

    /* renamed from: bh */
    public String f2514bh;

    /* renamed from: bi */
    public int f2515bi;

    /* renamed from: bj */
    public C0453l f2516bj;

    /* renamed from: a */
    public static void m3965a(C0405bf c0405bf, C0453l c0453l, C1072ab c1072ab, String str) {
        Integer m645b = c1072ab.m645b(str, "directDamage", (Integer) null);
        Integer m645b2 = c1072ab.m645b(str, "areaDamage", (Integer) null);
        if (m645b == null && m645b2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        c0405bf.f1163s = c1072ab.m663a(str, "targetGround", Boolean.valueOf(c0405bf.f1163s)).booleanValue();
        c0405bf.f1164t = c1072ab.m663a(str, "targetGround_includeTargetHeight", Boolean.valueOf(c0405bf.f1164t)).booleanValue();
        Integer m645b3 = c1072ab.m645b(str, "areaRadius", (Integer) null);
        if (m645b3 != null) {
            c0405bf.f1153i = m645b3.intValue();
        }
        c0405bf.f1100b = c1072ab.m645b(str, "directDamage", Integer.valueOf(c0405bf.f1100b)).intValue();
        c0405bf.f1101c = c1072ab.m645b(str, "areaDamage", Integer.valueOf(c0405bf.f1101c)).intValue();
        c0405bf.f1102d = c1072ab.m663a(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(c0405bf.f1102d)).booleanValue();
        c0405bf.f1105g = c1072ab.m663a(str, "areaDamageNoFalloff", Boolean.valueOf(c0405bf.f1105g)).booleanValue();
        c0405bf.f1154j = c1072ab.m661a(str, "areaIgnoreUnitsCloserThan", Float.valueOf(c0405bf.f1154j)).floatValue();
        c0405bf.f1106h = c1072ab.m663a(str, "areaRadiusFromEdge", Boolean.valueOf(c0405bf.f1106h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(c1072ab.m644b(str, "friendlyFire", (String) null))) {
            c0405bf.f1156l = true;
        } else {
            Boolean m663a = c1072ab.m663a(str, "friendlyFire", (Boolean) null);
            if (m663a != null) {
                c0405bf.f1156l = false;
                c0405bf.f1155k = m663a.booleanValue();
            }
        }
        c0405bf.f1157m = c1072ab.m663a(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(c0405bf.f1157m)).booleanValue();
        c0405bf.f1158n = c1072ab.m663a(str, "areaHitUnderwaterAlways", Boolean.valueOf(c0405bf.f1158n)).booleanValue();
        c0405bf.f1159o = c1072ab.m661a(str, "deflectionPower", Float.valueOf(c0405bf.f1159o)).floatValue();
        c0405bf.f1160p = c1072ab.m663a(str, "nukeWeapon", Boolean.valueOf(c0405bf.f1160p)).booleanValue();
        c0405bf.f1161q = c1072ab.m663a(str, "shouldRevealFog", Boolean.valueOf(c0405bf.f1161q)).booleanValue();
        c0405bf.f1162r = c1072ab.m663a(str, "alwaysVisibleInFog", Boolean.valueOf(c0405bf.f1162r)).booleanValue();
        c0405bf.f1108v = c1072ab.m623h(str, "life").floatValue();
        c0405bf.f1107u = c1072ab.m646b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        c0405bf.f1165w = c1072ab.m661a(str, "speed", Float.valueOf(c0405bf.f1165w)).floatValue();
        c0405bf.f1166x = c1072ab.m658a(str, "frame", Short.valueOf(c0405bf.f1166x)).shortValue();
        c0405bf.f1109y = c1072ab.m658a(str, "drawType", Short.valueOf(c0405bf.f1109y)).shortValue();
        c0405bf.f1167z = c1072ab.m658a(str, "shadowFrame", Short.valueOf(c0405bf.f1167z)).shortValue();
        C0934e m3540a = c0453l.m3540a(c1072ab, str, "image");
        if (m3540a != null) {
            c0405bf.f1111B = m3540a;
        }
        C0934e m3540a2 = c0453l.m3540a(c1072ab, str, "shadowImage");
        if (m3540a2 != null) {
            c0405bf.f1112C = m3540a2;
        }
        c0405bf.f1127ad = c1072ab.m661a(str, "beamImageOffsetRate", Float.valueOf(c0405bf.f1127ad)).floatValue();
        C0934e m3540a3 = c0453l.m3540a(c1072ab, str, "beamImage");
        if (m3540a3 != null) {
            c0405bf.f1122Y = m3540a3;
            c0405bf.f1179X = true;
            if (m3540a3.f6403q < 20 && !LoggerMaybe.m993aw()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        C0934e m3540a4 = c0453l.m3540a(c1072ab, str, "beamImageStart");
        if (m3540a4 != null) {
            c0405bf.f1123Z = m3540a4;
            if (m3540a3 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        c0405bf.f1124aa = c1072ab.m663a(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        C0934e m3540a5 = c0453l.m3540a(c1072ab, str, "beamImageEnd");
        if (m3540a5 != null) {
            c0405bf.f1125ab = m3540a5;
            if (m3540a3 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        c0405bf.f1126ac = c1072ab.m663a(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        c0405bf.f1110A = c1072ab.m663a(str, "invisible", Boolean.valueOf(c0405bf.f1110A)).booleanValue();
        c0405bf.f1113D = c1072ab.m661a(str, "initialUnguidedSpeedHeight", Float.valueOf(c0405bf.f1113D)).floatValue();
        c0405bf.f1114E = c1072ab.m661a(str, "initialUnguidedSpeedX", Float.valueOf(c0405bf.f1114E)).floatValue();
        c0405bf.f1115F = c1072ab.m661a(str, "initialUnguidedSpeedY", Float.valueOf(c0405bf.f1115F)).floatValue();
        c0405bf.f1116G = c1072ab.m661a(str, "gravity", Float.valueOf(c0405bf.f1116G)).floatValue();
        c0405bf.f1117H = c1072ab.m661a(str, "trueGravity", Float.valueOf(c0405bf.f1117H)).floatValue();
        c0405bf.f1168I = c1072ab.m663a(str, "instant", Boolean.valueOf(c0405bf.f1168I)).booleanValue();
        c0405bf.f1171L = c1072ab.m663a(str, "instantReuseLast", Boolean.valueOf(c0405bf.f1171L)).booleanValue();
        c0405bf.f1172M = c1072ab.m663a(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(c0405bf.f1172M)).booleanValue();
        if (c0405bf.f1172M) {
            if (!c0405bf.f1171L) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            c0453l.f3117ey = true;
        }
        c0405bf.f1173N = c1072ab.m663a(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(c0405bf.f1173N)).booleanValue();
        c0405bf.f1121T = c1072ab.m663a(str, "moveWithParent", Boolean.valueOf(c0405bf.f1121T)).booleanValue();
        c0405bf.f1169J = c1072ab.m663a(str, "disableLeadTargeting", Boolean.valueOf(c0405bf.f1169J)).booleanValue();
        c0405bf.f1170K = c1072ab.m661a(str, "leadTargetingSpeedCalculation", Float.valueOf(c0405bf.f1170K)).floatValue();
        c0405bf.f1180ae = c1072ab.m663a(str, "ballistic", Boolean.valueOf(c0405bf.f1180ae)).booleanValue();
        String m644b = c1072ab.m644b(str, "trailEffect", (String) null);
        if (m644b != null) {
            if (m644b.equalsIgnoreCase("true")) {
                c0405bf.f1181af = true;
            } else if (m644b.equalsIgnoreCase("false")) {
                c0405bf.f1181af = false;
            } else {
                c0405bf.f1181af = false;
                c0405bf.f1128ah = c0453l.m3535a(m644b, (C0467y) null);
            }
        }
        String m644b2 = c1072ab.m644b(str, "effectOnCreate", (String) null);
        if (m644b2 != null) {
            c0405bf.f1129ai = c0453l.m3535a(m644b2, (C0467y) null);
        }
        c0405bf.f1182ag = c1072ab.m661a(str, "trailEffectRate", Float.valueOf(c0405bf.f1182ag)).floatValue();
        if (c0405bf.f1181af) {
            c0405bf.f1184ao = -1118720;
        }
        c0405bf.f1133am = c1072ab.m661a(str, "wobbleAmplitude", Float.valueOf(c0405bf.f1133am)).floatValue();
        c0405bf.f1183an = c1072ab.m646b(str, "wobbleFrequency", Float.valueOf(c0405bf.f1183an)).floatValue();
        if (c0405bf.f1183an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        c0405bf.f1131ak = C0406bg.m3959a(c0453l, c1072ab, str, "spawnProjectilesOnEndOfLife", (C0406bg) null);
        c0405bf.f1130aj = C0406bg.m3959a(c0453l, c1072ab, str, "spawnProjectilesOnExplode", (C0406bg) null);
        c0405bf.f1132al = C0406bg.m3959a(c0453l, c1072ab, str, "spawnProjectilesOnCreate", (C0406bg) null);
        c0405bf.f1184ao = c1072ab.m659a(str, "lightColor", Integer.valueOf(c0405bf.f1184ao)).intValue();
        c0405bf.f1185ap = c1072ab.m661a(str, "lightSize", Float.valueOf(c0405bf.f1185ap)).floatValue();
        c0405bf.f1134aq = c1072ab.m663a(str, "lightCastOnGround", Boolean.valueOf(c0405bf.f1134aq)).booleanValue();
        c0405bf.f1186ar = c1072ab.m663a(str, "largeHitEffect", Boolean.valueOf(c0405bf.f1186ar)).booleanValue();
        c0405bf.f1174O = c1072ab.m661a(str, "turnSpeed", Float.valueOf(c0405bf.f1174O)).floatValue();
        c0405bf.f1175P = c1072ab.m661a(str, "turnSpeedWhenNear", Float.valueOf(c0405bf.f1175P)).floatValue();
        c0405bf.f1118Q = c1072ab.m661a(str, "sweepSpeed", Float.valueOf(c0405bf.f1118Q)).floatValue();
        c0405bf.f1119R = c1072ab.m661a(str, "sweepOffset", Float.valueOf(c0405bf.f1119R)).floatValue();
        c0405bf.f1120S = c1072ab.m661a(str, "sweepOffsetFromTargetRadius", Float.valueOf(c0405bf.f1120S)).floatValue();
        c0405bf.f1176U = c1072ab.m663a(str, "drawUnderUnits", Boolean.valueOf(c0405bf.f1176U)).booleanValue();
        c0405bf.f1177V = c1072ab.m663a(str, "lightingEffect", Boolean.valueOf(c0405bf.f1177V)).booleanValue();
        c0405bf.f1178W = c1072ab.m663a(str, "laserEffect", Boolean.valueOf(c0405bf.f1178W)).booleanValue();
        if (c0405bf.f1178W && c0405bf.f1122Y == null) {
            c0405bf.f1197aE = Color.m5435a(80, 255, 0, 0);
        }
        if (c0405bf.f1177V && c0405bf.f1163s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (c0405bf.f1178W && c0405bf.f1163s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        c0405bf.f1187as = c1072ab.m661a(str, "ballistic_delaymove_height", Float.valueOf(c0405bf.f1187as)).floatValue();
        c0405bf.f1188at = c1072ab.m661a(str, "ballistic_height", Float.valueOf(c0405bf.f1188at)).floatValue();
        c0405bf.f1189au = c1072ab.m661a(str, "targetSpeed", Float.valueOf(c0405bf.f1189au)).floatValue();
        c0405bf.f1190av = c1072ab.m661a(str, "targetSpeedAcceleration", Float.valueOf(c0405bf.f1190av)).floatValue();
        c0405bf.f1191aw = c1072ab.m663a(str, "autoTargetingOnDeadTarget", Boolean.valueOf(c0405bf.f1191aw)).booleanValue();
        c0405bf.f1192ax = c1072ab.m661a(str, "autoTargetingOnDeadTargetRange", Float.valueOf(c0405bf.f1192ax)).floatValue();
        c0405bf.f1193ay = c1072ab.m661a(str, "autoTargetingOnDeadTargetLead", Float.valueOf(c0405bf.f1193ay)).floatValue();
        c0405bf.f1135az = c1072ab.m663a(str, "retargetingInFlight", Boolean.valueOf(c0405bf.f1135az)).booleanValue();
        c0405bf.f1194aA = c1072ab.m661a(str, "retargetingInFlightSearchDelay", Float.valueOf(c0405bf.f1194aA)).floatValue();
        c0405bf.f1195aB = c1072ab.m661a(str, "retargetingInFlightSearchRange", Float.valueOf(c0405bf.f1195aB)).floatValue();
        c0405bf.f1196aC = c1072ab.m661a(str, "retargetingInFlightSearchLead", Float.valueOf(c0405bf.f1196aC)).floatValue();
        c0405bf.f1136aD = c1072ab.m683a(c0453l, str, "retargetingInFlightSearchOnlyTags", (C0449h) null);
        if (c0405bf.f1192ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (c0405bf.f1195aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        c0405bf.f1197aE = c1072ab.m659a(str, "color", Integer.valueOf(c0405bf.f1197aE)).intValue();
        c0405bf.f1199aG = c1072ab.m661a(str, "teamColorRatio", Float.valueOf(c0405bf.f1199aG)).floatValue();
        if (c0405bf.f1199aG < 0.0f || c0405bf.f1199aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + c0405bf.f1199aG);
        }
        c0405bf.f1200aH = c1072ab.m661a(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - c0405bf.f1199aG)).floatValue();
        if (c0405bf.f1200aH < 0.0f || c0405bf.f1200aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + c0405bf.f1200aH);
        }
        if (c0405bf.f1199aG == 0.0f && c0405bf.f1200aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        c0405bf.f1198aF = c1072ab.m661a(str, "drawSize", Float.valueOf(c0405bf.f1198aF)).floatValue();
        c0405bf.f1137aI = c1072ab.m663a(str, "flameWeapon", Boolean.valueOf(c0405bf.f1137aI)).booleanValue();
        c0405bf.f1201aJ = c1072ab.m663a(str, "hitSound", Boolean.valueOf(c0405bf.f1201aJ)).booleanValue();
        c0405bf.f1139aL = c1072ab.m661a(str, "targetGroundHeightOffset", Float.valueOf(c0405bf.f1139aL)).floatValue();
        c0405bf.f1138aK = c1072ab.m661a(str, "targetGroundSpread", Float.valueOf(c0405bf.f1138aK)).floatValue();
        c0405bf.f1140aM = c1072ab.m661a(str, "speedSpread", Float.valueOf(c0405bf.f1140aM)).floatValue();
        c0405bf.f1142aO = c1072ab.m663a(str, "explodeOnEndOfLife", Boolean.valueOf(c0405bf.f1142aO)).booleanValue();
        c0405bf.f1141aN = c1072ab.m663a(str, "ignoreParentShootDamageMultiplier", Boolean.valueOf(c0405bf.f1141aN)).booleanValue();
        c0405bf.f1143aP = c1072ab.m661a(str, "pushForce", Float.valueOf(c0405bf.f1143aP)).floatValue();
        c0405bf.f1144aQ = c1072ab.m661a(str, "pushVelocity", Float.valueOf(c0405bf.f1144aQ)).floatValue();
        c0405bf.f1202aR = c1072ab.m661a(str, "buildingDamageMultiplier", Float.valueOf(c0405bf.f1202aR)).floatValue();
        c0405bf.f1203aS = c1072ab.m661a(str, "shieldDamageMultiplier", Float.valueOf(c0405bf.f1203aS)).floatValue();
        c0405bf.f1204aT = c1072ab.m661a(str, "shieldDefectionMultiplier", Float.valueOf(c0405bf.f1204aT)).floatValue();
        c0405bf.f1205aU = c1072ab.m661a(str, "hullDamageMultiplier", Float.valueOf(c0405bf.f1205aU)).floatValue();
        c0405bf.f1145aV = c1072ab.m661a(str, "armourIgnoreAmount", Float.valueOf(c0405bf.f1145aV)).floatValue();
        c0405bf.f1206aW = c1072ab.m661a(str, "areaExpandTime", Float.valueOf(c0405bf.f1206aW)).floatValue();
        String m644b3 = c1072ab.m644b(str, "explodeEffect", (String) null);
        if (m644b3 != null) {
            c0405bf.f1146aX = c0453l.m3535a(m644b3, (C0467y) null);
        }
        String m644b4 = c1072ab.m644b(str, "explodeEffectOnShield", (String) null);
        if (m644b4 != null) {
            c0405bf.f1147aY = c0453l.m3535a(m644b4, (C0467y) null);
        }
        C0413bn m3944a = C0413bn.m3944a(c0453l, c1072ab, str, "spawnUnit");
        if (m3944a != null && !m3944a.m3939b()) {
            c0405bf.f1148aZ = m3944a;
        }
        c0405bf.f1149ba = c1072ab.m645b(str, "unloadUpToXUnitsFromSource", Integer.valueOf(c0405bf.f1149ba)).intValue();
        c0405bf.f1150bb = c1072ab.m663a(str, "teleportSource", Boolean.valueOf(c0405bf.f1150bb)).booleanValue();
        c0405bf.f1151bc = c1072ab.m663a(str, "convertHitToSourceTeam", Boolean.valueOf(c0405bf.f1151bc)).booleanValue();
        c0405bf.f1152bd = C0448g.m3750a(c1072ab.m644b(str, "tags", (String) null));
        C1101m m617k = c1072ab.m617k(str, "mutator");
        C1101m c1101m = new C1101m();
        Iterator it = m617k.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split("_");
            if (split.length > 1) {
                String str2 = split[0];
                String str3 = str2 + "_";
                if (!c1101m.contains(str3) && str2.length() > "mutator".length()) {
                    c1101m.add(str3);
                }
            }
        }
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C0190h c0190h = new C0190h();
            c0190h.f1210a = C0448g.m3750a(c1072ab.m644b(str, str4 + "ifUnitWithTags", (String) null));
            c0190h.f1211b = C0448g.m3750a(c1072ab.m644b(str, str4 + "ifUnitWithoutTags", (String) null));
            if (c0190h.f1210a == null && c0190h.f1211b == null) {
                throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
            }
            c0190h.f1212c = c1072ab.m661a(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            c0190h.f1213d = c1072ab.m661a(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            C0424b m3907a = C0424b.m3907a(c0453l, c1072ab, str, str4 + "addResourcesDirectHit", true);
            if (m3907a != null && m3907a.m3889c()) {
                c0190h.f1214e = m3907a;
                if (c0405bf.f1163s) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            C0424b m3907a2 = C0424b.m3907a(c0453l, c1072ab, str, str4 + "addResourcesAreaHit", true);
            if (m3907a2 != null && m3907a2.m3889c()) {
                c0190h.f1215f = m3907a2;
                if (m645b3 == null) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            String m644b5 = c1072ab.m644b(str, str4 + "changedExplodeEffect", (String) null);
            if (m644b5 != null) {
                c0190h.f1216g = c0453l.m3535a(m644b5, (C0467y) null);
                if (c0190h.f1216g != null && !c0190h.f1216g.m3460a()) {
                    c0190h.f1216g = null;
                }
            }
            boolean z = false;
            boolean z2 = false;
            if (!C0758f.m2037j(c0190h.f1212c, 1.0f)) {
                z = true;
            }
            if (!C0758f.m2037j(c0190h.f1213d, 1.0f) && c0405bf.f1101c != 0 && c0405bf.f1153i > 0) {
                z2 = true;
            }
            if (c0190h.f1214e != null) {
                z = true;
            }
            if (c0190h.f1215f != null) {
                z2 = true;
            }
            if (z) {
                if (c0405bf.f1207be == null) {
                    c0405bf.f1207be = new C1101m();
                }
                c0405bf.f1207be.add(c0190h);
            }
            if (z2) {
                if (c0405bf.f1208bf == null) {
                    c0405bf.f1208bf = new C1101m();
                }
                c0405bf.f1103e = true;
                c0405bf.f1208bf.add(c0190h);
            }
            if (c0190h.f1216g != null) {
                if (c0405bf.f1209bg == null) {
                    c0405bf.f1209bg = new C1101m();
                }
                c0405bf.f1209bg.add(c0190h);
            }
        }
        if (c0405bf.f1101c != 0 && c0405bf.f1153i > 0) {
            c0405bf.f1103e = true;
        }
        if ((c0405bf.f1143aP != 0.0f || c0405bf.f1144aQ != 0.0f) && c0405bf.f1153i > 0) {
            c0405bf.f1103e = true;
        }
        c0405bf.f1104f = !c0405bf.f1103e;
        c0453l.f3271fR.add(c0405bf);
    }

    /* renamed from: a */
    public static void m3964a(C0405bf c0405bf, StreamWriter streamWriter) {
        streamWriter.mo1370a(c0405bf.f2516bj);
        streamWriter.WriteUTF(c0405bf.f2514bh);
    }

    /* renamed from: b */
    public static C0189g m3963b(Reader reader) {
        InterfaceC0303as m1275q = reader.m1275q();
        String ReadUTF = reader.ReadUTF();
        if (m1275q == null) {
            return null;
        }
        if (!(m1275q instanceof C0453l)) {
            LoggerMaybe.m983b("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + m1275q.mo4252i() + " loading real_meta");
            return null;
        }
        C0405bf m3511f = ((C0453l) m1275q).m3511f(ReadUTF);
        if (m3511f == null) {
            LoggerMaybe.m983b("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + ReadUTF);
            return null;
        }
        return m3511f;
    }

    /* renamed from: a */
    public void m3966a(AbstractC0244am abstractC0244am, C0188f c0188f, AbstractC0244am abstractC0244am2, float f, float f2, float f3) {
        if (abstractC0244am2 == null) {
            c0188f.f1054aC = true;
            c0188f.f988n = f;
            c0188f.f989o = f2;
            if (this.f1138aK != 0.0f) {
                c0188f.f988n += C0758f.m2136a((AbstractC1120w) abstractC0244am, (int) ((-this.f1138aK) * 100.0f), (int) (this.f1138aK * 100.0f), 2) / 100.0f;
                abstractC0244am.f1588bB = (int) (abstractC0244am.f1588bB + c0188f.f988n);
                c0188f.f989o += C0758f.m2136a((AbstractC1120w) abstractC0244am, (int) ((-this.f1138aK) * 100.0f), (int) (this.f1138aK * 100.0f), 3) / 100.0f;
                abstractC0244am.f1588bB = (int) (abstractC0244am.f1588bB + c0188f.f989o);
            }
            c0188f.f990p = 0.0f;
            c0188f.f990p += this.f1139aL;
        } else if (c0188f.f987m) {
            c0188f.f1054aC = true;
            if (!this.f1169J) {
                float f4 = c0188f.f994t;
                if (this.f1189au != -1.0f) {
                    f4 = this.f1189au;
                }
                if (this.f1170K >= 0.0f) {
                    f4 = this.f1170K;
                }
                PointF m4433a = abstractC0244am2.m4433a(c0188f.f6957el, c0188f.f6958em, f4, c0188f.f982h, f3);
                c0188f.f988n = m4433a.f227a;
                c0188f.f989o = m4433a.f228b;
            } else {
                c0188f.f988n = abstractC0244am2.f6957el;
                c0188f.f989o = abstractC0244am2.f6958em;
            }
            if (this.f1164t) {
                c0188f.f990p = abstractC0244am2.f6959en;
            } else {
                c0188f.f990p = 0.0f;
            }
            c0188f.f990p += this.f1139aL;
            if (this.f1138aK != 0.0f) {
                c0188f.f988n += C0758f.m2136a((AbstractC1120w) abstractC0244am, (int) ((-this.f1138aK) * 100.0f), (int) (this.f1138aK * 100.0f), 2) / 100.0f;
                c0188f.f989o += C0758f.m2136a((AbstractC1120w) abstractC0244am, (int) ((-this.f1138aK) * 100.0f), (int) (this.f1138aK * 100.0f), 7) / 100.0f;
            }
        } else {
            c0188f.f986l = abstractC0244am2;
        }
    }
}
