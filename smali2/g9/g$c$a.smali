.class Lg9/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/CompletableFuture;

.field final synthetic b:Lg9/g$c;


# direct methods
.method public constructor <init>(Lg9/g$c;Ljava/util/concurrent/CompletableFuture;)V
    .registers 3

    iput-object p1, p0, Lg9/g$c$a;->b:Lg9/g$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    return-void
.end method


# virtual methods
.method public a(Lg9/d;Ljava/lang/Throwable;)V
    .registers 3

    iget-object p0, p0, Lg9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(Lg9/d;Lg9/x;)V
    .registers 3

    iget-object p0, p0, Lg9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    return-void
.end method
