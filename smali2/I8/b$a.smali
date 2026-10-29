.class final LI8/b$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/b;->j(LH8/t;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LI8/b;

.field t:I


# direct methods
.method constructor <init>(LI8/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LI8/b$a;->s:LI8/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LI8/b$a;->r:Ljava/lang/Object;

    iget p1, p0, LI8/b$a;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LI8/b$a;->t:I

    iget-object p1, p0, LI8/b$a;->s:LI8/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LI8/b;->j(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
