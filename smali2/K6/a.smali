.class public final LK6/a;
.super Lh3/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/a$a;,
        LK6/a$b;
    }
.end annotation


# static fields
.field public static final h:LK6/a$a;

.field private static final i:Ljava/util/List;

.field private static j:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LK6/a;->h:LK6/a$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LK6/a;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lh3/n;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic k(LK6/a;Lg3/a;)I
    .registers 2

    invoke-direct {p0, p1}, LK6/a;->r(Lg3/a;)I

    move-result p0

    return p0
.end method

.method public static final synthetic l(LK6/a;)Ljava/util/ArrayList;
    .registers 1

    iget-object p0, p0, Lh3/n;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic m()Ljava/util/List;
    .registers 1

    sget-object v0, LK6/a;->j:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic n()Ljava/util/List;
    .registers 1

    sget-object v0, LK6/a;->i:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic o()Ljava/util/List;
    .registers 1

    sget-object v0, Lh3/n;->g:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic p(LK6/a;Z)V
    .registers 2

    iput-boolean p1, p0, Lh3/n;->c:Z

    return-void
.end method

.method public static final synthetic q(Ljava/util/List;)V
    .registers 1

    sput-object p0, LK6/a;->j:Ljava/util/List;

    return-void
.end method

.method private final r(Lg3/a;)I
    .registers 6

    iget-object p0, p0, Lh3/n;->b:Ljava/util/ArrayList;

    const-string v0, "mCategories"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_1d

    invoke-static {}, Li8/s;->t()V

    :cond_1d
    check-cast v1, Lg3/a;

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    return v0

    :cond_2e
    move v0, v2

    goto :goto_c

    :cond_30
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method protected h(Lg3/c;Z)V
    .registers 4

    const-string p2, "receiver"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LK6/a$c;

    invoke-direct {p2, p1, p0}, LK6/a$c;-><init>(Lg3/c;LK6/a;)V

    new-instance p1, LK6/a$b;

    iget-object p0, p0, Lh3/n;->a:Landroid/content/Context;

    const-string v0, "mAppContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p0}, LK6/a$b;-><init>(Lg3/c;Landroid/content/Context;)V

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Void;

    invoke-virtual {p1, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
