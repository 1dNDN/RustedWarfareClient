package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAuth.class */
public class SteamAuth {

    /* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAuth$BeginAuthSessionResult.class */
    public enum BeginAuthSessionResult {
        OK,
        InvalidTicket,
        DuplicateRequest,
        InvalidVersion,
        GameMismatch,
        ExpiredTicket;
        
        private static final BeginAuthSessionResult[] values = values();

        /* JADX INFO: Access modifiers changed from: package-private */
        public static BeginAuthSessionResult byOrdinal(int i) {
            return values[i];
        }
    }

    /* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAuth$AuthSessionResponse.class */
    public enum AuthSessionResponse {
        OK,
        UserNotConnectedToSteam,
        NoLicenseOrExpired,
        VACBanned,
        LoggedInElseWhere,
        VACCheckTimedOut,
        AuthTicketCanceled,
        AuthTicketInvalidAlreadyUsed,
        AuthTicketInvalid,
        PublisherIssuedBan;
        
        private static final AuthSessionResponse[] values = values();

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AuthSessionResponse byOrdinal(int i) {
            return values[i];
        }
    }

    /* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAuth$UserHasLicenseForAppResult.class */
    public enum UserHasLicenseForAppResult {
        HasLicense,
        DoesNotHaveLicense,
        NoAuth;
        
        private static final UserHasLicenseForAppResult[] values = values();

        /* JADX INFO: Access modifiers changed from: package-private */
        public static UserHasLicenseForAppResult byOrdinal(int i) {
            return values[i];
        }
    }
}
