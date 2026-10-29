.class final LH8/e$g;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/e;->X0(LH8/l;IJLm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:I

.field t:J

.field synthetic u:Ljava/lang/Object;

.field final synthetic v:LH8/e;

.field w:I


# direct methods
.method constructor <init>(LH8/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LH8/e$g;->v:LH8/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    iput-object p1, p0, LH8/e$g;->u:Ljava/lang/Object;

    iget p1, p0, LH8/e$g;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LH8/e$g;->w:I

    iget-object v0, p0, LH8/e$g;->v:LH8/e;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LH8/e;->G(LH8/e;LH8/l;IJLm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1b

    return-object p0

    :cond_1b
    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    return-object p0
.end method
