.class public final LF7/e;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/e$a;,
        LF7/e$b;
    }
.end annotation


# static fields
.field public static final s:LF7/e$a;


# instance fields
.field private final q:Ljava/util/List;

.field private final r:Lv8/p;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF7/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF7/e;->s:LF7/e$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lv8/p;)V
    .registers 4

    const-string v0, "models"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, LF7/e;->q:Ljava/util/List;

    iput-object p2, p0, LF7/e;->r:Lv8/p;

    return-void
.end method

.method public static synthetic d(LF7/e;LF7/f;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LF7/e;->f(LF7/e;LF7/f;Landroid/view/View;)V

    return-void
.end method

.method private static final f(LF7/e;LF7/f;Landroid/view/View;)V
    .registers 3

    iget-object p0, p0, LF7/e;->r:Lv8/p;

    invoke-virtual {p1}, LF7/f;->d()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p2, p1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e(LF7/e$b;I)V
    .registers 7

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF7/e;->q:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF7/f;

    invoke-virtual {v0}, LF7/f;->a()Z

    move-result v1

    if-eqz v1, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_23

    :cond_16
    invoke-virtual {v0}, LF7/f;->d()Z

    move-result v1

    if-eqz v1, :cond_20

    const v1, 0x3e99999a    # 0.3f

    goto :goto_23

    :cond_20
    const v1, 0x3ecccccd    # 0.4f

    :goto_23
    invoke-virtual {v0}, LF7/f;->c()I

    move-result v2

    if-lez v2, :cond_35

    invoke-virtual {p1}, LF7/e$b;->f()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0}, LF7/f;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3d

    :cond_35
    invoke-virtual {p1}, LF7/e$b;->f()Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_3d
    invoke-virtual {p1}, LF7/e$b;->f()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0}, LF7/f;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p1}, LF7/e$b;->f()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1}, LF7/e$b;->h()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, LF7/f;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LF7/e$b;->h()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setAlpha(F)V

    const/4 v1, 0x0

    if-nez p2, :cond_76

    invoke-virtual {p1}, LF7/e$b;->d()Landroid/widget/LinearLayout;

    move-result-object p2

    const v2, 0x7f0802c7

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p1}, LF7/e$b;->e()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_a5

    :cond_76
    iget-object v2, p0, LF7/e;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne p2, v2, :cond_94

    invoke-virtual {p1}, LF7/e$b;->d()Landroid/widget/LinearLayout;

    move-result-object p2

    const v1, 0x7f0802c6

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p1}, LF7/e$b;->e()Landroid/view/View;

    move-result-object p2

    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_a5

    :cond_94
    invoke-virtual {p1}, LF7/e$b;->d()Landroid/widget/LinearLayout;

    move-result-object p2

    const v2, 0x7f0802c5

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p1}, LF7/e$b;->e()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_a5
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, LF7/d;

    invoke-direct {v1, p0, v0}, LF7/d;-><init>(LF7/e;LF7/f;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, LF7/e$b;->g()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    move-result-object p0

    invoke-virtual {v0}, LF7/f;->a()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;->setEnabled(Z)V

    invoke-virtual {v0}, LF7/f;->d()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;->setChecked(Z)V

    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)LF7/e$b;
    .registers 4

    const-string p0, "parent"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    const p2, 0x7f0d00cb

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    new-instance p1, LF7/e$b;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p1, p0}, LF7/e$b;-><init>(Landroid/view/View;)V

    return-object p1
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, LF7/e;->q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    check-cast p1, LF7/e$b;

    invoke-virtual {p0, p1, p2}, LF7/e;->e(LF7/e$b;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    invoke-virtual {p0, p1, p2}, LF7/e;->g(Landroid/view/ViewGroup;I)LF7/e$b;

    move-result-object p0

    return-object p0
.end method
