package android.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:android/view/KeyEvent.class */
public class KeyEvent extends InputEvent implements Parcelable {

    /* renamed from: b */
    private static final SparseArray f312b = new SparseArray();

    /* renamed from: c */
    private static final String[] f313c = {"META_SHIFT_ON", "META_ALT_ON", "META_SYM_ON", "META_FUNCTION_ON", "META_ALT_LEFT_ON", "META_ALT_RIGHT_ON", "META_SHIFT_LEFT_ON", "META_SHIFT_RIGHT_ON", "META_CAP_LOCKED", "META_ALT_LOCKED", "META_SYM_LOCKED", "0x00000800", "META_CTRL_ON", "META_CTRL_LEFT_ON", "META_CTRL_RIGHT_ON", "0x00008000", "META_META_ON", "META_META_LEFT_ON", "META_META_RIGHT_ON", "0x00080000", "META_CAPS_LOCK_ON", "META_NUM_LOCK_ON", "META_SCROLL_LOCK_ON", "0x00800000", "0x01000000", "0x02000000", "0x04000000", "0x08000000", "0x10000000", "0x20000000", "0x40000000", "0x80000000"};

    /* renamed from: d */
    private static final Object f314d = new Object();

    /* renamed from: e */
    private int f315e;

    /* renamed from: f */
    private int f316f;

    /* renamed from: g */
    private int f317g;

    /* renamed from: h */
    private int f318h;

    /* renamed from: i */
    private int f319i;

    /* renamed from: j */
    private int f320j;

    /* renamed from: k */
    private int f321k;

    /* renamed from: l */
    private int f322l;

    /* renamed from: m */
    private long f323m;

    /* renamed from: n */
    private long f324n;

    /* renamed from: o */
    private String f325o;

    /* renamed from: a */
    public static final Parcelable.Creator f326a;

    /* loaded from: game-lib.jar:android/view/KeyEvent$Callback.class */
    public interface Callback {
    }

    /* loaded from: game-lib.jar:android/view/KeyEvent$DispatcherState.class */
    public class DispatcherState {

        /* renamed from: a */
        SparseIntArray f327a = new SparseIntArray();
    }

    static {
        m4918b();
        f326a = new Parcelable.Creator() { // from class: android.view.KeyEvent.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public KeyEvent createFromParcel(Parcel parcel) {
                parcel.readInt();
                return KeyEvent.m4919a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public KeyEvent[] newArray(int i) {
                return new KeyEvent[i];
            }
        };
    }

