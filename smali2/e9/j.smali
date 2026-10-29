.class public abstract Le9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# instance fields
.field private final q:Le9/B;


# direct methods
.method public constructor <init>(Le9/B;)V
    .registers 3

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/j;->q:Le9/B;

    return-void
.end method


# virtual methods
.method public final a()Le9/B;
    .registers 1

    iget-object p0, p0, Le9/j;->q:Le9/B;

    return-object p0
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, Le9/j;->q:Le9/B;

    invoke-interface {p0}, Le9/B;->close()V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/j;->q:Le9/B;

    invoke-interface {p0}, Le9/B;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Le9/j;->q:Le9/B;

    invoke-interface {p0, p1, p2, p3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/j;->q:Le9/B;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
