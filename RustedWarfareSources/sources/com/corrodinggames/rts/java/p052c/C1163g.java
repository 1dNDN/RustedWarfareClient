package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/g.class */
public class C1163g {

    /* renamed from: b */
    C1157b f7117b;

    /* renamed from: d */
    SteamUGC f7119d;

    /* renamed from: e */
    C0824b f7120e;

    /* renamed from: f */
    boolean f7121f;

    /* renamed from: g */
    C0824b f7122g;

    /* renamed from: k */
    int f7126k;

    /* renamed from: a */
    boolean f7116a = false;

    /* renamed from: h */
    ArrayList f7123h = new ArrayList();

    /* renamed from: i */
    HashMap f7124i = new HashMap();

    /* renamed from: j */
    ArrayList f7125j = new ArrayList();

    /* renamed from: c */
    SteamUGCCallback f7118c = new C1166j(this);

    /* renamed from: e */
    private void m260e() {
        if (this.f7125j.size() == 0) {
            return;
        }
        SteamUGCQuery createQueryUGCDetailsRequest = this.f7119d.createQueryUGCDetailsRequest(this.f7125j);
        this.f7125j.clear();
        this.f7119d.sendQueryUGCRequest(createQueryUGCDetailsRequest);
        this.f7119d.releaseQueryUserUGCRequest(createQueryUGCDetailsRequest);
        SteamAPI.runCallbacks();
    }

    /* renamed from: e */
    private void m259e(SteamPublishedFileID steamPublishedFileID) {
        AbstractC0916l.m963e("Adding request for workshop details: " + steamPublishedFileID);
        this.f7125j.add(steamPublishedFileID);
    }

    /* renamed from: a */
    public C1164h m273a(SteamPublishedFileID steamPublishedFileID) {
        C1164h c1164h = (C1164h) this.f7124i.get(steamPublishedFileID);
        if (c1164h == null) {
            AbstractC0916l.m963e("New ItemInfo: " + steamPublishedFileID);
            c1164h = new C1164h();
            c1164h.f7127a = steamPublishedFileID;
            this.f7124i.put(steamPublishedFileID, c1164h);
        }
        return c1164h;
    }

    /* renamed from: b */
    public String m267b(SteamPublishedFileID steamPublishedFileID) {
        C1164h m273a = m273a(steamPublishedFileID);
        if (m273a.f7128b == 0 && !m273a.f7129c) {
            m273a.f7128b = System.currentTimeMillis();
            m259e(steamPublishedFileID);
        }
        if (m273a.f7129c) {
            AbstractC0916l.m963e("Got data for: " + steamPublishedFileID + " - " + m273a.f7130d);
            return m273a.f7130d;
        }
        AbstractC0916l.m963e("No data for: " + steamPublishedFileID);
        return null;
    }

    /* renamed from: c */
    public C1165i m264c(SteamPublishedFileID steamPublishedFileID) {
        Iterator it = this.f7123h.iterator();
        while (it.hasNext()) {
            C1165i c1165i = (C1165i) it.next();
            if (c1165i.f7131a.equals(steamPublishedFileID)) {
                return c1165i;
            }
        }
        return null;
    }

    public C1163g(C1157b c1157b) {
        this.f7117b = c1157b;
    }

    /* renamed from: a */
    public void m272a(SteamUGC steamUGC) {
        this.f7119d = steamUGC;
    }

    /* renamed from: a */
    public SteamUGCCallback m274a() {
        return this.f7118c;
    }

    /* renamed from: a */
    public void m270a(C0824b c0824b, String str, boolean z) {
        AbstractC0916l.m963e("workshop: " + str);
        if (z) {
            AbstractC0916l.m1071A().m953i(str);
        }
    }

    /* renamed from: a */
    public boolean m271a(C0824b c0824b) {
        if (c0824b.f5435s == null) {
            m270a(c0824b, "A title is required in the file 'mod-info.txt'", true);
            return false;
        }
        String m1620p = c0824b.m1620p();
        if (m1620p != null && !C0750a.m2209h(m1620p)) {
            m270a(c0824b, "Could not find thumbnail file: " + m1620p + " referenced mod-info.txt", true);
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m266b(C0824b c0824b) {
        if (this.f7120e != null) {
            m270a(c0824b, "A mod is already pending publishing", false);
        } else if (c0824b.f5427k != 0) {
            m270a(c0824b, "This mod has already been published", false);
        } else if (!m271a(c0824b)) {
        } else {
            if (!c0824b.m1640a(0L)) {
                m270a(c0824b, "Failed to write metadata to mod, check file permissions", true);
                return;
            }
            this.f7120e = c0824b;
            this.f7119d.createItem(this.f7117b.f7103j.getAppID(), SteamRemoteStorage.WorkshopFileType.Community);
        }
    }

    /* renamed from: a */
    public void m269a(C0824b c0824b, boolean z, String str) {
        if (!m271a(c0824b)) {
            return;
        }
        SteamUGCUpdateHandle startItemUpdate = this.f7119d.startItemUpdate(this.f7117b.f7103j.getAppID(), new SteamPublishedFileID(c0824b.f5427k));
        if (z) {
            if (c0824b.f5435s != null) {
                this.f7119d.setItemTitle(startItemUpdate, c0824b.f5435s);
            }
            if (c0824b.f5437u != null) {
                this.f7119d.setItemDescription(startItemUpdate, c0824b.f5437u);
            }
        }
        if (z) {
            this.f7119d.setItemVisibility(startItemUpdate, SteamRemoteStorage.PublishedFileVisibility.Public);
        }
        String m1620p = c0824b.m1620p();
        if (m1620p != null) {
            this.f7119d.setItemPreview(startItemUpdate, m1620p);
        }
        String m1633c = c0824b.m1633c("tags");
        if (m1633c != null) {
            String[] split = m1633c.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
                AbstractC0916l.m963e("Adding tag:" + split[i]);
            }
            this.f7119d.setItemTags(startItemUpdate, split);
        }
        String m1627i = c0824b.m1627i();
        AbstractC0916l.m963e("convertedAbsolutePath:" + m1627i);
        this.f7119d.setItemContent(startItemUpdate, m1627i);
        c0824b.f5461S = "Uploading to workshop";
        this.f7121f = z;
        this.f7122g = c0824b;
        this.f7119d.submitItemUpdate(startItemUpdate, str);
        AbstractC0916l.m963e("submitted item update for:" + c0824b.f5427k);
    }

    /* renamed from: b */
    public void m268b() {
        this.f7117b.f7096c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + this.f7117b.f7103j.getAppID());
    }

