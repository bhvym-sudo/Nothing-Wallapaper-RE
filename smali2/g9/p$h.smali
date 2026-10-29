.class final Lg9/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/p;->e(Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lm8/e;

.field final synthetic r:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lm8/e;Ljava/lang/Throwable;)V
    .registers 3

    iput-object p1, p0, Lg9/p$h;->q:Lm8/e;

    iput-object p2, p0, Lg9/p$h;->r:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lg9/p$h;->q:Lm8/e;

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    sget-object v1, Lh8/q;->r:Lh8/q$a;

    iget-object p0, p0, Lg9/p$h;->r:Ljava/lang/Throwable;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
