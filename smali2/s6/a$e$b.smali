.class public final Ls6/a$e$b;
.super Ls6/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private s:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 2
    invoke-direct {p0, v2, v0, v2, v1}, Ls6/a$e;-><init>(IZILkotlin/jvm/internal/h;)V

    .line 3
    iput-boolean p1, p0, Ls6/a$e$b;->s:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    .line 1
    :cond_5
    invoke-direct {p0, p1}, Ls6/a$e$b;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public e()Z
    .registers 1

    iget-boolean p0, p0, Ls6/a$e$b;->s:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final i()Ls6/a$e$b;
    .registers 2

    new-instance p0, Ls6/a$e$b;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ls6/a$e$b;-><init>(Z)V

    return-object p0
.end method

.method public final k()Z
    .registers 1

    iget-boolean p0, p0, Ls6/a$e$b;->s:Z

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget-boolean p0, p0, Ls6/a$e$b;->s:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EngineAttached(shown:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
