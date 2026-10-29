.class final LJ6/e$e;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/e;->i(ZZLg3/x;LD6/f;Lv8/p;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LJ6/e;

.field t:I


# direct methods
.method constructor <init>(LJ6/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ6/e$e;->s:LJ6/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    iput-object p1, p0, LJ6/e$e;->r:Ljava/lang/Object;

    iget p1, p0, LJ6/e$e;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LJ6/e$e;->t:I

    iget-object v0, p0, LJ6/e$e;->s:LJ6/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, LJ6/e;->i(ZZLg3/x;LD6/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
