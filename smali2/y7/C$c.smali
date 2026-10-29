.class public final Ly7/C$c;
.super Lw2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/C;->y(Landroid/view/View;IILcom/nothing/launcher/card/t;)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lx2/b;

.field final synthetic c:Lcom/nothing/launcher/card/t;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/android/launcher3/u;

.field final synthetic g:Landroid/view/View;


# direct methods
.method constructor <init>(Lx2/b;Lcom/nothing/launcher/card/t;IILcom/android/launcher3/u;Landroid/view/View;)V
    .registers 7

    iput-object p1, p0, Ly7/C$c;->b:Lx2/b;

    iput-object p2, p0, Ly7/C$c;->c:Lcom/nothing/launcher/card/t;

    iput p3, p0, Ly7/C$c;->d:I

    iput p4, p0, Ly7/C$c;->e:I

    iput-object p5, p0, Ly7/C$c;->f:Lcom/android/launcher3/u;

    iput-object p6, p0, Ly7/C$c;->g:Landroid/view/View;

    invoke-direct {p0}, Lw2/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/animation/Animator;)V
    .registers 4

    iget-object p1, p0, Ly7/C$c;->b:Lx2/b;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lx2/b;->h:Z

    iget-object p1, p0, Ly7/C$c;->c:Lcom/nothing/launcher/card/t;

    iget v0, p0, Ly7/C$c;->d:I

    iput v0, p1, LC2/b;->s:I

    iget v0, p0, Ly7/C$c;->e:I

    iput v0, p1, LC2/b;->t:I

    iget-object p1, p0, Ly7/C$c;->f:Lcom/android/launcher3/u;

    invoke-interface {p1}, Lcom/android/launcher3/u;->getTranslateDelegate()LF2/o;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, LF2/o;->c(IFF)V

    iget-object p0, p0, Ly7/C$c;->g:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
