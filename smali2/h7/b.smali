.class public final Lh7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Lg3/f$a;

.field private final r:Lb2/c;

.field private final s:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Lg3/f$a;Lb2/c;Landroidx/lifecycle/x;)V
    .registers 5

    const-string v0, "navigationController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/b;->q:Lg3/f$a;

    iput-object p2, p0, Lh7/b;->r:Lb2/c;

    iput-object p3, p0, Lh7/b;->s:Landroidx/lifecycle/x;

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Landroid/view/View;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lh7/b;->g(Landroid/content/Context;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroid/content/Context;Landroid/view/View;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p0, Landroid/app/Activity;

    if-eqz p1, :cond_c

    check-cast p0, Landroid/app/Activity;

    goto :goto_d

    :cond_c
    const/4 p0, 0x0

    :goto_d
    if-eqz p0, :cond_14

    sget-object p1, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->S:Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;->a(Landroid/app/Activity;)V

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lh7/b;->r:Lb2/c;

    iget-object p0, p0, Lh7/b;->s:Landroidx/lifecycle/x;

    new-instance v1, Lh7/a;

    invoke-direct {v1, p2}, Lh7/a;-><init>(Landroid/content/Context;)V

    invoke-static {p2, p1, v0, p0, v1}, LQ6/e;->c(Landroid/content/Context;Landroid/view/ViewGroup;Lb2/c;Landroidx/lifecycle/x;Lv8/l;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public f(Landroid/content/Context;)Li3/s0;
    .registers 3

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lh8/n;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is not implemented: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Not yet implemented"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lh8/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method
