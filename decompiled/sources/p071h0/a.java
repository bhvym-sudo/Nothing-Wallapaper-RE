package p071h0;

import android.util.Log;
import java.util.Locale;
import kotlin.jvm.internal.n;
import p081i0.e;
import p081i0.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f21564a = e.a();

    @Override // p071h0.f
    public Locale a(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (n.d(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(b.f21565a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
