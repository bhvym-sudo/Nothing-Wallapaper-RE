.class public final LF7/p$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final q:Le3/H0;

.field private final r:Lcom/android/launcher3/f;

.field private final s:LE7/S;


# direct methods
.method public constructor <init>(Le3/H0;Lcom/android/launcher3/f;LE7/S;)V
    .registers 5

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LF7/p$a;->q:Le3/H0;

    iput-object p2, p0, LF7/p$a;->r:Lcom/android/launcher3/f;

    iput-object p3, p0, LF7/p$a;->s:LE7/S;

    iget-object p3, p1, Le3/H0;->w:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/View;->setHapticFeedbackEnabled(Z)V

    new-instance v0, LF7/n;

    invoke-direct {v0, p0, p1}, LF7/n;-><init>(LF7/p$a;Le3/H0;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, LF7/o;

    invoke-direct {v0, p0, p1}, LF7/o;-><init>(LF7/p$a;Le3/H0;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object p0, p1, Le3/H0;->w:Landroid/widget/ImageView;

    iget p3, p2, Lcom/android/launcher3/f;->X:I

    invoke-virtual {p0, p3}, Landroid/widget/ImageView;->setMaxHeight(I)V

    iget-object p0, p1, Le3/H0;->w:Landroid/widget/ImageView;

    iget p3, p2, Lcom/android/launcher3/f;->X:I

    invoke-virtual {p0, p3}, Landroid/widget/ImageView;->setMaxWidth(I)V

    iget-object p0, p1, Le3/H0;->v:Landroid/widget/FrameLayout;

    const-string p1, "previewContainer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_50

    iget p2, p2, Lcom/android/launcher3/f;->b0:I

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_50
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(LF7/p$a;Le3/H0;Landroid/view/View;)Z
    .registers 3

    iget-object p0, p0, LF7/p$a;->s:LE7/S;

    if-eqz p0, :cond_e

    iget-object p1, p1, Le3/H0;->w:Landroid/widget/ImageView;

    const-string p2, "previewImg"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LE7/S;->j(Landroid/view/View;)V

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public static e(LF7/p$a;Le3/H0;Landroid/view/View;)V
    .registers 3

    iget-object p0, p0, LF7/p$a;->s:LE7/S;

    if-eqz p0, :cond_e

    iget-object p1, p1, Le3/H0;->w:Landroid/widget/ImageView;

    const-string p2, "previewImg"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LE7/S;->d(Landroid/view/View;)V

    :cond_e
    return-void
.end method


# virtual methods
.method public final f(Lcom/nothing/launcher/card/j;)V
    .registers 6

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/p$a;->q:Le3/H0;

    iget-object v1, v0, Le3/H0;->w:Landroid/widget/ImageView;

    new-instance v2, Lcom/nothing/launcher/card/m;

    invoke-direct {v2, p1}, Lcom/nothing/launcher/card/m;-><init>(Lcom/nothing/launcher/card/j;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, v0, Le3/H0;->w:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/nothing/launcher/card/j;->x0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p0, p0, LF7/p$a;->r:Lcom/android/launcher3/f;

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v1

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/android/launcher3/f;->l(II)Landroid/graphics/Rect;

    move-result-object p0

    iget-object v0, v0, Le3/H0;->w:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, p0}, Lcom/nothing/launcher/card/j;->t0(Landroid/content/Context;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method
