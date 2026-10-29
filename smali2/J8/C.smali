.class final LJ8/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# instance fields
.field private final q:Lm8/i;

.field private final r:Ljava/lang/Object;

.field private final s:Lv8/p;


# direct methods
.method public constructor <init>(LI8/g;Lm8/i;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ8/C;->q:Lm8/i;

    invoke-static {p2}, LK8/K;->g(Lm8/i;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LJ8/C;->r:Ljava/lang/Object;

    new-instance p2, LJ8/C$a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LJ8/C$a;-><init>(LI8/g;Lm8/e;)V

    iput-object p2, p0, LJ8/C;->s:Lv8/p;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LJ8/C;->q:Lm8/i;

    iget-object v1, p0, LJ8/C;->r:Ljava/lang/Object;

    iget-object p0, p0, LJ8/C;->s:Lv8/p;

    invoke-static {v0, p1, v1, p0, p2}, LJ8/f;->b(Lm8/i;Ljava/lang/Object;Ljava/lang/Object;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_11

    return-object p0

    :cond_11
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
