.class public final LT6/f;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements LT6/a;


# instance fields
.field private final q:Le3/A;

.field private final r:Z

.field private final s:Landroid/os/Handler;

.field private t:Lv8/l;

.field private final u:Ljava/lang/String;

.field private final v:I

.field private w:I

.field private final x:Lh8/h;


# direct methods
.method public constructor <init>(Le3/A;ZLandroid/os/Handler;Lv8/l;)V
    .registers 6

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LT6/f;->q:Le3/A;

    iput-boolean p2, p0, LT6/f;->r:Z

    iput-object p3, p0, LT6/f;->s:Landroid/os/Handler;

    iput-object p4, p0, LT6/f;->t:Lv8/l;

    const-string p1, "NTCreativePromptHolder"

    iput-object p1, p0, LT6/f;->u:Ljava/lang/String;

    const/16 p1, 0xa

    iput p1, p0, LT6/f;->v:I

    new-instance p1, LT6/d;

    invoke-direct {p1}, LT6/d;-><init>()V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LT6/f;->x:Lh8/h;

    return-void
.end method

.method public static synthetic d(LT6/f;ILandroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LT6/f;->n(LT6/f;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic e()Ljava/security/SecureRandom;
    .registers 1

    invoke-static {}, LT6/f;->q()Ljava/security/SecureRandom;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic f(LT6/f;)Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, LT6/f;->s:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic g(LT6/f;)I
    .registers 1

    iget p0, p0, LT6/f;->v:I

    return p0
.end method

.method public static final synthetic h(LT6/f;)Ljava/security/SecureRandom;
    .registers 1

    invoke-direct {p0}, LT6/f;->o()Ljava/security/SecureRandom;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LT6/f;)I
    .registers 1

    iget p0, p0, LT6/f;->w:I

    return p0
.end method

.method public static final synthetic j(LT6/f;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LT6/f;->u:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic k(LT6/f;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, LT6/f;->p(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic l(LT6/f;I)V
    .registers 2

    iput p1, p0, LT6/f;->w:I

    return-void
.end method

.method private static final n(LT6/f;ILandroid/view/View;)V
    .registers 3

    iget-object p0, p0, LT6/f;->t:Lv8/l;

    if-eqz p0, :cond_b

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    return-void
.end method

.method private final o()Ljava/security/SecureRandom;
    .registers 1

    iget-object p0, p0, LT6/f;->x:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/SecureRandom;

    return-object p0
.end method

.method private final p(Ljava/lang/String;)V
    .registers 7

    new-instance v0, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {v0}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07047a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    filled-new-array {v1, v2}, [Lcom/bumptech/glide/load/Transformation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->transform([Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/RequestOptions;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    invoke-static {}, Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;->withCrossFade()Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->transition(Lcom/bumptech/glide/TransitionOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, LT6/f$a;

    invoke-direct {v1, p0, p1}, LT6/f$a;-><init>(LT6/f;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->addListener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    iget-object p0, p0, LT6/f;->q:Le3/A;

    iget-object p0, p0, Le3/A;->v:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method private static final q()Ljava/security/SecureRandom;
    .registers 1

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(F)V
    .registers 4

    iget-object v0, p0, LT6/f;->q:Le3/A;

    iget-object v0, v0, Le3/A;->y:Landroid/widget/TextView;

    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, LT6/f;->q:Le3/A;

    iget-object p0, p0, Le3/A;->x:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final m(Lcom/nothing/wallpaper/picker/creative/model/Prompt;IZII)V
    .registers 9

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p4, :cond_fc

    if-gtz p5, :cond_b

    goto/16 :goto_fc

    :cond_b
    iget-object v0, p0, LT6/f;->q:Le3/A;

    iget-object v0, v0, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, LT6/c;

    invoke-direct {v1, p0, p2}, LT6/c;-><init>(LT6/f;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, LT6/f;->q:Le3/A;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f070472

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iget-object v0, p0, LT6/f;->q:Le3/A;

    iget-object v0, v0, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, LT6/f;->q:Le3/A;

    iget-object v1, v1, Le3/A;->v:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput p4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070477

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    mul-int/lit8 v2, v0, 0x2

    sub-int/2addr p4, v2

    iput p4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    sub-int/2addr p5, v0

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr v0, p2

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr p5, v0

    iput p5, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-boolean p4, p0, LT6/f;->r:Z

    if-eqz p4, :cond_82

    iget-object p4, p0, LT6/f;->q:Le3/A;

    iget-object p4, p4, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    iget-object v0, p0, LT6/f;->q:Le3/A;

    iget-object v0, v0, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr v0, p2

    div-int/lit8 v0, v0, 0x2

    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    iget-object v1, p0, LT6/f;->q:Le3/A;

    iget-object v1, v1, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p4, p5, v0, p2, v1}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_a8

    :cond_82
    iget-object p4, p0, LT6/f;->q:Le3/A;

    iget-object p4, p4, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    iget-object v0, p0, LT6/f;->q:Le3/A;

    iget-object v0, v0, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, LT6/f;->q:Le3/A;

    iget-object v1, v1, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    iget-object v2, p0, LT6/f;->q:Le3/A;

    iget-object v2, v2, Le3/A;->w:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v2, p2

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p4, p5, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    :goto_a8
    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_cc

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_b5

    goto :goto_cc

    :cond_b5
    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->v:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_e2

    :cond_cc
    :goto_cc
    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->v:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_e2
    if-eqz p3, :cond_ed

    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->x:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_f5

    :cond_ed
    iget-object p2, p0, LT6/f;->q:Le3/A;

    iget-object p2, p2, Le3/A;->x:Landroid/view/View;

    const/4 p3, 0x4

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    :goto_f5
    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPhotoLink()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LT6/f;->p(Ljava/lang/String;)V

    :cond_fc
    :goto_fc
    return-void
.end method
