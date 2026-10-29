.class final LG7/v$c$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lkotlin/jvm/internal/E;

.field final synthetic s:Landroid/view/SurfaceView;

.field final synthetic t:Landroidx/lifecycle/x;

.field final synthetic u:LG7/v$c$a$b;

.field final synthetic v:Z

.field final synthetic w:Landroid/app/Activity;

.field final synthetic x:Landroidx/cardview/widget/CardView;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;Landroid/view/SurfaceView;Landroidx/lifecycle/x;LG7/v$c$a$b;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V
    .registers 9

    iput-object p1, p0, LG7/v$c$a$a;->r:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LG7/v$c$a$a;->s:Landroid/view/SurfaceView;

    iput-object p3, p0, LG7/v$c$a$a;->t:Landroidx/lifecycle/x;

    iput-object p4, p0, LG7/v$c$a$a;->u:LG7/v$c$a$b;

    iput-boolean p5, p0, LG7/v$c$a$a;->v:Z

    iput-object p6, p0, LG7/v$c$a$a;->w:Landroid/app/Activity;

    iput-object p7, p0, LG7/v$c$a$a;->x:Landroidx/cardview/widget/CardView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 12

    new-instance v0, LG7/v$c$a$a;

    iget-object v1, p0, LG7/v$c$a$a;->r:Lkotlin/jvm/internal/E;

    iget-object v2, p0, LG7/v$c$a$a;->s:Landroid/view/SurfaceView;

    iget-object v3, p0, LG7/v$c$a$a;->t:Landroidx/lifecycle/x;

    iget-object v4, p0, LG7/v$c$a$a;->u:LG7/v$c$a$b;

    iget-boolean v5, p0, LG7/v$c$a$a;->v:Z

    iget-object v6, p0, LG7/v$c$a$a;->w:Landroid/app/Activity;

    iget-object v7, p0, LG7/v$c$a$a;->x:Landroidx/cardview/widget/CardView;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, LG7/v$c$a$a;-><init>(Lkotlin/jvm/internal/E;Landroid/view/SurfaceView;Landroidx/lifecycle/x;LG7/v$c$a$b;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LG7/v$c$a$a;->q:I

    if-nez v0, :cond_3d

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/v$c$a$a;->r:Lkotlin/jvm/internal/E;

    iget-boolean v0, p0, LG7/v$c$a$a;->v:Z

    iget-object v1, p0, LG7/v$c$a$a;->w:Landroid/app/Activity;

    iget-object v2, p0, LG7/v$c$a$a;->x:Landroidx/cardview/widget/CardView;

    iget-object v3, p0, LG7/v$c$a$a;->s:Landroid/view/SurfaceView;

    invoke-static {v0, v1, v2, v3}, LG7/v;->d(ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Landroid/view/SurfaceView;)LH3/F;

    move-result-object v0

    iput-object v0, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    iget-object p1, p0, LG7/v$c$a$a;->s:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object v0, p0, LG7/v$c$a$a;->r:Lkotlin/jvm/internal/E;

    iget-object v0, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Landroid/view/SurfaceHolder$Callback;

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, LG7/v$c$a$a;->s:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    iget-object p1, p0, LG7/v$c$a$a;->t:Landroidx/lifecycle/x;

    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p1

    iget-object p0, p0, LG7/v$c$a$a;->u:LG7/v$c$a$b;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_3d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
