package p101k0;

import I.AbstractC0868l;
import I.r;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22670a = a.f22671a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f22671a = new a();

        private a() {
        }

        public final j a(long j9) {
            return j9 != 16 ? new p101k0.b(j9, null) : b.f22672b;
        }
    }

    public static final class b implements j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22672b = new b();

        private b() {
        }

        @Override // p101k0.j
        public AbstractC0868l a() {
            return null;
        }

        @Override // p101k0.j
        public float b() {
            return Float.NaN;
        }

        @Override // p101k0.j
        public long c() {
            return r.f2740b.e();
        }
    }

    AbstractC0868l a();

    float b();

    long c();
}
