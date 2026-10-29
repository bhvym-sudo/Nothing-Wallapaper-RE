.class final LI8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# instance fields
.field private final q:LI8/f;

.field public final r:Lv8/l;

.field public final s:Lv8/p;


# direct methods
.method public constructor <init>(LI8/f;Lv8/l;Lv8/p;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/d;->q:LI8/f;

    iput-object p2, p0, LI8/d;->r:Lv8/l;

    iput-object p3, p0, LI8/d;->s:Lv8/p;

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, Lkotlin/jvm/internal/E;

    invoke-direct {v0}, Lkotlin/jvm/internal/E;-><init>()V

    sget-object v1, LJ8/t;->a:LK8/D;

    iput-object v1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    iget-object v1, p0, LI8/d;->q:LI8/f;

    new-instance v2, LI8/d$a;

    invoke-direct {v2, p0, v0, p1}, LI8/d$a;-><init>(LI8/d;Lkotlin/jvm/internal/E;LI8/g;)V

    invoke-interface {v1, v2, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1b

    return-object p0

    :cond_1b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
