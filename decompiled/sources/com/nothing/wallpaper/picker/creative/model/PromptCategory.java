package com.nothing.wallpaper.picker.creative.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class PromptCategory implements Parcelable {
    public static final Parcelable.Creator<PromptCategory> CREATOR = new a();
    private final String category;
    private final List<Prompt> prompts;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromptCategory createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Prompt.CREATOR.createFromParcel(parcel));
            }
            return new PromptCategory(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PromptCategory[] newArray(int i10) {
            return new PromptCategory[i10];
        }
    }

    public PromptCategory(String category, List<Prompt> prompts) {
        n.h(category, "category");
        n.h(prompts, "prompts");
        this.category = category;
        this.prompts = prompts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromptCategory copy$default(PromptCategory promptCategory, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = promptCategory.category;
        }
        if ((i10 & 2) != 0) {
            list = promptCategory.prompts;
        }
        return promptCategory.copy(str, list);
    }

    public final String component1() {
        return this.category;
    }

    public final List<Prompt> component2() {
        return this.prompts;
    }

    public final PromptCategory copy(String category, List<Prompt> prompts) {
        n.h(category, "category");
        n.h(prompts, "prompts");
        return new PromptCategory(category, prompts);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptCategory)) {
            return false;
        }
        PromptCategory promptCategory = (PromptCategory) obj;
        return n.d(this.category, promptCategory.category) && n.d(this.prompts, promptCategory.prompts);
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<Prompt> getPrompts() {
        return this.prompts;
    }

    public int hashCode() {
        return (this.category.hashCode() * 31) + this.prompts.hashCode();
    }

    public String toString() {
        return "PromptCategory(category=" + this.category + ", prompts=" + this.prompts + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.category);
        List<Prompt> list = this.prompts;
        dest.writeInt(list.size());
        Iterator<Prompt> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
    }
}
