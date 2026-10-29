.class public final Lt6/c;
.super Ld3/a;
.source "SourceFile"


# instance fields
.field private final d:Lh8/h;

.field private final e:Lh8/h;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ld3/a;-><init>()V

    new-instance v0, Lt6/a;

    invoke-direct {v0}, Lt6/a;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lt6/c;->d:Lh8/h;

    new-instance v0, Lt6/b;

    invoke-direct {v0}, Lt6/b;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lt6/c;->e:Lh8/h;

    return-void
.end method

.method private static final A()Z
    .registers 1

    const-string v0, "NTF_DEEP_EFFECT_WALLPAPER"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static final B()Z
    .registers 1

    const-string v0, "NTF_DYNAMIC_CLOCKFACE_TRANSITION"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static synthetic t()Z
    .registers 1

    invoke-static {}, Lt6/c;->A()Z

    move-result v0

    return v0
.end method

.method public static synthetic u()Z
    .registers 1

    invoke-static {}, Lt6/c;->B()Z

    move-result v0

    return v0
.end method

.method private final v()Z
    .registers 1

    iget-object p0, p0, Lt6/c;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final w()Z
    .registers 1

    iget-object p0, p0, Lt6/c;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public g(Landroid/content/Context;)Z
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt6/c;->l()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public l()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public m()Z
    .registers 1

    invoke-virtual {p0}, Lt6/c;->s()Z

    move-result p0

    return p0
.end method

.method public p()Z
    .registers 1

    invoke-direct {p0}, Lt6/c;->v()Z

    move-result p0

    return p0
.end method

.method public q()Z
    .registers 1

    invoke-direct {p0}, Lt6/c;->w()Z

    move-result p0

    return p0
.end method

.method public r()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public s()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final x()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final y()Z
    .registers 1

    invoke-virtual {p0}, Lt6/c;->l()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final z()Z
    .registers 1

    invoke-static {}, Li6/e;->l()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
