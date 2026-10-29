.class public final LJ8/i;
.super LJ8/g;
.source "SourceFile"


# instance fields
.field private final u:Lv8/q;


# direct methods
.method public constructor <init>(Lv8/q;LI8/f;Lm8/i;ILH8/a;)V
    .registers 6

    .line 4
    invoke-direct {p0, p2, p3, p4, p5}, LJ8/g;-><init>(LI8/f;Lm8/i;ILH8/a;)V

    .line 5
    iput-object p1, p0, LJ8/i;->u:Lv8/q;

    return-void
.end method

.method public synthetic constructor <init>(Lv8/q;LI8/f;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V
    .registers 14

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_6

    .line 1
    sget-object p3, Lm8/j;->q:Lm8/j;

    :cond_6
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_c

    const/4 p4, -0x2

    :cond_c
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_13

    .line 2
    sget-object p5, LH8/a;->q:LH8/a;

    :cond_13
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, LJ8/i;-><init>(Lv8/q;LI8/f;Lm8/i;ILH8/a;)V

    return-void
.end method

.method public static final synthetic u(LJ8/i;)Lv8/q;
    .registers 1

    iget-object p0, p0, LJ8/i;->u:Lv8/q;

    return-object p0
.end method


# virtual methods
.method protected k(Lm8/i;ILH8/a;)LJ8/e;
    .registers 10

    new-instance v0, LJ8/i;

    iget-object v1, p0, LJ8/i;->u:Lv8/q;

    iget-object v2, p0, LJ8/g;->t:LI8/f;

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LJ8/i;-><init>(Lv8/q;LI8/f;Lm8/i;ILH8/a;)V

    return-object v0
.end method

.method protected t(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LJ8/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LJ8/i$a;-><init>(LJ8/i;LI8/g;Lm8/e;)V

    invoke-static {v0, p2}, LF8/M;->e(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_11

    return-object p0

    :cond_11
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
