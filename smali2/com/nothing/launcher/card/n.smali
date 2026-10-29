.class public final Lcom/nothing/launcher/card/n;
.super LA2/a;
.source "SourceFile"


# instance fields
.field private final e:Lcom/nothing/launcher/card/m;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LA2/a;-><init>(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.nothing.launcher.card.PendingAddCardInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/nothing/launcher/card/m;

    iput-object p1, p0, Lcom/nothing/launcher/card/n;->e:Lcom/nothing/launcher/card/m;

    return-void
.end method


# virtual methods
.method public final c(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;Landroid/graphics/Point;Lcom/android/launcher3/g;Lz2/e;)V
    .registers 20

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "preview"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "previewBounds"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screenPos"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "source"

    move-object/from16 v8, p4

    invoke-static {v8, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "options"

    move-object/from16 v13, p5

    invoke-static {v13, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LA2/a;->b:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v2

    check-cast v2, Lcom/android/launcher3/views/f;

    const/4 v3, 0x1

    invoke-static {v3}, Lz2/j;->c(I)Lz2/j;

    move-result-object v5

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v4, v0, Landroid/graphics/Rect;->left:I

    add-int v6, v3, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    add-int v7, v1, v0

    invoke-interface {v2}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    new-instance v1, LT5/a;

    invoke-direct {v1, v2}, LT5/a;-><init>(Lcom/android/launcher3/views/f;)V

    invoke-virtual {v0, v1}, Lcom/android/launcher3/dragndrop/a;->d(Lcom/android/launcher3/dragndrop/a$b;)V

    invoke-interface {v2}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    new-instance v1, Lcom/nothing/launcher/card/h;

    iget-object v3, p0, LA2/a;->b:Landroid/view/View;

    const-string v4, "mView"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/nothing/launcher/card/h;-><init>(Lcom/android/launcher3/views/f;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/android/launcher3/dragndrop/a;->d(Lcom/android/launcher3/dragndrop/a$b;)V

    invoke-interface {v2}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v3

    iget-object v9, p0, Lcom/nothing/launcher/card/n;->e:Lcom/nothing/launcher/card/m;

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v13}, Lcom/android/launcher3/dragndrop/a;->D(Landroid/graphics/drawable/Drawable;Lz2/j;IILcom/android/launcher3/g;LC2/b;Landroid/graphics/Rect;FFLz2/e;)Lz2/h;

    return-void
.end method
