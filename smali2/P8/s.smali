.class public final LP8/s;
.super LP8/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/s$a;,
        LP8/s$b;
    }
.end annotation


# static fields
.field public static final d:LP8/s$b;

.field private static final e:LP8/x;


# instance fields
.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/s$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/s$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/s;->d:LP8/s$b;

    sget-object v0, LP8/x;->e:LP8/x$a;

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v0

    sput-object v0, LP8/s;->e:LP8/x;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .registers 4

    const-string v0, "encodedNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodedValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LP8/C;-><init>()V

    invoke-static {p1}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LP8/s;->b:Ljava/util/List;

    invoke-static {p2}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LP8/s;->c:Ljava/util/List;

    return-void
.end method

.method private final h(Le9/f;Z)J
    .registers 6

    if-eqz p2, :cond_8

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    goto :goto_f

    :cond_8
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1}, Le9/f;->d()Le9/e;

    move-result-object p1

    :goto_f
    iget-object v0, p0, LP8/s;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v0, :cond_3d

    if-lez v1, :cond_1f

    const/16 v2, 0x26

    invoke-virtual {p1, v2}, Le9/e;->m1(I)Le9/e;

    :cond_1f
    iget-object v2, p0, LP8/s;->b:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    const/16 v2, 0x3d

    invoke-virtual {p1, v2}, Le9/e;->m1(I)Le9/e;

    iget-object v2, p0, LP8/s;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    :cond_3d
    if-eqz p2, :cond_47

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v0

    invoke-virtual {p1}, Le9/e;->j()V

    return-wide v0

    :cond_47
    const-wide/16 p0, 0x0

    return-wide p0
.end method


# virtual methods
.method public a()J
    .registers 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LP8/s;->h(Le9/f;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()LP8/x;
    .registers 1

    sget-object p0, LP8/s;->e:LP8/x;

    return-object p0
.end method

.method public g(Le9/f;)V
    .registers 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LP8/s;->h(Le9/f;Z)J

    return-void
.end method
