package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0304at;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0416a;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0437d;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.p026e.C0526i;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/l.class */
public final class C0453l implements InterfaceC0303as {

    /* renamed from: b */
    public static C0453l f2903b;

    /* renamed from: r */
    public boolean f2904r;

    /* renamed from: s */
    public boolean f2905s;

    /* renamed from: t */
    public boolean f2906t;

    /* renamed from: u */
    public boolean f2907u;

    /* renamed from: v */
    public boolean f2908v;

    /* renamed from: w */
    public boolean f2909w;

    /* renamed from: x */
    public boolean f2910x;

    /* renamed from: y */
    public boolean f2911y;

    /* renamed from: A */
    public boolean f2912A;

    /* renamed from: B */
    public Rect f2913B;

    /* renamed from: C */
    public String f2914C;

    /* renamed from: D */
    public String f2915D;

    /* renamed from: E */
    public String f2916E;

    /* renamed from: G */
    public int f2917G;

    /* renamed from: H */
    public String f2918H;

    /* renamed from: I */
    public C0824b f2919I;

    /* renamed from: J */
    public String f2920J;

    /* renamed from: K */
    public String f2921K;

    /* renamed from: L */
    public String f2922L;

    /* renamed from: N */
    public C0449h f2923N;

    /* renamed from: O */
    public C0449h f2924O;

    /* renamed from: P */
    public String f2925P;

    /* renamed from: Q */
    public int f2926Q;

    /* renamed from: R */
    public int f2927R;

    /* renamed from: S */
    public EnumC0345ac f2928S;

    /* renamed from: X */
    public int f2929X;

    /* renamed from: Y */
    public LogicBoolean f2930Y;

    /* renamed from: Z */
    public boolean f2931Z;

    /* renamed from: aa */
    public boolean f2932aa;

    /* renamed from: ab */
    public EnumC0198o f2933ab;

    /* renamed from: ae */
    public int f2934ae;

    /* renamed from: af */
    public int f2935af;

    /* renamed from: ag */
    public int f2936ag;

    /* renamed from: ah */
    public int f2937ah;

    /* renamed from: ai */
    public float f2938ai;

    /* renamed from: aj */
    public boolean f2939aj;

    /* renamed from: al */
    public boolean f2940al;

    /* renamed from: ap */
    public boolean f2941ap;

    /* renamed from: ar */
    public C0934e[] f2942ar;

    /* renamed from: av */
    public C0934e f2943av;

    /* renamed from: aA */
    public boolean f2944aA;

    /* renamed from: aB */
    public C0385az f2945aB;

    /* renamed from: aC */
    public C0385az f2946aC;

    /* renamed from: aD */
    public String f2947aD;

    /* renamed from: aE */
    public boolean f2948aE;

    /* renamed from: aG */
    public boolean f2949aG;

    /* renamed from: aH */
    public boolean f2950aH;

    /* renamed from: aI */
    public boolean f2951aI;

    /* renamed from: aJ */
    public boolean f2952aJ;

    /* renamed from: aK */
    public float f2953aK;

    /* renamed from: aL */
    public boolean f2954aL;

    /* renamed from: aM */
    public boolean f2955aM;

    /* renamed from: aN */
    public boolean f2956aN;

    /* renamed from: aO */
    public boolean f2957aO;

    /* renamed from: aP */
    public boolean f2958aP;

    /* renamed from: aQ */
    public boolean f2959aQ;

    /* renamed from: aR */
    public C0449h f2960aR;

    /* renamed from: aS */
    public boolean f2961aS;

    /* renamed from: aT */
    public boolean f2962aT;

    /* renamed from: aU */
    public boolean f2963aU;

    /* renamed from: aV */
    public boolean f2964aV;

    /* renamed from: aX */
    public boolean f2965aX;

    /* renamed from: aZ */
    public boolean f2966aZ;

    /* renamed from: ba */
    public float f2967ba;

    /* renamed from: bb */
    public float f2968bb;

    /* renamed from: bd */
    public float f2969bd;

    /* renamed from: be */
    public float f2970be;

    /* renamed from: bf */
    public float f2971bf;

    /* renamed from: bg */
    public boolean f2972bg;

    /* renamed from: bh */
    public float f2973bh;

    /* renamed from: bi */
    public boolean f2974bi;

    /* renamed from: bj */
    public boolean f2975bj;

    /* renamed from: bk */
    public boolean f2976bk;

    /* renamed from: bl */
    public boolean f2977bl;

    /* renamed from: bm */
    public int f2978bm;

    /* renamed from: bn */
    public boolean f2979bn;

    /* renamed from: bo */
    public float f2980bo;

    /* renamed from: bp */
    public float f2981bp;

    /* renamed from: bq */
    public int f2982bq;

    /* renamed from: br */
    public boolean f2983br;

    /* renamed from: bs */
    public boolean f2984bs;

    /* renamed from: bt */
    public EnumC0233ab f2985bt;

    /* renamed from: bu */
    public boolean f2986bu;

    /* renamed from: bv */
    public boolean f2987bv;

    /* renamed from: bw */
    public C0467y f2988bw;

    /* renamed from: bx */
    public C0467y f2989bx;

    /* renamed from: by */
    public C0467y f2990by;

    /* renamed from: bz */
    public C0409bj f2991bz;

    /* renamed from: bC */
    public C0413bn f2992bC;

    /* renamed from: bD */
    public boolean f2993bD;

    /* renamed from: bE */
    public boolean f2994bE;

    /* renamed from: bF */
    public boolean f2995bF;

    /* renamed from: bG */
    public boolean f2996bG;

    /* renamed from: bJ */
    boolean f2997bJ;

    /* renamed from: bK */
    boolean f2998bK;

    /* renamed from: bL */
    boolean f2999bL;

    /* renamed from: bM */
    boolean f3000bM;

    /* renamed from: bN */
    boolean f3001bN;

    /* renamed from: bO */
    C0467y f3002bO;

    /* renamed from: bP */
    C0467y f3003bP;

    /* renamed from: bQ */
    boolean f3004bQ;

    /* renamed from: bR */
    float f3005bR;

    /* renamed from: bS */
    boolean f3006bS;

    /* renamed from: bT */
    float f3007bT;

    /* renamed from: bU */
    C0467y f3008bU;

    /* renamed from: bV */
    C0467y f3009bV;

    /* renamed from: bW */
    boolean f3010bW;

    /* renamed from: bX */
    float f3011bX;

    /* renamed from: bY */
    C0467y f3012bY;

    /* renamed from: bZ */
    C0467y f3013bZ;

    /* renamed from: cc */
    public boolean f3014cc;

    /* renamed from: cd */
    public boolean f3015cd;

    /* renamed from: ce */
    public boolean f3016ce;

    /* renamed from: cf */
    public C0424b f3017cf;

    /* renamed from: cg */
    public C0424b f3018cg;

    /* renamed from: ch */
    public C0424b f3019ch;

    /* renamed from: cj */
    public int f3020cj;

    /* renamed from: ck */
    public boolean f3021ck;

    /* renamed from: cl */
    public boolean f3022cl;

