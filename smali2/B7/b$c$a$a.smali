.class public final LB7/b$c$a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB7/b$c$a;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field synthetic q:Ljava/lang/Object;

.field r:I

.field final synthetic s:LB7/b$c$a;


# direct methods
.method public constructor <init>(LB7/b$c$a;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LB7/b$c$a$a;->s:LB7/b$c$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, LB7/b$c$a$a;->q:Ljava/lang/Object;

    iget p1, p0, LB7/b$c$a$a;->r:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB7/b$c$a$a;->r:I

    iget-object p1, p0, LB7/b$c$a$a;->s:LB7/b$c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LB7/b$c$a;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
