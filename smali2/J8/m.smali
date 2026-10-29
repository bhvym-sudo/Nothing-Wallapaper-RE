.class public final LJ8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i;


# instance fields
.field private final synthetic q:Lm8/i;

.field public final r:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lm8/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ8/m;->q:Lm8/i;

    iput-object p1, p0, LJ8/m;->r:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LJ8/m;->q:Lm8/i;

    invoke-interface {p0, p1, p2}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    iget-object p0, p0, LJ8/m;->q:Lm8/i;

    invoke-interface {p0, p1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 2

    iget-object p0, p0, LJ8/m;->q:Lm8/i;

    invoke-interface {p0, p1}, Lm8/i;->t0(Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    iget-object p0, p0, LJ8/m;->q:Lm8/i;

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
