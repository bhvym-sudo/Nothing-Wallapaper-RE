.class final LH8/e$f;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/e;->W0(LH8/e;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic q:Ljava/lang/Object;

.field final synthetic r:LH8/e;

.field s:I


# direct methods
.method constructor <init>(LH8/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LH8/e$f;->r:LH8/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LH8/e$f;->q:Ljava/lang/Object;

    iget p1, p0, LH8/e$f;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LH8/e$f;->s:I

    iget-object p1, p0, LH8/e$f;->r:LH8/e;

    invoke-static {p1, p0}, LH8/e;->W0(LH8/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_16

    return-object p0

    :cond_16
    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    return-object p0
.end method
