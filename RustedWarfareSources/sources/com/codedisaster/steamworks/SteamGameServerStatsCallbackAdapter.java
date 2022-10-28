package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamGameServerStatsCallbackAdapter.class */
class SteamGameServerStatsCallbackAdapter extends SteamCallbackAdapter {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamGameServerStatsCallbackAdapter(SteamGameServerStatsCallback steamGameServerStatsCallback) {
        super(steamGameServerStatsCallback);
    }

    void onStatsReceived(int i, long j) {
        ((SteamGameServerStatsCallback) this.callback).onStatsReceived(SteamResult.byValue(i), new SteamID(j));
    }

    void onStatsStored(int i, long j) {
        ((SteamGameServerStatsCallback) this.callback).onStatsStored(SteamResult.byValue(i), new SteamID(j));
    }

    void onStatsUnloaded(long j) {
        ((SteamGameServerStatsCallback) this.callback).onStatsUnloaded(new SteamID(j));
    }
}
