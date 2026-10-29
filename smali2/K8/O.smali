.class final LK8/O;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm8/i;

.field private final b:[Ljava/lang/Object;

.field private final c:[LF8/U0;

.field private d:I


# direct methods
.method public constructor <init>(Lm8/i;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK8/O;->a:Lm8/i;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, LK8/O;->b:[Ljava/lang/Object;

    new-array p1, p2, [LF8/U0;

    iput-object p1, p0, LK8/O;->c:[LF8/U0;

    return-void
.end method


# virtual methods
.method public final a(LF8/U0;Ljava/lang/Object;)V
    .registers 5

    iget-object v0, p0, LK8/O;->b:[Ljava/lang/Object;

    iget v1, p0, LK8/O;->d:I

    aput-object p2, v0, v1

    iget-object p2, p0, LK8/O;->c:[LF8/U0;

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, LK8/O;->d:I

    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p1, p2, v1

    return-void
.end method

.method public final b(Lm8/i;)V
    .registers 6

    iget-object v0, p0, LK8/O;->c:[LF8/U0;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1c

    :goto_7
    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, LK8/O;->c:[LF8/U0;

    aget-object v2, v2, v0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, LK8/O;->b:[Ljava/lang/Object;

    aget-object v0, v3, v0

    invoke-interface {v2, p1, v0}, LF8/U0;->X0(Lm8/i;Ljava/lang/Object;)V

    if-gez v1, :cond_1a

    goto :goto_1c

    :cond_1a
    move v0, v1

    goto :goto_7

    :cond_1c
    :goto_1c
    return-void
.end method
