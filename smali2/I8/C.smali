.class final LI8/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/O;
.implements LI8/f;
.implements LJ8/q;


# instance fields
.field private final synthetic q:LI8/O;

.field private final r:LF8/x0;


# direct methods
.method public constructor <init>(LI8/O;LF8/x0;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/C;->q:LI8/O;

    iput-object p2, p0, LI8/C;->r:LF8/x0;

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/C;->q:LI8/O;

    invoke-interface {p0, p1, p2}, LI8/E;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public e(Lm8/i;ILH8/a;)LI8/f;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/Q;->d(LI8/O;Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LI8/C;->q:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
