package com.android.launcher3;

import android.content.ComponentName;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public class m extends C2.b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ComponentName f15629F;

    @Override // C2.b
    protected String b() {
        return super.b() + " componentName=" + this.f15629F;
    }

    @Override // C2.b
    public ComponentName d() {
        return (ComponentName) Optional.ofNullable(super.d()).orElse(this.f15629F);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public m clone() {
        return f();
    }

    @Override // C2.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public m f() {
        m mVar = new m();
        mVar.a(this);
        mVar.f15629F = this.f15629F;
        return mVar;
    }
}
