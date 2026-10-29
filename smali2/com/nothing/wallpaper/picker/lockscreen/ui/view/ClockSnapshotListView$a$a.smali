.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final q:Le3/i;

.field private final r:Lcom/android/launcher3/f;

.field private final s:LS1/a;

.field final synthetic t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;Le3/i;Lcom/android/launcher3/f;LS1/a;)V
    .registers 6

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->r:Lcom/android/launcher3/f;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->s:LS1/a;

    return-void
.end method

.method public static synthetic d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;Landroid/view/View;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;Landroid/view/View;)Lh8/A;
    .registers 6

    const-string v0, "clockView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LT1/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    check-cast v0, LT1/a;

    goto :goto_14

    :cond_13
    move-object v0, v2

    :goto_14
    if-eqz v0, :cond_1a

    invoke-virtual {v0}, LT1/a;->a()Ljava/lang/String;

    move-result-object v2

    :cond_1a
    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2b

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object p0, p0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;->setUpClockView(Landroid/view/View;)V

    :cond_2b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final e(LT1/a;)V
    .registers 6

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object v0, v0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    const-string v1, "clockFaceContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_74

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->r:Lcom/android/launcher3/f;

    iget v3, v2, Lcom/android/launcher3/f;->p:I

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v2, v2, Lcom/android/launcher3/f;->q:I

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object v0, v0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p1}, LT1/a;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object v0, v0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p1}, LT1/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object v0, v0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;->a()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->s:LS1/a;

    instance-of v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    if-eqz v1, :cond_49

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    goto :goto_4a

    :cond_49
    const/4 v0, 0x0

    :goto_4a
    if-nez v0, :cond_4d

    return-void

    :cond_4d
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    iget-object v1, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_63

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object p0, p0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;->setUpClockView(Landroid/view/View;)V

    return-void

    :cond_63
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;

    iget-object v1, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-virtual {p1}, LT1/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;

    invoke-direct {v3, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;)V

    invoke-static {v1, v2, v0, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lv8/l;)V

    return-void

    :cond_74
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final g()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object p0, p0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;->a()V

    return-void
.end method

.method public final h(LT1/a;)V
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->q:Le3/i;

    iget-object p0, p0, Le3/i;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotItemView;

    invoke-virtual {p1}, LT1/a;->c()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method
