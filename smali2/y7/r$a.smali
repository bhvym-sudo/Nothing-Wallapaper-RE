.class public final Ly7/r$a;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .registers 3

    const-string v0, "nonTranslations"

    invoke-direct {p0, p1, v0}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ly7/r$c;)Landroid/graphics/RectF;
    .registers 2

    const-string p0, "changeAnimator"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly7/r$c;->a()Landroid/graphics/RectF;

    move-result-object p0

    return-object p0
.end method

.method public b(Ly7/r$c;Landroid/graphics/RectF;)V
    .registers 3

    const-string p0, "changeAnimator"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "value"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ly7/r$c;->b(Landroid/graphics/RectF;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Ly7/r$c;

    invoke-virtual {p0, p1}, Ly7/r$a;->a(Ly7/r$c;)Landroid/graphics/RectF;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    check-cast p1, Ly7/r$c;

    check-cast p2, Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, Ly7/r$a;->b(Ly7/r$c;Landroid/graphics/RectF;)V

    return-void
.end method
