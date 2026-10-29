package V6;

import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.graphics.Point;
import com.nothing.wallpaper.db.CreativeWallpaper;
import com.nothing.wallpaper.db.WallpaperRequestIndex;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import com.nothing.wallpaper.picker.creative.network.entity.PromptResponse;
import com.nothing.wallpaper.picker.creative.network.entity.WallpaperResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p087i6.h;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p129m8.e;
import p207u6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0296a f8200e = new C0296a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile a f8201f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p207u6.a f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f8203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.nothing.wallpaper.picker.creative.network.a f8204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8205d;

    /* JADX INFO: renamed from: V6.a$a, reason: collision with other inner class name */
    public static final class C0296a {
        public /* synthetic */ C0296a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a(p207u6.a dao, c wallpaperRequestIndexDao, com.nothing.wallpaper.picker.creative.network.a networkService) {
            a aVar;
            n.h(dao, "dao");
            n.h(wallpaperRequestIndexDao, "wallpaperRequestIndexDao");
            n.h(networkService, "networkService");
            a aVar2 = a.f8201f;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.f8201f;
                if (aVar == null) {
                    aVar = new a(dao, wallpaperRequestIndexDao, networkService, null);
                    a.f8201f = aVar;
                }
            }
            return aVar;
        }

        private C0296a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f8206q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f8207r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f8208s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f8210u;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8208s = obj;
            this.f8210u |= Integer.MIN_VALUE;
            return a.this.h(null, false, null, this);
        }
    }

    public /* synthetic */ a(p207u6.a aVar, c cVar, com.nothing.wallpaper.picker.creative.network.a aVar2, AbstractC1457h abstractC1457h) {
        this(aVar, cVar, aVar2);
    }

    private final List d(List list, int i10, List list2) {
        int i11 = i10 + 1;
        if (list.size() <= i11) {
            return AbstractC1444s.g0(list, list2);
        }
        return AbstractC1444s.g0(list.subList(0, i11), AbstractC1444s.f(AbstractC1444s.g0(list.subList(i11, list.size()), list2)));
    }

    private final List e(int i10, int i11, boolean z9) {
        if (i10 > i11) {
            return new ArrayList();
        }
        int i12 = (i11 - i10) + 1;
        Integer[] numArr = new Integer[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            numArr[i13] = Integer.valueOf(i13 + i10);
        }
        if (z9) {
            AbstractC1439m.S(numArr);
        }
        return AbstractC1439m.Y(numArr);
    }

    static /* synthetic */ List f(a aVar, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z9 = true;
        }
        return aVar.e(i10, i11, z9);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final PromptResponse i(Context context) throws Throwable {
        FileInputStream fileInputStream;
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "getPromptsFromLocal");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(context.getFilesDir(), "prompts.json");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("prompts.json");
            try {
                n.e(fileInputStreamOpenFileInput);
                PromptResponse promptResponse = (PromptResponse) h.b(fileInputStreamOpenFileInput, PromptResponse.class);
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e10) {
                        com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "getPromptsFromLocal close exception:" + e10.getMessage());
                    }
                }
                return promptResponse;
            } catch (Exception e11) {
                fileInputStream = fileInputStreamOpenFileInput;
                e = e11;
                try {
                    com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "getPromptsFromLocal exception:" + e.getMessage());
                    if (fileInputStream == null) {
                        return null;
                    }
                    try {
                        fileInputStream.close();
                        return null;
                    } catch (Exception e12) {
                        com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "getPromptsFromLocal close exception:" + e12.getMessage());
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e13) {
                            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "getPromptsFromLocal close exception:" + e13.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream2 = fileInputStreamOpenFileInput;
                th = th2;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final X6.b j(Context context) throws Throwable {
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "getPromptsResultFromLocal");
        PromptResponse promptResponseI = i(context);
        List<PromptCategory> promptSets = promptResponseI != null ? promptResponseI.getPromptSets() : null;
        List<PromptCategory> list = promptSets;
        return (list == null || list.isEmpty()) ? new X6.b.a(new Exception()) : new X6.b.C0322b(promptSets);
    }

    private final boolean o(X6.b bVar) {
        List listA;
        return (!(bVar instanceof X6.b.C0322b) || (listA = ((X6.b.C0322b) bVar).a()) == null || listA.isEmpty()) ? false : true;
    }

    private final Object p(Context context, String str, e eVar) throws Throwable {
        X6.b aVar;
        List<PromptCategory> listL;
        List<PromptCategory> promptSets;
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "requestPrompts");
        try {
            PromptResponse promptResponseB = this.f8204c.b(context, str);
            if (promptResponseB == null || (listL = promptResponseB.getPromptSets()) == null) {
                listL = AbstractC1444s.l();
            }
            if (promptResponseB != null && (promptSets = promptResponseB.getPromptSets()) != null && (!promptSets.isEmpty())) {
                s(context, promptResponseB);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f8205d = jCurrentTimeMillis;
            p087i6.n.h(context, "last_request_prompt_time", jCurrentTimeMillis);
            aVar = new X6.b.C0322b(listL);
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "requestPrompts exception:" + e10.getMessage());
            aVar = new X6.b.a(e10);
        }
        p008a7.d.f9853v.e(aVar);
        return aVar;
    }

    private final void s(Context context, PromptResponse promptResponse) throws Throwable {
        String message;
        StringBuilder sb;
        List<PromptCategory> promptSets = promptResponse.getPromptSets();
        if (promptSets == null || promptSets.isEmpty()) {
            com.nothing.wallpaper.common.log.c.o("WallpaperRepository", "savePromptsToLocal prompts is empty, return!");
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(context.openFileOutput("prompts.json", 0)));
                try {
                    bufferedWriter2.write(h.c(promptResponse));
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e10) {
                        message = e10.getMessage();
                        sb = new StringBuilder();
                        sb.append("savePromptsToLocal close exception:");
                        sb.append(message);
                        com.nothing.wallpaper.common.log.c.f("WallpaperRepository", sb.toString());
                    }
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "savePromptsToLocal exception:" + e.getMessage());
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (Exception e12) {
                            message = e12.getMessage();
                            sb = new StringBuilder();
                            sb.append("savePromptsToLocal close exception:");
                            sb.append(message);
                            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", sb.toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (Exception e13) {
                            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "savePromptsToLocal close exception:" + e13.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c() {
        if (this.f8202a.getCount() > 10000) {
            this.f8202a.a(10000);
            com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "checkHistoryCount deleteBeyond");
        }
    }

    public final Object g(String str, Prompt prompt, Prompt prompt2, int i10, e eVar) {
        List<Wallpaper> listL;
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "generateWallpaper");
        try {
            WallpaperResponse wallpaperResponseC = this.f8204c.c(str, prompt, prompt2, i10);
            if (wallpaperResponseC == null || (listL = wallpaperResponseC.getWallpapers()) == null) {
                listL = AbstractC1444s.l();
            }
            return new X6.d.b(listL);
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "generateWallpaper exception:" + e10.getMessage());
            return new X6.d.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r13 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r10, boolean r11, java.lang.String r12, p129m8.e r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof V6.a.b
            if (r0 == 0) goto L13
            r0 = r13
            V6.a$b r0 = (V6.a.b) r0
            int r1 = r0.f8210u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8210u = r1
            goto L18
        L13:
            V6.a$b r0 = new V6.a$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8208s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f8210u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p079h8.r.b(r13)
            goto La9
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.f8207r
            r10 = r9
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r9 = r0.f8206q
            V6.a r9 = (V6.a) r9
            p079h8.r.b(r13)
            goto L84
        L42:
            p079h8.r.b(r13)
            java.lang.String r13 = "prompts_language"
            java.lang.String r2 = ""
            java.lang.String r13 = p087i6.n.e(r10, r13, r2)
            boolean r13 = kotlin.jvm.internal.n.d(r12, r13)
            r13 = r13 ^ r4
            long r5 = r9.f8205d
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L62
            java.lang.String r2 = "last_request_prompt_time"
            long r5 = p087i6.n.c(r10, r2, r7)
            r9.f8205d = r5
        L62:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r9.f8205d
            long r5 = r5 - r7
            r7 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L72
            r2 = r4
            goto L73
        L72:
            r2 = 0
        L73:
            r13 = r13 | r2
            r11 = r11 | r13
            if (r11 == 0) goto L98
            r0.f8206q = r9
            r0.f8207r = r10
            r0.f8210u = r4
            java.lang.Object r13 = r9.p(r10, r12, r0)
            if (r13 != r1) goto L84
            goto La8
        L84:
            X6.b r13 = (X6.b) r13
            boolean r11 = r9.o(r13)
            if (r11 != 0) goto L97
            X6.b r10 = r9.j(r10)
            boolean r9 = r9.o(r10)
            if (r9 == 0) goto L97
            return r10
        L97:
            return r13
        L98:
            X6.b r11 = r9.j(r10)
            boolean r13 = r11 instanceof X6.b.a
            if (r13 == 0) goto Lac
            r0.f8210u = r3
            java.lang.Object r13 = r9.p(r10, r12, r0)
            if (r13 != r1) goto La9
        La8:
            return r1
        La9:
            X6.b r13 = (X6.b) r13
            return r13
        Lac:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.a.h(android.content.Context, boolean, java.lang.String, m8.e):java.lang.Object");
    }

    public final CreativeWallpaper k(long j9) {
        return this.f8202a.e(j9);
    }

    public final CreativeWallpaper l(String imageUrl) {
        n.h(imageUrl, "imageUrl");
        return this.f8202a.f(imageUrl);
    }

    public final WallpaperRequestIndex m(Prompt subjectPrompt, Prompt stylePrompt) {
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        return this.f8203b.a(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId());
    }

    public final Point n(Prompt subjectPrompt, Prompt stylePrompt) {
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        WallpaperRequestIndex wallpaperRequestIndexM = m(subjectPrompt, stylePrompt);
        int requestIndex = wallpaperRequestIndexM != null ? wallpaperRequestIndexM.getRequestIndex() : 0;
        String indexArray = wallpaperRequestIndexM != null ? wallpaperRequestIndexM.getIndexArray() : null;
        List listA = indexArray != null ? h.a(indexArray) : null;
        Point point = new Point(0, 0);
        if ((listA != null ? listA.size() : 0) > requestIndex) {
            point.x = requestIndex;
            point.y = listA != null ? ((Number) listA.get(requestIndex)).intValue() : 0;
        }
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "getWallpaperRequestIndex array:" + listA + " index:" + requestIndex);
        return point;
    }

    public final int q(Prompt subjectPrompt, Prompt stylePrompt) {
        int iD;
        List list;
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        WallpaperRequestIndex wallpaperRequestIndexM = m(subjectPrompt, stylePrompt);
        int totalCount = wallpaperRequestIndexM != null ? wallpaperRequestIndexM.getTotalCount() : 0;
        try {
            iD = this.f8204c.d(subjectPrompt, stylePrompt);
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("WallpaperRepository", "requestWallpaperTotalCount occur error, msg:" + e10.getMessage());
            iD = 0;
        }
        com.nothing.wallpaper.common.log.c.d("WallpaperRepository", "requestWallpaperTotalCount lastCount:" + totalCount + " newCount:" + iD);
        String indexArray = wallpaperRequestIndexM != null ? wallpaperRequestIndexM.getIndexArray() : null;
        List listA = indexArray != null ? h.a(indexArray) : null;
        if (totalCount == iD && (list = listA) != null && !list.isEmpty()) {
            return iD;
        }
        if (wallpaperRequestIndexM == null) {
            int i10 = iD;
            this.f8203b.d(new WallpaperRequestIndex(0, subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId(), h.c(f(this, 0, iD - 1, false, 4, null)), i10, 0, 0));
            return i10;
        }
        List list2 = listA;
        if (list2 == null || list2.isEmpty()) {
            this.f8203b.b(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId(), h.c(f(this, 0, iD - 1, false, 4, null)), iD, 0);
            return iD;
        }
        if (totalCount < iD) {
            this.f8203b.b(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId(), h.c(d(listA, wallpaperRequestIndexM.getRequestIndex(), e(totalCount, iD - 1, false))), iD, 0);
            return iD;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((Number) obj).intValue() < iD) {
                arrayList.add(obj);
            }
        }
        this.f8203b.b(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId(), h.c(arrayList), iD, 0);
        return iD;
    }

    public final boolean r(CreativeWallpaper wallpaper) {
        n.h(wallpaper, "wallpaper");
        try {
            this.f8202a.b(wallpaper);
            return true;
        } catch (SQLiteConstraintException unused) {
            com.nothing.wallpaper.common.log.c.o("WallpaperRepository", "saveGeneratedHistory already saved!");
            return false;
        }
    }

    public final int t(Prompt subjectPrompt, Prompt stylePrompt, int i10) {
        n.h(subjectPrompt, "subjectPrompt");
        n.h(stylePrompt, "stylePrompt");
        WallpaperRequestIndex wallpaperRequestIndexA = this.f8203b.a(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId());
        int i11 = i10 + 1;
        return this.f8203b.c(subjectPrompt.getPromptWordId(), stylePrompt.getPromptWordId(), (wallpaperRequestIndexA != null ? wallpaperRequestIndexA.getTotalCount() : 0) > i11 ? i11 : 0);
    }

    private a(p207u6.a aVar, c cVar, com.nothing.wallpaper.picker.creative.network.a aVar2) {
        this.f8202a = aVar;
        this.f8203b = cVar;
        this.f8204c = aVar2;
    }
}
