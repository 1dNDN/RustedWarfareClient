package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamGameServerAPI.class */
public class SteamGameServerAPI {
    private static boolean isRunning = false;

    /* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamGameServerAPI$ServerMode.class */
    public enum ServerMode {
        Invalid,
        NoAuthentication,
        Authentication,
        AuthenticationAndSecure
    }

    private static native boolean nativeInit(int i, short s, short s2, short s3, int i2, String str);

    private static native void nativeShutdown();

    public static native void runCallbacks();

    public static native boolean isSecure();

    private static native long nativeGetSteamID();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamGameServerPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamGameServerNetworkingPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamGameServerStatsPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamGameServerHTTPPointer();

    public static boolean init(int i, short s, short s2, short s3, ServerMode serverMode, String str) {
        return init(null, i, s, s2, s3, serverMode, str);
    }

    public static boolean init(String str, int i, short s, short s2, short s3, ServerMode serverMode, String str2) {
        SteamSharedLibraryLoader.loadLibraries(str);
        isRunning = nativeInit(i, s, s2, s3, serverMode.ordinal(), str2);
        return isRunning;
    }

    public static void shutdown() {
        isRunning = false;
        nativeShutdown();
    }

    public static SteamID getSteamID() {
        return new SteamID(nativeGetSteamID());
    }
}
