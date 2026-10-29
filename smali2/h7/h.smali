.class public final Lh7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Landroidx/lifecycle/x;

.field private final r:Lw7/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Lw7/a;)V
    .registers 4

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/h;->q:Landroidx/lifecycle/x;

    iput-object p2, p0, Lh7/h;->r:Lw7/a;

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lh7/h;->q:Landroidx/lifecycle/x;

    iget-object p0, p0, Lh7/h;->r:Lw7/a;

    const v1, 0x7f1301eb

    invoke-static {p2, p1, v1, v0, p0}, LM7/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;ILandroidx/lifecycle/x;Lw7/a;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lf7/b;->a:Lf7/b;

    invoke-virtual {p0, p1}, Lf7/b;->d(Landroid/content/Context;)Z

    move-result p0

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