    /* renamed from: cp */
    public int f3023cp;

    /* renamed from: cq */
    public float f3024cq;

    /* renamed from: cv */
    public LogicBoolean f3025cv;

    /* renamed from: cw */
    public boolean f3026cw;

    /* renamed from: cx */
    public boolean f3027cx;

    /* renamed from: cy */
    public boolean f3028cy;

    /* renamed from: cz */
    public boolean f3029cz;

    /* renamed from: cA */
    public boolean f3030cA;

    /* renamed from: cB */
    public boolean f3031cB;

    /* renamed from: cC */
    public boolean f3032cC;

    /* renamed from: cD */
    public float f3033cD;

    /* renamed from: cE */
    public int f3034cE;

    /* renamed from: cF */
    public C0449h f3035cF;

    /* renamed from: cH */
    public float f3036cH;

    /* renamed from: cI */
    public float f3037cI;

    /* renamed from: cK */
    public boolean f3038cK;

    /* renamed from: cL */
    public float f3039cL;

    /* renamed from: cM */
    public boolean f3040cM;

    /* renamed from: cN */
    public float f3041cN;

    /* renamed from: cO */
    public float f3042cO;

    /* renamed from: cP */
    public boolean f3043cP;

    /* renamed from: cQ */
    public float f3044cQ;

    /* renamed from: cR */
    public C0385az f3045cR;

    /* renamed from: cS */
    public boolean f3046cS;

    /* renamed from: cT */
    public float f3047cT;

    /* renamed from: cU */
    public int f3048cU;

    /* renamed from: cY */
    public float f3049cY;

    /* renamed from: cZ */
    public float f3050cZ;

    /* renamed from: da */
    public boolean f3051da;

    /* renamed from: db */
    public int f3052db;

    /* renamed from: dc */
    public float f3053dc;

    /* renamed from: dd */
    public int f3054dd;

    /* renamed from: de */
    public int f3055de;

    /* renamed from: df */
    public int f3056df;

    /* renamed from: dg */
    public float f3057dg;

    /* renamed from: dh */
    public float f3058dh;

    /* renamed from: di */
    public Float f3059di;

    /* renamed from: dj */
    public float f3060dj;

    /* renamed from: dk */
    public boolean f3061dk;

    /* renamed from: dl */
    public Float f3062dl;

    /* renamed from: dm */
    public C0409bj f3063dm;

    /* renamed from: dn */
    public C0409bj f3064dn;

    /* renamed from: do */
    public C0409bj f3065do;

    /* renamed from: dt */
    C0441f f3066dt;

    /* renamed from: du */
    C0441f f3067du;

    /* renamed from: dv */
    C0441f f3068dv;

    /* renamed from: dw */
    C0441f f3069dw;

    /* renamed from: dx */
    C0441f f3070dx;

    /* renamed from: dy */
    C0441f f3071dy;

    /* renamed from: dz */
    public boolean f3072dz;

    /* renamed from: dA */
    public boolean f3073dA;

    /* renamed from: dB */
    public boolean f3074dB;

    /* renamed from: dC */
    public boolean f3075dC;

    /* renamed from: dD */
    public C0411bl f3076dD;

    /* renamed from: dE */
    public float f3077dE;

    /* renamed from: dF */
    C0455m f3078dF;

    /* renamed from: dG */
    public float f3079dG;

    /* renamed from: dH */
    public Boolean f3080dH;

    /* renamed from: dI */
    public boolean f3081dI;

    /* renamed from: dJ */
    public float f3082dJ;

    /* renamed from: dK */
    public float f3083dK;

    /* renamed from: dL */
    public float f3084dL;

    /* renamed from: dM */
    public boolean f3085dM;

    /* renamed from: dN */
    public boolean f3086dN;

    /* renamed from: dO */
    public boolean f3087dO;

    /* renamed from: dQ */
    public float f3088dQ;

    /* renamed from: dR */
    public float f3089dR;

    /* renamed from: dV */
    public boolean f3090dV;

    /* renamed from: dW */
    public boolean f3091dW;

    /* renamed from: dX */
    public int f3092dX;

    /* renamed from: dY */
    public float f3093dY;

    /* renamed from: dZ */
    public float f3094dZ;

    /* renamed from: ea */
    public EnumC0307b f3095ea;

    /* renamed from: eb */
    public float f3096eb;

    /* renamed from: ec */
    public float f3097ec;

    /* renamed from: ed */
    public boolean f3098ed;

    /* renamed from: ee */
    public boolean f3099ee;

    /* renamed from: ef */
    public boolean f3100ef;

    /* renamed from: eg */
    public boolean f3101eg;

    /* renamed from: eh */
    public float f3102eh;

    /* renamed from: ei */
    public float f3103ei;

    /* renamed from: ej */
    public float f3104ej;

    /* renamed from: em */
    public float f3105em;

    /* renamed from: en */
    public boolean f3106en;

    /* renamed from: eo */
    public LogicBoolean f3107eo;

    /* renamed from: ep */
    public LogicBoolean f3108ep;

    /* renamed from: eq */
    public LogicBoolean f3109eq;

    /* renamed from: er */
    public LogicBoolean f3110er;

    /* renamed from: es */
    public boolean f3111es;

    /* renamed from: et */
    public C0449h f3112et;

    /* renamed from: eu */
    public C0449h f3113eu;

    /* renamed from: ev */
    public boolean f3114ev;

    /* renamed from: ew */
    public boolean f3115ew;

    /* renamed from: ex */
    public float f3116ex;

    /* renamed from: ey */
    public boolean f3117ey;

    /* renamed from: ez */
    public int f3118ez;

    /* renamed from: eA */
    public boolean f3119eA;

    /* renamed from: eB */
    public boolean f3120eB;

    /* renamed from: eC */
    public boolean f3121eC;

    /* renamed from: eD */
    public boolean f3122eD;

    /* renamed from: eE */
    public float f3123eE;

    /* renamed from: eF */
    public boolean f3124eF;

    /* renamed from: eG */
    public boolean f3125eG;

    /* renamed from: eL */
    public float f3126eL;

    /* renamed from: eM */
    public boolean f3127eM;

    /* renamed from: eN */
    public C0449h f3128eN;

    /* renamed from: eP */
    public boolean f3129eP;

    /* renamed from: eQ */
    public boolean f3130eQ;

    /* renamed from: eR */
    public boolean f3131eR;

    /* renamed from: eS */
    public LogicBoolean f3132eS;

    /* renamed from: eT */
    public LogicBoolean f3133eT;

    /* renamed from: eU */
    public LogicBoolean f3134eU;

    /* renamed from: eV */
    public boolean f3135eV;

    /* renamed from: eW */
    public float f3136eW;

    /* renamed from: fa */
    public LogicBoolean f3137fa;

    /* renamed from: fb */
    public LogicBoolean f3138fb;

    /* renamed from: fd */
    public C0402bc f3139fd;

    /* renamed from: fe */
    public EnumC0246ao f3140fe;

    /* renamed from: ff */
    public EnumC0246ao f3141ff;

    /* renamed from: fg */
    public boolean f3142fg;

