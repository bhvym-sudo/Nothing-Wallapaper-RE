.class final Lg9/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final q:Ljava/util/concurrent/Executor;

.field final r:Lg9/d;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lg9/d;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/i$b;->q:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg9/i$b;->r:Lg9/d;

    return-void
.end method


# virtual methods
.method public a()Lg9/x;
    .registers 1

    iget-object p0, p0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->a()Lg9/x;

    move-result-object p0

    return-object p0
.end method

.method public b()LP8/B;
    .registers 1

    iget-object p0, p0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->b()LP8/B;

    move-result-object p0

    return-object p0
.end method

.method public cancel()V
    .registers 1

    iget-object p0, p0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Lg9/i$b;->u()Lg9/d;

    move-result-object p0

    return-object p0
.end method

.method public f()Z
    .registers 1

    iget-object p0, p0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->f()Z

    move-result p0

    return p0
.end method

.method public g(Lg9/f;)V
    .registers 4

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lg9/i$b;->r:Lg9/d;

    new-instance v1, Lg9/i$b$a;

    invoke-direct {v1, p0, p1}, Lg9/i$b$a;-><init>(Lg9/i$b;Lg9/f;)V

    invoke-interface {v0, v1}, Lg9/d;->g(Lg9/f;)V

    return-void
.end method

.method public u()Lg9/d;
    .registers 3

    new-instance v0, Lg9/i$b;

    iget-object v1, p0, Lg9/i$b;->q:Ljava/util/concurrent/Executor;

    iget-object p0, p0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->u()Lg9/d;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lg9/i$b;-><init>(Ljava/util/concurrent/Executor;Lg9/d;)V

    return-object v0
.end method
