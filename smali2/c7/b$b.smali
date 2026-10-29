.class public final Lc7/b$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final q:Landroid/view/View;

.field private final r:Landroid/widget/ImageView;

.field final synthetic s:Lc7/b;


# direct methods
.method public constructor <init>(Lc7/b;Landroid/view/View;Landroid/widget/ImageView;)V
    .registers 5

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imgView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc7/b$b;->s:Lc7/b;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lc7/b$b;->q:Landroid/view/View;

    iput-object p3, p0, Lc7/b$b;->r:Landroid/widget/ImageView;

    instance-of p3, p2, Lcom/google/android/material/carousel/i;

    if-eqz p3, :cond_1a

    check-cast p2, Lcom/google/android/material/carousel/i;

    goto :goto_1b

    :cond_1a
    const/4 p2, 0x0

    :goto_1b
    if-eqz p2, :cond_2c

    invoke-direct {p0}, Lc7/b$b;->f()LN4/l;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/material/carousel/i;->setShapeAppearanceModel(LN4/l;)V

    new-instance p3, Lc7/c;

    invoke-direct {p3, p0, p1}, Lc7/c;-><init>(Lc7/b$b;Lc7/b;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2c
    return-void
.end method

.method public static d(Lc7/b$b;Lc7/b;Landroid/view/View;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    if-ltz p2, :cond_3a

    invoke-static {p1}, Lc7/b;->e(Lc7/b;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ge p2, v0, :cond_3a

    invoke-static {p1}, Lc7/b;->d(Lc7/b;)Lv8/l;

    move-result-object p0

    invoke-static {p1}, Lc7/b;->e(Lc7/b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-static {p1}, Lc7/b;->e(Lc7/b;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg3/x;

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getWallpaperId(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LR7/d;->k(Ljava/lang/String;)V

    return-void

    :cond_3a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    move-result p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "click item pos with CarouselLayoutManager error, layoutPos="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", adapterPos="

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "SuggestedWallpaperAdapter"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final f()LN4/l;
    .registers 3

    iget-object p0, p0, Lc7/b$b;->q:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f0704c6

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    new-instance v0, LN4/a;

    int-to-float p0, p0

    invoke-direct {v0, p0}, LN4/a;-><init>(F)V

    new-instance p0, LN4/l$b;

    invoke-direct {p0}, LN4/l$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LN4/l$b;->y(ILN4/d;)LN4/l$b;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, LN4/l$b;->C(ILN4/d;)LN4/l$b;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, LN4/l$b;->u(ILN4/d;)LN4/l$b;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, LN4/l$b;->q(ILN4/d;)LN4/l$b;

    move-result-object p0

    invoke-virtual {p0}, LN4/l$b;->m()LN4/l;

    move-result-object p0

    const-string v0, "build(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final e(Lg3/x;I)V
    .registers 6

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc7/b$b;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p1

    iget-object v1, p0, Lc7/b$b;->r:Landroid/widget/ImageView;

    const v2, 0x1010530

    invoke-static {v0, v2}, LH3/r;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    iget-object p0, p0, Lc7/b$b;->r:Landroid/widget/ImageView;

    const p1, 0x7f130233

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 p2, p2, 0x1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method
