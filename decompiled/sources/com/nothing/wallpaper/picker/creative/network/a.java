package com.nothing.wallpaper.picker.creative.network;

import Y6.c;
import android.content.Context;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import com.nothing.wallpaper.picker.creative.network.entity.PromptResponse;
import com.nothing.wallpaper.picker.creative.network.entity.WallpaperResponse;
import g9.y;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p087i6.e;
import p087i6.l;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0485a f18477c = new C0485a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WallpaperApi f18478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18479b;

    /* JADX INFO: renamed from: com.nothing.wallpaper.picker.creative.network.a$a, reason: collision with other inner class name */
    public static final class C0485a {
        public /* synthetic */ C0485a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0485a() {
        }
    }

    public a(Context context) {
        n.h(context, "context");
        this.f18479b = true;
        String strC = l.f22204a.c(context, true);
        this.f18478a = (WallpaperApi) new y.b().c(strC).a(h9.a.f()).e(c.f9376a.a(context)).d().b(WallpaperApi.class);
    }

    private final int a(Context context, String str) {
        boolean zA = p087i6.n.a(context, "prompts_release_environment", false);
        if (n.d(str, p087i6.n.e(context, "prompts_language", "")) && this.f18479b == zA) {
            return p087i6.n.b(context, "prompts_version", 0);
        }
        p087i6.n.g(context, "prompts_version", 0);
        return 0;
    }

    private final void e(Context context, int i10, String str) {
        p087i6.n.i(context, "prompts_language", str);
        p087i6.n.g(context, "prompts_version", i10);
        p087i6.n.f(context, "prompts_release_environment", this.f18479b);
    }

    public final PromptResponse b(Context context, String language) {
        List<PromptCategory> promptSets;
        n.h(context, "context");
        n.h(language, "language");
        int iA = a(context, language);
        e eVar = e.f22188a;
        ResponseData responseData = (ResponseData) this.f18478a.b(new WallpaperApi.DeviceParam(language, iA, eVar.f(), eVar.e())).a().a();
        PromptResponse promptResponse = responseData != null ? (PromptResponse) responseData.getData() : null;
        if (promptResponse != null && (promptSets = promptResponse.getPromptSets()) != null && !promptSets.isEmpty()) {
            e(context, promptResponse.getVersion(), language);
        }
        return promptResponse;
    }

    public final WallpaperResponse c(String userId, Prompt subjectPrompt, Prompt stylePrompt, int i10) {
        n.h(userId, "userId");
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        ResponseData responseData = (ResponseData) this.f18478a.c(new WallpaperApi.WallpaperParam(userId, i10, AbstractC1444s.n(new WallpaperApi.PromptParam(subjectPrompt.getPromptWordId(), "subject", subjectPrompt.getPromptWordEn()), new WallpaperApi.PromptParam(stylePrompt.getPromptWordId(), "style", stylePrompt.getPromptWordEn())))).a().a();
        if (responseData != null) {
            return (WallpaperResponse) responseData.getData();
        }
        return null;
    }

    public final int d(Prompt subjectPrompt, Prompt stylePrompt) {
        Integer num;
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        ResponseData responseData = (ResponseData) this.f18478a.a(new WallpaperApi.WallpaperCountParam(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId())).a().a();
        if (responseData == null || (num = (Integer) responseData.getData()) == null) {
            return 0;
        }
        return num.intValue();
    }
}
