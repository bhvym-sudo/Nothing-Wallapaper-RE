.class public final Lj7/j$q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$q;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/g;


# direct methods
.method public constructor <init>(LI8/g;)V
    .registers 2

    iput-object p1, p0, Lj7/j$q$a;->q:LI8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, Lj7/j$q$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lj7/j$q$a$a;

    iget v1, v0, Lj7/j$q$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lj7/j$q$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, Lj7/j$q$a$a;

    invoke-direct {v0, p0, p2}, Lj7/j$q$a$a;-><init>(Lj7/j$q$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lj7/j$q$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lj7/j$q$a$a;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_47

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p0, p0, Lj7/j$q$a;->q:LI8/g;

    check-cast p1, Ljava/util/Map;

    sget-object p2, LC6/e$c;->c:LC6/e$c;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, Lj7/j$q$a$a;->r:I

    invoke-interface {p0, p1, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_47

    return-object v1

    :cond_47
    :goto_47
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
