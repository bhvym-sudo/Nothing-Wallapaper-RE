.class final LQ6/c$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ6/c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic r:LP6/e;

.field final synthetic s:Lp6/a;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;)V
    .registers 4

    iput-object p1, p0, LQ6/c$a$a$a$a;->q:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, LQ6/c$a$a$a$a;->r:LP6/e;

    iput-object p3, p0, LQ6/c$a$a$a$a;->s:Lp6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LQ6/c$a$a$a$a;->e(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V

    return-void
.end method

.method private static final e(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V
    .registers 5

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Lp6/a;->c(I)I

    move-result p2

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, Li8/s;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, LP6/e;->j(Landroid/view/View;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, LQ6/c$a$a$a$a;->c(Ljava/util/Collection;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final c(Ljava/util/Collection;Lm8/e;)Ljava/lang/Object;
    .registers 7

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    move v2, v1

    goto :goto_32

    :cond_13
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    :cond_18
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb2/e;

    invoke-virtual {v3}, Lb2/e;->c()I

    move-result v3

    if-lez v3, :cond_18

    add-int/lit8 v2, v2, 0x1

    if-gez v2, :cond_18

    invoke-static {}, Li8/s;->s()V

    goto :goto_18

    :cond_32
    :goto_32
    const/4 v0, 0x1

    if-ne v2, v0, :cond_69

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_39
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_61

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb2/e;

    invoke-virtual {v2}, Lb2/e;->c()I

    move-result v3

    if-lez v3, :cond_4d

    move v3, v0

    goto :goto_4e

    :cond_4d
    move v3, v1

    :goto_4e
    if-eqz v3, :cond_39

    invoke-virtual {v2}, Lb2/e;->b()Lv8/a;

    move-result-object p2

    if-eqz p2, :cond_59

    invoke-interface {p2}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_59
    iget-object p2, p0, LQ6/c$a$a$a$a;->q:Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6e

    :cond_61
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Collection contains no element matching the predicate."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_69
    iget-object p2, p0, LQ6/c$a$a$a$a;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_6e
    iget-object p2, p0, LQ6/c$a$a$a$a;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, LQ6/c$a$a$a$a;->r:LP6/e;

    iget-object p0, p0, LQ6/c$a$a$a$a;->s:Lp6/a;

    new-instance v1, LQ6/b;

    invoke-direct {v1, v0, p2, p0, p1}, LQ6/b;-><init>(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
