.class final LU5/e$m;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;->i(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LU5/e;

.field u:I


# direct methods
.method constructor <init>(LU5/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LU5/e$m;->t:LU5/e;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LU5/e$m;->s:Ljava/lang/Object;

    iget p1, p0, LU5/e$m;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LU5/e$m;->u:I

    iget-object p1, p0, LU5/e$m;->t:LU5/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LU5/e;->i(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
