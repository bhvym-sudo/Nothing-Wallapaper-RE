.class public final LI8/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/y;->e(LI8/f;LI8/f;Lv8/q;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:LI8/f;

.field final synthetic s:Lv8/q;


# direct methods
.method public constructor <init>(LI8/f;LI8/f;Lv8/q;)V
    .registers 4

    iput-object p1, p0, LI8/y$c;->q:LI8/f;

    iput-object p2, p0, LI8/y$c;->r:LI8/f;

    iput-object p3, p0, LI8/y$c;->s:Lv8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    iget-object v0, p0, LI8/y$c;->q:LI8/f;

    iget-object v1, p0, LI8/y$c;->r:LI8/f;

    filled-new-array {v0, v1}, [LI8/f;

    move-result-object v0

    invoke-static {}, LI8/y;->a()Lv8/a;

    move-result-object v1

    new-instance v2, LI8/y$d;

    iget-object p0, p0, LI8/y$c;->s:Lv8/q;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LI8/y$d;-><init>(Lv8/q;Lm8/e;)V

    invoke-static {p1, v0, v1, v2, p2}, LJ8/l;->a(LI8/g;[LI8/f;Lv8/a;Lv8/q;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1f

    return-object p0

    :cond_1f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
