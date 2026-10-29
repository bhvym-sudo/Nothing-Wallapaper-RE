.class final Lg9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/v$a;
    }
.end annotation


# static fields
.field private static final l:[C

.field private static final m:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LP8/v;

.field private c:Ljava/lang/String;

.field private d:LP8/v$a;

.field private final e:LP8/B$a;

.field private final f:LP8/u$a;

.field private g:LP8/x;

.field private final h:Z

.field private i:LP8/y$a;

.field private j:LP8/s$a;

.field private k:LP8/C;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_12

    sput-object v0, Lg9/v;->l:[C

    const-string v0, "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lg9/v;->m:Ljava/util/regex/Pattern;

    return-void

    :array_12
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method constructor <init>(Ljava/lang/String;LP8/v;Ljava/lang/String;LP8/u;LP8/x;ZZZ)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/v;->a:Ljava/lang/String;

    iput-object p2, p0, Lg9/v;->b:LP8/v;

    iput-object p3, p0, Lg9/v;->c:Ljava/lang/String;

    new-instance p1, LP8/B$a;

    invoke-direct {p1}, LP8/B$a;-><init>()V

    iput-object p1, p0, Lg9/v;->e:LP8/B$a;

    iput-object p5, p0, Lg9/v;->g:LP8/x;

    iput-boolean p6, p0, Lg9/v;->h:Z

    if-eqz p4, :cond_1d

    invoke-virtual {p4}, LP8/u;->f()LP8/u$a;

    move-result-object p1

    iput-object p1, p0, Lg9/v;->f:LP8/u$a;

    goto :goto_24

    :cond_1d
    new-instance p1, LP8/u$a;

    invoke-direct {p1}, LP8/u$a;-><init>()V

    iput-object p1, p0, Lg9/v;->f:LP8/u$a;

    :goto_24
    if-eqz p7, :cond_2e

    new-instance p1, LP8/s$a;

    invoke-direct {p1}, LP8/s$a;-><init>()V

    iput-object p1, p0, Lg9/v;->j:LP8/s$a;

    return-void

    :cond_2e
    if-eqz p8, :cond_3c

    new-instance p1, LP8/y$a;

    invoke-direct {p1}, LP8/y$a;-><init>()V

    iput-object p1, p0, Lg9/v;->i:LP8/y$a;

    sget-object p0, LP8/y;->l:LP8/x;

    invoke-virtual {p1, p0}, LP8/y$a;->d(LP8/x;)LP8/y$a;

    :cond_3c
    return-void
.end method

.method private static i(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_3d

    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    const/16 v4, 0x20

    if-lt v3, v4, :cond_2e

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_2e

    const-string v4, " \"<>^`{}|\\?#"

    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2e

    if-nez p1, :cond_28

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_2e

    const/16 v4, 0x25

    if-ne v3, v4, :cond_28

    goto :goto_2e

    :cond_28
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_6

    :cond_2e
    :goto_2e
    new-instance v3, Le9/e;

    invoke-direct {v3}, Le9/e;-><init>()V

    invoke-virtual {v3, p0, v1, v2}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    invoke-static {v3, p0, v2, v0, p1}, Lg9/v;->j(Le9/e;Ljava/lang/String;IIZ)V

    invoke-virtual {v3}, Le9/e;->P0()Ljava/lang/String;

    move-result-object p0

    :cond_3d
    return-object p0
.end method

.method private static j(Le9/e;Ljava/lang/String;IIZ)V
    .registers 11

    const/4 v0, 0x0

    :goto_1
    if-ge p2, p3, :cond_6c

    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    if-eqz p4, :cond_1a

    const/16 v2, 0x9

    if-eq v1, v2, :cond_66

    const/16 v2, 0xa

    if-eq v1, v2, :cond_66

    const/16 v2, 0xc

    if-eq v1, v2, :cond_66

    const/16 v2, 0xd

    if-ne v1, v2, :cond_1a

    goto :goto_66

    :cond_1a
    const/16 v2, 0x20

    const/16 v3, 0x25

    if-lt v1, v2, :cond_3a

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_3a

    const-string v2, " \"<>^`{}|\\?#"

    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_3a

    if-nez p4, :cond_36

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_3a

    if-ne v1, v3, :cond_36

    goto :goto_3a

    :cond_36
    invoke-virtual {p0, v1}, Le9/e;->w1(I)Le9/e;

    goto :goto_66

    :cond_3a
    :goto_3a
    if-nez v0, :cond_41

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    :cond_41
    invoke-virtual {v0, v1}, Le9/e;->w1(I)Le9/e;

    :goto_44
    invoke-virtual {v0}, Le9/e;->D()Z

    move-result v2

    if-nez v2, :cond_66

    invoke-virtual {v0}, Le9/e;->readByte()B

    move-result v2

    and-int/lit16 v4, v2, 0xff

    invoke-virtual {p0, v3}, Le9/e;->m1(I)Le9/e;

    sget-object v5, Lg9/v;->l:[C

    shr-int/lit8 v4, v4, 0x4

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    invoke-virtual {p0, v4}, Le9/e;->m1(I)Le9/e;

    and-int/lit8 v2, v2, 0xf

    aget-char v2, v5, v2

    invoke-virtual {p0, v2}, Le9/e;->m1(I)Le9/e;

    goto :goto_44

    :cond_66
    :goto_66
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    goto :goto_1

    :cond_6c
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 4

    if-eqz p3, :cond_8

    iget-object p0, p0, Lg9/v;->j:LP8/s$a;

    invoke-virtual {p0, p1, p2}, LP8/s$a;->b(Ljava/lang/String;Ljava/lang/String;)LP8/s$a;

    return-void

    :cond_8
    iget-object p0, p0, Lg9/v;->j:LP8/s$a;

    invoke-virtual {p0, p1, p2}, LP8/s$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/s$a;

    return-void
.end method

.method b(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 5

    const-string v0, "Content-Type"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    :try_start_8
    invoke-static {p2}, LP8/x;->d(Ljava/lang/String;)LP8/x;

    move-result-object p1

    iput-object p1, p0, Lg9/v;->g:LP8/x;
    :try_end_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_e} :catch_f

    return-void

    :catch_f
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Malformed content type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_27
    if-eqz p3, :cond_2f

    iget-object p0, p0, Lg9/v;->f:LP8/u$a;

    invoke-virtual {p0, p1, p2}, LP8/u$a;->e(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-void

    :cond_2f
    iget-object p0, p0, Lg9/v;->f:LP8/u$a;

    invoke-virtual {p0, p1, p2}, LP8/u$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-void
.end method

.method c(LP8/u;)V
    .registers 2

    iget-object p0, p0, Lg9/v;->f:LP8/u$a;

    invoke-virtual {p0, p1}, LP8/u$a;->b(LP8/u;)LP8/u$a;

    return-void
.end method

.method d(LP8/u;LP8/C;)V
    .registers 3

    iget-object p0, p0, Lg9/v;->i:LP8/y$a;

    invoke-virtual {p0, p1, p2}, LP8/y$a;->a(LP8/u;LP8/C;)LP8/y$a;

    return-void
.end method

.method e(LP8/y$c;)V
    .registers 2

    iget-object p0, p0, Lg9/v;->i:LP8/y$a;

    invoke-virtual {p0, p1}, LP8/y$a;->b(LP8/y$c;)LP8/y$a;

    return-void
.end method

.method f(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 7

    iget-object v0, p0, Lg9/v;->c:Ljava/lang/String;

    if-eqz v0, :cond_4a

    invoke-static {p2, p3}, Lg9/v;->i(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lg9/v;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lg9/v;->m:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-nez p3, :cond_33

    iput-object p1, p0, Lg9/v;->c:Ljava/lang/String;

    return-void

    :cond_33
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@Path parameters shouldn\'t perform path traversal (\'.\' or \'..\'): "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4a
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method g(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 6

    iget-object v0, p0, Lg9/v;->c:Ljava/lang/String;

    if-eqz v0, :cond_35

    iget-object v1, p0, Lg9/v;->b:LP8/v;

    invoke-virtual {v1, v0}, LP8/v;->l(Ljava/lang/String;)LP8/v$a;

    move-result-object v0

    iput-object v0, p0, Lg9/v;->d:LP8/v$a;

    if-eqz v0, :cond_12

    const/4 v0, 0x0

    iput-object v0, p0, Lg9/v;->c:Ljava/lang/String;

    goto :goto_35

    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Malformed URL. Base: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lg9/v;->b:LP8/v;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", Relative: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lg9/v;->c:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    :goto_35
    if-eqz p3, :cond_3d

    iget-object p0, p0, Lg9/v;->d:LP8/v$a;

    invoke-virtual {p0, p1, p2}, LP8/v$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/v$a;

    return-void

    :cond_3d
    iget-object p0, p0, Lg9/v;->d:LP8/v$a;

    invoke-virtual {p0, p1, p2}, LP8/v$a;->b(Ljava/lang/String;Ljava/lang/String;)LP8/v$a;

    return-void
.end method

.method h(Ljava/lang/Class;Ljava/lang/Object;)V
    .registers 3

    iget-object p0, p0, Lg9/v;->e:LP8/B$a;

    invoke-virtual {p0, p1, p2}, LP8/B$a;->g(Ljava/lang/Class;Ljava/lang/Object;)LP8/B$a;

    return-void
.end method

.method k()LP8/B$a;
    .registers 6

    iget-object v0, p0, Lg9/v;->d:LP8/v$a;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LP8/v$a;->c()LP8/v;

    move-result-object v0

    goto :goto_13

    :cond_9
    iget-object v0, p0, Lg9/v;->b:LP8/v;

    iget-object v1, p0, Lg9/v;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, LP8/v;->q(Ljava/lang/String;)LP8/v;

    move-result-object v0

    if-eqz v0, :cond_64

    :goto_13
    iget-object v1, p0, Lg9/v;->k:LP8/C;

    if-nez v1, :cond_35

    iget-object v2, p0, Lg9/v;->j:LP8/s$a;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, LP8/s$a;->c()LP8/s;

    move-result-object v1

    goto :goto_35

    :cond_20
    iget-object v2, p0, Lg9/v;->i:LP8/y$a;

    if-eqz v2, :cond_29

    invoke-virtual {v2}, LP8/y$a;->c()LP8/y;

    move-result-object v1

    goto :goto_35

    :cond_29
    iget-boolean v2, p0, Lg9/v;->h:Z

    if-eqz v2, :cond_35

    const/4 v1, 0x0

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-static {v2, v1}, LP8/C;->d(LP8/x;[B)LP8/C;

    move-result-object v1

    :cond_35
    :goto_35
    iget-object v2, p0, Lg9/v;->g:LP8/x;

    if-eqz v2, :cond_4d

    if-eqz v1, :cond_42

    new-instance v3, Lg9/v$a;

    invoke-direct {v3, v1, v2}, Lg9/v$a;-><init>(LP8/C;LP8/x;)V

    move-object v1, v3

    goto :goto_4d

    :cond_42
    iget-object v3, p0, Lg9/v;->f:LP8/u$a;

    const-string v4, "Content-Type"

    invoke-virtual {v2}, LP8/x;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, LP8/u$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    :cond_4d
    :goto_4d
    iget-object v2, p0, Lg9/v;->e:LP8/B$a;

    invoke-virtual {v2, v0}, LP8/B$a;->h(LP8/v;)LP8/B$a;

    move-result-object v0

    iget-object v2, p0, Lg9/v;->f:LP8/u$a;

    invoke-virtual {v2}, LP8/u$a;->f()LP8/u;

    move-result-object v2

    invoke-virtual {v0, v2}, LP8/B$a;->d(LP8/u;)LP8/B$a;

    move-result-object v0

    iget-object p0, p0, Lg9/v;->a:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, LP8/B$a;->e(Ljava/lang/String;LP8/C;)LP8/B$a;

    move-result-object p0

    return-object p0

    :cond_64
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed URL. Base: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg9/v;->b:LP8/v;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Relative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lg9/v;->c:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method l(LP8/C;)V
    .registers 2

    iput-object p1, p0, Lg9/v;->k:LP8/C;

    return-void
.end method

.method m(Ljava/lang/Object;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lg9/v;->c:Ljava/lang/String;

    return-void
.end method
