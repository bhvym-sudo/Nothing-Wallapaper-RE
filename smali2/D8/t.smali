.class public final LD8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;
.implements LD8/c;


# instance fields
.field private final a:LD8/h;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(LD8/h;II)V
    .registers 5

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/t;->a:LD8/h;

    iput p2, p0, LD8/t;->b:I

    iput p3, p0, LD8/t;->c:I

    if-ltz p2, :cond_53

    if-ltz p3, :cond_38

    if-lt p3, p2, :cond_15

    return-void

    :cond_15
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "endIndex should be not less than startIndex, but was "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_38
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "endIndex should be non-negative, but is "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_53
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "startIndex should be non-negative, but is "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic c(LD8/t;)I
    .registers 1

    iget p0, p0, LD8/t;->c:I

    return p0
.end method

.method public static final synthetic d(LD8/t;)LD8/h;
    .registers 1

    iget-object p0, p0, LD8/t;->a:LD8/h;

    return-object p0
.end method

.method public static final synthetic e(LD8/t;)I
    .registers 1

    iget p0, p0, LD8/t;->b:I

    return p0
.end method

.method private final f()I
    .registers 2

    iget v0, p0, LD8/t;->c:I

    iget p0, p0, LD8/t;->b:I

    sub-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public a(I)LD8/h;
    .registers 4

    invoke-direct {p0}, LD8/t;->f()I

    move-result v0

    if-lt p1, v0, :cond_7

    return-object p0

    :cond_7
    new-instance v0, LD8/t;

    iget-object v1, p0, LD8/t;->a:LD8/h;

    iget p0, p0, LD8/t;->b:I

    add-int/2addr p1, p0

    invoke-direct {v0, v1, p0, p1}, LD8/t;-><init>(LD8/h;II)V

    return-object v0
.end method

.method public b(I)LD8/h;
    .registers 5

    invoke-direct {p0}, LD8/t;->f()I

    move-result v0

    if-lt p1, v0, :cond_b

    invoke-static {}, LD8/p;->g()LD8/h;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance v0, LD8/t;

    iget-object v1, p0, LD8/t;->a:LD8/h;

    iget v2, p0, LD8/t;->b:I

    add-int/2addr v2, p1

    iget p0, p0, LD8/t;->c:I

    invoke-direct {v0, v1, v2, p0}, LD8/t;-><init>(LD8/h;II)V

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LD8/t$a;

    invoke-direct {v0, p0}, LD8/t$a;-><init>(LD8/t;)V

    return-object v0
.end method
