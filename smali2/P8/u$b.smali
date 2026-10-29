.class public final LP8/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LP8/u$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(LP8/u$b;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, LP8/u$b;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic b(LP8/u$b;Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LP8/u$b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic c(LP8/u$b;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    invoke-direct {p0, p1, p2}, LP8/u$b;->f([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/String;)V
    .registers 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_39

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v0, 0x0

    :goto_b
    if-ge v0, p0, :cond_38

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x21

    if-gt v2, v1, :cond_1c

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_1c

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_1c
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Unexpected char %#04x at %d in header name: %s"

    invoke-static {p1, p0}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_38
    return-void

    :cond_39
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "name is empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final e(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v0, 0x0

    :goto_5
    if-ge v0, p0, :cond_60

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x9

    if-eq v1, v2, :cond_5d

    const/16 v2, 0x20

    if-gt v2, v1, :cond_18

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_18

    goto :goto_5d

    :cond_18
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0, p2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Unexpected char %#04x at %d in %s value"

    invoke-static {v1, v0}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LQ8/d;->G(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3b

    const-string p1, ""

    goto :goto_4c

    :cond_3b
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ": "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_4c
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5d
    :goto_5d
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_60
    return-void
.end method

.method private final f([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    array-length p0, p1

    add-int/lit8 p0, p0, -0x2

    const/4 v0, 0x0

    const/4 v1, -0x2

    invoke-static {p0, v0, v1}, Lp8/c;->b(III)I

    move-result v0

    if-gt v0, p0, :cond_1d

    :goto_b
    aget-object v1, p1, p0

    const/4 v2, 0x1

    invoke-static {p2, v1, v2}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_18

    add-int/2addr p0, v2

    aget-object p0, p1, p0

    return-object p0

    :cond_18
    if-eq p0, v0, :cond_1d

    add-int/lit8 p0, p0, -0x2

    goto :goto_b

    :cond_1d
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final varargs g([Ljava/lang/String;)LP8/u;
    .registers 7

    const-string v0, "namesAndValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    if-nez v0, :cond_4f

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_13
    if-ge v3, v0, :cond_2e

    aget-object v4, p1, v3

    if-eqz v4, :cond_26

    invoke-static {v4}, LE8/i;->N0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_26
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Headers cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2e
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0, v1}, Lp8/c;->b(III)I

    move-result v0

    if-ltz v0, :cond_48

    :goto_37
    aget-object v1, p1, v2

    add-int/lit8 v3, v2, 0x1

    aget-object v3, p1, v3

    invoke-direct {p0, v1}, LP8/u$b;->d(Ljava/lang/String;)V

    invoke-direct {p0, v3, v1}, LP8/u$b;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eq v2, v0, :cond_48

    add-int/lit8 v2, v2, 0x2

    goto :goto_37

    :cond_48
    new-instance p0, LP8/u;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LP8/u;-><init>([Ljava/lang/String;Lkotlin/jvm/internal/h;)V

    return-object p0

    :cond_4f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Expected alternating header names and values"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
