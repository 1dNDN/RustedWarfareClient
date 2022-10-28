package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/be.class */
public class C0720be {

    /* renamed from: e */
    static C0720be f4538e = null;

    /* renamed from: a */
    public boolean f4539a = false;

    /* renamed from: b */
    String f4540b = "rtsSave";

    /* renamed from: c */
    String f4541c = "rtsSave.bak";

    /* renamed from: d */
    public boolean f4542d = false;

    /* renamed from: f */
    HashMap f4543f = new HashMap();

    /* renamed from: a */
    public void m2407a(Context context) {
        if (LoggerMaybe.f6205aU || this.f4539a) {
            return;
        }
        try {
        } catch (FileNotFoundException e) {
            Log.m5368b("RustedWarfare", "file save error:", e);
        } catch (IOException e2) {
            Log.m5368b("RustedWarfare", "file save error:", e2);
        }
        if (context == null) {
            throw new IOException("context==null");
        }
        try {
            FileOutputStream mo5605b = context.mo5605b(this.f4540b, 0);
            DataOutputStream dataOutputStream = new DataOutputStream(mo5605b);
            m2405a(dataOutputStream);
            dataOutputStream.close();
            mo5605b.close();
            if (this.f4542d) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4541c));
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    m2405a(dataOutputStream2);
                    dataOutputStream2.close();
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.m5368b("RustedWarfare", "file read error:", e3);
                }
            }
        } catch (NullPointerException e4) {
            throw new IOException("openFileOutput NullPointerException", e4);
        }
    }

    /* renamed from: a */
    public boolean m2405a(DataOutputStream dataOutputStream) {
        if (LoggerMaybe.f6205aU) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f4543f.size());
            for (C0721bf c0721bf : this.f4543f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(c0721bf.f4544a);
                dataOutputStream.writeUTF(c0721bf.f4545b);
                dataOutputStream.writeInt(c0721bf.f4546c);
                dataOutputStream.writeBoolean(c0721bf.f4547d);
                dataOutputStream.writeBoolean(c0721bf.f4548e);
                dataOutputStream.writeBoolean(c0721bf.f4549f);
                dataOutputStream.writeLong(c0721bf.f4550g);
                dataOutputStream.writeInt(c0721bf.f4551h);
            }
            dataOutputStream.flush();
            return true;
        } catch (IOException e) {
            Log.m5368b("RustedWarfare", "file save error:", e);
            return false;
        }
    }

    /* renamed from: b */
    public void m2403b(Context context) {
        if (this.f4539a) {
            return;
        }
        boolean z = false;
        Log.m5365d("RustedWarfare", "Trying to load from internal memory");
        try {
            FileInputStream mo5608a = context.mo5608a(this.f4540b);
            z = m2406a(new DataInputStream(mo5608a));
            if (z) {
                Log.m5365d("RustedWarfare", "loaded from internal memory");
            }
            mo5608a.close();
        } catch (IOException e) {
            Log.m5368b("RustedWarfare", "file read error:", e);
        }
        if (this.f4542d && !z) {
            Log.m5365d("RustedWarfare", "Trying to load from SD");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4541c));
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                if (m2406a(dataInputStream)) {
                    Log.m5365d("RustedWarfare", "loaded from SD");
                }
                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e2) {
                Log.m5368b("RustedWarfare", "file read error:", e2);
            }
        }
    }

    /* renamed from: a */
    public boolean m2406a(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.m5365d("RustedWarfare", "Warning file is at version:" + readInt);
                return false;
            }
            dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            this.f4543f.clear();
            for (int i = 0; i < readInt2; i++) {
                C0721bf c0721bf = new C0721bf(this);
                dataInputStream.readInt();
                c0721bf.f4544a = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                    Log.m5365d("RustedWarfare", "converting:" + readUTF);
                    readUTF = "maps/challenge/l090;Level 7.tmx";
                }
                c0721bf.f4545b = readUTF;
                c0721bf.f4546c = dataInputStream.readInt();
                c0721bf.f4547d = dataInputStream.readBoolean();
                c0721bf.f4548e = dataInputStream.readBoolean();
                c0721bf.f4549f = dataInputStream.readBoolean();
                c0721bf.f4550g = dataInputStream.readLong();
                c0721bf.f4551h = dataInputStream.readInt();
                this.f4543f.put(m2404a(c0721bf.f4545b), c0721bf);
            }
            return true;
        } catch (IOException e) {
            Log.m5368b("RustedWarfare", "file read error:", e);
            return false;
        }
    }

    /* renamed from: c */
    public static C0720be m2401c(Context context) {
        if (f4538e == null) {
            f4538e = new C0720be(context);
            if (!LoggerMaybe.f6205aU) {
                f4538e.m2403b(context);
            }
        }
        return f4538e;
    }

    private C0720be(Context context) {
    }

    /* renamed from: a */
    public String m2404a(String str) {
        Integer m954l = LoggerMaybe.m954l(str);
        if (m954l != null) {
            return LoggerMaybe.m959j(str) + "/l" + m954l;
        }
        return str;
    }

    /* renamed from: b */
    public C0721bf m2402b(String str) {
        String m2404a = m2404a(str);
        C0721bf c0721bf = (C0721bf) this.f4543f.get(m2404a);
        Log.m5365d("RustedWarfare", "StateEngine: get(" + str + ")=" + c0721bf + "  (key=" + m2404a + ")");
        if (c0721bf == null) {
            c0721bf = new C0721bf(this);
            c0721bf.f4544a = 1;
            c0721bf.f4545b = str;
            this.f4543f.put(m2404a, c0721bf);
        }
        return c0721bf;
    }
}
