.class public final synthetic LQ6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LP6/e;

.field public final synthetic r:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic s:Lp6/a;

.field public final synthetic t:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ6/b;->q:LP6/e;

    iput-object p2, p0, LQ6/b;->r:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, LQ6/b;->s:Lp6/a;

    iput-object p4, p0, LQ6/b;->t:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, LQ6/b;->q:LP6/e;

    iget-object v1, p0, LQ6/b;->r:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, LQ6/b;->s:Lp6/a;

    iget-object p0, p0, LQ6/b;->t:Ljava/util/Collection;

    invoke-static {v0, v1, v2, p0}, LQ6/c$a$a$a$a;->a(LP6/e;Landroidx/recyclerview/widget/RecyclerView;Lp6/a;Ljava/util/Collection;)V

    return-void
.end method