    /* renamed from: c */
    public void m263c(C0824b c0824b) {
        this.f7117b.f7096c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + c0824b.f5427k);
    }

    /* renamed from: d */
    public long m261d(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    /* renamed from: c */
    public void m265c() {
        if (this.f7116a) {
            this.f7116a = false;
            AbstractC0916l.m1071A().f6172bZ.m1643m();
        }
        int numSubscribedItems = this.f7119d.getNumSubscribedItems();
        if (numSubscribedItems != this.f7126k) {
            AbstractC0916l.m963e("Number of subscribed items changed from: " + this.f7126k + " to: " + numSubscribedItems);
            this.f7126k = numSubscribedItems;
            AbstractC0916l.m1071A();
            m262d();
            this.f7116a = true;
        }
    }

    /* renamed from: d */
    public void m262d() {
        SteamUGC.ItemDownloadInfo itemDownloadInfo;
        String m267b;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        SteamAPI.runCallbacks();
        AbstractC0916l.m963e("--------------");
        AbstractC0916l.m963e("Steam: loadWorkshopMods");
        int numSubscribedItems = this.f7119d.getNumSubscribedItems();
        this.f7126k = numSubscribedItems;
        SteamPublishedFileID[] steamPublishedFileIDArr = new SteamPublishedFileID[numSubscribedItems];
        this.f7119d.getSubscribedItems(steamPublishedFileIDArr);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArr) {
            Collection<SteamUGC.ItemState> itemState = this.f7119d.getItemState(steamPublishedFileID);
            long m261d = m261d(steamPublishedFileID);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            String str = null;
            for (SteamUGC.ItemState itemState2 : itemState) {
                if (itemState2 != SteamUGC.ItemState.None) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString + itemState2;
                    } else {
                        str = str + ", " + itemState2;
                    }
                    if (itemState2 == SteamUGC.ItemState.Downloading) {
                        z2 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.DownloadPending) {
                        z2 = true;
                        z3 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Installed) {
                        z = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.NeedsUpdate) {
                        z4 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Subscribed) {
                        z5 = true;
                    }
                }
            }
            AbstractC0916l.m963e("Found workshop item " + m261d + " with state: " + str + VariableScope.nullOrMissingString);
            String str2 = "sw" + m261d;
            String str3 = "(Workshop item - " + m261d + ")";
            if (!z && (m267b = m267b(steamPublishedFileID)) != null) {
                str3 = m267b;
            }
            String str4 = null;
            String str5 = null;
            if (!z5) {
                AbstractC0916l.m963e("Skipping: " + m261d + " as it is not subscribed");
            } else {
                if (z) {
                    SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
                    this.f7119d.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
                    str4 = itemInstallInfo.getFolder();
                    AbstractC0916l.m963e(" Installed at: " + str4);
                } else {
                    AbstractC0916l.m963e(" Not installed");
                    str5 = "Not installed.";
                    if (z4) {
                        str5 = "Update needed..";
                    }
                    if (z3) {
                        str5 = "Download pending in steam...";
                    } else if (z2) {
                        str5 = "Steam is downloading files..";
                        if (this.f7119d.getItemDownloadInfo(steamPublishedFileID, new SteamUGC.ItemDownloadInfo())) {
                            str5 = str5 + " " + C0758f.m2076c((itemDownloadInfo.getBytesDownloaded() / itemDownloadInfo.getBytesTotal()) * 100.0d) + "%";
                        }
                    }
                }
                int i = 0;
                if (!z) {
                    i = -1;
                }
                C0824b m1665a = m1071A.f6172bZ.m1665a(str2, str2, str4, str2, true, true, false, i);
                if (m1665a.f5435s == null) {
                    m1665a.f5436t = str3;
                }
                if (str5 == null && z4) {
                    if (z3) {
                        str5 = "An update is pending download in Steam.";
                    } else if (z3) {
                        str5 = "An update is downloading...";
                    } else {
                        str5 = "An update is available.";
                    }
                }
                m1665a.f5462T = str5;
                if ((!z || z4) && (!z2 || z3)) {
                    AbstractC0916l.m963e("Queuing download on: " + steamPublishedFileID);
                    this.f7119d.downloadItem(steamPublishedFileID, false);
                }
            }
        }
        m260e();
    }
}
