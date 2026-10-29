.class public final LM6/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/u;->m(Lg3/a;Landroidx/lifecycle/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/u;


# direct methods
.method constructor <init>(LM6/u;)V
    .registers 2

    iput-object p1, p0, LM6/u$a;->a:LM6/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Le3/K;Ljava/util/List;LM6/u;)V
    .registers 3

    invoke-static {p0, p1, p2}, LM6/u$a;->c(Le3/K;Ljava/util/List;LM6/u;)V

    return-void
.end method

.method private static final c(Le3/K;Ljava/util/List;LM6/u;)V
    .registers 4

    iget-object v0, p0, Le3/K;->C:Lcom/nothing/wallpaper/widget/PhotoCoverView;

    iget-object p0, p0, Le3/K;->v:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    invoke-static {p2}, LM6/u;->l(LM6/u;)Z

    move-result p2

    invoke-virtual {v0, p1, p0, p2}, Lcom/nothing/wallpaper/widget/PhotoCoverView;->a(Ljava/util/List;IZ)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .registers 5

    const-string v0, "asserts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM6/u$a;->a:LM6/u;

    invoke-static {v0}, LM6/u;->k(LM6/u;)Le3/K;

    move-result-object v0

    iget-object p0, p0, LM6/u$a;->a:LM6/u;

    iget-object v1, v0, Le3/K;->v:Landroidx/cardview/widget/CardView;

    new-instance v2, LM6/t;

    invoke-direct {v2, v0, p1, p0}, LM6/t;-><init>(Le3/K;Ljava/util/List;LM6/u;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
