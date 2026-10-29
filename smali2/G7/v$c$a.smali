.class final LG7/v$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field final synthetic s:Landroidx/lifecycle/x;

.field final synthetic t:Landroid/view/SurfaceView;

.field final synthetic u:Lkotlin/jvm/internal/E;

.field final synthetic v:Lkotlin/jvm/internal/E;

.field final synthetic w:Lkotlin/jvm/internal/E;

.field final synthetic x:Z

.field final synthetic y:Landroid/app/Activity;

.field final synthetic z:Landroidx/cardview/widget/CardView;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V
    .registers 10

    iput-object p1, p0, LG7/v$c$a;->s:Landroidx/lifecycle/x;

    iput-object p2, p0, LG7/v$c$a;->t:Landroid/view/SurfaceView;

    iput-object p3, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iput-object p4, p0, LG7/v$c$a;->v:Lkotlin/jvm/internal/E;

    iput-object p5, p0, LG7/v$c$a;->w:Lkotlin/jvm/internal/E;

    iput-boolean p6, p0, LG7/v$c$a;->x:Z

    iput-object p7, p0, LG7/v$c$a;->y:Landroid/app/Activity;

    iput-object p8, p0, LG7/v$c$a;->z:Landroidx/cardview/widget/CardView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/internal/E;)V
    .registers 1

    invoke-static {p0}, LG7/v$c$a;->u(Lkotlin/jvm/internal/E;)V

    return-void
.end method

.method private static final u(Lkotlin/jvm/internal/E;)V
    .registers 1

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, LH3/F;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, LH3/F;->b()V

    :cond_9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 13

    new-instance v0, LG7/v$c$a;

    iget-object v1, p0, LG7/v$c$a;->s:Landroidx/lifecycle/x;

    iget-object v2, p0, LG7/v$c$a;->t:Landroid/view/SurfaceView;

    iget-object v3, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iget-object v4, p0, LG7/v$c$a;->v:Lkotlin/jvm/internal/E;

    iget-object v5, p0, LG7/v$c$a;->w:Lkotlin/jvm/internal/E;

    iget-boolean v6, p0, LG7/v$c$a;->x:Z

    iget-object v7, p0, LG7/v$c$a;->y:Landroid/app/Activity;

    iget-object v8, p0, LG7/v$c$a;->z:Landroidx/cardview/widget/CardView;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, LG7/v$c$a;-><init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 14

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/v$c$a;->r:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, LG7/v$c$a;->q:Ljava/lang/Object;

    check-cast v0, LG7/v$c$a$b;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_47

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance v7, LG7/v$c$a$b;

    iget-object p1, p0, LG7/v$c$a;->v:Lkotlin/jvm/internal/E;

    iget-object v1, p0, LG7/v$c$a;->w:Lkotlin/jvm/internal/E;

    invoke-direct {v7, p1, v1}, LG7/v$c$a$b;-><init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V

    iget-object v6, p0, LG7/v$c$a;->s:Landroidx/lifecycle/x;

    sget-object p1, Landroidx/lifecycle/q$b;->s:Landroidx/lifecycle/q$b;

    new-instance v3, LG7/v$c$a$a;

    iget-object v4, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iget-object v5, p0, LG7/v$c$a;->t:Landroid/view/SurfaceView;

    iget-boolean v8, p0, LG7/v$c$a;->x:Z

    iget-object v9, p0, LG7/v$c$a;->y:Landroid/app/Activity;

    iget-object v10, p0, LG7/v$c$a;->z:Landroidx/cardview/widget/CardView;

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v11}, LG7/v$c$a$a;-><init>(Lkotlin/jvm/internal/E;Landroid/view/SurfaceView;Landroidx/lifecycle/x;LG7/v$c$a$b;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V

    iput-object v7, p0, LG7/v$c$a;->q:Ljava/lang/Object;

    iput v2, p0, LG7/v$c$a;->r:I

    invoke-static {v6, p1, v3, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_46

    return-object v0

    :cond_46
    move-object v0, v7

    :goto_47
    iget-object p1, p0, LG7/v$c$a;->s:Landroidx/lifecycle/x;

    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/q;->d(Landroidx/lifecycle/w;)V

    iget-object p1, p0, LG7/v$c$a;->t:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object v0, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iget-object v0, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Landroid/view/SurfaceHolder$Callback;

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p1, LH3/F;

    if-eqz p1, :cond_6c

    invoke-virtual {p1}, LH3/F;->c()Landroid/widget/ImageView;

    move-result-object p1

    goto :goto_6d

    :cond_6c
    const/4 p1, 0x0

    :goto_6d
    if-eqz p1, :cond_84

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-ne v0, v2, :cond_84

    iget-object p0, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    new-instance v0, LG7/w;

    invoke-direct {v0, p0}, LG7/w;-><init>(Lkotlin/jvm/internal/E;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_8f

    :cond_84
    iget-object p0, p0, LG7/v$c$a;->u:Lkotlin/jvm/internal/E;

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, LH3/F;

    if-eqz p0, :cond_8f

    invoke-virtual {p0}, LH3/F;->b()V

    :cond_8f
    :goto_8f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