    /* renamed from: fh */
    public boolean f3143fh;

    /* renamed from: fi */
    public boolean f3144fi;

    /* renamed from: fj */
    public C0449h f3145fj;

    /* renamed from: fk */
    public int f3146fk;

    /* renamed from: fl */
    public C0449h f3147fl;

    /* renamed from: fm */
    public C0449h f3148fm;

    /* renamed from: fn */
    public boolean f3149fn;

    /* renamed from: fo */
    public boolean f3150fo;

    /* renamed from: fp */
    public boolean f3151fp;

    /* renamed from: fq */
    public boolean f3152fq;

    /* renamed from: fr */
    public boolean f3153fr;

    /* renamed from: fs */
    public boolean f3154fs;

    /* renamed from: ft */
    public C0449h f3155ft;

    /* renamed from: fu */
    public boolean f3156fu;

    /* renamed from: fv */
    public int f3157fv;

    /* renamed from: fw */
    public int f3158fw;

    /* renamed from: fx */
    public float f3159fx;

    /* renamed from: fy */
    public int f3160fy;

    /* renamed from: fz */
    public float f3161fz;

    /* renamed from: fA */
    public float f3162fA;

    /* renamed from: fB */
    public float f3163fB;

    /* renamed from: fC */
    public int f3164fC;

    /* renamed from: fD */
    public int f3165fD;

    /* renamed from: fE */
    public boolean f3166fE;

    /* renamed from: fF */
    public C0449h f3167fF;

    /* renamed from: fG */
    public String f3168fG;

    /* renamed from: fH */
    public boolean f3169fH;

    /* renamed from: fK */
    public boolean f3170fK;

    /* renamed from: fL */
    public boolean f3171fL;

    /* renamed from: fM */
    public C0449h f3172fM;

    /* renamed from: fN */
    public boolean f3173fN;

    /* renamed from: fP */
    public C0405bf[] f3174fP;

    /* renamed from: fV */
    boolean f3175fV;

    /* renamed from: fW */
    C0460r[] f3176fW;

    /* renamed from: fX */
    C0460r[] f3177fX;

    /* renamed from: fY */
    C0460r[] f3178fY;

    /* renamed from: gf */
    public boolean f3179gf;

    /* renamed from: gh */
    String f3180gh;

    /* renamed from: gi */
    String f3181gi;

    /* renamed from: gj */
    HashMap f3182gj;

    /* renamed from: gk */
    C0304at[] f3183gk;

    /* renamed from: go */
    public boolean f3184go;

    /* renamed from: gp */
    public boolean f3185gp;

    /* renamed from: a */
    public static final Rect f3186a = new Rect();

    /* renamed from: c */
    public static final ArrayList f3187c = new ArrayList();

    /* renamed from: d */
    public static ArrayList f3188d = new ArrayList();

    /* renamed from: e */
    public static ArrayList f3189e = null;

    /* renamed from: f */
    public static final HashMap f3190f = new HashMap();

    /* renamed from: g */
    public static ArrayList f3191g = new ArrayList();

    /* renamed from: eY */
    public static LogicBoolean f3192eY = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");

    /* renamed from: eZ */
    public static LogicBoolean f3193eZ = LogicBoolean.create(null, "if not self.isOverLiquid()");

    /* renamed from: gb */
    static final C0382aw[] f3194gb = new C0382aw[0];

    /* renamed from: gc */
    static final C0382aw[] f3195gc = new C0382aw[0];

    /* renamed from: h */
    public final C1101m f3196h = new C1101m();

    /* renamed from: i */
    public final C1101m f3197i = new C1101m();

    /* renamed from: j */
    public final C1101m f3198j = new C1101m();

    /* renamed from: k */
    final C1101m f3199k = new C1101m();

    /* renamed from: l */
    public final C1101m f3200l = new C1101m();

    /* renamed from: m */
    public final C1101m f3201m = new C1101m();

    /* renamed from: n */
    public final C1101m f3202n = new C1101m();

    /* renamed from: o */
    public final C1101m f3203o = new C1101m();

    /* renamed from: p */
    final C1101m f3204p = new C1101m();

    /* renamed from: q */
    public final VariableScope.VariableMapping f3205q = new VariableScope.VariableMapping();

    /* renamed from: z */
    public boolean f3206z = true;

    /* renamed from: F */
    public boolean f3207F = true;

    /* renamed from: M */
    public C1101m f3208M = new C1101m();

    /* renamed from: T */
    public int f3209T = 1;

    /* renamed from: U */
    public int f3210U = Integer.MAX_VALUE;

    /* renamed from: V */
    public int f3211V = -1;

    /* renamed from: W */
    public int f3212W = -1;

    /* renamed from: ac */
    public C0934e f3213ac = null;

    /* renamed from: ad */
    public boolean f3214ad = true;

    /* renamed from: ak */
    public C0934e f3215ak = null;

    /* renamed from: am */
    public C0934e f3216am = null;

    /* renamed from: an */
    public C0934e f3217an = null;

    /* renamed from: ao */
    public C0934e f3218ao = null;

    /* renamed from: aq */
    public C0934e[] f3219aq = new C0934e[10];

    /* renamed from: as */
    public C0934e[] f3220as = null;

    /* renamed from: at */
    public C0934e f3221at = null;

    /* renamed from: au */
    public boolean f3222au = false;

    /* renamed from: aw */
    public C0384ay[] f3223aw = null;

    /* renamed from: ax */
    public boolean f3224ax = false;

    /* renamed from: ay */
    public boolean f3225ay = false;

    /* renamed from: az */
    public final C1101m f3226az = new C1101m();

    /* renamed from: aF */
    public float f3227aF = 1.0f;

    /* renamed from: aW */
    public int f3228aW = -1;

    /* renamed from: aY */
    public int f3229aY = -1;

    /* renamed from: bc */
    public float f3230bc = 1.0f;

    /* renamed from: bA */
    public int f3231bA = -1;

    /* renamed from: bB */
    public int f3232bB = -1;

    /* renamed from: bH */
    public float f3233bH = 1.0f;

    /* renamed from: bI */
    public float f3234bI = 1.0f;

    /* renamed from: ca */
    public float f3235ca = 60.0f;

    /* renamed from: cb */
    public EnumC0461s f3236cb = EnumC0461s.f3340a;

    /* renamed from: ci */
    public float f3237ci = 0.001f;

    /* renamed from: cm */
    public C0424b f3238cm = C0424b.f2710a;

    /* renamed from: cn */
    public C0439f f3239cn = C0439f.f2801a;

    /* renamed from: co */
    public C0439f f3240co = C0439f.f2801a;

    /* renamed from: cr */
    public VariableScope.CachedWriter f3241cr = null;

    /* renamed from: cs */
    public float f3242cs = 1.0f;

    /* renamed from: ct */
    public C0424b f3243ct = C0424b.f2710a;

    /* renamed from: cu */
    public C0424b f3244cu = C0424b.f2710a;

    /* renamed from: cG */
    public int f3245cG = -2;

    /* renamed from: cJ */
    public C0359aq f3246cJ = new C0359aq(true);

