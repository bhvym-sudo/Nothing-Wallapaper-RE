.class final LJ7/a$f;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/a;->m(LU5/a;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LJ7/a;

.field t:I


# direct methods
.method constructor <init>(LJ7/a;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/a$f;->s:LJ7/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LJ7/a$f;->r:Ljava/lang/Object;

    iget p1, p0, LJ7/a$f;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LJ7/a$f;->t:I

    iget-object p1, p0, LJ7/a$f;->s:LJ7/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, LJ7/a;->l(LJ7/a;LU5/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
