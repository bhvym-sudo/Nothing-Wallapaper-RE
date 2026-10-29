.class public LD7/d;
.super Lz2/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ly7/u;Landroid/graphics/drawable/Drawable;IIFFF)V
    .registers 8

    .line 1
    invoke-direct/range {p0 .. p7}, Lz2/h;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;IIFFF)V

    return-void
.end method

.method public constructor <init>(Ly7/u;Landroid/view/View;IIIIFFF)V
    .registers 10

    .line 2
    invoke-direct/range {p0 .. p9}, Lz2/h;-><init>(Landroid/content/Context;Landroid/view/View;IIIIFFF)V

    return-void
.end method


# virtual methods
.method public f(IILjava/lang/Runnable;I)V
    .registers 14

    iget-object v0, p0, Lz2/h;->C:[I

    iget v1, p0, Lz2/h;->x:I

    sub-int/2addr p1, v1

    const/4 v1, 0x0

    aput p1, v0, v1

    iget p1, p0, Lz2/h;->y:I

    sub-int/2addr p2, p1

    const/4 p1, 0x1

    aput p2, v0, p1

    iget-object p1, p0, Lz2/h;->F:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    iget-object v2, p0, Lz2/h;->C:[I

    iget v4, p0, Lz2/h;->B:F

    const/4 v6, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    move v5, v4

    move-object v1, p0

    move-object v7, p3

    move v8, p4

    invoke-virtual/range {v0 .. v8}, Lcom/android/launcher3/dragndrop/DragLayer;->w(Lz2/h;[IFFFILjava/lang/Runnable;I)V

    return-void
.end method
