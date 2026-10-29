.class public final LI8/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/y;->c(LI8/f;LI8/f;LI8/f;Lv8/r;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:[LI8/f;

.field final synthetic r:Lv8/r;


# direct methods
.method public constructor <init>([LI8/f;Lv8/r;)V
    .registers 3

    iput-object p1, p0, LI8/y$a;->q:[LI8/f;

    iput-object p2, p0, LI8/y$a;->r:Lv8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    iget-object v0, p0, LI8/y$a;->q:[LI8/f;

    invoke-static {}, LI8/y;->a()Lv8/a;

    move-result-object v1

    new-instance v2, LI8/y$a$a;

    const/4 v3, 0x0

    iget-object p0, p0, LI8/y$a;->r:Lv8/r;

    invoke-direct {v2, v3, p0}, LI8/y$a$a;-><init>(Lm8/e;Lv8/r;)V

    invoke-static {p1, v0, v1, v2, p2}, LJ8/l;->a(LI8/g;[LI8/f;Lv8/a;Lv8/q;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_19

    return-object p0

    :cond_19
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
