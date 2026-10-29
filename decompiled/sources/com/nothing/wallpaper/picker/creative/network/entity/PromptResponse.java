package com.nothing.wallpaper.picker.creative.network.entity;

import androidx.annotation.Keep;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class PromptResponse {
    private final String localLanguageCode;
    private final List<PromptCategory> promptSets;
    private final int version;

    public PromptResponse(int i10, String localLanguageCode, List<PromptCategory> list) {
        n.h(localLanguageCode, "localLanguageCode");
        this.version = i10;
        this.localLanguageCode = localLanguageCode;
        this.promptSets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromptResponse copy$default(PromptResponse promptResponse, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = promptResponse.version;
        }
        if ((i11 & 2) != 0) {
            str = promptResponse.localLanguageCode;
        }
        if ((i11 & 4) != 0) {
            list = promptResponse.promptSets;
        }
        return promptResponse.copy(i10, str, list);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.localLanguageCode;
    }

    public final List<PromptCategory> component3() {
        return this.promptSets;
    }

    public final PromptResponse copy(int i10, String localLanguageCode, List<PromptCategory> list) {
        n.h(localLanguageCode, "localLanguageCode");
        return new PromptResponse(i10, localLanguageCode, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptResponse)) {
            return false;
        }
        PromptResponse promptResponse = (PromptResponse) obj;
        return this.version == promptResponse.version && n.d(this.localLanguageCode, promptResponse.localLanguageCode) && n.d(this.promptSets, promptResponse.promptSets);
    }

    public final String getLocalLanguageCode() {
        return this.localLanguageCode;
    }

    public final List<PromptCategory> getPromptSets() {
        return this.promptSets;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.version) * 31) + this.localLanguageCode.hashCode()) * 31;
        List<PromptCategory> list = this.promptSets;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PromptResponse(version=" + this.version + ", localLanguageCode=" + this.localLanguageCode + ", promptSets=" + this.promptSets + ")";
    }
}
