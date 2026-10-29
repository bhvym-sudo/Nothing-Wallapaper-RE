.class public final Le9/r;
.super Li8/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/r$a;
    }
.end annotation


# static fields
.field public static final t:Le9/r$a;


# instance fields
.field private final r:[Le9/h;

.field private final s:[I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Le9/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le9/r$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Le9/r;->t:Le9/r$a;

    return-void
.end method

.method private constructor <init>([Le9/h;[I)V
    .registers 3

    .line 2
    invoke-direct {p0}, Li8/c;-><init>()V

    .line 3
    iput-object p1, p0, Le9/r;->r:[Le9/h;

    .line 4
    iput-object p2, p0, Le9/r;->s:[I

    return-void
.end method

.method public synthetic constructor <init>([Le9/h;[ILkotlin/jvm/internal/h;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Le9/r;-><init>([Le9/h;[I)V

    return-void
.end method

.method public static final varargs r([Le9/h;)Le9/r;
    .registers 2

    sget-object v0, Le9/r;->t:Le9/r$a;

    invoke-virtual {v0, p0}, Le9/r$a;->d([Le9/h;)Le9/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .registers 1

    iget-object p0, p0, Le9/r;->r:[Le9/h;

    array-length p0, p0

    return p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Le9/h;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    check-cast p1, Le9/h;

    invoke-virtual {p0, p1}, Le9/r;->g(Le9/h;)Z

    move-result p0

    return p0
.end method

.method public bridge g(Le9/h;)Z
    .registers 2

    invoke-super {p0, p1}, Li8/b;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Le9/r;->m(I)Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .registers 3

    instance-of v0, p1, Le9/h;

    if-nez v0, :cond_6

    const/4 p0, -0x1

    return p0

    :cond_6
    check-cast p1, Le9/h;

    invoke-virtual {p0, p1}, Le9/r;->p(Le9/h;)I

    move-result p0

    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .registers 3

    instance-of v0, p1, Le9/h;

    if-nez v0, :cond_6

    const/4 p0, -0x1

    return p0

    :cond_6
    check-cast p1, Le9/h;

    invoke-virtual {p0, p1}, Le9/r;->q(Le9/h;)I

    move-result p0

    return p0
.end method

.method public m(I)Le9/h;
    .registers 2

    iget-object p0, p0, Le9/r;->r:[Le9/h;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public final n()[Le9/h;
    .registers 1

    iget-object p0, p0, Le9/r;->r:[Le9/h;

    return-object p0
.end method

.method public final o()[I
    .registers 1

    iget-object p0, p0, Le9/r;->s:[I

    return-object p0
.end method

.method public bridge p(Le9/h;)I
    .registers 2

    invoke-super {p0, p1}, Li8/c;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public bridge q(Le9/h;)I
    .registers 2

    invoke-super {p0, p1}, Li8/c;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method
