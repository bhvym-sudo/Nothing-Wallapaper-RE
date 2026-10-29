.class public final LF7/k$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final q:Le3/z0;

.field private final r:Lcom/android/launcher3/f;

.field private final s:LE7/S;


# direct methods
.method public constructor <init>(Le3/z0;Lcom/android/launcher3/f;LE7/S;)V
    .registers 7

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LF7/k$b;->q:Le3/z0;

    iput-object p2, p0, LF7/k$b;->r:Lcom/android/launcher3/f;

    iput-object p3, p0, LF7/k$b;->s:LE7/S;

    iget-object p3, p1, Le3/z0;->v:Landroidx/cardview/widget/CardView;

    const-string v0, "cardView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v0, :cond_5a

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v2, p2, Lcom/android/launcher3/f;->Z:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p3, p1, Le3/z0;->w:Landroid/widget/TextView;

    const-string v0, "expandTips"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_54

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget p2, p2, Lcom/android/launcher3/f;->Z:I

    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Le3/z0;->v:Landroidx/cardview/widget/CardView;

    new-instance p3, LF7/l;

    invoke-direct {p3, p1, p0}, LF7/l;-><init>(Le3/z0;LF7/k$b;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_54
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5a
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Le3/z0;LF7/k$b;Landroid/view/View;)V
    .registers 4

    iget-object p2, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {p2}, Landroid/view/View;->isLaidOut()Z

    move-result p2

    if-nez p2, :cond_34

    iget-object p2, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    iget-object p2, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    const-string v0, "switchView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-virtual {p2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object p2, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    new-instance v0, LF7/k$b$a;

    invoke-direct {v0, p0, p1}, LF7/k$b$a;-><init>(Le3/z0;LF7/k$b;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2b
    new-instance v0, LF7/k$b$b;

    invoke-direct {v0, p0, p1}, LF7/k$b$b;-><init>(Le3/z0;LF7/k$b;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void

    :cond_34
    invoke-static {p0, p1}, LF7/k$b;->g(Le3/z0;LF7/k$b;)V

    return-void
.end method

.method public static final synthetic e(Le3/z0;LF7/k$b;)V
    .registers 2

    invoke-static {p0, p1}, LF7/k$b;->g(Le3/z0;LF7/k$b;)V

    return-void
.end method

.method private static final g(Le3/z0;LF7/k$b;)V
    .registers 4

    iget-object v0, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {v0}, Lcom/nothing/widget/ui/NtSwitch;->toggle()V

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LS5/c;

    if-eqz v1, :cond_12

    check-cast v0, LS5/c;

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_1e

    iget-object v1, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, LS5/c;->d(Z)V

    :cond_1e
    iget-object p1, p1, LF7/k$b;->s:LE7/S;

    if-eqz p1, :cond_2b

    iget-object p0, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    invoke-interface {p1, p0}, LE7/S;->a(Z)V

    :cond_2b
    return-void
.end method


# virtual methods
.method public final f(LS5/c;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p0, p0, LF7/k$b;->q:Le3/z0;

    iget-object p0, p0, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {p1}, LS5/c;->b()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/widget/ui/NtSwitch;->setChecked(Z)V

    return-void
.end method
