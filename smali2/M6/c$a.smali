.class public final LM6/c$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final q:Le3/M;

.field private final r:Lv8/p;

.field private final s:Landroid/content/Context;

.field private t:Lg3/x;

.field private u:F


# direct methods
.method public constructor <init>(Le3/M;Lv8/p;)V
    .registers 5

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LM6/c$a;->q:Le3/M;

    iput-object p2, p0, LM6/c$a;->r:Lv8/p;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, LM6/c$a;->s:Landroid/content/Context;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LM6/c$a;->u:F

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LH3/D;->n(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, LM6/c$a;->u:F

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, LM6/b;

    invoke-direct {v1, p0}, LM6/b;-><init>(LM6/c$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f07045f

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object p1, p1, Le3/M;->y:Landroid/widget/ImageView;

    const-string p2, "indicatorIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string p2, "itemView"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, LH6/d;->d(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(LM6/c$a;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LM6/c$a;->e(LM6/c$a;Landroid/view/View;)V

    return-void
.end method

.method private static final e(LM6/c$a;Landroid/view/View;)V
    .registers 4

    iget-object p1, p0, LM6/c$a;->r:Lv8/p;

    iget-object v0, p0, LM6/c$a;->t:Lg3/x;

    iget-object p0, p0, LM6/c$a;->q:Le3/M;

    iget-object p0, p0, Le3/M;->x:Landroid/widget/ImageView;

    const-string v1, "image"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f(Lg3/x;Ljava/util/Set;)V
    .registers 8

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LM6/c$a;->t:Lg3/x;

    iget-object v0, p0, LM6/c$a;->q:Le3/M;

    iget-object v1, p0, LM6/c$a;->s:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lg3/x;->b(Landroid/content/Context;)Ljava/util/concurrent/Future;

    iget-object v1, p0, LM6/c$a;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object v1

    iget-object v2, p0, LM6/c$a;->s:Landroid/content/Context;

    iget-object v3, v0, Le3/M;->x:Landroid/widget/ImageView;

    const v4, 0x1010530

    invoke-static {v2, v4}, LH3/r;->a(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    iget-object v1, v0, Le3/M;->y:Landroid/widget/ImageView;

    const-string v2, "indicatorIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3e

    const/4 p2, 0x0

    goto :goto_40

    :cond_3e
    const/16 p2, 0x8

    :goto_40
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, v0, Le3/M;->x:Landroid/widget/ImageView;

    iget v1, p0, LM6/c$a;->u:F

    invoke-virtual {p2, v1}, Landroid/view/View;->setScaleX(F)V

    iget-object p2, v0, Le3/M;->x:Landroid/widget/ImageView;

    iget v1, p0, LM6/c$a;->u:F

    invoke-virtual {p2, v1}, Landroid/view/View;->setScaleY(F)V

    instance-of p1, p1, LJ6/c;

    if-eqz p1, :cond_68

    iget-object p1, v0, Le3/M;->x:Landroid/widget/ImageView;

    iget-object p0, p0, LM6/c$a;->s:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p2, 0x7f13009a

    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_68
    iget-object p1, v0, Le3/M;->x:Landroid/widget/ImageView;

    iget-object p0, p0, LM6/c$a;->s:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p2, 0x7f130233

    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method
