.class public final LJ8/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/o;->b(Lv8/q;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/q;


# direct methods
.method public constructor <init>(Lv8/q;)V
    .registers 2

    iput-object p1, p0, LJ8/o$a;->q:Lv8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LJ8/o$b;

    iget-object p0, p0, LJ8/o$a;->q:Lv8/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LJ8/o$b;-><init>(Lv8/q;LI8/g;Lm8/e;)V

    invoke-static {v0, p2}, LJ8/o;->a(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_13

    return-object p0

    :cond_13
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
