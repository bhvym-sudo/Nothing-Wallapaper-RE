.class final LI8/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/E;
.implements LI8/f;
.implements LJ8/q;


# instance fields
.field private final synthetic q:LI8/E;

.field private final r:LF8/x0;


# direct methods
.method public constructor <init>(LI8/E;LF8/x0;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/B;->q:LI8/E;

    iput-object p2, p0, LI8/B;->r:LF8/x0;

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/B;->q:LI8/E;

    invoke-interface {p0, p1, p2}, LI8/E;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public e(Lm8/i;ILH8/a;)LI8/f;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/G;->e(LI8/E;Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method
