.class public final LS7/e;
.super Landroidx/transition/K;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS7/e$a;
    }
.end annotation


# static fields
.field public static final k0:LS7/e$a;


# instance fields
.field private final i0:I

.field private final j0:LR4/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LS7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS7/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LS7/e;->k0:LS7/e$a;

    return-void
.end method

.method public constructor <init>(IZ)V
    .registers 3

    invoke-direct {p0}, Landroidx/transition/K;-><init>()V

    iput p1, p0, LS7/e;->i0:I

    if-nez p1, :cond_16

    new-instance p1, LR4/a;

    if-eqz p2, :cond_f

    const p2, 0x800005

    goto :goto_12

    :cond_f
    const p2, 0x800003

    :goto_12
    invoke-direct {p1, p2}, LR4/a;-><init>(I)V

    goto :goto_22

    :cond_16
    new-instance p1, LR4/a;

    if-eqz p2, :cond_1d

    const/16 p2, 0x50

    goto :goto_1f

    :cond_1d
    const/16 p2, 0x30

    :goto_1f
    invoke-direct {p1, p2}, LR4/a;-><init>(I)V

    :goto_22
    iput-object p1, p0, LS7/e;->j0:LR4/a;

    return-void
.end method

.method private final C0(Landroid/view/ViewGroup;Landroid/view/View;Z)Landroid/animation/Animator;
    .registers 6

    iget-object v0, p0, LS7/e;->j0:LR4/a;

    iget v1, p0, LS7/e;->i0:I

    if-nez v1, :cond_b

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    goto :goto_f

    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    :goto_f
    invoke-virtual {v0, v1}, LR4/a;->i(I)V

    if-eqz p3, :cond_1b

    iget-object p0, p0, LS7/e;->j0:LR4/a;

    invoke-virtual {p0, p1, p2}, LR4/a;->a(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0

    :cond_1b
    iget-object p0, p0, LS7/e;->j0:LR4/a;

    invoke-virtual {p0, p1, p2}, LR4/a;->b(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public x0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;
    .registers 5

    const-string p3, "sceneRoot"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "view"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, LS7/e;->C0(Landroid/view/ViewGroup;Landroid/view/View;Z)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public z0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;
    .registers 5

    const-string p3, "sceneRoot"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "view"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LS7/e;->C0(Landroid/view/ViewGroup;Landroid/view/View;Z)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method
