package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/c.class */
public class C0074c extends AbstractC0083l {
    /* renamed from: a */
    public void m4854a() {
        AbstractC0916l.m963e("Logic boolean tests");
        C0453l c0453l = C0453l.f2904b;
        m4852a(c0453l, "number numA");
        m4852a(c0453l, "number numB");
        AbstractC0244am m3426a = C0453l.m3426a(false, c0453l);
        AbstractC0623y m3426a2 = C0453l.m3426a(false, c0453l);
        m3426a2.mo2819b(AbstractC0197n.f1314i);
        AbstractC0623y m3426a3 = C0453l.m3426a(false, c0453l);
        m3426a3.mo2819b(AbstractC0197n.f1314i);
        m3426a3.f1632cs = 44.0f;
        m4853a(m3426a3, "numA=5");
        m4853a(m3426a3, "numB=7");
        C0451j m3426a4 = C0453l.m3426a(false, c0453l);
        m3426a4.mo2819b(AbstractC0197n.f1314i);
        m3426a4.f6958el = 10.0f;
        m3426a4.f1632cs = 55.0f;
        m3426a4.f1633ct = 500.0f;
        m3426a3.f1580bt = m3426a4;
        m4853a(m3426a4, "numA=309");
        m4853a(m3426a4, "numB=409");
        C0451j m3426a5 = C0453l.m3426a(false, c0453l);
        m3426a5.mo2819b(AbstractC0197n.f1314i);
        m3426a5.f6959em = 5.0f;
        m3426a5.f1632cs = 66.0f;
        m3426a5.f1633ct = 1000.0f;
        m3426a4.f1581bu = m3426a5;
        C0451j m3426a6 = C0453l.m3426a(false, c0453l);
        m3426a6.mo2819b(AbstractC0197n.f1314i);
        m3426a6.f6958el = 2.0f;
        m4853a(m3426a6, "numA=99");
        m4853a(m3426a6, "numB=88");
        C0451j m3426a7 = C0453l.m3426a(false, c0453l);
        m3426a7.mo2819b(AbstractC0197n.f1314i);
        m3426a7.f6958el = 3.0f;
        m4853a(m3426a7, "numA=239");
        m4853a(m3426a7, "numB=268");
        C0451j m3426a8 = C0453l.m3426a(false, c0453l);
        m3426a8.mo2819b(AbstractC0197n.f1314i);
        m3426a8.f6958el = 3.0f;
        m3426a6.m3556C(m3426a7);
        m3426a6.m3556C(m3426a8);
        C0451j m3426a9 = C0453l.m3426a(false, c0453l);
        m3426a9.mo2819b(AbstractC0197n.f1314i);
        m3426a9.m3532a(C0448g.m3569a("globalTag1, globalTag2"), false);
        m3426a9.f6958el = 2.0f;
        AbstractC0916l.m963e("=== logic boolean tests == (runs:50)");
        Long valueOf = Long.valueOf(C0727bl.m2370a());
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
            }
            m4844b(m3426a3, m4843b("true"));
            m4841c(m3426a3, m4843b("false"));
            m4844b(m3426a3, m4843b("not false"));
            m4844b(m3426a3, m4843b("not not true"));
            m4850a(m3426a3, m4843b("5"), 5.0f);
            m4850a(m3426a3, m4843b("5+5"), 10.0f);
            m4850a(m3426a3, m4843b("1+2+3"), 6.0f);
            m4850a(m3426a3, m4843b("2.5+2.5"), 5.0f);
            m4850a(m3426a3, m4843b("10-2"), 8.0f);
            m4850a(m3426a3, m4843b("((5+5)-2)*3"), 24.0f);
            m4850a(m3426a3, m4843b("10/2+10*2"), 25.0f);
            m4850a(m3426a3, m4843b("-5"), -5.0f);
            m4850a(m3426a3, m4843b("--5"), 5.0f);
            m4850a(m3426a3, m4843b("9--5"), 14.0f);
            m4850a(m3426a3, m4843b("-9--5"), -4.0f);
            m4850a(m3426a3, m4843b("+5"), 5.0f);
            m4850a(m3426a3, m4843b("+ 5"), 5.0f);
            m4850a(m3426a3, m4843b(" + 5"), 5.0f);
            m4850a(m3426a3, m4843b(" ++ 5"), 5.0f);
            m4850a(m3426a3, m4843b("-+5"), -5.0f);
            m4850a(m3426a3, m4843b("--+5"), 5.0f);
            m4850a(m3426a3, m4843b("++-5"), -5.0f);
            m4850a(m3426a3, m4843b(" - - +5"), 5.0f);
            m4850a(m3426a3, m4843b("9++5"), 14.0f);
            m4847a("5 - ");
            m4847a("5 -- ");
            m4847a("5 + ");
            m4847a("5 ++ ");
            m4847a("5 ** 9 ");
            m4847a("5 -/ 9 ");
            m4847a("5 * 5 -");
            m4847a(" - ");
            m4847a(" -- ");
            m4847a(" + ");
            m4847a(" ++ ");
            m4848a(m3426a3, m4843b(" 'hello'"), "hello");
            m4848a(m3426a3, m4843b(" \"hello\" "), "hello");
            m4850a(m3426a3, m4843b("self.hp+1"), m3426a3.f1632cs + 1.0f);
            m4850a(m3426a3, m4843b("self.x+1"), m3426a3.f6958el + 1.0f);
            m4850a(m3426a3, m4843b("self.y+1"), m3426a3.f6959em + 1.0f);
            m4850a(m3426a3, m4843b("self.z+1"), m3426a3.f6960en + 1.0f);
            m4850a(m3426a3, m4843b("int( 5.5+0.1 )"), 5.0f);
            m4850a(m3426a3, m4843b("-5 * 5"), -25.0f);
            m4850a(m3426a3, m4843b("-5 * self.hp"), (-5.0f) * m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("self.hp + -5"), m3426a3.f1632cs - 5.0f);
            m4850a(m3426a3, m4843b("self.hp * -5"), (-5.0f) * m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("(self.hp ) * -5 "), (-5.0f) * m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("-self.hp * -5"), (-5.0f) * (-m3426a3.f1632cs));
            m4850a(m3426a3, m4843b("-(self.hp ) * -5 "), (-5.0f) * (-m3426a3.f1632cs));
            m4850a(m3426a3, m4843b("-5 * -self.hp"), (-5.0f) * (-m3426a3.f1632cs));
            m4850a(m3426a3, m4843b("(-5 * -self.hp)/2"), ((-5.0f) * (-m3426a3.f1632cs)) / 2.0f);
            m4850a(m3426a3, m4843b("-(self.hp )"), -m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("--(self.hp )"), m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("-((self.hp ))"), -m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("-self.hp"), -m3426a3.f1632cs);
            m4850a(m3426a3, m4843b("-0"), 0.0f);
            m4850a(m3426a3, m4843b("-  1"), -1.0f);
            m4850a(m3426a3, m4843b(" -  1"), -1.0f);
            m4850a(m3426a3, m4843b("-0*-0"), 0.0f);
            m4850a(m3426a3, m4843b("-2*2"), -4.0f);
            m4850a(m3426a3, m4843b("-2-3-2"), -7.0f);
            m4841c(m3426a3, m4843b("10>10"));
            m4841c(m3426a3, m4843b("10<10"));
            m4844b(m3426a3, m4843b("10>=10"));
            m4844b(m3426a3, m4843b("10<=10"));
            m4844b(m3426a3, m4843b("'hello'=='hello'"));
            m4844b(m3426a3, m4843b("'hello'!='bye'"));
            m4847a("'hello'<'bye'");
            m4847a("'hello'>'bye'");
            m4847a("'hello'<='bye'");
            m4847a("'hello'>='bye'");
            m4847a("'hello'55'bye'");
            m4847a("'hello'><'bye'");
            m4847a("6><8");
            m4841c(m3426a3, m4843b("not (10>5 and true)"));
            m4841c(m3426a3, m4843b("not true and false"));
            m4844b(m3426a3, m4843b("not false and true"));
            m4844b(m3426a3, m4843b("not (false and true)"));
            m4841c(m3426a3, m4843b("not (1>2 or 5>2)"));
            m4844b(m3426a3, m4843b("(true and (false or true))"));
            m4844b(m3426a3, m4843b(" true and   (false   or   true  )"));
            m4844b(m3426a3, m4843b("true and((false)or(true) )"));
            m4844b(m3426a3, m4843b("100>50+20"));
            m4844b(m3426a3, m4843b("100>50*1.5"));
            m4844b(m3426a3, m4843b("not (100<50*1.5)"));
            m4844b(m3426a3, m4843b("5 < 10 < 15"));
            m4844b(m3426a3, m4843b("false==false"));
            m4844b(m3426a3, m4843b("true==true"));
            m4844b(m3426a3, m4843b("false==false==false"));
            m4844b(m3426a3, m4843b("true==true==true"));
            m4844b(m3426a3, m4843b("false!=true!=false"));
            m4844b(m3426a3, m4843b("true!=false!=true"));
            m4841c(m3426a3, m4843b("'test'==null"));
            m4844b(m3426a3, m4843b("'test'!=null"));
            m4841c(m3426a3, m4843b("'test'==null==null"));
            m4844b(m3426a3, m4843b("'test'!=null!='test2'"));
            m4844b(m3426a3, m4843b("self!=null"));
            m4841c(m3426a3, m4843b("self==null"));
            m4844b(m3426a3, m4843b("10==10"));
            m4844b(m3426a3, m4843b("10.5==10.5"));
            m4844b(m3426a3, m4843b("1/3==1/3"));
            m4841c(m3426a3, m4843b("10!=10"));
            m4844b(m3426a3, m4843b("10!=5"));
            m4847a("true - true");
            m4847a("true + true");
            m4847a("true * true");
            m4847a("true / true");
            m4847a("true < 10");
            m4847a("true == 10");
            m4847a("true != 10");
            m4847a("'text' == 10");
            m4847a("10 == ");
            m4847a("10 != ");
            m4847a("10 > ");
            m4847a("10 < ");
            m4847a("10 >= ");
            m4847a("10 <= ");
            m4847a("10 ==");
            m4847a("10 !=");
            m4847a("10 >");
            m4847a("10 <");
            m4847a("10 >=");
            m4847a("10 <=");
            m4847a("==10");
            m4847a("!=10");
            m4847a(">10");
            m4847a("<10");
            m4847a(">=10");
            m4847a("<=10");
            m4847a("10.6.6");
            m4848a(m3426a3, m4843b("select(true, 'A','B')"), "A");
            m4848a(m3426a3, m4843b("select(false, 'A','B')"), "B");
            m4848a(m3426a3, m4843b("str(5.5)"), "5.5");
            m4848a(m3426a3, m4843b("str(5)"), "5");
            m4848a(m3426a3, m4843b("lowercase('HELlo')"), "hello");
            m4848a(m3426a3, m4843b("uppercase('heLLo')"), "HELLO");
            m4848a(m3426a3, m4843b("lowercase(str('HELlo'))"), "hello");
            m4844b(m3426a3, m4843b("self.hp(lessThan=9999)"));
            m4847a("self.hp(lessThan=9999, lessThan=9998)");
            m4847a("self..hp(lessThan=9999)");
            m4847a("self...hp(lessThan=9999)");
            m4843b("game.nukesEnabled()");
            m4847a("game.nukesEnabled(nukesEnabled=true)");
            m4847a("game.nukesEnabled(nukesEnabled=false)");
            m4847a("game.nukesEnabled()==0");
            m4847a("game.nukesEnabled()!=0");
            m4847a("game.nukesEnabled()<0");
            m4847a("game.nukesEnabled()>0");
            m4847a("game.nukesEnabled()=='true'");
            m4847a("game.nukesEnabled()!='true'");
            m4847a("self.nukesEnabled()");
            m4847a("parent.nukesEnabled()");
            m4847a("hp==44");
            m4847a("5=44");
            if (m3426a3 == AbstractC0197n.f1314i.f1324r) {
                AbstractC0916l.m963e("skipping for placeholderTeamUnit");
            } else {
                m4844b(m3426a3, m4843b("self.hp==44"));
                m4844b(m3426a3, m4843b("self.customTarget1.hp==55"));
                m4847a("self.memory1.hp=55");
                m4844b(m3426a3, m4843b("self.customTarget1.maxhp==500"));
                m4844b(m3426a3, m4843b("customTarget1.hp==55"));
                m4844b(m3426a3, m4843b("self.customTarget1.customTarget2.hp==66"));
                m4844b(m3426a3, m4843b("self.customTarget1==self.customTarget1"));
                m4844b(m3426a3, m4843b("self.customTarget1!=self"));
                m4844b(m3426a2, m4843b("self.customTarget1==null"));
                m4844b(m3426a2, m4843b("self.customTarget1!=self"));
                m4844b(m3426a2, m4843b("self.parent==null"));
                m4844b(m3426a2, m4843b("self.parent.customTarget1==null"));
                m4844b(m3426a2, m4843b("self.parent.customTarget1==self.parent"));
                m4844b(m3426a2, m4843b("self.parent.customTarget1!=self"));
            }
            m4850a(m3426a3, m4843b("self.getOffsetAbsolute(y=10).y"), m3426a3.f6959em + 10.0f);
            m4844b(m3426a3, m4843b("self.getOffsetAbsolute(y=10).y==self.y+10"));
            m4844b(m3426a3, m4843b("self.getOffsetRelative(y=10, height=5).height==self.height+5"));
            m4850a(m3426a3, m4843b("self.getOffsetRelative(y=10, height=5).height"), m3426a3.f6960en + 5.0f);
            m4850a(m3426a3, m4843b("self.getOffsetAbsolute(y=10).getOffsetAbsolute(y=10).y"), m3426a3.f6959em + 10.0f + 10.0f);
            m4850a(m3426a6, m4843b("self.transporting().getOffsetAbsolute(x=5).x"), m3426a7.f6958el + 5.0f);
            m4850a(m3426a6, m4843b("self.transporting(slot=1).getOffsetAbsolute(x=5).x"), m3426a8.f6958el + 5.0f);
            m4850a(m3426a6, m4843b("self.transporting().parent.transporting().parent.id"), (float) m3426a6.f6951ee);
            m4850a(m3426a6, m4843b("self.transporting().getOffsetAbsolute(x=memory.numA).x-memory.numA"), m3426a7.f6958el);
            m4850a(m3426a6, m4843b("self.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m3426a7.f6958el);
            m4850a(m3426a6, m4843b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m3426a7.f6958el);
            m4850a(m3426a6, m4843b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute().x-self.id"), m3426a7.f6958el);
            m4850a(m3426a6, m4843b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute(x=self.id+1).x"), m3426a7.f6958el + ((float) m3426a6.f6951ee) + ((float) m3426a6.f6951ee) + 1.0f);
            m4844b(m3426a3, m4843b("numberOfUnitsInTeam(greaterThan=-2)"));
            m4844b(m3426a3, m4843b("NumberOfUnitsInTeam(greaterTHAN=-2)"));
            m4851a(m3426a3, m4843b("self.noUnitInTeam()"));
            m4851a(m3426a3, m4843b("self.hasUnitInTeam()"));
            m4851a(m3426a3, m4843b("self.hasUnitInTeam(neutralTeam=true)"));
            m4851a(m3426a3, m4843b("self.shield()+self.ammo()+self.hp()>-1"));
            m4851a(m3426a3, m4843b("parent.shield()+parent.ammo()+parent.hp()>-1"));
            m4848a(m3426a3, m4843b("'hello'+'a'"), "helloa");
            m4848a(m3426a3, m4843b("'hello'+5"), "hello5");
            m4848a(m3426a3, m4843b("substring('hello',0,3)"), "hel");
            m4848a(m3426a3, m4843b("substring('hello',0,100)"), "hello");
            m4848a(m3426a3, m4843b("substring('HEllo',0,100)"), "HEllo");
            m4848a(m3426a3, m4843b("'HEllo'"), "HEllo");
            m4848a(m3426a3, m4843b("substring('aa',0,2)+substring('bb',0,2)"), "aabb");
            m4844b(m3426a3, m4843b(" true AND true"));
            m4844b(m3426a3, m4843b(" true aNd true"));
            m4844b(m3426a3, m4843b(" true OR false"));
            m4844b(m3426a3, m4843b(" true OR TRUE"));
            m4844b(m3426a3, m4843b(" True OR  False "));
            m4844b(m3426a3, m4843b(" True OR  (False) "));
            m4844b(m3426a3, m4843b(" NOT FALSE "));
            m4844b(m3426a3, m4843b(" NOT NOT NOT FALSE "));
            m4844b(m3426a3, m4843b(" game.nukesEnabled "));
            m4844b(m3426a3, m4843b(" GAME.NukesEnabled "));
            m4850a(m3426a3, m4843b("squareRoot( 100 )"), 10.0f);
            m4850a(m3426a3, m4843b("max(+1,2)"), 2.0f);
            m4850a(m3426a3, m4843b("min(+1,2)"), 1.0f);
            m4850a(m3426a3, m4843b("max(1,2)"), 2.0f);
            m4850a(m3426a3, m4843b("min(1,2)"), 1.0f);
            m4850a(m3426a3, m4843b("max( 1,2 )"), 2.0f);
            m4850a(m3426a3, m4843b("min( 1,2 )"), 1.0f);
            m4850a(m3426a3, m4843b("max(-1,2)"), 2.0f);
            m4850a(m3426a3, m4843b("min(-1,2)"), -1.0f);
            m4850a(m3426a3, m4843b("max( -1,2 )"), 2.0f);
            m4850a(m3426a3, m4843b("min( -1,2 )"), -1.0f);
            m4850a(m3426a3, m4843b("max( 3,1 )"), 3.0f);
            m4850a(m3426a3, m4843b("min( 3,1 )"), 1.0f);
            m4850a(m3426a3, m4843b("max( 3+3,4 )"), 6.0f);
            m4850a(m3426a3, m4843b("min( 3+3,4 )"), 4.0f);
            m4850a(m3426a3, m4843b("distanceSquared( 1,1,1,6 )"), 25.0f);
            m4850a(m3426a3, m4843b("max(distanceSquared( 1,1,1,6 ), 4)"), 25.0f);
            m4850a(m3426a3, m4843b("min(  distanceSquared( 1,1,1 , 6 )  , 4)"), 4.0f);
            m4844b(m3426a3, m4843b("distanceSquared( 1,1,1,6 )>=5*5"));
            m4844b(m3426a3, m4843b("distanceSquared( 1,1,1,6 )>4*5"));
            m4844b(m3426a3, m4843b("distanceSquared( 1,1,6,1 )<6*5"));
            m4844b(m3426a3, m4843b("distance( 0,0,5,0 )==5"));
            m4844b(m3426a3, m4843b("distance( 0,1,0,6 )==5"));
            m4849a(m3426a3, m4843b("customTarget1"), m3426a4);
            m4849a(m3426a3, m4843b("customTarget1.self"), m3426a4);
            m4849a(m3426a3, m4843b("self.customTarget1.self"), m3426a4);
            m4849a(m3426a3, m4843b("customTarget1.customTarget2"), m3426a4.f1581bu);
            m4850a(m3426a3, m4843b(" distanceBetween(customTarget1.customTarget2, customTarget1 ) "), C0758f.m2095b(m3426a4.f6958el, m3426a4.f6959em, m3426a5.f6958el, m3426a5.f6959em));
            m4850a(m3426a3, m4843b(" distanceBetweenSquared(customTarget1.customTarget2, customTarget1 ) "), C0758f.m2147a(m3426a4.f6958el, m3426a4.f6959em, m3426a5.f6958el, m3426a5.f6959em));
            m4844b(m3426a3, m4843b(" distanceBetween(self, nullUnit ) == 0 "));
            m4850a(m3426a3, m4843b(" distanceBetween(customTarget1.customTarget2, nullUnit ) "), 0.0f);
            m4850a(m3426a3, m4843b(" distanceBetween(nullUnit, nullUnit ) "), 0.0f);
            m4850a(m3426a3, m4843b(" distanceBetween( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 10.0f);
            m4850a(m3426a3, m4843b(" distanceBetweenSquared( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 100.0f);
            m4844b(m3426a3, m4842b(" self.energy < 0.5 and customTarget2==nullUnit ", true));
            m4844b(m3426a3, m4842b(" self.energy < 0.5 and customTarget2 == nullUnit ", true));
            m4844b(m3426a3, m4842b(" self.energy < 0.5 and customTarget1 != nullUnit ", true));
            m4844b(m3426a3, m4842b("parent==nullUnit and customTarget1!= nullUnit ", true));
            m4844b(m3426a3, m4842b("parent == nullUnit and customTarget1!=nullUnit ", true));
            m4847a("distanceBetween( self )");
            m4847a("distanceBetween( self, 5 )");
            m4847a("distanceBetween( self, nullUnit, nullUnit )");
            m4847a("distanceBetween(  )");
            m4844b(m3426a3, m4843b("'and'=='and'"));
            m4844b(m3426a3, m4843b("'and'!='and true'"));
            m4844b(m3426a3, m4843b("'hello.test'!='bye'"));
            m4844b(m3426a3, m4843b("'hel.lo.test'!='b.ye'"));
            m4844b(m3426a3, m4843b("'hel.lo.(test'!='b.ye'"));
            m4844b(m3426a3, m4843b("'hel.\"lo.(test'!='b.ye \"and '"));
            m4844b(m3426a3, m4843b("\"hel.lo.'(test2\"!='b.ye \"and '"));
            m4844b(m3426a3, m4843b("5==5"));
            m4844b(m3426a3, m4843b("'hel.lo.(test'!='b.ye' and 5==5"));
            m4847a("distanceSquared(  )");
            m4847a("distanceSquared( 1 )");
            m4847a("distanceSquared( 1,1 )");
            m4847a("distanceSquared( 1,1,1 )");
            m4847a("distanceSquared( 1,1,1,'test' )");
            m4847a("distanceSquared( 1,1,1,true )");
            m4847a("distanceSquared( 1,1,1,null )");
            m4847a("distanceSquared( 1,1,1, )");
            m4847a("distanceSquared( 1,1,1,'test' )");
            m4847a("distanceSquared( x1=1,1,1,'test' )");
            m4847a("distanceSquared( 1,1,1,1, x1=1 )");
            m4847a("distanceSquared( 1,1,1,1,1 )");
            m4847a("distanceSquared( 1,1,1, x1=1 )");
            m4847a("distanceSquared( 1,1,1, 1 ");
            m4847a("distanceSquared( 1,1,1, 1 ))");
            m4844b(m3426a3, m4843b("SELF.HP(lessThan=9999)"));
            m4841c(m3426a3, m4843b("Self.Parent.HP(lessThan=9999)"));
            m4847a("self.hasFlag( id=35 )");
            m4847a("self.hasFlag( 35 )");
            m4841c(m3426a3, m4843b("self.hasFlag(id=30)"));
            m4841c(m3426a3, m4843b("self.hasFlag(30)"));
            m4841c(m3426a3, m4843b("self.hasFlag(15+15)"));
            m4841c(m3426a3, m4843b("self.hasFlag(id=15*2)"));
        }
        AbstractC0916l.m963e("Took: " + C0727bl.m2367a(valueOf.longValue(), Long.valueOf(C0727bl.m2370a()).longValue()));
        AbstractC0916l.m963e("=== logic boolean memory tests ==");
        m4852a(c0453l, "unit testUnit1, float testFloat1");
        m4852a(c0453l, "unit testUnit2, float testFloat2");
        m4852a(c0453l, "bool testBool1");
        m4852a(c0453l, "number testNumber1");
        m4852a(c0453l, "float  testNumber2");
        m4852a(c0453l, "String testString");
        m4852a(c0453l, "String nullString");
        m4853a(m3426a3, "testString='(,,((', testFloat1=5, testFloat2=8, testBool1=true, testUnit1=self");
        m4853a(m3426a3, "nullString=null");
        m4845b(m3426a, "testNumber1=null");
        m4845b(m3426a, "testNumber2=null");
        m4845b(m3426a, "testBool1=null");
        m4845b(m3426a, "testNumber1=self");
        m4845b(m3426a, "testBool1=5");
        AbstractC0916l.m963e(m3426a3.f1582bv.debugMemory(false, true));
        m4850a(m3426a3, m4843b("memory.testFloat1"), 5.0f);
        m4850a(m3426a3, m4843b("memory.testFloat2"), 8.0f);
        m4844b(m3426a3, m4843b("memory.testFloat1==5"));
        m4844b(m3426a3, m4843b("memory.testString=='(,,(('"));
        m4844b(m3426a3, m4843b("memory.testBool1"));
        m4844b(m3426a3, m4843b("memory.testBool1==true"));
        m4844b(m3426a3, m4843b("memory.testUnit1==self"));
        m4844b(m3426a3, m4843b("memory.testUnit1!=nullUnit"));
        m4846a("memory.testUnit1==5", true);
        m4850a(m3426a3, m4843b("self.readUnitMemory('testFloat1', type='float')"), 5.0f);
        m4853a(m3426a3, "testFloat1=distance( 0,0,6,0 ), testFloat2=16");
        m4844b(m3426a3, m4843b("memory.testFloat1==6"));
        m4844b(m3426a3, m4843b("memory.testFloat2==16"));
        m4853a(m3426a3, "testUnit1=self.getOffsetAbsolute(y=10), testUnit2=self.getOffsetAbsolute(y=-10)");
        AbstractC0916l.m963e(m3426a3.f1582bv.debugMemory(false, true));
        m4850a(m3426a3, m4843b("distanceBetween( memory.testUnit1, memory.testUnit2)"), 20.0f);
        m4844b(m3426a3, m4843b("distanceBetweenSquared( memory.testUnit1, memory.testUnit2)==20*20"));
        m4849a(m3426a3, m4843b("globalSearchForFirstUnit(withTag='globalTag1')"), m3426a9);
        m4849a(m3426a3, m4843b("globalSearchForFirstUnit(withTag='globalTag2')"), m3426a9);
        m4844b(m3426a3, m4843b("globalSearchForFirstUnit()!=null"));
        m4844b(m3426a3, m4843b("globalSearchForFirstUnit(withTag='globalTag1', relation='enemy')==null"));
        m4844b(m3426a3, m4843b("globalSearchForFirstUnit(withTag='globalTagNo')==null"));
        m4846a("globalSearchForFirstUnit(withTag='globalTag1', relation='XYZ')", true);
    }

    /* renamed from: a */
    public void m4847a(String str) {
        m4846a(str, false);
    }

    /* renamed from: a */
    public void m4846a(String str, boolean z) {
        try {
            LogicBooleanLoader.parseBooleanBlock(C0453l.f2904b, str, false);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                AbstractC0916l.m968d("assertCreateError: " + str + " error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void m4852a(C0453l c0453l, String str) {
        c0453l.f2919q.defineVariables(c0453l, str);
    }

    /* renamed from: a */
    public void m4853a(AbstractC0244am abstractC0244am, String str) {
        try {
            C0451j c0451j = (C0451j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0451j.f2863x, "testsection", "testkey").writeToUnit(c0451j);
        } catch (C0412bm e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void m4845b(AbstractC0244am abstractC0244am, String str) {
        try {
            C0451j c0451j = (C0451j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0451j.f2863x, "testsection", "testkey").writeToUnit(c0451j);
            throw new RuntimeException("assertSetMemoryError got no error for: " + str);
        } catch (C0412bm e) {
        } catch (RuntimeException e2) {
        }
    }

    /* renamed from: b */
    public LogicBoolean m4843b(String str) {
        return m4842b(str, false);
    }

    /* renamed from: b */
    public LogicBoolean m4842b(String str, boolean z) {
        try {
            return LogicBooleanLoader.parseBooleanBlock(C0453l.f2904b, str, z);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m4851a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        logicBoolean.read(abstractC0623y);
    }

    /* renamed from: b */
    public void m4844b(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        if (!logicBoolean.read(abstractC0623y)) {
            throw new RuntimeException("Asset assertBooleanTrue failed, got false for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }

    /* renamed from: c */
    public void m4841c(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanFalse type ==" + logicBoolean.getReturnType());
        }
        C0085n.m4816b(logicBoolean.read(abstractC0623y));
    }

    /* renamed from: a */
    public void m4850a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, float f) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Asset assertBooleanNumber type ==" + logicBoolean.getReturnType());
        }
        float readNumber = logicBoolean.readNumber(abstractC0623y);
        if (C0758f.m2075c(readNumber - f) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + readNumber + "!=" + f + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }

    /* renamed from: a */
    public void m4848a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, String str) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        C0085n.m4819a(logicBoolean.readString(abstractC0623y), str);
    }

    /* renamed from: a */
    public void m4849a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, AbstractC0244am abstractC0244am) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
            throw new RuntimeException("Asset assertBooleanUnit type ==" + logicBoolean.getReturnType());
        }
        AbstractC0244am readUnit = logicBoolean.readUnit(abstractC0623y);
        if (readUnit != abstractC0244am) {
            AbstractC0916l.m963e("class: " + logicBoolean.getClass().getName());
            throw new RuntimeException("assertBooleanUnit failed:" + AbstractC0244am.m4132A(readUnit) + "!=" + AbstractC0244am.m4132A(abstractC0244am) + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }
}
