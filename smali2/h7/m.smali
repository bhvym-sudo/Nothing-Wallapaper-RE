.class public final Lh7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Landroid/view/View;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lh7/m;->g(Landroid/content/Context;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method private static final g(Landroid/content/Context;Landroid/view/View;Landroid/view/View;)V
    .registers 4

    :try_start_0
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    invoke-interface {p2}, Lh3/H;->C()Ld3/a;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lt6/c;

    invoke-virtual {p2}, Lt6/c;->z()Z

    move-result p2

    if-eqz p2, :cond_2c

    invoke-static {}, Lf7/c;->a()Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {p1}, LH3/a;->a(Landroid/view/View;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_42

    const p1, 0x7f010022

    const p2, 0x7f01005e

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_2c
    invoke-static {}, Lf7/c;->a()Landroid/content/Intent;

    move-result-object p1

    const p2, 0x10008000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_39
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_39} :catch_3a

    return-void

    :catch_3a
    move-exception p0

    const-string p1, "NTMoreSettingsSectionController"

    const-string p2, "start activity error!"

    invoke-static {p1, p2, p0}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_42
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 9

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "context"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    const p0, 0x7f08027f

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    new-instance v5, Lh7/l;

    invoke-direct {v5, p2, p1}, Lh7/l;-><init>(Landroid/content/Context;Landroid/view/View;)V

    const v4, 0x7f13021c

    move-object v0, p2

    invoke-static/range {v0 .. v5}, LM7/c;->f(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/Integer;Landroid/widget/ImageView$ScaleType;ILandroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

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
