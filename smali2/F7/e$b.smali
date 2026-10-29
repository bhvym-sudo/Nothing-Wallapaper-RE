.class public final LF7/e$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final q:Landroid/widget/TextView;

.field private final r:Landroid/widget/ImageView;

.field private final s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

.field private final t:Landroid/widget/LinearLayout;

.field private final u:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 4

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a026a

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LF7/e$b;->q:Landroid/widget/TextView;

    const v0, 0x7f0a0267

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LF7/e$b;->r:Landroid/widget/ImageView;

    const v0, 0x7f0a0268

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    iput-object v0, p0, LF7/e$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    const v0, 0x7f0a0260

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, LF7/e$b;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f0a0188

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LF7/e$b;->u:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final d()Landroid/widget/LinearLayout;
    .registers 1

    iget-object p0, p0, LF7/e$b;->t:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public final e()Landroid/view/View;
    .registers 1

    iget-object p0, p0, LF7/e$b;->u:Landroid/view/View;

    return-object p0
.end method

.method public final f()Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, LF7/e$b;->r:Landroid/widget/ImageView;

    return-object p0
.end method

.method public final g()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;
    .registers 1

    iget-object p0, p0, LF7/e$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    return-object p0
.end method

.method public final h()Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, LF7/e$b;->q:Landroid/widget/TextView;

    return-object p0
.end method
