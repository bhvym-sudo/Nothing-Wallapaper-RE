.class final LF8/F0;
.super LF8/U;
.source "SourceFile"


# instance fields
.field private final t:Lm8/e;


# direct methods
.method public constructor <init>(Lm8/i;Lv8/p;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LF8/U;-><init>(Lm8/i;Z)V

    invoke-static {p2, p0, p0}, Ln8/b;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p1

    iput-object p1, p0, LF8/F0;->t:Lm8/e;

    return-void
.end method


# virtual methods
.method protected y0()V
    .registers 2

    iget-object v0, p0, LF8/F0;->t:Lm8/e;

    invoke-static {v0, p0}, LL8/a;->b(Lm8/e;Lm8/e;)V

    return-void
.end method
