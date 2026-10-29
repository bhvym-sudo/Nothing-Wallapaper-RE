.class public final Li7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:LI8/A;

.field private final c:LI8/O;

.field private final d:Li7/g$a;


# direct methods
.method public constructor <init>(I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li7/g;->a:I

    sget-object p1, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;->a(Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p1

    iput-object p1, p0, Li7/g;->b:LI8/A;

    invoke-static {p1}, LI8/h;->b(LI8/A;)LI8/O;

    move-result-object p1

    iput-object p1, p0, Li7/g;->c:LI8/O;

    new-instance p1, Li7/g$a;

    invoke-direct {p1, p0}, Li7/g$a;-><init>(Li7/g;)V

    iput-object p1, p0, Li7/g;->d:Li7/g$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Li6/n;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public static synthetic a(Lg3/x;)Lg3/p;
    .registers 1

    invoke-static {p0}, Li7/g;->k(Lg3/x;)Lg3/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg3/x;)Z
    .registers 1

    invoke-static {p0}, Li7/g;->j(Lg3/x;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Li7/g;)I
    .registers 1

    iget p0, p0, Li7/g;->a:I

    return p0
.end method

.method public static final synthetic d(Li7/g;)LI8/A;
    .registers 1

    iget-object p0, p0, Li7/g;->b:LI8/A;

    return-object p0
.end method

.method public static final synthetic e(Li7/g;Ljava/util/List;Ljava/util/List;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Li7/g;->i(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method private final i(Ljava/util/List;Ljava/util/List;I)V
    .registers 6

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_59

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg3/a;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int v0, p3, v0

    if-gtz v0, :cond_1b

    goto :goto_59

    :cond_1b
    instance-of v1, p2, Lg3/r;

    if-eqz v1, :cond_6

    check-cast p2, Lg3/r;

    invoke-virtual {p2}, Lg3/r;->q()Ljava/util/List;

    move-result-object p2

    const-string v1, "getUnmodifiableWallpapers(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Li8/s;->K(Ljava/lang/Iterable;)LD8/h;

    move-result-object p2

    new-instance v1, Li7/e;

    invoke-direct {v1}, Li7/e;-><init>()V

    invoke-static {p2, v1}, LD8/k;->o(LD8/h;Lv8/l;)LD8/h;

    move-result-object p2

    new-instance v1, Li7/f;

    invoke-direct {v1}, Li7/f;-><init>()V

    invoke-static {p2, v1}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object p2

    new-instance v1, Li7/g$c;

    invoke-direct {v1}, Li7/g$c;-><init>()V

    invoke-static {p2, v1}, LD8/k;->z(LD8/h;Ljava/util/Comparator;)LD8/h;

    move-result-object p2

    invoke-static {p2, v0}, LD8/k;->A(LD8/h;I)LD8/h;

    move-result-object p2

    invoke-static {p2}, LD8/k;->D(LD8/h;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_6

    :cond_59
    :goto_59
    return-void
.end method

.method private static final j(Lg3/x;)Z
    .registers 1

    instance-of p0, p0, Lg3/p;

    return p0
.end method

.method private static final k(Lg3/x;)Lg3/p;
    .registers 2

    const-string v0, "null cannot be cast to non-null type com.android.wallpaper.model.SystemStaticWallpaperInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lg3/p;

    return-object p0
.end method


# virtual methods
.method public final f()LI8/O;
    .registers 1

    iget-object p0, p0, Li7/g;->c:LI8/O;

    return-object p0
.end method

.method public final g()V
    .registers 2

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Li6/n;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object p0, p0, Li7/g;->d:Li7/g$a;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final h(Landroid/content/Context;Lv8/l;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCategoryLoadedCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0, p1}, Lh3/H;->a(Landroid/content/Context;)Lg3/b;

    move-result-object p1

    new-instance v0, Li7/g$b;

    invoke-direct {v0, p2, p0}, Li7/g$b;-><init>(Lv8/l;Li7/g;)V

    const/4 p0, 0x0

    invoke-interface {p1, v0, p0}, Lg3/b;->c(Lg3/c;Z)V

    return-void
.end method
