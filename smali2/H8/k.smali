.class public final LH8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/k$a;,
        LH8/k$b;,
        LH8/k$c;
    }
.end annotation


# static fields
.field public static final b:LH8/k$b;

.field private static final c:LH8/k$c;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LH8/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH8/k$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LH8/k;->b:LH8/k$b;

    new-instance v0, LH8/k$c;

    invoke-direct {v0}, LH8/k$c;-><init>()V

    sput-object v0, LH8/k;->c:LH8/k$c;

    return-void
.end method

.method private synthetic constructor <init>(Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()LH8/k$c;
    .registers 1

    sget-object v0, LH8/k;->c:LH8/k$c;

    return-object v0
.end method

.method public static final synthetic b(Ljava/lang/Object;)LH8/k;
    .registers 2

    new-instance v0, LH8/k;

    invoke-direct {v0, p0}, LH8/k;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    return-object p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LH8/k;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, LH8/k;

    invoke-virtual {p1}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    return v1

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 3

    instance-of v0, p0, LH8/k$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    check-cast p0, LH8/k$a;

    goto :goto_9

    :cond_8
    move-object p0, v1

    :goto_9
    if-eqz p0, :cond_e

    iget-object p0, p0, LH8/k$a;->a:Ljava/lang/Throwable;

    return-object p0

    :cond_e
    return-object v1
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    instance-of v0, p0, LH8/k$c;

    if-nez v0, :cond_5

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(Ljava/lang/Object;)I
    .registers 1

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public static final h(Ljava/lang/Object;)Z
    .registers 1

    instance-of p0, p0, LH8/k$a;

    return p0
.end method

.method public static final i(Ljava/lang/Object;)Z
    .registers 1

    instance-of p0, p0, LH8/k$c;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static j(Ljava/lang/Object;)Ljava/lang/String;
    .registers 3

    instance-of v0, p0, LH8/k$a;

    if-eqz v0, :cond_b

    check-cast p0, LH8/k$a;

    invoke-virtual {p0}, LH8/k$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Value("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 2

    iget-object p0, p0, LH8/k;->a:Ljava/lang/Object;

    invoke-static {p0, p1}, LH8/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, LH8/k;->a:Ljava/lang/Object;

    invoke-static {p0}, LH8/k;->g(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final synthetic k()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LH8/k;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LH8/k;->a:Ljava/lang/Object;

    invoke-static {p0}, LH8/k;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
