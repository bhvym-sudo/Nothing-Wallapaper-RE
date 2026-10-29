.class final LG7/v$c$b$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic A:Lcom/android/wallpaper/asset/a$f;

.field final synthetic B:Landroidx/lifecycle/x;

.field final synthetic C:Landroid/app/WallpaperManager;

.field final synthetic D:Lg3/v;

.field final synthetic E:Landroid/view/SurfaceView;

.field final synthetic F:Lkotlin/jvm/internal/E;

.field final synthetic G:Lv8/l;

.field final synthetic H:Lv8/a;

.field final synthetic I:Landroidx/cardview/widget/CardView;

.field final synthetic J:Lkotlin/jvm/internal/E;

.field q:Ljava/lang/Object;

.field r:I

.field final synthetic s:Lkotlin/jvm/internal/E;

.field final synthetic t:Lv8/p;

.field final synthetic u:Landroid/widget/ImageView;

.field final synthetic v:Landroid/app/Activity;

.field final synthetic w:Z

.field final synthetic x:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic y:Z

.field final synthetic z:Lv8/a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V
    .registers 20

    iput-object p1, p0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LG7/v$c$b$a$a;->t:Lv8/p;

    iput-object p3, p0, LG7/v$c$b$a$a;->u:Landroid/widget/ImageView;

    iput-object p4, p0, LG7/v$c$b$a$a;->v:Landroid/app/Activity;

    iput-boolean p5, p0, LG7/v$c$b$a$a;->w:Z

    iput-object p6, p0, LG7/v$c$b$a$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p7, p0, LG7/v$c$b$a$a;->y:Z

    iput-object p8, p0, LG7/v$c$b$a$a;->z:Lv8/a;

    iput-object p9, p0, LG7/v$c$b$a$a;->A:Lcom/android/wallpaper/asset/a$f;

    iput-object p10, p0, LG7/v$c$b$a$a;->B:Landroidx/lifecycle/x;

    iput-object p11, p0, LG7/v$c$b$a$a;->C:Landroid/app/WallpaperManager;

    iput-object p12, p0, LG7/v$c$b$a$a;->D:Lg3/v;

    iput-object p13, p0, LG7/v$c$b$a$a;->E:Landroid/view/SurfaceView;

    iput-object p14, p0, LG7/v$c$b$a$a;->F:Lkotlin/jvm/internal/E;

    iput-object p15, p0, LG7/v$c$b$a$a;->G:Lv8/l;

    move-object/from16 p1, p16

    iput-object p1, p0, LG7/v$c$b$a$a;->H:Lv8/a;

    move-object/from16 p1, p17

    iput-object p1, p0, LG7/v$c$b$a$a;->I:Landroidx/cardview/widget/CardView;

    move-object/from16 p1, p18

    iput-object p1, p0, LG7/v$c$b$a$a;->J:Lkotlin/jvm/internal/E;

    const/4 p1, 0x2

    move-object/from16 p2, p19

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V
    .registers 2

    invoke-static {p0, p1}, LG7/v$c$b$a$a;->u(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V

    return-void
.end method

.method private static final u(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 23

    move-object/from16 v0, p0

    new-instance v1, LG7/v$c$b$a$a;

    move-object v2, v1

    iget-object v1, v0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    move-object v3, v2

    iget-object v2, v0, LG7/v$c$b$a$a;->t:Lv8/p;

    move-object v4, v3

    iget-object v3, v0, LG7/v$c$b$a$a;->u:Landroid/widget/ImageView;

    move-object v5, v4

    iget-object v4, v0, LG7/v$c$b$a$a;->v:Landroid/app/Activity;

    move-object v6, v5

    iget-boolean v5, v0, LG7/v$c$b$a$a;->w:Z

    move-object v7, v6

    iget-object v6, v0, LG7/v$c$b$a$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v8, v7

    iget-boolean v7, v0, LG7/v$c$b$a$a;->y:Z

    move-object v9, v8

    iget-object v8, v0, LG7/v$c$b$a$a;->z:Lv8/a;

    move-object v10, v9

    iget-object v9, v0, LG7/v$c$b$a$a;->A:Lcom/android/wallpaper/asset/a$f;

    move-object v11, v10

    iget-object v10, v0, LG7/v$c$b$a$a;->B:Landroidx/lifecycle/x;

    move-object v12, v11

    iget-object v11, v0, LG7/v$c$b$a$a;->C:Landroid/app/WallpaperManager;

    move-object v13, v12

    iget-object v12, v0, LG7/v$c$b$a$a;->D:Lg3/v;

    move-object v14, v13

    iget-object v13, v0, LG7/v$c$b$a$a;->E:Landroid/view/SurfaceView;

    move-object v15, v14

    iget-object v14, v0, LG7/v$c$b$a$a;->F:Lkotlin/jvm/internal/E;

    move-object/from16 v16, v15

    iget-object v15, v0, LG7/v$c$b$a$a;->G:Lv8/l;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c$b$a$a;->H:Lv8/a;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c$b$a$a;->I:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, LG7/v$c$b$a$a;->J:Lkotlin/jvm/internal/E;

    move-object/from16 v19, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v19

    move-object/from16 v19, p2

    invoke-direct/range {v0 .. v19}, LG7/v$c$b$a$a;-><init>(Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c$b$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c$b$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c$b$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/v$c$b$a$a;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1c

    if-ne v1, v3, :cond_14

    iget-object v0, p0, LG7/v$c$b$a$a;->q:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/E;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_34

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1c
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    iget-object v1, p0, LG7/v$c$b$a$a;->t:Lv8/p;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object p1, p0, LG7/v$c$b$a$a;->q:Ljava/lang/Object;

    iput v3, p0, LG7/v$c$b$a$a;->r:I

    invoke-interface {v1, v4, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_32

    return-object v0

    :cond_32
    move-object v0, p1

    move-object p1, v1

    :goto_34
    iput-object p1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    iget-object p1, p0, LG7/v$c$b$a$a;->B:Landroidx/lifecycle/x;

    iget-object v0, p0, LG7/v$c$b$a$a;->C:Landroid/app/WallpaperManager;

    iget-object v1, p0, LG7/v$c$b$a$a;->D:Lg3/v;

    invoke-static {p1, v0, v1}, LG7/v;->f(Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;)V

    invoke-static {}, LG7/v;->g()Z

    move-result p1

    if-eqz p1, :cond_64

    iget-object p1, p0, LG7/v$c$b$a$a;->u:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v4, LG7/v;->a:LG7/v;

    iget-object v5, p0, LG7/v$c$b$a$a;->v:Landroid/app/Activity;

    iget-object p1, p0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lg3/x;

    iget-object v7, p0, LG7/v$c$b$a$a;->u:Landroid/widget/ImageView;

    iget-boolean v8, p0, LG7/v$c$b$a$a;->w:Z

    iget-object v9, p0, LG7/v$c$b$a$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v10, p0, LG7/v$c$b$a$a;->y:Z

    iget-object v11, p0, LG7/v$c$b$a$a;->z:Lv8/a;

    iget-object v12, p0, LG7/v$c$b$a$a;->A:Lcom/android/wallpaper/asset/a$f;

    invoke-static/range {v4 .. v12}, LG7/v;->i(LG7/v;Landroid/app/Activity;Lg3/x;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;)V

    :cond_64
    iget-object p1, p0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    invoke-static {p1}, LG7/v;->e(Lkotlin/jvm/internal/E;)Z

    move-result p1

    if-nez p1, :cond_b3

    iget-object p1, p0, LG7/v$c$b$a$a;->s:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    instance-of v0, p1, Lg3/k;

    if-eqz v0, :cond_77

    check-cast p1, Lg3/k;

    goto :goto_78

    :cond_77
    const/4 p1, 0x0

    :goto_78
    if-eqz p1, :cond_b3

    iget-object v0, p0, LG7/v$c$b$a$a;->E:Landroid/view/SurfaceView;

    iget-object v1, p0, LG7/v$c$b$a$a;->F:Lkotlin/jvm/internal/E;

    iget-object v4, p0, LG7/v$c$b$a$a;->G:Lv8/l;

    iget-object v5, p0, LG7/v$c$b$a$a;->H:Lv8/a;

    iget-object v6, p0, LG7/v$c$b$a$a;->I:Landroidx/cardview/widget/CardView;

    iget-object p0, p0, LG7/v$c$b$a$a;->J:Lkotlin/jvm/internal/E;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v2, Ls6/i;

    if-nez v2, :cond_97

    sget-object v2, LG7/v;->a:LG7/v;

    invoke-static {v2, p1, v4, v0, v5}, LG7/v;->h(LG7/v;Lg3/k;Lv8/l;Landroid/view/SurfaceView;Lv8/a;)Ls6/h;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    :cond_97
    invoke-virtual {v6}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-nez p1, :cond_ad

    new-instance p1, LG7/v$c$b$a$a$a;

    invoke-direct {p1, v2, v6}, LG7/v$c$b$a$a$a;-><init>(Ls6/i;Landroidx/cardview/widget/CardView;)V

    invoke-virtual {v6, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v0, LG7/x;

    invoke-direct {v0, v6, p1}, LG7/x;-><init>(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V

    iput-object v0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    goto :goto_b3

    :cond_ad
    invoke-interface {v2}, Ls6/i;->b()Z

    invoke-interface {v2, v3}, Ls6/i;->c(Z)V

    :cond_b3
    :goto_b3
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
