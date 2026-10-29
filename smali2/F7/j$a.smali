.class public final LF7/j$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final q:Le3/p0;

.field private final r:Ly7/t;

.field final synthetic s:LF7/j;


# direct methods
.method public constructor <init>(LF7/j;Le3/p0;Ly7/t;)V
    .registers 5

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LF7/j$a;->s:LF7/j;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LF7/j$a;->q:Le3/p0;

    iput-object p3, p0, LF7/j$a;->r:Ly7/t;

    return-void
.end method

.method public static synthetic d(LF7/j$a;LC7/a;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LF7/j$a;->g(LF7/j$a;LC7/a;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(LF7/j$a;LC7/a;Landroid/view/View;)Z
    .registers 3

    invoke-static {p0, p1, p2}, LF7/j$a;->h(LF7/j$a;LC7/a;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private static final g(LF7/j$a;LC7/a;Landroid/view/View;)V
    .registers 3

    iget-object p0, p0, LF7/j$a;->r:Ly7/t;

    if-eqz p0, :cond_a

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p2, p1}, Ly7/t;->b(Landroid/view/View;LC7/a;)V

    :cond_a
    return-void
.end method

.method private static final h(LF7/j$a;LC7/a;Landroid/view/View;)Z
    .registers 3

    iget-object p0, p0, LF7/j$a;->r:Ly7/t;

    if-eqz p0, :cond_a

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p2, p1}, Ly7/t;->y(Landroid/view/View;LC7/a;)V

    :cond_a
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final f(LC7/a;)V
    .registers 7

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, LF7/h;

    invoke-direct {v1, p0, p1}, LF7/h;-><init>(LF7/j$a;LC7/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, LF7/i;

    invoke-direct {v1, p0, p1}, LF7/i;-><init>(LF7/j$a;LC7/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, p0, LF7/j$a;->q:Le3/p0;

    iget-object v1, p0, LF7/j$a;->s:LF7/j;

    iget-object v2, v0, Le3/p0;->v:Landroid/widget/ImageView;

    invoke-virtual {p1}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, v0, Le3/p0;->v:Landroid/widget/ImageView;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0604c2

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, v0, Le3/p0;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, LC7/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LC7/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_59

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    invoke-virtual {p1}, LC7/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9f

    :cond_59
    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LF7/j;->d()LC7/a;

    move-result-object v1

    if-eqz v1, :cond_68

    invoke-virtual {v1}, LC7/a;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_69

    :cond_68
    const/4 v1, 0x0

    :goto_69
    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "none"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_91

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v4, 0x7f130289

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9f

    :cond_91
    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_9f
    iget-object v1, v0, Le3/p0;->w:Landroid/widget/RadioButton;

    invoke-virtual {p1}, LC7/a;->f()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v1, v0, Le3/p0;->w:Landroid/widget/RadioButton;

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, v0, Le3/p0;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v1, v0, Le3/p0;->x:Landroid/widget/TextView;

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, v0, Le3/p0;->v:Landroid/widget/ImageView;

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
