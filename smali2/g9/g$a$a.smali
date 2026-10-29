.class Lg9/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/CompletableFuture;

.field final synthetic b:Lg9/g$a;


# direct methods
.method public constructor <init>(Lg9/g$a;Ljava/util/concurrent/CompletableFuture;)V
    .registers 3

    iput-object p1, p0, Lg9/g$a$a;->b:Lg9/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg9/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    return-void
.end method


# virtual methods
.method public a(Lg9/d;Ljava/lang/Throwable;)V
    .registers 3

    iget-object p0, p0, Lg9/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(Lg9/d;Lg9/x;)V
    .registers 3

    invoke-virtual {p2}, Lg9/x;->d()Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p0, p0, Lg9/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p2}, Lg9/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    return-void

    :cond_10
    iget-object p0, p0, Lg9/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    new-instance p1, Lg9/m;

    invoke-direct {p1, p2}, Lg9/m;-><init>(Lg9/x;)V

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method
