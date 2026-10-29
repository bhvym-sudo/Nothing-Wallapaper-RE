.class public final Lh8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/q$a;,
        Lh8/q$b;
    }
.end annotation


# static fields
.field public static final r:Lh8/q$a;


# instance fields
.field private final q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lh8/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/q$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lh8/q;->r:Lh8/q$a;

    return-void
.end method

.method private synthetic constructor <init>(Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/q;->q:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/Object;)Lh8/q;
    .registers 2

    new-instance v0, Lh8/q;

    invoke-direct {v0, p0}, Lh8/q;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    return-object p0
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, Lh8/q;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, Lh8/q;

    invoke-virtual {p1}, Lh8/q;->h()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    return v1

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 2

    instance-of v0, p0, Lh8/q$b;

    if-eqz v0, :cond_9

    check-cast p0, Lh8/q$b;

    iget-object p0, p0, Lh8/q$b;->q:Ljava/lang/Throwable;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Ljava/lang/Object;)I
    .registers 1

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public static final f(Ljava/lang/Object;)Z
    .registers 1

    instance-of p0, p0, Lh8/q$b;

    return p0
.end method

.method public static g(Ljava/lang/Object;)Ljava/lang/String;
    .registers 3

    instance-of v0, p0, Lh8/q$b;

    if-eqz v0, :cond_b

    check-cast p0, Lh8/q$b;

    invoke-virtual {p0}, Lh8/q$b;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Success("

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

    iget-object p0, p0, Lh8/q;->q:Ljava/lang/Object;

    invoke-static {p0, p1}, Lh8/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final synthetic h()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lh8/q;->q:Ljava/lang/Object;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, Lh8/q;->q:Ljava/lang/Object;

    invoke-static {p0}, Lh8/q;->e(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lh8/q;->q:Ljava/lang/Object;

    invoke-static {p0}, Lh8/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