    /* renamed from: b */
    private static void m4918b() {
        SparseArray sparseArray = f312b;
        sparseArray.m4923c(0, "KEYCODE_UNKNOWN");
        sparseArray.m4923c(1, "KEYCODE_SOFT_LEFT");
        sparseArray.m4923c(2, "KEYCODE_SOFT_RIGHT");
        sparseArray.m4923c(3, "KEYCODE_HOME");
        sparseArray.m4923c(4, "KEYCODE_BACK");
        sparseArray.m4923c(5, "KEYCODE_CALL");
        sparseArray.m4923c(6, "KEYCODE_ENDCALL");
        sparseArray.m4923c(7, "KEYCODE_0");
        sparseArray.m4923c(8, "KEYCODE_1");
        sparseArray.m4923c(9, "KEYCODE_2");
        sparseArray.m4923c(10, "KEYCODE_3");
        sparseArray.m4923c(11, "KEYCODE_4");
        sparseArray.m4923c(12, "KEYCODE_5");
        sparseArray.m4923c(13, "KEYCODE_6");
        sparseArray.m4923c(14, "KEYCODE_7");
        sparseArray.m4923c(15, "KEYCODE_8");
        sparseArray.m4923c(16, "KEYCODE_9");
        sparseArray.m4923c(17, "KEYCODE_STAR");
        sparseArray.m4923c(18, "KEYCODE_POUND");
        sparseArray.m4923c(19, "KEYCODE_DPAD_UP");
        sparseArray.m4923c(20, "KEYCODE_DPAD_DOWN");
        sparseArray.m4923c(21, "KEYCODE_DPAD_LEFT");
        sparseArray.m4923c(22, "KEYCODE_DPAD_RIGHT");
        sparseArray.m4923c(23, "KEYCODE_DPAD_CENTER");
        sparseArray.m4923c(24, "KEYCODE_VOLUME_UP");
        sparseArray.m4923c(25, "KEYCODE_VOLUME_DOWN");
        sparseArray.m4923c(26, "KEYCODE_POWER");
        sparseArray.m4923c(27, "KEYCODE_CAMERA");
        sparseArray.m4923c(28, "KEYCODE_CLEAR");
        sparseArray.m4923c(29, "KEYCODE_A");
        sparseArray.m4923c(30, "KEYCODE_B");
        sparseArray.m4923c(31, "KEYCODE_C");
        sparseArray.m4923c(32, "KEYCODE_D");
        sparseArray.m4923c(33, "KEYCODE_E");
        sparseArray.m4923c(34, "KEYCODE_F");
        sparseArray.m4923c(35, "KEYCODE_G");
        sparseArray.m4923c(36, "KEYCODE_H");
        sparseArray.m4923c(37, "KEYCODE_I");
        sparseArray.m4923c(38, "KEYCODE_J");
        sparseArray.m4923c(39, "KEYCODE_K");
        sparseArray.m4923c(40, "KEYCODE_L");
        sparseArray.m4923c(41, "KEYCODE_M");
        sparseArray.m4923c(42, "KEYCODE_N");
        sparseArray.m4923c(43, "KEYCODE_O");
        sparseArray.m4923c(44, "KEYCODE_P");
        sparseArray.m4923c(45, "KEYCODE_Q");
        sparseArray.m4923c(46, "KEYCODE_R");
        sparseArray.m4923c(47, "KEYCODE_S");
        sparseArray.m4923c(48, "KEYCODE_T");
        sparseArray.m4923c(49, "KEYCODE_U");
        sparseArray.m4923c(50, "KEYCODE_V");
        sparseArray.m4923c(51, "KEYCODE_W");
        sparseArray.m4923c(52, "KEYCODE_X");
        sparseArray.m4923c(53, "KEYCODE_Y");
        sparseArray.m4923c(54, "KEYCODE_Z");
        sparseArray.m4923c(55, "KEYCODE_COMMA");
        sparseArray.m4923c(56, "KEYCODE_PERIOD");
        sparseArray.m4923c(57, "KEYCODE_ALT_LEFT");
        sparseArray.m4923c(58, "KEYCODE_ALT_RIGHT");
        sparseArray.m4923c(59, "KEYCODE_SHIFT_LEFT");
        sparseArray.m4923c(60, "KEYCODE_SHIFT_RIGHT");
        sparseArray.m4923c(61, "KEYCODE_TAB");
        sparseArray.m4923c(62, "KEYCODE_SPACE");
        sparseArray.m4923c(63, "KEYCODE_SYM");
        sparseArray.m4923c(64, "KEYCODE_EXPLORER");
        sparseArray.m4923c(65, "KEYCODE_ENVELOPE");
        sparseArray.m4923c(66, "KEYCODE_ENTER");
        sparseArray.m4923c(67, "KEYCODE_DEL");
        sparseArray.m4923c(68, "KEYCODE_GRAVE");
        sparseArray.m4923c(69, "KEYCODE_MINUS");
        sparseArray.m4923c(70, "KEYCODE_EQUALS");
        sparseArray.m4923c(71, "KEYCODE_LEFT_BRACKET");
        sparseArray.m4923c(72, "KEYCODE_RIGHT_BRACKET");
        sparseArray.m4923c(73, "KEYCODE_BACKSLASH");
        sparseArray.m4923c(74, "KEYCODE_SEMICOLON");
        sparseArray.m4923c(75, "KEYCODE_APOSTROPHE");
        sparseArray.m4923c(76, "KEYCODE_SLASH");
        sparseArray.m4923c(77, "KEYCODE_AT");
        sparseArray.m4923c(78, "KEYCODE_NUM");
        sparseArray.m4923c(79, "KEYCODE_HEADSETHOOK");
        sparseArray.m4923c(80, "KEYCODE_FOCUS");
        sparseArray.m4923c(81, "KEYCODE_PLUS");
        sparseArray.m4923c(82, "KEYCODE_MENU");
        sparseArray.m4923c(83, "KEYCODE_NOTIFICATION");
        sparseArray.m4923c(84, "KEYCODE_SEARCH");
        sparseArray.m4923c(85, "KEYCODE_MEDIA_PLAY_PAUSE");
        sparseArray.m4923c(86, "KEYCODE_MEDIA_STOP");
        sparseArray.m4923c(87, "KEYCODE_MEDIA_NEXT");
        sparseArray.m4923c(88, "KEYCODE_MEDIA_PREVIOUS");
        sparseArray.m4923c(89, "KEYCODE_MEDIA_REWIND");
        sparseArray.m4923c(90, "KEYCODE_MEDIA_FAST_FORWARD");
        sparseArray.m4923c(91, "KEYCODE_MUTE");
        sparseArray.m4923c(92, "KEYCODE_PAGE_UP");
        sparseArray.m4923c(93, "KEYCODE_PAGE_DOWN");
        sparseArray.m4923c(94, "KEYCODE_PICTSYMBOLS");
        sparseArray.m4923c(95, "KEYCODE_SWITCH_CHARSET");
        sparseArray.m4923c(96, "KEYCODE_BUTTON_A");
        sparseArray.m4923c(97, "KEYCODE_BUTTON_B");
        sparseArray.m4923c(98, "KEYCODE_BUTTON_C");
        sparseArray.m4923c(99, "KEYCODE_BUTTON_X");
        sparseArray.m4923c(100, "KEYCODE_BUTTON_Y");
        sparseArray.m4923c(101, "KEYCODE_BUTTON_Z");
        sparseArray.m4923c(102, "KEYCODE_BUTTON_L1");
        sparseArray.m4923c(103, "KEYCODE_BUTTON_R1");
        sparseArray.m4923c(104, "KEYCODE_BUTTON_L2");
        sparseArray.m4923c(105, "KEYCODE_BUTTON_R2");
        sparseArray.m4923c(106, "KEYCODE_BUTTON_THUMBL");
        sparseArray.m4923c(107, "KEYCODE_BUTTON_THUMBR");
        sparseArray.m4923c(108, "KEYCODE_BUTTON_START");
        sparseArray.m4923c(109, "KEYCODE_BUTTON_SELECT");
        sparseArray.m4923c(110, "KEYCODE_BUTTON_MODE");
        sparseArray.m4923c(111, "KEYCODE_ESCAPE");
        sparseArray.m4923c(112, "KEYCODE_FORWARD_DEL");
        sparseArray.m4923c(113, "KEYCODE_CTRL_LEFT");
        sparseArray.m4923c(114, "KEYCODE_CTRL_RIGHT");
        sparseArray.m4923c(115, "KEYCODE_CAPS_LOCK");
        sparseArray.m4923c(116, "KEYCODE_SCROLL_LOCK");
        sparseArray.m4923c(117, "KEYCODE_META_LEFT");
        sparseArray.m4923c(118, "KEYCODE_META_RIGHT");
        sparseArray.m4923c(119, "KEYCODE_FUNCTION");
        sparseArray.m4923c(120, "KEYCODE_SYSRQ");
        sparseArray.m4923c(121, "KEYCODE_BREAK");
        sparseArray.m4923c(122, "KEYCODE_MOVE_HOME");
        sparseArray.m4923c(123, "KEYCODE_MOVE_END");
        sparseArray.m4923c(124, "KEYCODE_INSERT");
        sparseArray.m4923c(125, "KEYCODE_FORWARD");
        sparseArray.m4923c(126, "KEYCODE_MEDIA_PLAY");
        sparseArray.m4923c(127, "KEYCODE_MEDIA_PAUSE");
        sparseArray.m4923c(128, "KEYCODE_MEDIA_CLOSE");
        sparseArray.m4923c(129, "KEYCODE_MEDIA_EJECT");
        sparseArray.m4923c(130, "KEYCODE_MEDIA_RECORD");
        sparseArray.m4923c(131, "KEYCODE_F1");
        sparseArray.m4923c(132, "KEYCODE_F2");
        sparseArray.m4923c(133, "KEYCODE_F3");
        sparseArray.m4923c(134, "KEYCODE_F4");
        sparseArray.m4923c(135, "KEYCODE_F5");
        sparseArray.m4923c(136, "KEYCODE_F6");
        sparseArray.m4923c(137, "KEYCODE_F7");
        sparseArray.m4923c(138, "KEYCODE_F8");
        sparseArray.m4923c(139, "KEYCODE_F9");
        sparseArray.m4923c(140, "KEYCODE_F10");
        sparseArray.m4923c(141, "KEYCODE_F11");
        sparseArray.m4923c(142, "KEYCODE_F12");
        sparseArray.m4923c(143, "KEYCODE_NUM_LOCK");
        sparseArray.m4923c(144, "KEYCODE_NUMPAD_0");
        sparseArray.m4923c(145, "KEYCODE_NUMPAD_1");
        sparseArray.m4923c(146, "KEYCODE_NUMPAD_2");
        sparseArray.m4923c(147, "KEYCODE_NUMPAD_3");
        sparseArray.m4923c(148, "KEYCODE_NUMPAD_4");
        sparseArray.m4923c(149, "KEYCODE_NUMPAD_5");
        sparseArray.m4923c(150, "KEYCODE_NUMPAD_6");
        sparseArray.m4923c(151, "KEYCODE_NUMPAD_7");
        sparseArray.m4923c(152, "KEYCODE_NUMPAD_8");
        sparseArray.m4923c(153, "KEYCODE_NUMPAD_9");
        sparseArray.m4923c(154, "KEYCODE_NUMPAD_DIVIDE");
        sparseArray.m4923c(155, "KEYCODE_NUMPAD_MULTIPLY");
        sparseArray.m4923c(156, "KEYCODE_NUMPAD_SUBTRACT");
        sparseArray.m4923c(157, "KEYCODE_NUMPAD_ADD");
        sparseArray.m4923c(158, "KEYCODE_NUMPAD_DOT");
        sparseArray.m4923c(159, "KEYCODE_NUMPAD_COMMA");
        sparseArray.m4923c(160, "KEYCODE_NUMPAD_ENTER");
        sparseArray.m4923c(161, "KEYCODE_NUMPAD_EQUALS");
        sparseArray.m4923c(162, "KEYCODE_NUMPAD_LEFT_PAREN");
        sparseArray.m4923c(163, "KEYCODE_NUMPAD_RIGHT_PAREN");
        sparseArray.m4923c(164, "KEYCODE_VOLUME_MUTE");
        sparseArray.m4923c(165, "KEYCODE_INFO");
        sparseArray.m4923c(166, "KEYCODE_CHANNEL_UP");
        sparseArray.m4923c(167, "KEYCODE_CHANNEL_DOWN");
        sparseArray.m4923c(168, "KEYCODE_ZOOM_IN");
        sparseArray.m4923c(169, "KEYCODE_ZOOM_OUT");
        sparseArray.m4923c(170, "KEYCODE_TV");
        sparseArray.m4923c(171, "KEYCODE_WINDOW");
        sparseArray.m4923c(172, "KEYCODE_GUIDE");
        sparseArray.m4923c(173, "KEYCODE_DVR");
        sparseArray.m4923c(174, "KEYCODE_BOOKMARK");
        sparseArray.m4923c(175, "KEYCODE_CAPTIONS");
        sparseArray.m4923c(176, "KEYCODE_SETTINGS");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER, "KEYCODE_TV_POWER");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT, "KEYCODE_TV_INPUT");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, "KEYCODE_STB_INPUT");
        sparseArray.m4923c(179, "KEYCODE_STB_POWER");
        sparseArray.m4923c(181, "KEYCODE_AVR_POWER");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, "KEYCODE_AVR_INPUT");
        sparseArray.m4923c(183, "KEYCODE_PROG_RED");
        sparseArray.m4923c(184, "KEYCODE_PROG_GREEN");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, "KEYCODE_PROG_YELLOW");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_BLUE, "KEYCODE_PROG_BLUE");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_APP_SWITCH, "KEYCODE_APP_SWITCH");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_1, "KEYCODE_BUTTON_1");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, "KEYCODE_BUTTON_2");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, "KEYCODE_BUTTON_3");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_4, "KEYCODE_BUTTON_4");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_5, "KEYCODE_BUTTON_5");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6, "KEYCODE_BUTTON_6");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_7, "KEYCODE_BUTTON_7");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, "KEYCODE_BUTTON_8");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_9, "KEYCODE_BUTTON_9");
        sparseArray.m4923c(197, "KEYCODE_BUTTON_10");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_11, "KEYCODE_BUTTON_11");
        sparseArray.m4923c(199, "KEYCODE_BUTTON_12");
        sparseArray.m4923c(200, "KEYCODE_BUTTON_13");
        sparseArray.m4923c(201, "KEYCODE_BUTTON_14");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, "KEYCODE_BUTTON_15");
        sparseArray.m4923c(203, "KEYCODE_BUTTON_16");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LANGUAGE_SWITCH, "KEYCODE_LANGUAGE_SWITCH");
        sparseArray.m4923c(205, "KEYCODE_MANNER_MODE");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, "KEYCODE_3D_MODE");
        sparseArray.m4923c(207, "KEYCODE_CONTACTS");
        sparseArray.m4923c(208, "KEYCODE_CALENDAR");
        sparseArray.m4923c(209, "KEYCODE_MUSIC");
        sparseArray.m4923c(210, "KEYCODE_CALCULATOR");
        sparseArray.m4923c(211, "KEYCODE_ZENKAKU_HANKAKU");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, "KEYCODE_EISU");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_MUHENKAN, "KEYCODE_MUHENKAN");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_HENKAN, "KEYCODE_HENKAN");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, "KEYCODE_KATAKANA_HIRAGANA");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_YEN, "KEYCODE_YEN");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_RO, "KEYCODE_RO");
        sparseArray.m4923c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KANA, "KEYCODE_KANA");
        sparseArray.m4923c(219, "KEYCODE_ASSIST");
        sparseArray.m4923c(220, "KEYCODE_BRIGHTNESS_DOWN");
        sparseArray.m4923c(221, "KEYCODE_BRIGHTNESS_UP");
        sparseArray.m4923c(222, "KEYCODE_MEDIA_AUDIO_TRACK");
    }

    /* renamed from: a */
    public static int m4921a() {
        return 222;
    }

    private KeyEvent() {
    }

    @Override // android.view.InputEvent
    public final int getDeviceId() {
        return this.f315e;
    }

    @Override // android.view.InputEvent
    public final int getSource() {
        return this.f316f;
    }

    @Override // android.view.InputEvent
    public final long getEventTime() {
        return this.f324n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent { action=").append(m4920a(this.f318h));
        sb.append(", keyCode=").append(m4917b(this.f319i));
        sb.append(", scanCode=").append(this.f320j);
        if (this.f325o != null) {
            sb.append(", characters=\"").append(this.f325o).append("\"");
        }
        sb.append(", metaState=").append(m4916c(this.f317g));
        sb.append(", flags=0x").append(Integer.toHexString(this.f322l));
        sb.append(", repeatCount=").append(this.f321k);
        sb.append(", eventTime=").append(this.f324n);
        sb.append(", downTime=").append(this.f323m);
        sb.append(", deviceId=").append(this.f315e);
        sb.append(", source=0x").append(Integer.toHexString(this.f316f));
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4920a(int i) {
        switch (i) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MULTIPLE";
            default:
                return Integer.toString(i);
        }
    }

    /* renamed from: b */
    public static String m4917b(int i) {
        String str = (String) f312b.m4930a(i);
        return str != null ? str : Integer.toString(i);
    }

    /* renamed from: c */
    public static String m4916c(int i) {
        if (i == 0) {
            return "0";
        }
        StringBuilder sb = null;
        int i2 = 0;
        while (i != 0) {
            boolean z = (i & 1) != 0;
            i >>>= 1;
            if (z) {
                String str = f313c[i2];
                if (sb == null) {
                    if (i == 0) {
                        return str;
                    }
                    sb = new StringBuilder(str);
                } else {
                    sb.append('|');
                    sb.append(str);
                }
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static KeyEvent m4919a(Parcel parcel) {
        return new KeyEvent(parcel);
    }

    private KeyEvent(Parcel parcel) {
        this.f315e = parcel.readInt();
        this.f316f = parcel.readInt();
        this.f318h = parcel.readInt();
        this.f319i = parcel.readInt();
        this.f321k = parcel.readInt();
        this.f317g = parcel.readInt();
        this.f320j = parcel.readInt();
        this.f322l = parcel.readInt();
        this.f323m = parcel.readLong();
        this.f324n = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f315e);
        parcel.writeInt(this.f316f);
        parcel.writeInt(this.f318h);
        parcel.writeInt(this.f319i);
        parcel.writeInt(this.f321k);
        parcel.writeInt(this.f317g);
        parcel.writeInt(this.f320j);
        parcel.writeInt(this.f322l);
        parcel.writeLong(this.f323m);
        parcel.writeLong(this.f324n);
    }
}
