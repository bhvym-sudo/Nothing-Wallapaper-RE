.class public LD7/c;
.super Lcom/android/launcher3/dragndrop/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ly7/u;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/android/launcher3/dragndrop/a;-><init>(Lcom/android/launcher3/views/f;)V

    return-void
.end method

.method public static synthetic F(Landroid/view/MotionEvent;)V
    .registers 1

    return-void
.end method


# virtual methods
.method protected C(Landroid/graphics/drawable/Drawable;Landroid/view/View;Lz2/j;IILcom/android/launcher3/g;LC2/b;Landroid/graphics/Rect;FFLz2/e;)Lz2/h;
    .registers 28

    move-object/from16 v0, p0

    move-object/from16 v1, p8

    move-object/from16 v2, p11

    iput-object v2, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    iget-object v3, v2, Lz2/e;->c:Landroid/graphics/Point;

    if-eqz v3, :cond_1c

    iget-object v4, v0, Lcom/android/launcher3/dragndrop/a;->w:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/android/launcher3/dragndrop/a;->v:Landroid/graphics/Point;

    iget v6, v3, Landroid/graphics/Point;->x:I

    iput v6, v5, Landroid/graphics/Point;->x:I

    iput v6, v4, Landroid/graphics/Point;->x:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    iput v3, v5, Landroid/graphics/Point;->y:I

    iput v3, v4, Landroid/graphics/Point;->y:I

    :cond_1c
    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->v:Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    sub-int v8, v4, p4

    iget v3, v3, Landroid/graphics/Point;->y:I

    sub-int v9, v3, p5

    const/4 v3, 0x0

    if-nez v1, :cond_2b

    move v4, v3

    goto :goto_2d

    :cond_2b
    iget v4, v1, Landroid/graphics/Rect;->left:I

    :goto_2d
    if-nez v1, :cond_31

    move v15, v3

    goto :goto_34

    :cond_31
    iget v5, v1, Landroid/graphics/Rect;->top:I

    move v15, v5

    :goto_34
    const/4 v5, 0x0

    iput-object v5, v0, Lcom/android/launcher3/dragndrop/a;->B:Lcom/android/launcher3/h;

    new-instance v5, Lcom/android/launcher3/h$a;

    iget-object v6, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v6, Ly7/u;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/android/launcher3/h$a;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/android/launcher3/dragndrop/a;->y:Lcom/android/launcher3/h$a;

    move-object/from16 v6, p3

    iput-object v6, v5, Lcom/android/launcher3/h$a;->m:Lz2/j;

    iget-object v5, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v3, v0, Lcom/android/launcher3/dragndrop/a;->E:Z

    iget-object v5, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v5, Ly7/u;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-boolean v6, v0, Lcom/android/launcher3/dragndrop/a;->E:Z

    if-eqz v6, :cond_67

    const v6, 0x7f070510

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    int-to-float v5, v5

    :goto_65
    move v12, v5

    goto :goto_69

    :cond_67
    const/4 v5, 0x0

    goto :goto_65

    :goto_69
    iget-object v13, v0, Lcom/android/launcher3/dragndrop/a;->y:Lcom/android/launcher3/h$a;

    if-eqz p1, :cond_7e

    new-instance v5, LD7/d;

    iget-object v6, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v6, Ly7/u;

    move-object/from16 v7, p1

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v5 .. v12}, LD7/d;-><init>(Ly7/u;Landroid/graphics/drawable/Drawable;IIFFF)V

    move-object v3, v13

    goto :goto_99

    :cond_7e
    new-instance v5, LD7/d;

    iget-object v6, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v6, Ly7/u;

    move v10, v8

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    move v11, v9

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    move-object/from16 v7, p2

    move v14, v12

    move-object v3, v13

    move/from16 v12, p9

    move/from16 v13, p10

    invoke-direct/range {v5 .. v14}, LD7/d;-><init>(Ly7/u;Landroid/view/View;IIIIFFF)V

    :goto_99
    iput-object v5, v3, Lcom/android/launcher3/h$a;->f:Lz2/h;

    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->y:Lcom/android/launcher3/h$a;

    const/4 v6, 0x0

    iput-boolean v6, v3, Lcom/android/launcher3/h$a;->e:Z

    iget-object v6, v0, Lcom/android/launcher3/dragndrop/a;->v:Landroid/graphics/Point;

    iget v7, v6, Landroid/graphics/Point;->x:I

    add-int v4, p4, v4

    sub-int/2addr v7, v4

    iput v7, v3, Lcom/android/launcher3/h$a;->c:I

    iget v4, v6, Landroid/graphics/Point;->y:I

    add-int v6, p5, v15

    sub-int/2addr v4, v6

    iput v4, v3, Lcom/android/launcher3/h$a;->d:I

    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    new-instance v4, LD7/a;

    invoke-direct {v4}, LD7/a;-><init>()V

    invoke-static {v0, v3, v4}, Lcom/android/launcher3/dragndrop/b;->a(Lcom/android/launcher3/dragndrop/a;Lz2/e;Ljava/util/function/Consumer;)Lcom/android/launcher3/dragndrop/b;

    move-result-object v3

    iput-object v3, v0, Lcom/android/launcher3/dragndrop/a;->t:Lcom/android/launcher3/dragndrop/b;

    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    iget-boolean v3, v3, Lz2/e;->a:Z

    if-nez v3, :cond_cb

    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->y:Lcom/android/launcher3/h$a;

    invoke-static {v5}, Lv2/d;->d(Landroid/view/View;)Lv2/d;

    move-result-object v4

    iput-object v4, v3, Lcom/android/launcher3/h$a;->l:Lv2/d;

    :cond_cb
    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->y:Lcom/android/launcher3/h$a;

    move-object/from16 v4, p6

    iput-object v4, v3, Lcom/android/launcher3/h$a;->i:Lcom/android/launcher3/g;

    move-object/from16 v4, p7

    iput-object v4, v3, Lcom/android/launcher3/h$a;->g:LC2/b;

    invoke-virtual {v4}, LC2/b;->f()LC2/b;

    move-result-object v4

    iput-object v4, v3, Lcom/android/launcher3/h$a;->h:LC2/b;

    iget-object v3, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_ea

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v5, v3}, Lz2/h;->setDragRegion(Landroid/graphics/Rect;)V

    :cond_ea
    iget-object v1, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v1, Ly7/u;

    invoke-virtual {v1}, Ly7/u;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, v0, Lcom/android/launcher3/dragndrop/a;->w:Landroid/graphics/Point;

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v5, v3, v1}, Lz2/h;->q(II)V

    iput v6, v0, Lcom/android/launcher3/dragndrop/a;->D:I

    iget-boolean v1, v0, Lcom/android/launcher3/dragndrop/a;->E:Z

    if-nez v1, :cond_109

    invoke-virtual {v0}, Lcom/android/launcher3/dragndrop/a;->i()V

    goto :goto_10e

    :cond_109
    iget-object v1, v0, Lcom/android/launcher3/dragndrop/a;->u:Lz2/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_10e
    iget-object v1, v0, Lcom/android/launcher3/dragndrop/a;->w:Landroid/graphics/Point;

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v3, v1}, Lcom/android/launcher3/dragndrop/a;->x(II)V

    iget-object v1, v0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v1, Ly7/u;

    invoke-virtual {v1}, Ly7/u;->A()Z

    move-result v1

    if-nez v1, :cond_12f

    iget-object v1, v2, Lz2/e;->c:Landroid/graphics/Point;

    if-nez v1, :cond_12f

    sget-object v1, LF2/d;->e:LF2/i;

    new-instance v2, LD7/b;

    invoke-direct {v2, v0}, LD7/b;-><init>(LD7/c;)V

    invoke-virtual {v1, v2}, LF2/i;->c(Ljava/lang/Runnable;)V

    :cond_12f
    return-object v5
.end method

.method protected r()V
    .registers 1

    return-void
.end method

.method protected u([I)Lcom/android/launcher3/h;
    .registers 4

    iget-object v0, p0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    iget-object v1, p0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast v1, Ly7/u;

    invoke-virtual {v1}, Ly7/u;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/android/launcher3/views/g;->p(Landroid/view/View;[I)V

    iget-object p0, p0, Lcom/android/launcher3/dragndrop/a;->q:Lcom/android/launcher3/views/f;

    check-cast p0, Ly7/u;

    invoke-virtual {p0}, Ly7/u;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    return-object p0
.end method
