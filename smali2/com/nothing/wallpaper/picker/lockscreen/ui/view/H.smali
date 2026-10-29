.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;
.super LS1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$a;,
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;
    }
.end annotation


# static fields
.field public static final r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$a;


# instance fields
.field private final j:Landroid/content/Context;

.field private final k:Ly7/g;

.field private final l:Ljava/util/HashMap;

.field private final m:Ljava/util/concurrent/ConcurrentHashMap;

.field private n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

.field private o:LO2/h;

.field private p:Ljava/util/concurrent/ConcurrentHashMap;

.field private q:LO2/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Point;Landroid/app/WallpaperManager;LQ2/k;Ly7/g;)V
    .registers 7

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenSize"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockShareDataManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, LS1/c;-><init>(Landroid/content/Context;Landroid/graphics/Point;Landroid/app/WallpaperManager;LQ2/k;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private static final D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_b

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->H(Landroid/content/Context;)V

    :cond_1a
    return-void
.end method

.method private static final F(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V
    .registers 5

    invoke-interface {p0}, LO2/h;->b()LO2/j;

    move-result-object v0

    iget-object v1, p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "getResources(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LO2/j;->d(Landroid/content/res/Resources;)V

    invoke-interface {p0}, LO2/h;->b()LO2/j;

    move-result-object p0

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-static {p1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p1

    invoke-interface {p0, p1}, LO2/j;->b(Z)V

    return-void
.end method

.method private final I(LO2/a;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    if-eqz v0, :cond_d

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, LO2/j;->c(LO2/a;)V

    :cond_d
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-interface {v0, p1}, LO2/j;->c(LO2/a;)V

    :cond_1a
    invoke-virtual {p0}, LS1/c;->l()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO2/h;

    invoke-interface {v2}, LO2/h;->b()LO2/j;

    move-result-object v2

    invoke-interface {v2, p1}, LO2/j;->c(LO2/a;)V

    goto :goto_2d

    :cond_41
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_50
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/h;

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    invoke-interface {v0, p1}, LO2/j;->c(LO2/a;)V

    goto :goto_50

    :cond_64
    return-void
.end method

.method private final J(LX5/a;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    if-eqz v0, :cond_d

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, LO2/j;->g(LX5/a;)V

    :cond_d
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-interface {v0, p1}, LO2/j;->g(LX5/a;)V

    :cond_1a
    invoke-virtual {p0}, LS1/c;->l()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO2/h;

    invoke-interface {v2}, LO2/h;->b()LO2/j;

    move-result-object v2

    invoke-interface {v2, p1}, LO2/j;->g(LX5/a;)V

    goto :goto_2d

    :cond_41
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_50
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/h;

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    invoke-interface {v0, p1}, LO2/j;->g(LX5/a;)V

    goto :goto_50

    :cond_64
    return-void
.end method

.method private final K(LY5/a;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    if-eqz v0, :cond_d

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, LO2/j;->a(LY5/a;)V

    :cond_d
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-interface {v0, p1}, LO2/j;->a(LY5/a;)V

    :cond_1a
    invoke-virtual {p0}, LS1/c;->l()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO2/h;

    invoke-interface {v2}, LO2/h;->b()LO2/j;

    move-result-object v2

    invoke-interface {v2, p1}, LO2/j;->a(LY5/a;)V

    goto :goto_2d

    :cond_41
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_50
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/h;

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v0

    invoke-interface {v0, p1}, LO2/j;->a(LY5/a;)V

    goto :goto_50

    :cond_64
    return-void
.end method

.method private final M(LO2/h;ZZ)V
    .registers 4

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object p0

    const/4 p1, 0x0

    invoke-interface {p0, p2, p3, p1}, LO2/l;->c(ZZZ)V

    return-void
.end method

.method public static synthetic v(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->F(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V

    return-void
.end method

.method public static synthetic w(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic x(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;LO2/a;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->I(LO2/a;)V

    return-void
.end method

.method public static final synthetic y(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;LX5/a;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->J(LX5/a;)V

    return-void
.end method

.method public static final synthetic z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;LY5/a;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->K(LY5/a;)V

    return-void
.end method


# virtual methods
.method public final A()LO2/h;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    return-object p0
.end method

.method public final B(Ljava/lang/String;)Landroid/view/View;
    .registers 5

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q(Ljava/lang/String;)LO2/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object v1

    goto :goto_14

    :cond_13
    move-object v1, v0

    :goto_14
    if-eqz v1, :cond_20

    invoke-interface {v1}, LO2/l;->a()LO2/k;

    move-result-object v2

    if-eqz v2, :cond_20

    invoke-virtual {v2}, LO2/k;->a()LO2/w;

    move-result-object v0

    :cond_20
    sget-object v2, LO2/w;->s:LO2/w;

    if-ne v0, v2, :cond_35

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->d()V

    :cond_2b
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    :cond_35
    if-eqz p1, :cond_46

    invoke-interface {p1}, LO2/h;->b()LO2/j;

    move-result-object p1

    if-eqz p1, :cond_46

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    invoke-interface {p1, v0}, LO2/j;->b(Z)V

    :cond_46
    if-eqz v1, :cond_50

    invoke-interface {v1}, LO2/l;->getView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_4f

    goto :goto_50

    :cond_4f
    return-object p1

    :cond_50
    :goto_50
    invoke-virtual {p0}, LS1/c;->k()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public final C(Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;
    .registers 7

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q(Ljava/lang/String;)LO2/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    if-eqz p1, :cond_5f

    sget-object v0, LA7/a;->r:LA7/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p3, v0, :cond_1f

    move p3, v2

    goto :goto_20

    :cond_1f
    move p3, v1

    :goto_20
    sget-object v0, LN1/a;->q:LN1/a;

    if-ne p2, v0, :cond_25

    move v1, v2

    :cond_25
    invoke-direct {p0, p1, p3, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->M(LO2/h;ZZ)V

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object p2

    invoke-interface {p2}, LO2/l;->a()LO2/k;

    move-result-object p2

    invoke-virtual {p2}, LO2/k;->a()LO2/w;

    move-result-object p2

    sget-object p3, LO2/w;->s:LO2/w;

    if-ne p2, p3, :cond_46

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    :cond_46
    invoke-interface {p1}, LO2/h;->b()LO2/j;

    move-result-object p2

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-static {p3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p3

    invoke-interface {p2, p3}, LO2/j;->b(Z)V

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object p1

    invoke-interface {p1}, LO2/l;->getView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_5e

    goto :goto_5f

    :cond_5e
    return-object p1

    :cond_5f
    :goto_5f
    invoke-virtual {p0}, LS1/c;->k()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Landroid/view/View;
    .registers 6

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->G(Ljava/lang/String;)LO2/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    sget-object v2, LF2/d;->e:LF2/i;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;

    invoke-direct {v3, v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;-><init>(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V

    invoke-virtual {v2, v3}, LF2/i;->execute(Ljava/lang/Runnable;)V

    invoke-interface {v0}, LO2/h;->c()LO2/l;

    move-result-object v0

    goto :goto_1c

    :cond_1b
    move-object v0, v1

    :goto_1c
    if-eqz v0, :cond_29

    invoke-interface {v0}, LO2/l;->a()LO2/k;

    move-result-object v2

    if-eqz v2, :cond_29

    invoke-virtual {v2}, LO2/k;->a()LO2/w;

    move-result-object v2

    goto :goto_2a

    :cond_29
    move-object v2, v1

    :goto_2a
    sget-object v3, LO2/w;->s:LO2/w;

    if-ne v2, v3, :cond_45

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-nez v2, :cond_42

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-direct {v2, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_42
    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    :cond_45
    if-eqz v0, :cond_4b

    invoke-interface {v0}, LO2/l;->getView()Landroid/view/View;

    move-result-object v1

    :cond_4b
    if-nez v1, :cond_52

    invoke-virtual {p0}, LS1/c;->k()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0

    :cond_52
    return-object v1
.end method

.method public final G(Ljava/lang/String;)LO2/h;
    .registers 5

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/h;

    if-nez v0, :cond_42

    invoke-virtual {p0, p1}, LS1/c;->r(Ljava/lang/String;)LO2/h;

    move-result-object v0

    if-eqz v0, :cond_40

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v2}, Ly7/g;->w()LY5/a;

    move-result-object v2

    invoke-interface {v1, v2}, LO2/j;->a(LY5/a;)V

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v2}, Ly7/g;->v()LX5/a;

    move-result-object v2

    invoke-interface {v1, v2}, LO2/j;->g(LX5/a;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v1}, Ly7/g;->t()LO2/a;

    move-result-object v1

    if-eqz v1, :cond_3a

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v2

    invoke-interface {v2, v1}, LO2/j;->c(LO2/a;)V

    :cond_3a
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_40
    const/4 p0, 0x0

    return-object p0

    :cond_42
    return-object v0
.end method

.method public final H(Landroid/content/Context;)V
    .registers 9

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-string p0, "com.nothing.action.APPWIDGET_CONFIGURE"

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance p0, Landroid/content/ComponentName;

    const-string v0, "com.nothing.hearthstone"

    const-string v1, "com.nothing.hearthstone.quicklook.QuickLookSettingsActivity"

    invoke-direct {p0, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    sget-object v0, Li6/a;->a:Li6/a;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Li6/a;->b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z

    return-void
.end method

.method public final L(LO2/h;)V
    .registers 5

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    if-eqz p1, :cond_39

    invoke-interface {p1}, LO2/h;->d()LO2/l;

    move-result-object v0

    if-eqz v0, :cond_39

    invoke-interface {v0}, LO2/l;->a()LO2/k;

    move-result-object v1

    invoke-virtual {v1}, LO2/k;->a()LO2/w;

    move-result-object v1

    sget-object v2, LO2/w;->s:LO2/w;

    if-ne v1, v2, :cond_2c

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-eqz v1, :cond_22

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->d()V

    :cond_22
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-direct {v1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    :cond_2c
    invoke-interface {p1}, LO2/h;->b()LO2/j;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p0

    invoke-interface {p1, p0}, LO2/j;->b(Z)V

    :cond_39
    return-void
.end method

.method public e(Landroidx/lifecycle/x;)V
    .registers 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LS1/c;->e(Landroidx/lifecycle/x;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->t()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    goto :goto_1c

    :cond_2c
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    :cond_33
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    return-void

    :cond_44
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$c;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {p0, v0}, Ly7/g;->C(Ly7/g$b;)V

    return-void
.end method

.method public f(Ljava/lang/String;)Landroid/view/View;
    .registers 7

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LS1/c;->d(Ljava/lang/String;)LO2/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_23

    invoke-interface {v0}, LO2/h;->b()LO2/j;

    move-result-object v2

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "getResources(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, LO2/j;->d(Landroid/content/res/Resources;)V

    invoke-interface {v0}, LO2/h;->d()LO2/l;

    move-result-object v0

    goto :goto_24

    :cond_23
    move-object v0, v1

    :goto_24
    if-eqz v0, :cond_31

    invoke-interface {v0}, LO2/l;->a()LO2/k;

    move-result-object v2

    if-eqz v2, :cond_31

    invoke-virtual {v2}, LO2/k;->a()LO2/w;

    move-result-object v2

    goto :goto_32

    :cond_31
    move-object v2, v1

    :goto_32
    sget-object v3, LO2/w;->s:LO2/w;

    if-ne v2, v3, :cond_4d

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-nez v2, :cond_4a

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-direct {v2, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4a
    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c()V

    :cond_4d
    if-eqz v0, :cond_54

    invoke-interface {v0}, LO2/l;->getView()Landroid/view/View;

    move-result-object v0

    goto :goto_55

    :cond_54
    move-object v0, v1

    :goto_55
    if-eqz v0, :cond_68

    sget-object v1, LA7/d;->a:LA7/d;

    invoke-virtual {v1, p1}, LA7/d;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_67

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/G;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/G;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_67
    move-object v1, v0

    :cond_68
    if-nez v1, :cond_6f

    invoke-virtual {p0}, LS1/c;->k()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0

    :cond_6f
    return-object v1
.end method

.method public i(Landroidx/lifecycle/x;)V
    .registers 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LS1/c;->i(Landroidx/lifecycle/x;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->d()V

    goto :goto_19

    :cond_29
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->d()V

    :cond_30
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly7/g$b;

    if-eqz p1, :cond_47

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {p0, p1}, Ly7/g;->D(Ly7/g$b;)V

    :cond_47
    return-void
.end method

.method public onDestroy()V
    .registers 4

    invoke-super {p0}, LS1/c;->onDestroy()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->d()V

    goto :goto_14

    :cond_24
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->n:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_57

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly7/g$b;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v2, v1}, Ly7/g;->D(Ly7/g$b;)V

    goto :goto_3f

    :cond_57
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method

.method protected q(Ljava/lang/String;)LO2/h;
    .registers 4

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LS1/c;->q(Ljava/lang/String;)LO2/h;

    move-result-object p1

    if-eqz p1, :cond_23

    invoke-interface {p1}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_23

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v1}, Ly7/g;->w()LY5/a;

    move-result-object v1

    invoke-interface {v0, v1}, LO2/j;->a(LY5/a;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {v1}, Ly7/g;->v()LX5/a;

    move-result-object v1

    invoke-interface {v0, v1}, LO2/j;->g(LX5/a;)V

    :cond_23
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->k:Ly7/g;

    invoke-virtual {p0}, Ly7/g;->t()LO2/a;

    move-result-object p0

    if-eqz p0, :cond_36

    if-eqz p1, :cond_36

    invoke-interface {p1}, LO2/h;->b()LO2/j;

    move-result-object v0

    if-eqz v0, :cond_36

    invoke-interface {v0, p0}, LO2/j;->c(LO2/a;)V

    :cond_36
    return-object p1
.end method

.method protected s()Z
    .registers 2

    sget-object v0, LF2/F;->t:LF2/F$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->j:Landroid/content/Context;

    invoke-virtual {v0, p0}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object p0

    invoke-virtual {p0}, LF2/F;->Y()Z

    move-result p0

    return p0
.end method

.method protected t()V
    .registers 2

    invoke-super {p0}, LS1/c;->t()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->q:LO2/h;

    if-eqz v0, :cond_16

    invoke-interface {v0}, LO2/h;->d()LO2/l;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-interface {v0}, LO2/l;->b()LO2/m;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-interface {v0}, LO2/m;->b()V

    :cond_16
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->o:LO2/h;

    if-eqz v0, :cond_29

    invoke-interface {v0}, LO2/h;->d()LO2/l;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-interface {v0}, LO2/l;->b()LO2/m;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-interface {v0}, LO2/m;->b()V

    :cond_29
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO2/h;

    invoke-interface {v0}, LO2/h;->c()LO2/l;

    move-result-object v0

    invoke-interface {v0}, LO2/l;->b()LO2/m;

    move-result-object v0

    invoke-interface {v0}, LO2/m;->b()V

    goto :goto_33

    :cond_51
    return-void
.end method
