.class final LG7/n$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/n$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LJ7/i;

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

.field final synthetic s:LS1/a;


# direct methods
.method constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LS1/a;)V
    .registers 4

    iput-object p1, p0, LG7/n$b$a$a;->q:LJ7/i;

    iput-object p2, p0, LG7/n$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iput-object p3, p0, LG7/n$b$a$a;->s:LS1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 11

    instance-of v0, p2, LG7/n$b$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LG7/n$b$a$a$a;

    iget v1, v0, LG7/n$b$a$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LG7/n$b$a$a$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LG7/n$b$a$a$a;

    invoke-direct {v0, p0, p2}, LG7/n$b$a$a$a;-><init>(LG7/n$b$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LG7/n$b$a$a$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG7/n$b$a$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3a

    if-ne v2, v3, :cond_32

    iget-object p0, v0, LG7/n$b$a$a$a;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    iget-object p0, v0, LG7/n$b$a$a$a;->q:Ljava/lang/Object;

    check-cast p0, LG7/n$b$a$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_50

    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3a
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LG7/n$b$a$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->U()LI8/f;

    move-result-object p2

    iput-object p0, v0, LG7/n$b$a$a$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LG7/n$b$a$a$a;->r:Ljava/lang/Object;

    iput v3, v0, LG7/n$b$a$a$a;->u:I

    invoke-static {p2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_50

    return-object v1

    :cond_50
    :goto_50
    check-cast p2, Ljava/lang/String;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LG7/n$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_66
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_77

    invoke-static {}, Li8/s;->t()V

    :cond_77
    check-cast v3, LT1/a;

    new-instance v2, LT1/a;

    invoke-virtual {v3}, LT1/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, LT1/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f1301ff

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v5, v3, v6}, LT1/a;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_66

    :cond_a9
    iget-object p1, p0, LG7/n$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object p0, p0, LG7/n$b$a$a;->s:LS1/a;

    invoke-virtual {p1, v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->i(Ljava/util/List;LS1/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LG7/n$b$a$a;->a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
