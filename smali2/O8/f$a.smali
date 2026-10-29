.class final LO8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/l;
.implements LF8/c1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final q:LF8/n;

.field public final r:Ljava/lang/Object;

.field final synthetic s:LO8/f;


# direct methods
.method public constructor <init>(LO8/f;LF8/n;Ljava/lang/Object;)V
    .registers 4

    iput-object p1, p0, LO8/f$a;->s:LO8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO8/f$a;->q:LF8/n;

    iput-object p3, p0, LO8/f$a;->r:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c(LO8/f;LO8/f$a;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, LO8/f$a;->l(LO8/f;LO8/f$a;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LO8/f;LO8/f$a;Ljava/lang/Throwable;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LO8/f$a;->g(LO8/f;LO8/f$a;Ljava/lang/Throwable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LO8/f;LO8/f$a;Ljava/lang/Throwable;)Lh8/A;
    .registers 3

    iget-object p1, p1, LO8/f$a;->r:Ljava/lang/Object;

    invoke-virtual {p0, p1}, LO8/f;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final l(LO8/f;LO8/f$a;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;
    .registers 5

    invoke-static {}, LO8/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p1, LO8/f$a;->r:Ljava/lang/Object;

    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p1, LO8/f$a;->r:Ljava/lang/Object;

    invoke-virtual {p0, p1}, LO8/f;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .registers 1

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0}, LF8/n;->a()Z

    move-result p0

    return p0
.end method

.method public b(LK8/A;I)V
    .registers 3

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1, p2}, LF8/n;->b(LK8/A;I)V

    return-void
.end method

.method public e(Lh8/A;Lv8/l;)V
    .registers 3

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1, p2}, LF8/n;->k(Ljava/lang/Object;Lv8/l;)V

    return-void
.end method

.method public f(Lh8/A;Lv8/q;)V
    .registers 5

    invoke-static {}, LO8/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object v0, p0, LO8/f$a;->s:LO8/f;

    iget-object v1, p0, LO8/f$a;->r:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, LO8/f$a;->q:LF8/n;

    iget-object v0, p0, LO8/f$a;->s:LO8/f;

    new-instance v1, LO8/e;

    invoke-direct {v1, v0, p0}, LO8/e;-><init>(LO8/f;LO8/f$a;)V

    invoke-virtual {p2, p1, v1}, LF8/n;->k(Ljava/lang/Object;Lv8/l;)V

    return-void
.end method

.method public getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public h(LF8/I;Lh8/A;)V
    .registers 3

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1, p2}, LF8/n;->q(LF8/I;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Lv8/l;)V
    .registers 2

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1}, LF8/n;->i(Lv8/l;)V

    return-void
.end method

.method public j(Lh8/A;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;
    .registers 6

    iget-object p3, p0, LO8/f$a;->s:LO8/f;

    iget-object v0, p0, LO8/f$a;->q:LF8/n;

    new-instance v1, LO8/d;

    invoke-direct {v1, p3, p0}, LO8/d;-><init>(LO8/f;LO8/f$a;)V

    invoke-virtual {v0, p1, p2, v1}, LF8/n;->r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1a

    invoke-static {}, LO8/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p0, LO8/f$a;->s:LO8/f;

    iget-object p0, p0, LO8/f$a;->r:Ljava/lang/Object;

    invoke-virtual {p2, p3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1a
    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lv8/l;)V
    .registers 3

    check-cast p1, Lh8/A;

    invoke-virtual {p0, p1, p2}, LO8/f$a;->e(Lh8/A;Lv8/l;)V

    return-void
.end method

.method public bridge synthetic m(Ljava/lang/Object;Lv8/q;)V
    .registers 3

    check-cast p1, Lh8/A;

    invoke-virtual {p0, p1, p2}, LO8/f$a;->f(Lh8/A;Lv8/q;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;)Z
    .registers 2

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1}, LF8/n;->o(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic q(LF8/I;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Lh8/A;

    invoke-virtual {p0, p1, p2}, LO8/f$a;->h(LF8/I;Lh8/A;)V

    return-void
.end method

.method public bridge synthetic r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;
    .registers 4

    check-cast p1, Lh8/A;

    invoke-virtual {p0, p1, p2, p3}, LO8/f$a;->j(Lh8/A;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1}, LF8/n;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public t(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, LO8/f$a;->q:LF8/n;

    invoke-virtual {p0, p1}, LF8/n;->t(Ljava/lang/Object;)V

    return-void
.end method
