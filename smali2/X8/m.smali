.class public final LX8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/m$a;
    }
.end annotation


# static fields
.field public static final c:LX8/m$a;


# instance fields
.field private a:I

.field private final b:[I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/m$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/m;->c:LX8/m$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, LX8/m;->b:[I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .registers 2

    iget-object p0, p0, LX8/m;->b:[I

    aget p0, p0, p1

    return p0
.end method

.method public final b()I
    .registers 2

    iget v0, p0, LX8/m;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_c

    iget-object p0, p0, LX8/m;->b:[I

    const/4 v0, 0x1

    aget p0, p0, v0

    return p0

    :cond_c
    const/4 p0, -0x1

    return p0
.end method

.method public final c()I
    .registers 2

    iget v0, p0, LX8/m;->a:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_c

    iget-object p0, p0, LX8/m;->b:[I

    const/4 v0, 0x7

    aget p0, p0, v0

    return p0

    :cond_c
    const p0, 0xffff

    return p0
.end method

.method public final d()I
    .registers 2

    iget v0, p0, LX8/m;->a:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_c

    iget-object p0, p0, LX8/m;->b:[I

    const/4 v0, 0x4

    aget p0, p0, v0

    return p0

    :cond_c
    const p0, 0x7fffffff

    return p0
.end method

.method public final e(I)I
    .registers 3

    iget v0, p0, LX8/m;->a:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_c

    iget-object p0, p0, LX8/m;->b:[I

    const/4 p1, 0x5

    aget p0, p0, p1

    return p0

    :cond_c
    return p1
.end method

.method public final f(I)Z
    .registers 3

    const/4 v0, 0x1

    shl-int p1, v0, p1

    iget p0, p0, LX8/m;->a:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_9

    return v0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final g(LX8/m;)V
    .registers 4

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_6
    const/16 v1, 0xa

    if-ge v0, v1, :cond_1a

    invoke-virtual {p1, v0}, LX8/m;->f(I)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {p1, v0}, LX8/m;->a(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, LX8/m;->h(II)LX8/m;

    :cond_17
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_1a
    return-void
.end method

.method public final h(II)LX8/m;
    .registers 6

    if-ltz p1, :cond_11

    iget-object v0, p0, LX8/m;->b:[I

    array-length v1, v0

    if-lt p1, v1, :cond_8

    goto :goto_11

    :cond_8
    const/4 v1, 0x1

    shl-int/2addr v1, p1

    iget v2, p0, LX8/m;->a:I

    or-int/2addr v1, v2

    iput v1, p0, LX8/m;->a:I

    aput p2, v0, p1

    :cond_11
    :goto_11
    return-object p0
.end method

.method public final i()I
    .registers 1

    iget p0, p0, LX8/m;->a:I

    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    move-result p0

    return p0
.end method