    /* renamed from: cV */
    public Rect f3247cV = new Rect();

    /* renamed from: cW */
    public Rect f3248cW = new Rect();

    /* renamed from: cX */
    public Rect f3249cX = new Rect();

    /* renamed from: dp */
    C1101m f3250dp = new C1101m();

    /* renamed from: dq */
    C0441f f3251dq = new C0441f("moving");

    /* renamed from: dr */
    C0441f f3252dr = new C0441f("idle");

    /* renamed from: ds */
    C0441f f3253ds = new C0441f("attack");

    /* renamed from: dP */
    public float f3254dP = 0.0f;

    /* renamed from: dS */
    public float f3255dS = -1.0f;

    /* renamed from: dT */
    public float f3256dT = 0.03f;

    /* renamed from: dU */
    public float f3257dU = 0.06f;

    /* renamed from: ek */
    public int f3258ek = -1;

    /* renamed from: el */
    public int f3259el = -1;

    /* renamed from: eH */
    public boolean f3260eH = false;

    /* renamed from: eI */
    public boolean f3261eI = false;

    /* renamed from: eJ */
    public boolean f3262eJ = false;

    /* renamed from: eK */
    public int f3263eK = 0;

    /* renamed from: eO */
    public C1101m f3264eO = new C1101m();

    /* renamed from: eX */
    public int f3265eX = 1;

    /* renamed from: fc */
    public boolean f3266fc = true;

    /* renamed from: fI */
    public float f3267fI = -1.0f;

    /* renamed from: fJ */
    public C1101m f3268fJ = new C1101m();

    /* renamed from: fO */
    public C0411bl[] f3269fO = null;

    /* renamed from: fQ */
    ArrayList f3270fQ = new ArrayList();

    /* renamed from: fR */
    ArrayList f3271fR = new ArrayList();

    /* renamed from: fS */
    boolean f3272fS = false;

    /* renamed from: fT */
    C0411bl f3273fT = null;

    /* renamed from: fU */
    C1101m f3274fU = new C1101m();

    /* renamed from: fZ */
    ArrayList f3275fZ = new ArrayList();

    /* renamed from: ga */
    ArrayList f3276ga = new ArrayList();

    /* renamed from: gd */
    ArrayList f3277gd = new ArrayList();

    /* renamed from: ge */
    ArrayList f3278ge = new ArrayList();

    /* renamed from: gg */
    int f3279gg = -1;

    /* renamed from: gl */
    C0231z f3280gl = new C0231z(this);

    /* renamed from: gm */
    C1101m f3281gm = new C1101m();

    /* renamed from: gn */
    C1101m f3282gn = new C1101m();

    /* renamed from: gq */
    C1101m f3283gq = new C1101m();

    /* renamed from: b */
    public String m3706b() {
        String str = this.f2914C;
        if (this.f2919I != null) {
            String str2 = this.f2919I.f5433q;
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + this.f2919I.m1691a() + ")";
        }
        return str;
    }

