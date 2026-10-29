.class final Lj7/j$e;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->v0(Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic q:Ljava/lang/Object;

.field final synthetic r:Lj7/j;

.field s:I


# direct methods
.method constructor <init>(Lj7/j;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lj7/j$e;->r:Lj7/j;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lj7/j$e;->q:Ljava/lang/Object;

    iget p1, p0, Lj7/j$e;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj7/j$e;->s:I

    iget-object p1, p0, Lj7/j$e;->r:Lj7/j;

    invoke-static {p1, p0}, Lj7/j;->A(Lj7/j;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
