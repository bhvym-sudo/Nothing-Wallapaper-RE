package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C1022b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f12759o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f12760p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f12761q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f12763b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f12766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f12767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f12768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f12769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f12770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f12771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0389e f12775n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f12762a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f12764c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f12765d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f12776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f12777c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0388a extends i {
            C0388a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                a.this.f12779a.n(th);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f12779a.f12767f.a(new C0388a());
            } catch (Throwable th) {
                this.f12779a.n(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9) {
            return this.f12776b.h(charSequence, i10, i11, i12, z9);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f12777c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f12779a.f12769h);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f12779a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f12777c = mVar;
            m mVar2 = this.f12777c;
            j jVar = this.f12779a.f12768g;
            InterfaceC0389e interfaceC0389e = this.f12779a.f12775n;
            e eVar = this.f12779a;
            this.f12776b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0389e, eVar.f12770i, eVar.f12771j, androidx.emoji2.text.g.a());
            this.f12779a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f12779a;

        b(e eVar) {
            this.f12779a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f12780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f12781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f12783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f12784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f12785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f12786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12787h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f12788i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0389e f12789j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            B0.i.f(hVar, "metadataLoader cannot be null.");
            this.f12780a = hVar;
        }

        protected final h a() {
            return this.f12780a;
        }

        public c b(int i10) {
            this.f12788i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public androidx.emoji2.text.i a(o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0389e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f12790q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Throwable f12791r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f12792s;

        g(f fVar, int i10) {
            this(Arrays.asList((f) B0.i.f(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f12790q.size();
            int i10 = 0;
            if (this.f12792s != 1) {
                while (i10 < size) {
                    ((f) this.f12790q.get(i10)).a(this.f12791r);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f12790q.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th) {
            B0.i.f(collection, "initCallbacks cannot be null");
            this.f12790q = new ArrayList(collection);
            this.f12792s = i10;
            this.f12791r = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    public interface j {
        androidx.emoji2.text.i a(o oVar);
    }

    private e(c cVar) {
        this.f12769h = cVar.f12782c;
        this.f12770i = cVar.f12783d;
        this.f12771j = cVar.f12784e;
        this.f12772k = cVar.f12786g;
        this.f12773l = cVar.f12787h;
        this.f12767f = cVar.f12780a;
        this.f12774m = cVar.f12788i;
        this.f12775n = cVar.f12789j;
        C1022b c1022b = new C1022b();
        this.f12763b = c1022b;
        j jVar = cVar.f12781b;
        this.f12768g = jVar == null ? new d() : jVar;
        Set set = cVar.f12785f;
        if (set != null && !set.isEmpty()) {
            c1022b.addAll(cVar.f12785f);
        }
        this.f12766e = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (f12759o) {
            eVar = f12761q;
            B0.i.g(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z9);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static e h(c cVar) {
        e eVar;
        e eVar2 = f12761q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f12759o) {
            try {
                eVar = f12761q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f12761q = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f12761q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f12762a.writeLock().lock();
        try {
            if (this.f12774m == 0) {
                this.f12764c = 0;
            }
            this.f12762a.writeLock().unlock();
            if (e() == 0) {
                this.f12766e.a();
            }
        } catch (Throwable th) {
            this.f12762a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f12773l;
    }

    public int e() {
        this.f12762a.readLock().lock();
        try {
            return this.f12764c;
        } finally {
            this.f12762a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f12772k;
    }

    public void l() {
        B0.i.g(this.f12774m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f12762a.writeLock().lock();
        try {
            if (this.f12764c == 0) {
                this.f12762a.writeLock().unlock();
                return;
            }
            this.f12764c = 0;
            this.f12762a.writeLock().unlock();
            this.f12766e.a();
        } catch (Throwable th) {
            this.f12762a.writeLock().unlock();
            throw th;
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f12762a.writeLock().lock();
        try {
            this.f12764c = 2;
            arrayList.addAll(this.f12763b);
            this.f12763b.clear();
            this.f12762a.writeLock().unlock();
            this.f12765d.post(new g(arrayList, this.f12764c, th));
        } catch (Throwable th2) {
            this.f12762a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f12762a.writeLock().lock();
        try {
            this.f12764c = 1;
            arrayList.addAll(this.f12763b);
            this.f12763b.clear();
            this.f12762a.writeLock().unlock();
            this.f12765d.post(new g(arrayList, this.f12764c));
        } catch (Throwable th) {
            this.f12762a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z9;
        B0.i.g(k(), "Not initialized yet");
        B0.i.d(i10, "start cannot be negative");
        B0.i.d(i11, "end cannot be negative");
        B0.i.d(i12, "maxEmojiCount cannot be negative");
        B0.i.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        B0.i.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        B0.i.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z9 = i13 != 2 ? this.f12769h : false;
        } else {
            z9 = true;
        }
        return this.f12766e.b(charSequence, i10, i11, i12, z9);
    }

    public void t(f fVar) {
        B0.i.f(fVar, "initCallback cannot be null");
        this.f12762a.writeLock().lock();
        try {
            if (this.f12764c == 1 || this.f12764c == 2) {
                this.f12765d.post(new g(fVar, this.f12764c));
            } else {
                this.f12763b.add(fVar);
            }
        } finally {
            this.f12762a.writeLock().unlock();
        }
    }

    public void u(f fVar) {
        B0.i.f(fVar, "initCallback cannot be null");
        this.f12762a.writeLock().lock();
        try {
            this.f12763b.remove(fVar);
        } finally {
            this.f12762a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f12766e.c(editorInfo);
    }
}
