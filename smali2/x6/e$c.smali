.class final Lx6/e$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx6/e;->j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field synthetic u:Ljava/lang/Object;

.field final synthetic v:Lx6/e;

.field w:I


# direct methods
.method constructor <init>(Lx6/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lx6/e$c;->v:Lx6/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lx6/e$c;->u:Ljava/lang/Object;

    iget p1, p0, Lx6/e$c;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/e$c;->w:I

    iget-object p1, p0, Lx6/e$c;->v:Lx6/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lx6/e;->j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
