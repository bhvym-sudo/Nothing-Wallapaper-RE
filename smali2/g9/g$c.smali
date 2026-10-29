.class final Lg9/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/g$c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Type;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/g$c;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .registers 1

    iget-object p0, p0, Lg9/g$c;->a:Ljava/lang/reflect/Type;

    return-object p0
.end method

.method public bridge synthetic b(Lg9/d;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lg9/g$c;->c(Lg9/d;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p0

    return-object p0
.end method

.method public c(Lg9/d;)Ljava/util/concurrent/CompletableFuture;
    .registers 4

    new-instance v0, Lg9/g$b;

    invoke-direct {v0, p1}, Lg9/g$b;-><init>(Lg9/d;)V

    new-instance v1, Lg9/g$c$a;

    invoke-direct {v1, p0, v0}, Lg9/g$c$a;-><init>(Lg9/g$c;Ljava/util/concurrent/CompletableFuture;)V

    invoke-interface {p1, v1}, Lg9/d;->g(Lg9/f;)V

    return-object v0
.end method
