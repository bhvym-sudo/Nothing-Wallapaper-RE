.class public final synthetic Ly7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Ly7/C;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Landroid/graphics/Rect;

.field public final synthetic e:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/w;->a:Ly7/C;

    iput-boolean p2, p0, Ly7/w;->b:Z

    iput p3, p0, Ly7/w;->c:I

    iput-object p4, p0, Ly7/w;->d:Landroid/graphics/Rect;

    iput-object p5, p0, Ly7/w;->e:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 8

    iget-object v0, p0, Ly7/w;->a:Ly7/C;

    iget-boolean v1, p0, Ly7/w;->b:Z

    iget v2, p0, Ly7/w;->c:I

    iget-object v3, p0, Ly7/w;->d:Landroid/graphics/Rect;

    iget-object v4, p0, Ly7/w;->e:Landroid/graphics/drawable/Drawable;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ly7/C;->d(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method
