package R7;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0051 A[RETURN] */
    public static final String a(String wallpaperId) {
        n.h(wallpaperId, "wallpaperId");
        switch (wallpaperId.hashCode()) {
            case -1529105809:
                if (wallpaperId.equals("wallpaper1")) {
                    return "wallpaper_flower_blue";
                }
                return wallpaperId;
            case -1529105808:
                if (wallpaperId.equals("wallpaper2")) {
                    return "wallpaper_flower_purple";
                }
                return wallpaperId;
            case -1529105807:
                if (wallpaperId.equals("wallpaper3")) {
                    return "wallpaper_abstract_multicolour";
                }
                return wallpaperId;
            case -1529105806:
                if (wallpaperId.equals("wallpaper4")) {
                    return "wallpaper_dog_black";
                }
                return wallpaperId;
            case -1529105805:
                if (wallpaperId.equals("wallpaper5")) {
                    return "wallpaper_underground_dark";
                }
                return wallpaperId;
            case -1529105804:
            case -1529105803:
            default:
                return wallpaperId;
            case -1529105802:
                if (wallpaperId.equals("wallpaper8")) {
                    return "wallpaper_geototem1_light";
                }
                return wallpaperId;
        }
    }
}
