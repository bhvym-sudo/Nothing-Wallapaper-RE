.class public final LN8/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field private final b:Lv8/q;

.field private final c:Lv8/q;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;

.field public final f:Lv8/q;

.field public g:Ljava/lang/Object;

.field public h:I

.field final synthetic i:LN8/j;


# direct methods
.method public constructor <init>(LN8/j;Ljava/lang/Object;Lv8/q;Lv8/q;Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)V
    .registers 8

    iput-object p1, p0, LN8/j$a;->i:LN8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LN8/j$a;->a:Ljava/lang/Object;

    iput-object p3, p0, LN8/j$a;->b:Lv8/q;

    iput-object p4, p0, LN8/j$a;->c:Lv8/q;

    iput-object p5, p0, LN8/j$a;->d:Ljava/lang/Object;

    iput-object p6, p0, LN8/j$a;->e:Ljava/lang/Object;

    iput-object p7, p0, LN8/j$a;->f:Lv8/q;

    const/4 p1, -0x1

    iput p1, p0, LN8/j$a;->h:I

    return-void
.end method


# virtual methods
.method public final a(LN8/k;Ljava/lang/Object;)Lv8/q;
    .registers 4

    iget-object v0, p0, LN8/j$a;->f:Lv8/q;

    if-eqz v0, :cond_d

    iget-object p0, p0, LN8/j$a;->d:Ljava/lang/Object;

    invoke-interface {v0, p1, p0, p2}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv8/q;

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final b()V
    .registers 5

    iget-object v0, p0, LN8/j$a;->g:Ljava/lang/Object;

    iget-object v1, p0, LN8/j$a;->i:LN8/j;

    instance-of v2, v0, LK8/A;

    const/4 v3, 0x0

    if-eqz v2, :cond_15

    check-cast v0, LK8/A;

    iget p0, p0, LN8/j$a;->h:I

    invoke-virtual {v1}, LN8/j;->getContext()Lm8/i;

    move-result-object v1

    invoke-virtual {v0, p0, v3, v1}, LK8/A;->s(ILjava/lang/Throwable;Lm8/i;)V

    return-void

    :cond_15
    instance-of p0, v0, LF8/d0;

    if-eqz p0, :cond_1c

    move-object v3, v0

    check-cast v3, LF8/d0;

    :cond_1c
    if-eqz v3, :cond_21

    invoke-interface {v3}, LF8/d0;->dispose()V

    :cond_21
    return-void
.end method

.method public final c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LN8/j$a;->e:Ljava/lang/Object;

    iget-object p0, p0, LN8/j$a;->d:Ljava/lang/Object;

    invoke-static {}, LN8/l;->i()LK8/D;

    move-result-object v1

    if-ne p0, v1, :cond_16

    const-string p0, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lv8/l;

    invoke-interface {v0, p2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_16
    const-string p0, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lv8/p;

    invoke-interface {v0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LN8/j$a;->c:Lv8/q;

    iget-object v1, p0, LN8/j$a;->a:Ljava/lang/Object;

    iget-object p0, p0, LN8/j$a;->d:Ljava/lang/Object;

    invoke-interface {v0, v1, p0, p1}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final e(LN8/j;)Z
    .registers 4

    iget-object v0, p0, LN8/j$a;->b:Lv8/q;

    iget-object v1, p0, LN8/j$a;->a:Ljava/lang/Object;

    iget-object p0, p0, LN8/j$a;->d:Ljava/lang/Object;

    invoke-interface {v0, v1, p1, p0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LN8/j;->h(LN8/j;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LN8/l;->d()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method
