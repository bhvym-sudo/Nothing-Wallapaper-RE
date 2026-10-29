.class public final Lh7/g;
.super Lh7/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lh7/b;Lh7/h;Lh7/f;)V
    .registers 5

    const-string v0, "colorController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconPackOptionController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gridOptionController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lh7/c;-><init>(Lg3/f;Lg3/f;Lg3/f;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic f(Landroid/content/Context;)Li3/s0;
    .registers 2

    invoke-virtual {p0, p1}, Lh7/g;->k(Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;

    move-result-object p0

    return-object p0
.end method

.method public k(Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/ResponsiveLayoutSectionView;
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
