package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.java.c.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/j.class */
public class C1166j implements SteamUGCCallback {

    /* renamed from: a */
    final /* synthetic */ C1163g f7133a;

    public C1166j(C1163g c1163g) {
        this.f7133a = c1163g;
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUGCQueryCompleted(SteamUGCQuery steamUGCQuery, int i, int i2, boolean z, SteamResult steamResult) {
        AbstractC0916l.m963e("Got workshop callback: onUGCQueryCompleted (" + steamResult + ") numResultsReturned:" + i);
        if (steamResult != SteamResult.OK) {
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            SteamUGCDetails steamUGCDetails = new SteamUGCDetails();
            if (!this.f7133a.f7119d.getQueryUGCResult(steamUGCQuery, i3, steamUGCDetails)) {
                AbstractC0916l.m963e("getQueryUGCResult failed for index: " + i3);
            } else {
                SteamPublishedFileID publishedFileID = steamUGCDetails.getPublishedFileID();
                AbstractC0916l.m963e("getQueryUGCResult: " + publishedFileID);
                C1164h m273a = this.f7133a.m273a(publishedFileID);
                m273a.f7130d = steamUGCDetails.getTitle();
                m273a.f7129c = true;
                this.f7133a.f7116a = true;
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m257a("onSubscribeItem", steamResult);
        AbstractC0916l.m1071A();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUnsubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m257a("onUnsubscribeItem", steamResult);
        AbstractC0916l.m1071A();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onRequestUGCDetails(SteamUGCDetails steamUGCDetails, SteamResult steamResult) {
        m257a("onRequestUGCDetails", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onCreateItem(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m257a("onCreateItem", steamResult);
        if (this.f7133a.f7120e == null) {
            this.f7133a.m270a((C0824b) null, "Error no mod pending creation!", false);
        } else if (this.f7133a.f7120e.f5427k != 0) {
            this.f7133a.m270a(this.f7133a.f7120e, "This mod has already been published", true);
        } else {
            this.f7133a.f7120e.m1640a(SteamNativeHandle.getNativeHandle(steamPublishedFileID));
            this.f7133a.m269a(this.f7133a.f7120e, true, "Created.");
            this.f7133a.f7120e = null;
            AbstractC0916l.m1071A().f6172bZ.m1643m();
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubmitItemUpdate(boolean z, SteamResult steamResult) {
        String str;
        C0824b c0824b = this.f7133a.f7122g;
        this.f7133a.f7122g = null;
        m257a("onSubmitItemUpdate", steamResult);
        if (steamResult == SteamResult.OK) {
            str = "Workshop item updated.";
        } else if (this.f7133a.f7121f) {
            str = "Error. Workshop returned: " + steamResult + " while trying to upload workshop data.";
        } else {
            str = "Error. Workshop returned: " + steamResult + " while trying to update existing workshop item.";
            if (steamResult == SteamResult.FileNotFound) {
                str = str + " (If you want to create a new workshop item instead of updating, delete steam.dat from this mod.)";
            }
        }
        if (z) {
            str = str + "WLA agreement needs to be accepted on the workshop site.";
        }
        AbstractC0916l.m1071A().m953i(str);
        AbstractC0916l.m1071A().f6172bZ.m1643m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onDownloadItemResult(int i, SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m257a("onDownloadItemResult", steamResult);
        synchronized (this.f7133a.f7123h) {
            C1165i m264c = this.f7133a.m264c(steamPublishedFileID);
            if (m264c != null) {
                m264c.m258a(steamResult);
                this.f7133a.f7123h.remove(m264c);
            }
        }
        AbstractC0916l.m1071A().f6172bZ.m1643m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUserFavoriteItemsListChanged(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m257a("onUserFavoriteItemsListChanged", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m257a("onSetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onGetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, boolean z2, boolean z3, SteamResult steamResult) {
        m257a("onGetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStartPlaytimeTracking(SteamResult steamResult) {
        m257a("onStartPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTracking(SteamResult steamResult) {
        m257a("onStopPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTrackingForAllItems(SteamResult steamResult) {
        m257a("onStopPlaytimeTrackingForAllItems", steamResult);
    }

    /* renamed from: a */
    public void m257a(String str, SteamResult steamResult) {
        AbstractC0916l.m963e("Got workshop callback: " + str + " (" + steamResult + ")");
    }
}
