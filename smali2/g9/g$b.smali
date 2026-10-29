.class final Lg9/g$b;
.super Ljava/util/concurrent/CompletableFuture;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final q:Lg9/d;


# direct methods
.method constructor <init>(Lg9/d;)V
    .registers 2

    invoke-direct {p0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    iput-object p1, p0, Lg9/g$b;->q:Lg9/d;

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .registers 3

    if-eqz p1, :cond_7

    iget-object v0, p0, Lg9/g$b;->q:Lg9/d;

    invoke-interface {v0}, Lg9/d;->cancel()V

    :cond_7
    invoke-super {p0, p1}, Ljava/util/concurrent/CompletableFuture;->cancel(Z)Z

    move-result p0

    return p0
.end method
