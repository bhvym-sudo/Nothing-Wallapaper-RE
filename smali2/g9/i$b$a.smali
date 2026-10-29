.class Lg9/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/i$b;->g(Lg9/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg9/f;

.field final synthetic b:Lg9/i$b;


# direct methods
.method constructor <init>(Lg9/i$b;Lg9/f;)V
    .registers 3

    iput-object p1, p0, Lg9/i$b$a;->b:Lg9/i$b;

    iput-object p2, p0, Lg9/i$b$a;->a:Lg9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lg9/i$b$a;Lg9/f;Ljava/lang/Throwable;)V
    .registers 3

    iget-object p0, p0, Lg9/i$b$a;->b:Lg9/i$b;

    invoke-interface {p1, p0, p2}, Lg9/f;->a(Lg9/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lg9/i$b$a;Lg9/f;Lg9/x;)V
    .registers 4

    iget-object v0, p0, Lg9/i$b$a;->b:Lg9/i$b;

    iget-object v0, v0, Lg9/i$b;->r:Lg9/d;

    invoke-interface {v0}, Lg9/d;->f()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object p0, p0, Lg9/i$b$a;->b:Lg9/i$b;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Lg9/f;->a(Lg9/d;Ljava/lang/Throwable;)V

    return-void

    :cond_17
    iget-object p0, p0, Lg9/i$b$a;->b:Lg9/i$b;

    invoke-interface {p1, p0, p2}, Lg9/f;->b(Lg9/d;Lg9/x;)V

    return-void
.end method


# virtual methods
.method public a(Lg9/d;Ljava/lang/Throwable;)V
    .registers 5

    iget-object p1, p0, Lg9/i$b$a;->b:Lg9/i$b;

    iget-object p1, p1, Lg9/i$b;->q:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lg9/i$b$a;->a:Lg9/f;

    new-instance v1, Lg9/k;

    invoke-direct {v1, p0, v0, p2}, Lg9/k;-><init>(Lg9/i$b$a;Lg9/f;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lg9/d;Lg9/x;)V
    .registers 5

    iget-object p1, p0, Lg9/i$b$a;->b:Lg9/i$b;

    iget-object p1, p1, Lg9/i$b;->q:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lg9/i$b$a;->a:Lg9/f;

    new-instance v1, Lg9/j;

    invoke-direct {v1, p0, v0, p2}, Lg9/j;-><init>(Lg9/i$b$a;Lg9/f;Lg9/x;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
