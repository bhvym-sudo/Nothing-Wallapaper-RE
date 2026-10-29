.class public final LM6/h;
.super LM6/a;
.source "SourceFile"


# instance fields
.field private final r:Le3/X;


# direct methods
.method public constructor <init>(Le3/X;Ljava/util/Set;Lv8/p;)V
    .registers 6

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LM6/a;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LM6/h;->r:Le3/X;

    iget-object v0, p1, Le3/X;->z:Landroidx/cardview/widget/CardView;

    new-instance v1, LM6/g;

    invoke-direct {v1, p3, p0}, LM6/g;-><init>(Lv8/p;LM6/h;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p0, p1, Le3/X;->v:Le3/V;

    iget-object p0, p0, Le3/V;->w:Lcom/nothing/wallpaper/widget/CategoryItemView;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1, p3}, Lcom/nothing/wallpaper/widget/CategoryItemView;->f(Ljava/util/Set;ZLv8/p;)V

    return-void
.end method

.method public static f(Lv8/p;LM6/h;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, LM6/a;->e()Lg3/a;

    move-result-object p1

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d(Lg3/a;)V
    .registers 8

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LM6/a;->d(Lg3/a;)V

    instance-of v0, p1, LJ6/h;

    if-eqz v0, :cond_68

    iget-object p0, p0, LM6/h;->r:Le3/X;

    iget-object v0, p0, Le3/X;->v:Le3/V;

    iget-object v0, v0, Le3/V;->w:Lcom/nothing/wallpaper/widget/CategoryItemView;

    const-string v1, "categoryItem"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, LJ6/h;

    invoke-virtual {v1}, Lg3/r;->q()Ljava/util/List;

    move-result-object v2

    const-string v3, "getUnmodifiableWallpapers(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-nez v2, :cond_30

    move v2, v5

    goto :goto_31

    :cond_30
    move v2, v4

    :goto_31
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Le3/X;->z:Landroidx/cardview/widget/CardView;

    const-string v2, "defaultView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg3/r;->q()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_46

    move v4, v5

    :cond_46
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Le3/X;->y:Landroid/widget/TextView;

    invoke-virtual {v1}, Lg3/a;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lg3/r;->q()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_68

    iget-object p0, p0, Le3/X;->v:Le3/V;

    iget-object p0, p0, Le3/V;->w:Lcom/nothing/wallpaper/widget/CategoryItemView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/widget/CategoryItemView;->c(Lg3/a;)V

    :cond_68
    return-void
.end method