    /* renamed from: a */
    public C0457o m3714a(String str, C0457o c0457o) {
        if (str != null) {
            C0457o c0457o2 = new C0457o(this);
            c0457o2.f3326a = str;
            c0457o2.m3652a();
            return c0457o2;
        } else if (c0457o != null) {
            C0457o c0457o3 = new C0457o(this);
            c0457o3.f3326a = c0457o.f3326a;
            c0457o3.m3652a();
            return c0457o3;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0441f m3722a(EnumC0456n enumC0456n, C0441f c0441f, boolean z) {
        C0441f m3723a = m3723a(enumC0456n);
        if (m3723a != null) {
            if (z && c0441f != null && c0441f.m3984a()) {
                throw new C0412bm("Cannot define animation " + enumC0456n.name() + " on graphics and with onAction at same time");
            }
            return m3723a;
        }
        return c0441f;
    }

    /* renamed from: a */
    public static String m3716a(String str) {
        String trim = str.toLowerCase(Locale.ROOT).trim();
        if (trim.startsWith("arm_")) {
            trim = "arm" + trim.substring("arm_".length());
        }
        if (trim.startsWith("leg_")) {
            trim = "leg" + trim.substring("leg_".length());
        }
        return trim;
    }

    /* renamed from: b */
    public int m3702b(String str) {
        String m3716a = m3716a(str);
        Core.LogDebug2("name:" + m3716a);
        for (int i = 0; i < this.f3223aw.length; i++) {
            Core.LogDebug2("checking:" + this.f3223aw[i].f2273b);
            if (m3716a.equals(this.f3223aw[i].f2273b)) {
                Core.LogDebug2("got");
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0441f m3723a(EnumC0456n enumC0456n) {
        Iterator it = this.f3250dp.iterator();
        while (it.hasNext()) {
            C0441f c0441f = (C0441f) it.next();
            if (c0441f.m3980a(enumC0456n)) {
                return c0441f;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0467y m3713a(String str, C0467y c0467y) {
        if (str == null && c0467y != null) {
            return c0467y;
        }
        C0467y c0467y2 = new C0467y(this, str);
        c0467y2.m3634c();
        return c0467y2;
    }

    /* renamed from: c */
    public C0467y m3697c(String str) {
        return new C0467y(this, str);
    }

    /* renamed from: d */
    public C0382aw m3693d(String str) {
        boolean z = false;
        boolean z2 = false;
        String upperCase = str.toUpperCase();
        if (upperCase.startsWith("CUSTOM:")) {
            str = str.substring("CUSTOM:".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("CUSTOM|")) {
            str = str.substring("CUSTOM|".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("BUILTIN:") || upperCase.startsWith("BUILTIN|")) {
            str = str.substring("BUILTIN:".length()).trim();
            z2 = true;
        }
        if (z) {
            Iterator it = this.f3276ga.iterator();
            while (it.hasNext()) {
                C0382aw c0382aw = (C0382aw) it.next();
                if (str.equalsIgnoreCase(c0382aw.name)) {
                    return c0382aw;
                }
            }
            throw new C0412bm("Failed to find custom effect with the name:" + str);
        } else if (str.contains(":")) {
            throw new C0412bm("Unknown effect format:" + str + " expected built-in effect or CUSTOM:");
        } else {
            if (str.contains("|")) {
                throw new C0412bm("Unknown effect format:" + str + " expected built-in effect or CUSTOM|");
            }
            if (!z2) {
                Iterator it2 = this.f3276ga.iterator();
                while (it2.hasNext()) {
                    C0382aw c0382aw2 = (C0382aw) it2.next();
                    if (str.equalsIgnoreCase(c0382aw2.name)) {
                        return c0382aw2;
                    }
                }
            }
            if ("small".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2262a);
            }
            if ("medium".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2263b);
            }
            if ("large".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2264c);
            }
            if ("smoke".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2265d);
            }
            if ("shockwave".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2266e);
            }
            if ("largeExplosion".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2267f);
            }
            if ("smallExplosion".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2268g);
            }
            if ("resourcePoolSmoke".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2269h);
            }
            if ("none".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2270i);
            }
            throw new C0412bm("Failed to find built-in or custom effect with the name:" + str);
        }
    }

    /* renamed from: C */
    public boolean mo4487C() {
        return this.f3014cc;
    }

    /* renamed from: w */
    public boolean mo4463w() {
        if (this.f3016ce) {
            Core m1087A = Core.m1087A();
            if (m1087A.m1074N() && m1087A.f6122bX.f5603aO.f5662i) {
                return true;
            }
        }
        return this.f3015cd;
    }

    /* renamed from: c */
    public int mo4481c() {
        return this.f3017cf.m4126a();
    }

    /* renamed from: u */
    public C0424b mo4465u() {
        return this.f3017cf;
    }

    /* renamed from: B */
    public C0424b mo4488B() {
        return this.f3019ch;
    }

    /* renamed from: d */
    public C0424b mo4479d(int i) {
        return this.f3017cf;
    }

    /* renamed from: D */
    public float mo4486D() {
        return this.f3237ci;
    }

    /* renamed from: g */
    public int mo4476g() {
        return this.f3020cj;
    }

    /* renamed from: a */
    public AbstractC0244am mo4485a() {
        return m3707a(false, this);
    }

    /* renamed from: a */
    public AbstractC0244am m3708a(boolean z) {
        return m3707a(z, this);
    }

    /* renamed from: e */
    public String mo4478e() {
        if (this.f3279gg != C0820a.f5400c || this.f3180gh == null) {
            this.f3279gg = C0820a.f5400c;
            String m4224b = this.f2945aB != null ? this.f2945aB.m4224b() : this.f2922L;
            String str = this.f2922L;
            if (this.f2947aD != null) {
                str = this.f2947aD;
            }
            this.f3180gh = C0820a.m1734a("units." + str + ".name", m4224b, new Object[0]);
        }
        return this.f3180gh;
    }

    /* renamed from: f */
    public String mo4477f() {
        if (this.f3279gg != C0820a.f5400c || this.f3181gi == null) {
            this.f3279gg = C0820a.f5400c;
            String m4224b = this.f2946aC != null ? this.f2946aC.m4224b() : this.f2922L;
            String str = this.f2922L;
            if (this.f2947aD != null) {
                str = this.f2947aD;
            }
            this.f3181gi = C0820a.m1734a("units." + str + ".description", m4224b, new Object[0]);
        }
        return this.f3181gi;
    }

    /* renamed from: j */
    public boolean mo4473j() {
        return this.f2949aG;
    }

    /* renamed from: k */
    public boolean mo4472k() {
        return this.f2950aH;
    }

    /* renamed from: m */
    public boolean mo4470m() {
        return this.f3150fo;
    }

    /* renamed from: n */
    public boolean mo4469n() {
        return this.f3151fp;
    }

    /* renamed from: l */
    public boolean mo4471l() {
        return this.f3149fn;
    }

    /* renamed from: o */
    public EnumC0246ao mo4468o() {
        return this.f3140fe;
    }

    /* renamed from: p */
    public boolean mo4467p() {
        return this.f2951aI;
    }

    /* renamed from: q */
    public C0402bc mo4466q() {
        return this.f3139fd;
    }

    /* renamed from: a */
    public void m3709a(ArrayList arrayList, int i) {
        if (this.f3263eK != 0 && this.f3131eR) {
            arrayList.add(C0526i.f3644i);
            arrayList.add(C0526i.f3645j);
        }
    }

    /* renamed from: h */
    public void mo4475h() {
        this.f3182gj = null;
        this.f3183gk = new C0304at[3];
        for (int i = 1; i <= 3; i++) {
            C0304at c0304at = new C0304at();
            m3709a(c0304at.f1796a, i);
            this.f3183gk[i - 1] = c0304at;
        }
    }

    /* renamed from: a */
    public ArrayList mo4484a(int i) {
        if (this.f3183gk == null) {
            Core m1087A = Core.m1087A();
            throw new RuntimeException("specialActionLists==null for:" + this.f2922L + " t:" + i + " networked:" + m1087A.m1075M() + " replay:" + m1087A.f6126cb.m2464h() + " sandbox:" + m1087A.f6100bv + " active: " + f3188d.contains(this));
        }
        return this.f3183gk[i - 1].f1796a;
    }

    /* renamed from: r */
    public void m3666r() {
        ArrayList mo4484a = mo4484a(this.f3020cj);
        if (mo4484a.size() > 4) {
            this.f3182gj = new HashMap();
            int size = mo4484a.size();
            for (int i = 0; i < size; i++) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) mo4484a.get(i);
                if (this.f3182gj.get(abstractC0224s.m4910N()) == null) {
                    this.f3182gj.put(abstractC0224s.m4910N(), abstractC0224s);
                }
            }
        }
    }

    /* renamed from: a */
    public AbstractC0224s m3732a(C0208c c0208c) {
        if (this.f3182gj != null) {
            return (AbstractC0224s) this.f3182gj.get(c0208c);
        }
        ArrayList mo4484a = mo4484a(this.f3020cj);
        int size = mo4484a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) mo4484a.get(i);
            if (abstractC0224s.m4893d(c0208c)) {
                return abstractC0224s;
            }
        }
        return null;
    }

    /* renamed from: i */
    public String mo4474i() {
        return this.f2922L;
    }

    /* renamed from: v */
    public String mo4464v() {
        return this.f2922L;
    }

    /* renamed from: b */
    public int mo4482b(int i) {
        return mo4481c();
    }

    /* renamed from: d */
    public C0231z mo4480d() {
        return this.f3280gl;
    }

    /* renamed from: a */
    public C0463u m3712a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        C0463u c0463u = new C0463u();
        c0463u.f3348a = str2;
        c0463u.f3349b = str3;
        c0463u.f3350c = str;
        this.f3204p.add(c0463u);
        return c0463u;
    }

    /* renamed from: b */
    public C0465w m3701b(String str, String str2, String str3) {
        C0465w c0465w = new C0465w();
        c0465w.f3348a = str2;
        c0465w.f3349b = str3;
        c0465w.f3350c = "(known unit:)" + mo4474i();
        c0465w.f3351d = this;
        c0465w.f3352e = true;
        c0465w.f3354g = str;
        this.f3204p.add(c0465w);
        return c0465w;
    }

    /* renamed from: c */
    public C0462t m3696c(String str, String str2, String str3) {
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        C0462t c0462t = new C0462t();
        c0462t.f3346c = str2;
        c0462t.f3347d = str3;
        for (String str4 : C0758f.m2130c(str, ',')) {
            c0462t.f3344a.add(str4.trim());
        }
        this.f3281gm.add(c0462t);
        return c0462t;
    }

    /* renamed from: a */
    public static C0463u m3730a(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            return null;
        }
        C0463u c0463u = new C0463u();
        c0463u.f3348a = "known";
        c0463u.f3351d = interfaceC0303as;
        c0463u.f3352e = true;
        return c0463u;
    }

    /* renamed from: c */
    public static C0453l m3699c(int i) {
        int i2;
        if (i >= 100 && (i2 = i - 100) < f3191g.size()) {
            return (C0453l) f3191g.get(i2);
        }
        return null;
    }

    /* renamed from: s */
    public static ArrayList m3664s() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        Iterator it = f3191g.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    /* renamed from: x */
    public C0449h mo4462x() {
        return this.f2923N;
    }

    /* renamed from: e */
    public C0411bl m3691e(String str) {
        Iterator it = this.f3270fQ.iterator();
        while (it.hasNext()) {
            C0411bl c0411bl = (C0411bl) it.next();
            if (c0411bl.f2543a.equalsIgnoreCase(str)) {
                return c0411bl;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0405bf m3689f(String str) {
        Iterator it = this.f3271fR.iterator();
        while (it.hasNext()) {
            C0405bf c0405bf = (C0405bf) it.next();
            if (c0405bf.f2514bh.equalsIgnoreCase(str)) {
                return c0405bf;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0339d m3687g(String str) {
        Iterator it = this.f3278ge.iterator();
        while (it.hasNext()) {
            C0339d c0339d = (C0339d) it.next();
            if (c0339d.f2049b != null && c0339d.f2049b.equalsIgnoreCase(str)) {
                return c0339d;
            }
        }
        return null;
    }

    /* renamed from: h */
    public AbstractC0224s m3685h(String str) {
        Iterator it = mo4484a(this.f3020cj).iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s instanceof C0342g) {
                C0342g c0342g = (C0342g) abstractC0224s;
                if (c0342g.f2149a.f2049b.equalsIgnoreCase(str)) {
                    return c0342g;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3728a(AbstractC0387a abstractC0387a) {
        if (!this.f3196h.contains(abstractC0387a)) {
            this.f3196h.add(abstractC0387a);
        }
    }

    /* renamed from: b */
    public void m3703b(AbstractC0387a abstractC0387a) {
        if (!this.f3197i.contains(abstractC0387a)) {
            this.f3197i.add(abstractC0387a);
        }
    }

    /* renamed from: a */
    public void m3727a(C0424b c0424b) {
        if (c0424b != null && c0424b.f2699b != 0) {
            if (this.f3185gp) {
                Core.m973g("usesCreditResources:" + c0424b);
            }
            this.f3184go = true;
        }
    }

    /* renamed from: i */
    public C0399m m3683i(String str) {
        Iterator it = this.f3226az.iterator();
        while (it.hasNext()) {
            C0399m c0399m = (C0399m) it.next();
            if (c0399m.m4183b().equalsIgnoreCase(str)) {
                return c0399m;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C0428a m3681j(String str) {
        C0428a m4054a = C0428a.m4054a(str);
        if (m4054a != null) {
            return m4054a;
        }
        return m3679k(str);
    }

    /* renamed from: k */
    public C0428a m3679k(String str) {
        Iterator it = this.f3198j.iterator();
        while (it.hasNext()) {
            C0437d c0437d = (C0437d) it.next();
            if (c0437d.f2772a.equalsIgnoreCase(str)) {
                return c0437d.f2773b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0437d m3726a(C0428a c0428a) {
        Iterator it = this.f3198j.iterator();
        while (it.hasNext()) {
            C0437d c0437d = (C0437d) it.next();
            if (c0437d.f2773b == c0428a) {
                return c0437d;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0416a m3725a(C0448g c0448g) {
        Iterator it = this.f3200l.iterator();
        while (it.hasNext()) {
            C0416a c0416a = (C0416a) it.next();
            if (c0416a.f2671g == c0448g) {
                return c0416a;
            }
        }
        return null;
    }

    /* renamed from: l */
    public C0416a m3677l(String str) {
        Iterator it = this.f3200l.iterator();
        while (it.hasNext()) {
            C0416a c0416a = (C0416a) it.next();
            if (c0416a.f2671g.f2834a.equals(str)) {
                return c0416a;
            }
        }
        return null;
    }

    /* renamed from: y */
    public boolean mo4461y() {
        return this.f3184go;
    }

    /* renamed from: t */
    public String m3662t() {
        if (this.f2919I != null) {
            return this.f2919I.m1691a();
        }
        return null;
    }

    /* renamed from: a */
    public static void m3721a(StreamWriter streamWriter) {
        streamWriter.m1396e("customUnits");
        streamWriter.WriteInteger(1);
        streamWriter.WriteInteger(f3188d.size());
        Iterator it = f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            streamWriter.WriteUTF(c0453l.f2922L);
            streamWriter.WriteInteger(c0453l.f2917G);
            streamWriter.mo1329a(true);
            streamWriter.m1404b(c0453l.m3662t());
            long j = 0;
            if (c0453l.f2919I != null && c0453l.f2919I.f5427k != 0) {
                j = c0453l.f2919I.f5427k;
            }
            streamWriter.m1424a(j);
            streamWriter.m1424a(0L);
        }
        streamWriter.mo1332a("customUnits");
    }

    /* renamed from: a */
    public static void m3729a(C0343aa c0343aa, HashMap hashMap) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!(c0343aa.f2152a == null)) {
            for (C0344ab c0344ab : hashMap.values()) {
                if (c0344ab.f2159b == 0 && c0344ab.f2161d == 0 && c0344ab.f2160c > 0) {
                    arrayList.add(c0344ab);
                } else if (c0344ab.f2160c > 0 || c0344ab.f2161d > 0) {
                    arrayList2.add(c0344ab);
                }
            }
            String str2 = null;
            String str3 = VariableScope.nullOrMissingString;
            if (arrayList.size() > 0) {
                String str4 = VariableScope.nullOrMissingString;
                boolean z = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0344ab c0344ab2 = (C0344ab) it.next();
                    if (z) {
                        z = false;
                    } else {
                        str4 = str4 + ", \n";
                    }
                    str4 = str4 + "'" + c0344ab2.f2158a + "'";
                }
                String m2144b = C0758f.m2144b(str4, 200);
                if (arrayList.size() == 1) {
                    str2 = "Missing 1 mod.";
                    str = "Missing mod: '" + ((C0344ab) arrayList.get(0)).f2158a + "'";
                } else {
                    str2 = "Missing " + arrayList.size() + " mods";
                    str = "missing mods: " + m2144b;
                }
                str3 = str + "\n Required by this server.";
                if (arrayList2.size() > 0) {
                    str3 = str3 + "\n and " + arrayList2.size() + " mods are different.";
                }
            } else if (arrayList2.size() > 0) {
                String str5 = VariableScope.nullOrMissingString;
                boolean z2 = true;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0344ab c0344ab3 = (C0344ab) it2.next();
                    if (z2) {
                        z2 = false;
                    } else {
                        str5 = str5 + ", \n";
                    }
                    str5 = str5 + "'" + c0344ab3.f2158a + "'";
                }
                str2 = "Different mod data.";
                str3 = "Different mod data for: " + C0758f.m2144b(str5, 200) + " \n Check these mods are the same version as the server you are connecting to.";
            } else {
                Core.LogDebug2("Skipping nice message: completelyMissedMods:" + arrayList.size() + " differentMods:" + arrayList2.size());
            }
            if (str2 != null) {
                C0401bb c0401bb = new C0401bb(str3, VariableScope.nullOrMissingString);
                c0401bb.f2488a = str2;
                throw c0401bb;
            }
        }
        String str6 = "from internal units";
        if (c0343aa.f2152a != null) {
            str6 = "from mod:'" + c0343aa.f2152a + "'";
        }
        C0824b m1703e = Core.m1087A().f6124bZ.m1703e(c0343aa.f2152a);
        if (m1703e != null) {
            if (!m1703e.m1673m()) {
                str6 = str6 + " (You seem to have this mod but it is not enabled)";
            } else {
                str6 = str6 + " (You seem to have this mod but it might be a different version)";
            }
        }
        if (c0343aa.f2155d == -1) {
            throw new C0401bb("The server requires the unit:" + c0343aa.f2153b + " that was not found " + str6, VariableScope.nullOrMissingString);
        }
        throw new C0401bb("Found unit:" + c0343aa.f2153b + " but it does not match the server's copy " + str6, "checksum c:" + c0343aa.f2155d + " s:" + c0343aa.f2154c);
    }

    /* renamed from: a */
    public static void m3720a(Reader reader) {
        reader.m1307b("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (reader.ReadInt() >= 2) {
                z = reader.ReadBool();
                reader.ReadBool();
            }
            int ReadInt = reader.ReadInt();
            for (int i = 0; i < ReadInt; i++) {
                String ReadUTF = reader.ReadUTF();
                int ReadInt2 = reader.ReadInt();
                reader.ReadBool();
                String ReadString = reader.ReadString();
                reader.m1298i();
                reader.m1298i();
                String str = null;
                if (z) {
                    str = reader.ReadString();
                }
                C0453l c0453l = null;
                int i2 = -1;
                C0453l c0453l2 = null;
                synchronized (f3187c) {
                    Iterator it = f3187c.iterator();
                    while (it.hasNext()) {
                        C0453l c0453l3 = (C0453l) it.next();
                        if (ReadUTF.equals(c0453l3.f2922L)) {
                            if (ReadInt2 == c0453l3.f2917G) {
                                c0453l = c0453l3;
                            } else {
                                c0453l2 = c0453l3;
                                i2 = c0453l3.f2917G;
                            }
                        }
                    }
                }
                C0344ab c0344ab = (C0344ab) hashMap.get(ReadString);
                if (c0344ab == null) {
                    c0344ab = new C0344ab(ReadString);
                    hashMap.put(ReadString, c0344ab);
                }
                if (c0453l == null) {
                    if (c0453l2 != null) {
                        c0344ab.f2161d++;
                    } else {
                        c0344ab.f2160c++;
                    }
                    C0343aa c0343aa = new C0343aa();
                    c0343aa.f2152a = ReadString;
                    c0343aa.f2153b = ReadUTF;
                    c0343aa.f2155d = i2;
                    c0343aa.f2154c = ReadInt2;
                    c0343aa.f2157f = c0453l2;
                    c0343aa.f2156e = str;
                    arrayList2.add(c0343aa);
                    Core.m998b(c0343aa.m4321a());
                } else {
                    c0344ab.f2159b++;
                    arrayList.add(c0453l);
                }
            }
            if (arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0343aa c0343aa2 = (C0343aa) it2.next();
                    if (c0343aa2.f2152a == null) {
                        m3729a(c0343aa2, hashMap);
                    }
                }
                m3729a((C0343aa) arrayList2.get(0), hashMap);
            }
            f3189e = arrayList;
            reader.m1303d("customUnits");
        } catch (Throwable th) {
            reader.m1303d("customUnits");
            throw th;
        }
    }

    /* renamed from: b */
    public void m3704b(InterfaceC0303as interfaceC0303as) {
        if (!this.f3268fJ.contains(interfaceC0303as) && interfaceC0303as != this) {
            this.f3268fJ.add(interfaceC0303as);
        }
        if (interfaceC0303as instanceof C0453l) {
            Iterator it = ((C0453l) interfaceC0303as).f3268fJ.iterator();
            while (it.hasNext()) {
                InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
                if (!this.f3268fJ.contains(interfaceC0303as2) && interfaceC0303as != this) {
                    this.f3268fJ.add(interfaceC0303as2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0453l m3724a(C0453l c0453l) {
        Iterator it = f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l2 = (C0453l) it.next();
            if (c0453l.f2914C.equals(c0453l2.f2914C)) {
                return c0453l2;
            }
        }
        Iterator it2 = f3188d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l3 = (C0453l) it2.next();
            if (c0453l.f2922L.equals(c0453l3.f2922L)) {
                return c0453l3;
            }
        }
        return null;
    }

    /* renamed from: A */
    public static void m3739A() {
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof C0451j) {
                C0451j c0451j = (C0451j) abstractC0244am;
                C0453l c0453l = c0451j.f2863x;
                if (!f3188d.contains(c0453l)) {
                    C0453l m3724a = m3724a(c0453l);
                    if (m3724a == null) {
                        m3724a = f2903b;
                    }
                    if (m3724a != null) {
                        c0451j.m3902a(m3724a, false, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C0934e[] m3719a(C0934e c0934e, EnumC0198o enumC0198o) {
        boolean z = false;
        if ((this.f2919I != null || this.f3121eC) && !Core.m1087A().settingEngine.disableModLazyLoad) {
            z = true;
        }
        if ((this.f3026cw && this.f3027cx) || this.f3032cC) {
            z = true;
        }
        C0934e[] m5080a = AbstractC0197n.m5080a(c0934e, enumC0198o, z);
        for (int i = 0; i < m5080a.length; i++) {
            if (z && this.f2919I != null && this.f3121eC && i == 1) {
                m5080a[i].mo383w();
            }
        }
        C0348af.m4288a(m5080a);
        return m5080a;
    }

    /* renamed from: a */
    public C0934e m3718a(C1072ab c1072ab, String str, String str2) {
        return m3717a(c1072ab, str, str2, this.f2932aa);
    }

    /* renamed from: a */
    public C0934e m3717a(C1072ab c1072ab, String str, String str2, boolean z) {
        return m3711a(this.f2916E, c1072ab.m656b(str, str2, (String) null), z, str, str2);
    }

    /* renamed from: a */
    public C0934e m3711a(String str, String str2, boolean z, String str3, String str4) {
        return C0348af.m4291a(str, str2, z, this, str3, str4);
    }

    /* renamed from: m */
    public static InterfaceC0303as m3675m(String str) {
        for (InterfaceC0303as interfaceC0303as : f3190f.keySet()) {
            if (interfaceC0303as.mo4474i().equals(str)) {
                return (InterfaceC0303as) f3190f.get(interfaceC0303as);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static InterfaceC0303as m3698c(InterfaceC0303as interfaceC0303as) {
        return (InterfaceC0303as) f3190f.get(interfaceC0303as);
    }

    /* renamed from: n */
    public static C0453l m3673n(String str) {
        Iterator it = f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            if (str.equals(c0453l.f2922L)) {
                return c0453l;
            }
        }
        Iterator it2 = f3188d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l2 = (C0453l) it2.next();
            if (c0453l2.f3208M.contains(str)) {
                return c0453l2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0451j m3707a(boolean z, C0453l c0453l) {
        return new C0451j(z, c0453l);
    }

    /* renamed from: o */
    public void m3671o(String str) {
        if (C1077ag.m589i(str)) {
            return;
        }
        this.f3199k.add(new C0468z(str));
    }

    /* renamed from: p */
    public void m3669p(String str) {
        C0348af.m4298a(mo4474i(), new C0412bm(str), this);
    }

    /* renamed from: q */
    public void m3667q(String str) {
        String str2 = "Warning (on " + m3706b() + "): " + str;
        Core.m998b(str2);
        this.f3283gq.add(str);
        if (this.f2919I == null) {
            Core.m1087A().m1045a(str2, 1);
            if (Core.f6204aT) {
                Core.LogDebug2("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
        }
    }

    /* renamed from: r */
    public void m3665r(String str) {
        String str2 = "Warning (on " + m3706b() + "): " + str;
        Core.m998b(str2);
        this.f3283gq.add(str);
        if (this.f2919I == null) {
            Core.m1087A().m1045a(str2, 1);
            if (Core.f6204aT) {
                Core.LogDebug2("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
            return;
        }
        this.f2919I.m1685b(str2);
    }

    /* renamed from: z */
    public C0934e mo4460z() {
        return this.f2943av;
    }

    /* renamed from: E */
    public static void m3735E() {
        Core m1087A = Core.m1087A();
        Iterator it = f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            EnumC0345ac enumC0345ac = c0453l.f2928S;
            if (enumC0345ac != null) {
                if (enumC0345ac == EnumC0345ac.f2162a || enumC0345ac == EnumC0345ac.f2163b) {
                    Iterator it2 = m1087A.f6110bL.f838A.iterator();
                    while (it2.hasNext()) {
                        Point point = (Point) it2.next();
                        AbstractC0244am mo4485a = c0453l.mo4485a();
                        mo4485a.m4768b(AbstractC0197n.f1371i);
                        m1087A.f6110bL.m5340a(point.f224a, point.f225b);
                        mo4485a.f6958el = m1087A.f6110bL.f801T;
                        mo4485a.f6959em = m1087A.f6110bL.f802U;
                        mo4485a.f6958el += mo4485a.m4710cX();
                        mo4485a.f6959em += mo4485a.m4709cY();
                        if (enumC0345ac == EnumC0345ac.f2162a && (mo4485a instanceof AbstractC0623y) && ((AbstractC0623y) mo4485a).m2974a((AbstractC0244am) null, (AbstractC0197n) null)) {
                            mo4485a.m4700ch();
                        } else {
                            AbstractC0197n.m5053c(mo4485a);
                        }
                    }
                } else if (enumC0345ac == EnumC0345ac.f2164c || enumC0345ac == EnumC0345ac.f2165d) {
                    if (enumC0345ac == EnumC0345ac.f2164c) {
                        AbstractC0244am mo4485a2 = c0453l.mo4485a();
                        mo4485a2.m4768b(AbstractC0197n.f1371i);
                        m1087A.f6110bL.m5309b(m1087A.f6110bL.m5281i() / 2.0f, m1087A.f6110bL.m5280j() / 2.0f);
                        mo4485a2.f6958el = m1087A.f6110bL.f801T;
                        mo4485a2.f6959em = m1087A.f6110bL.f802U;
                        mo4485a2.f6958el += mo4485a2.m4710cX();
                        mo4485a2.f6959em += mo4485a2.m4709cY();
                        AbstractC0197n.m5053c(mo4485a2);
                    }
                    if (enumC0345ac == EnumC0345ac.f2165d) {
                        Iterator it3 = AbstractC0197n.m5058c().iterator();
                        while (it3.hasNext()) {
                            AbstractC0197n abstractC0197n = (AbstractC0197n) it3.next();
                            if (abstractC0197n.m5075a(true, false) > 0) {
                                AbstractC0244am mo4485a3 = c0453l.mo4485a();
                                mo4485a3.m4768b(abstractC0197n);
                                m1087A.f6110bL.m5309b(m1087A.f6110bL.m5281i() / 2.0f, m1087A.f6110bL.m5280j() / 2.0f);
                                mo4485a3.f6958el = m1087A.f6110bL.f801T;
                                mo4485a3.f6959em = m1087A.f6110bL.f802U;
                                mo4485a3.f6958el += mo4485a3.m4710cX();
                                mo4485a3.f6959em += mo4485a3.m4709cY();
                                AbstractC0197n.m5053c(mo4485a3);
                            }
                        }
                    }
                } else if (enumC0345ac == EnumC0345ac.f2166e) {
                    Iterator it4 = AbstractC0197n.m5058c().iterator();
                    while (it4.hasNext()) {
                        AbstractC0197n abstractC0197n2 = (AbstractC0197n) it4.next();
                        if (abstractC0197n2.m5075a(true, false) > 0) {
                            PointF pointF = new PointF();
                            C1117y.m472a(abstractC0197n2, pointF);
                            AbstractC0244am mo4485a4 = c0453l.mo4485a();
                            mo4485a4.m4768b(abstractC0197n2);
                            m1087A.f6110bL.m5309b(pointF.f227a, pointF.f228b);
                            mo4485a4.f6958el = m1087A.f6110bL.f801T;
                            mo4485a4.f6959em = m1087A.f6110bL.f802U;
                            mo4485a4.f6958el += mo4485a4.m4710cX();
                            mo4485a4.f6959em += mo4485a4.m4709cY();
                            AbstractC0197n.m5053c(mo4485a4);
                        }
                    }
                } else {
                    Core.m998b("onNewMapSpawn unhandled: " + c0453l.f2928S);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo4483a(AbstractC0244am abstractC0244am) {
        int i = 0;
        if (this.f2953aK > 0.0f) {
            return (int) this.f2953aK;
        }
        if (this.f2951aI && this.f2949aG && abstractC0244am.mo3161y() < 20) {
            i = 0 + 17;
        }
        return i;
    }

    /* renamed from: a */
    public void m3715a(String str, int i, String str2, String str3) {
        if (this.f2919I == null || this.f2919I.f5439w >= i) {
            return;
        }
        if (this.f2919I.f5438v == null) {
            throw new C0412bm("[" + str2 + "] minVersion of " + str + " is required to be set in mod-info.txt at the root of this mod to use " + str3);
        }
        try {
            C0823a.m1716a(str, this.f2919I.f5438v);
            this.f2919I.f5439w = i;
        } catch (C0412bm e) {
            throw new C0412bm("[" + str2 + "]" + str3 + " " + e.getMessage() + " to be set as minVersion in mod-info.txt");
        }
    }

    /* renamed from: s */
    public static InterfaceC0303as m3663s(String str) {
        return m3710a(str, true);
    }

    /* renamed from: a */
    public static InterfaceC0303as m3710a(String str, boolean z) {
        InterfaceC0303as m4619a = EnumC0249ar.m4619a(str, z);
        if (m4619a == EnumC0249ar.f1785Y) {
            return EnumC0249ar.f1742h;
        }
        return m4619a;
    }
}
