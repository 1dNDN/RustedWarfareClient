package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0435b;
import com.corrodinggames.rts.game.units.custom.p023f.C0443b;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p036e.C0753d;
import com.corrodinggames.rts.gameFramework.p036e.C0754e;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/e.class */
public class C0076e extends AbstractC0083l {

    /* renamed from: a */
    int f394a = 1;

    /* renamed from: a */
    public void m4839a() {
        AbstractC0916l.m963e("separator regex test");
        "first".split(Pattern.quote(File.separator));
        C0085n.m4819a("first\\second".split(Pattern.quote("\\"))[0], "first");
        C0085n.m4819a("first/second".split(Pattern.quote("/"))[0], "first");
        AbstractC0916l.m963e("Test for dis sq ranges");
        C0085n.m4818a(50 < 850000 * 850000);
        C0085n.m4818a(50.0f < ((float) (850000 * 850000)));
        C0085n.m4818a(50 < 8500000 * 8500000);
        C0085n.m4818a(50.0f < ((float) (8500000 * 8500000)));
        Random random = new Random();
        float[] fArr = new float[10000];
        for (int i = 1; i < 5; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr[i3] = random.nextFloat() * 50.0f;
            }
            long m2370a = C0727bl.m2370a();
            for (int i4 = 0; i4 < 1000; i4++) {
                for (float f : fArr) {
                    i2 += C0758f.m2142a((int) f);
                }
            }
            AbstractC0916l.m963e("sum:" + i2);
            AbstractC0916l.m963e("fastSquareRootInt took:" + C0727bl.m2369a(C0727bl.m2368a(m2370a)));
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr[i5] = random.nextFloat() * 50.0f;
            }
            long m2370a2 = C0727bl.m2370a();
            int i6 = 0;
            for (int i7 = 0; i7 < 1000; i7++) {
                for (float f2 : fArr) {
                    i6 = (int) (i6 + C0758f.m2150a((int) f2));
                }
            }
            AbstractC0916l.m963e("sum:" + i6);
            AbstractC0916l.m963e("squareRoot took:" + C0727bl.m2369a(C0727bl.m2368a(m2370a2)));
        }
        AbstractC0916l.m963e("CommonUtils.fastSplit");
        String[] m2068c = C0758f.m2068c("testA|testB", '|');
        C0085n.m4821a(m2068c.length, 2);
        C0085n.m4819a(m2068c[0], "testA");
        C0085n.m4819a(m2068c[1], "testB");
        String[] m2068c2 = C0758f.m2068c("test|", '|');
        C0085n.m4821a(m2068c2.length, "test|".split("\\|").length);
        C0085n.m4819a(m2068c2[0], "test");
        String[] m2068c3 = C0758f.m2068c("|test", '|');
        C0085n.m4821a(m2068c3.length, 2);
        C0085n.m4819a(m2068c3[0], VariableScope.nullOrMissingString);
        C0085n.m4819a(m2068c3[1], "test");
        C0085n.m4821a(C0758f.m2068c("|", '|').length, 0);
        AbstractC0916l.m963e("VariableReplacement");
        C0443b c0443b = new C0443b();
        c0443b.f2826b.m3575a("a", "5");
        c0443b.f2826b.m3575a("b", "10");
        c0443b.f2826b.m3575a("abc_foo", "7");
        C0453l c0453l = C0453l.f2904b;
        try {
            C1072ab c1072ab = new C1072ab("assets/" + c0453l.f2931C);
            try {
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "123"), "123");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "1+1"), "2");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "(1+1)*2"), "4");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "a+b"), "15");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "a+a+abc_foo"), "17");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "(2+2)*(2+2)"), "16");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "10/5"), "2");
                C0085n.m4819a(c0443b.m3588a(c0453l, c1072ab, "core", "10-5"), "5");
                C0085n.m4815c(c0443b.m3588a(c0453l, c1072ab, "core", "cos(60)"), "0.5");
                C0085n.m4815c(c0443b.m3588a(c0453l, c1072ab, "core", "sin(b+20+(2-2)+(5*0))"), "0.5");
                AbstractC0916l.m963e("PassthroughZipReader");
                C0085n.m4819a(C1077ag.m586l("/first/second/zip.rwmod/test1/test2"), "test1/test2");
                C0085n.m4819a(C1077ag.m586l("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
                m4838a("A", "B");
                m4838a("AA=11", "BB=22");
                m4838a("AA='11'", "BB='22'");
                m4838a("AA=(11)", "BB=22");
                m4838a("(AA)=(11)", "BB=22");
                m4838a("(AA)=('11')", "BB=22");
                m4838a("(AA)=('11')", "BB=((22))");
                m4838a("(A,A)=('1,1')", "BB=((2,2))");
                m4838a("(A,A)=('1,,1')", "BB=((2,2))");
                AbstractC0916l.m963e("splitWithEscaping");
                m4835a(C0758f.m2058d("hello world", ' '), "hello", "world");
                m4836a(C0758f.m2058d("hello world", 'X'), "hello world");
                m4835a(C0758f.m2058d("hello,world", ','), "hello", "world");
                m4835a(C0758f.m2058d("he\\,llo,world", ','), "he,llo", "world");
                m4836a(VariableScope.nullOrMissingString.split(" "), VariableScope.nullOrMissingString);
                m4836a(C0758f.m2058d(VariableScope.nullOrMissingString, ' '), VariableScope.nullOrMissingString);
                m4835a(C0758f.m2058d("hello\\\\,World", ','), "hello\\", "World");
                m4835a(C0758f.m2058d("Hello\\A,world", ','), "HelloA", "world");
                m4836a(C0758f.m2058d("h\\ello\\,world", ','), "hello,world");
                m4835a(C0758f.m2058d("h\\ello\\,w,orld", ','), "hello,w", "orld");
                m4835a(C0758f.m2058d("h\\ello\\,w,orld", ','), "hello,w", "orld");
                C0085n.m4819a(C0758f.m2103a(new String[]{"Hello"}), "Hello");
                C0085n.m4819a(C0758f.m2103a(new String[]{"Hello", "World"}), "Hello,World");
                C0085n.m4819a(C0758f.m2103a(new String[]{"Hel,lo", "World"}), "Hel\\,lo,World");
                C0085n.m4819a(C0758f.m2103a(new String[]{"Hel,lo,", "Wor,ld"}), "Hel\\,lo\\,,Wor\\,ld");
                C0085n.m4819a(C0758f.m2103a(new String[]{"Hel\\,lo,", "Wor,ld"}), "Hel\\\\\\,lo\\,,Wor\\,ld");
                C0085n.m4819a(C0758f.m2103a(new String[]{"H\\el\\,lo,", "Wor,ld"}), "H\\\\el\\\\\\,lo\\,,Wor\\,ld");
                AbstractC0916l.m963e("FileLoaderBackend");
                C0753d c0753d = new C0753d("/tmp/rustedWarfareTests/", "test1");
                c0753d.f4873a = "fileLoader1: ";
                c0753d.f4874b = true;
                C0753d c0753d2 = new C0753d("/tmp/rustedWarfareTestsSec2/", "test2");
                c0753d2.f4873a = "fileLoader2: ";
                c0753d2.f4874b = true;
                C0754e c0754e = new C0754e(c0753d, "primary-PATH/", c0753d2, "[ALT-PATH]/");
                c0754e.f4873a = "mergedFileLoader: ";
                c0754e.f4874b = true;
                C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m4817b(c0753d.mo2182f("units/test.ini"), "assets/units/test.ini");
                AbstractC0916l.m963e("FileLoaderBackend - merged");
                C0085n.m4817b(c0754e.mo2182f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m4817b(c0754e.mo2182f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                AbstractC0916l.m963e("FileLoaderBackend - android fake");
                boolean z = AbstractC0916l.f6115aU;
                AbstractC0916l.f6115aU = false;
                try {
                    C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                    C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m4817b(c0753d.mo2182f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m4817b(c0753d.mo2182f("units/test.ini"), "units/test.ini");
                    AbstractC0916l.f6115aU = z;
                    if (1 != 0) {
                        AbstractC0916l.m963e("FileLoaderBackend - real file tests");
                        File file = new File(c0753d.mo2182f("/SD/rustedWarfare/testDir"));
                        file.mkdirs();
                        new File(c0753d2.mo2182f("/SD/rustedWarfare/testDir")).mkdirs();
                        try {
                            try {
                                File file2 = new File(c0753d.mo2182f("/SD/rustedWarfare/testDir/map1.tmx"));
                                file2.createNewFile();
                                FileWriter fileWriter = new FileWriter(file2);
                                fileWriter.write("map1");
                                fileWriter.close();
                                new File(c0753d.mo2182f("/SD/rustedWarfare/testDir/map2.tmx")).createNewFile();
                                File file3 = new File(c0753d2.mo2182f("/SD/rustedWarfare/testDir/map3.tmx"));
                                file3.createNewFile();
                                FileWriter fileWriter2 = new FileWriter(file3);
                                fileWriter2.write("map3");
                                fileWriter2.close();
                                String[] a = c0753d.mo2172a("/SD/rustedWarfare/testDir", false);
                                C0085n.m4821a(a.length, 2);
                                C0085n.m4817b(a[0], "map1.tmx");
                                C0085n.m4817b(a[1], "map2.tmx");
                                String[] mo2172a = c0754e.mo2172a("/SD/rustedWarfare/testDir", false);
                                C0085n.m4821a(mo2172a.length, 3);
                                C0085n.m4817b(mo2172a[0], "primary-PATH/map1.tmx");
                                C0085n.m4817b(mo2172a[1], "primary-PATH/map2.tmx");
                                C0085n.m4817b(mo2172a[2], "[ALT-PATH]/map3.tmx");
                                String str = mo2172a[2];
                                C1098j mo2178k = c0754e.mo2178k("/SD/rustedWarfare/testDir/" + str);
                                if (mo2178k == null) {
                                    throw new RuntimeException("Null for: /SD/rustedWarfare/testDir/" + str);
                                }
                                C0085n.m4817b(C0758f.m2086b(mo2178k), "map3");
                                AbstractC0916l.m963e("FileLoaderBackend - clean up");
                                for (String str2 : file.list()) {
                                    new File(file.getPath(), str2).delete();
                                }
                                file.delete();
                                AbstractC0916l.m963e("isSameOrHigherVersion..");
                                m4837a("v1.13", "v1.14", true);
                                m4837a("v1.13", "v2.14", true);
                                m4837a("v1.13", "v2.11", true);
                                m4837a("v1.13", "v1.13p5", false);
                                m4837a("v1.13", "v1.13.2", true);
                                m4837a("v1.13.2", "v1.13", false);
                                m4837a("v1.13", "v1.13b", true);
                                m4837a("v1.13", "v1.13.2p6", true);
                                m4837a("v1.13", "v1.14.2p6", true);
                                m4837a("v1.13p9", "v1.14.2p6", true);
                                m4837a("v1.13p9", "v1.14p6", true);
                                m4837a("v1.14p3", "v1.14p6", true);
                                m4837a("v1.14p3", "v1.14p6b", true);
                                m4837a("v1.14p8", "v1.14p3", false);
                                m4837a("v1", "v2", true);
                                m4837a("v1.5", "v2", true);
                                m4837a("v2", "v1.15", false);
                                m4837a("v2.0.5", "v1.15", false);
                                m4837a("v1.15", "v2.0.5", true);
                                m4837a("v1.15.6", "v2.0.5", true);
                                m4837a("v1.15.6", "v1.16.5", true);
                                m4837a("v1.13", "v1.13.2p5", true);
                                m4837a("v1.14", "v1.14p3", false);
                                m4837a("v1.14b", "v1.14p3", false);
                                m4837a("v1.14.2", "v1.14p3", false);
                                m4837a("v1.14.2b", "v1.14p3", false);
                                try {
                                    C0823a.m1669a("v1.11p1");
                                    C0085n.m4819a(C0428a.m3665a("10000", EnumC0435b.none), "10000");
                                    C0085n.m4819a(C0428a.m3665a(VariableScope.nullOrMissingString, EnumC0435b.space), VariableScope.nullOrMissingString);
                                    C0085n.m4819a(C0428a.m3665a("1", EnumC0435b.comma), "1");
                                    C0085n.m4819a(C0428a.m3665a("10", EnumC0435b.comma), "10");
                                    C0085n.m4819a(C0428a.m3665a("100", EnumC0435b.comma), "100");
                                    C0085n.m4819a(C0428a.m3665a("1000", EnumC0435b.comma), "1,000");
                                    C0085n.m4819a(C0428a.m3665a(".", EnumC0435b.comma), ".");
                                    C0085n.m4819a(C0428a.m3665a(".2", EnumC0435b.comma), ".2");
                                    C0085n.m4819a(C0428a.m3665a(".22", EnumC0435b.comma), ".22");
                                    C0085n.m4819a(C0428a.m3665a(".223", EnumC0435b.comma), ".223");
                                    C0085n.m4819a(C0428a.m3665a(".2234", EnumC0435b.comma), ".2234");
                                    C0085n.m4819a(C0428a.m3665a("100.2234", EnumC0435b.comma), "100.2234");
                                    C0085n.m4819a(C0428a.m3665a("1000.2234", EnumC0435b.comma), "1,000.2234");
                                    C0085n.m4819a(C0428a.m3665a("10000", EnumC0435b.comma), "10,000");
                                    C0085n.m4819a(C0428a.m3665a("9800000", EnumC0435b.comma), "9,800,000");
                                    C0085n.m4819a(C0428a.m3665a("9800000.67", EnumC0435b.comma), "9,800,000.67");
                                    C0085n.m4819a(C0428a.m3665a("98000000.67", EnumC0435b.comma), "98,000,000.67");
                                    C0085n.m4819a(C0428a.m3665a("980000000.67", EnumC0435b.comma), "980,000,000.67");
                                    C0085n.m4819a(C0428a.m3665a("9800000001.67", EnumC0435b.comma), "9,800,000,001.67");
                                    C0085n.m4819a(C0428a.m3665a("9800000001.6", EnumC0435b.comma), "9,800,000,001.6");
                                    C0085n.m4819a(C0428a.m3665a("9800000001.", EnumC0435b.comma), "9,800,000,001.");
                                    C0085n.m4819a(C0428a.m3665a("9800000001", EnumC0435b.comma), "9,800,000,001");
                                    C0085n.m4819a(C0428a.m3668a(9800000L, EnumC0435b.comma), "9,800,000");
                                } catch (C0412bm e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (Throwable th) {
                            AbstractC0916l.m963e("FileLoaderBackend - clean up");
                            for (String str3 : file.list()) {
                                new File(file.getPath(), str3).delete();
                            }
                            file.delete();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0916l.f6115aU = z;
                    throw th2;
                }
            } catch (C0412bm e3) {
                throw new RuntimeException(e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m4838a(String str, String str2) {
        ArrayList m2107a = C0758f.m2107a(str + "," + str2, ",", false, false);
        C0085n.m4819a((String) m2107a.get(0), str);
        C0085n.m4819a((String) m2107a.get(1), str2);
    }

    /* renamed from: a */
    public void m4836a(String[] strArr, String str) {
        C0085n.m4821a(strArr.length, 1);
        C0085n.m4819a(strArr[0], str);
    }

    /* renamed from: a */
    public void m4835a(String[] strArr, String str, String str2) {
        C0085n.m4821a(strArr.length, 2);
        C0085n.m4819a(strArr[0], str);
        C0085n.m4819a(strArr[1], str2);
    }

    /* renamed from: a */
    public void m4837a(String str, String str2, boolean z) {
        boolean z2;
        try {
            C0823a.m1666a(str, str2);
            z2 = true;
        } catch (C0412bm e) {
            if (z) {
                AbstractC0916l.m982b(e.getMessage());
            }
            z2 = false;
        }
        if (z2 != z) {
            throw new RuntimeException("isSameOrHigherVersion(" + str + "," + str2 + "): Asset failed got: " + z2);
        }
    }
}
