.class public final LF7/k$c;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final q:Le3/B0;

.field private final r:Lcom/android/launcher3/f;

.field private final s:LE7/S;


# direct methods
.method public constructor <init>(Le3/B0;Lcom/android/launcher3/f;LE7/S;)V
    .registers 6

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LF7/k$c;->q:Le3/B0;

    iput-object p2, p0, LF7/k$c;->r:Lcom/android/launcher3/f;

    iput-object p3, p0, LF7/k$c;->s:LE7/S;

    iget-object p3, p1, Le3/B0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClipCardView;

    const-string v0, "cardView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_4a

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p2, Lcom/android/launcher3/f;->X:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v1, p2, Lcom/android/launcher3/f;->Z:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p3, p1, Le3/B0;->x:Landroid/widget/ImageView;

    iget v0, p2, Lcom/android/launcher3/f;->a0:F

    invoke-virtual {p3, v0}, Landroid/view/View;->setTranslationX(F)V

    iget p2, p2, Lcom/android/launcher3/f;->a0:F

    invoke-virtual {p3, p2}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p1, Le3/B0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClipCardView;

    new-instance p2, LF7/m;

    invoke-direct {p2, p0}, LF7/m;-><init>(LF7/k$c;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_4a
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(LF7/k$c;Landroid/view/View;)V
    .registers 9

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LS5/a;

    if-eqz v0, :cond_d

    check-cast p1, LS5/a;

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    if-eqz p1, :cond_28

    iget-object p0, p0, LF7/k$c;->s:LE7/S;

    if-eqz p0, :cond_28

    new-instance v0, Lz7/c;

    invoke-virtual {p1}, LS5/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LS5/a;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v6}, Lz7/c;-><init>(Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/h;)V

    invoke-interface {p0, v0}, LE7/S;->v(Lz7/c;)V

    :cond_28
    return-void
.end method


# virtual methods
.method public final e(LS5/a;)V
    .registers 6

    const-string v0, "metaInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, LF7/k$c;->q:Le3/B0;

    iget-object v1, v0, Le3/B0;->y:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LS5/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/B0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClipCardView;

    iget-object v2, v0, Le3/B0;->y:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/B0;->w:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LS5/a;->b(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_3d

    iget-object v2, v0, Le3/B0;->w:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3d
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/request/BaseRequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/RequestBuilder;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/request/BaseRequestOptions;->skipMemoryCache(Z)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/RequestBuilder;

    iget-object p1, v0, Le3/B0;->x:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method
