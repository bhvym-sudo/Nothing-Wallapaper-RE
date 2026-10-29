.class final LG7/v$c$b;
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
.field final synthetic A:Lcom/android/wallpaper/asset/a$f;

.field final synthetic B:Landroid/app/WallpaperManager;

.field final synthetic C:Lg3/v;

.field final synthetic D:Landroid/view/SurfaceView;

.field final synthetic E:Lkotlin/jvm/internal/E;

.field final synthetic F:Lv8/l;

.field final synthetic G:Lv8/a;

.field final synthetic H:Landroidx/cardview/widget/CardView;

.field final synthetic I:Lkotlin/jvm/internal/E;

.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:Lkotlin/jvm/internal/E;

.field final synthetic t:Lv8/p;

.field final synthetic u:Landroid/widget/ImageView;

.field final synthetic v:Landroid/app/Activity;

.field final synthetic w:Z

.field final synthetic x:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic y:Z

.field final synthetic z:Lv8/a;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V
    .registers 20

    iput-object p1, p0, LG7/v$c$b;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, LG7/v$c$b;->s:Lkotlin/jvm/internal/E;

    iput-object p3, p0, LG7/v$c$b;->t:Lv8/p;

    iput-object p4, p0, LG7/v$c$b;->u:Landroid/widget/ImageView;

    iput-object p5, p0, LG7/v$c$b;->v:Landroid/app/Activity;

    iput-boolean p6, p0, LG7/v$c$b;->w:Z

    iput-object p7, p0, LG7/v$c$b;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p8, p0, LG7/v$c$b;->y:Z

    iput-object p9, p0, LG7/v$c$b;->z:Lv8/a;

    iput-object p10, p0, LG7/v$c$b;->A:Lcom/android/wallpaper/asset/a$f;

    iput-object p11, p0, LG7/v$c$b;->B:Landroid/app/WallpaperManager;

    iput-object p12, p0, LG7/v$c$b;->C:Lg3/v;

    iput-object p13, p0, LG7/v$c$b;->D:Landroid/view/SurfaceView;

    iput-object p14, p0, LG7/v$c$b;->E:Lkotlin/jvm/internal/E;

    iput-object p15, p0, LG7/v$c$b;->F:Lv8/l;

    move-object/from16 p1, p16

    iput-object p1, p0, LG7/v$c$b;->G:Lv8/a;

    move-object/from16 p1, p17

    iput-object p1, p0, LG7/v$c$b;->H:Landroidx/cardview/widget/CardView;

    move-object/from16 p1, p18

    iput-object p1, p0, LG7/v$c$b;->I:Lkotlin/jvm/internal/E;

    const/4 p1, 0x2

    move-object/from16 p2, p19

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 23

    move-object/from16 v0, p0

    new-instance v1, LG7/v$c$b;

    move-object v2, v1

    iget-object v1, v0, LG7/v$c$b;->r:Landroidx/lifecycle/x;

    move-object v3, v2

    iget-object v2, v0, LG7/v$c$b;->s:Lkotlin/jvm/internal/E;

    move-object v4, v3

    iget-object v3, v0, LG7/v$c$b;->t:Lv8/p;

    move-object v5, v4

    iget-object v4, v0, LG7/v$c$b;->u:Landroid/widget/ImageView;

    move-object v6, v5

    iget-object v5, v0, LG7/v$c$b;->v:Landroid/app/Activity;

    move-object v7, v6

    iget-boolean v6, v0, LG7/v$c$b;->w:Z

    move-object v8, v7

    iget-object v7, v0, LG7/v$c$b;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v9, v8

    iget-boolean v8, v0, LG7/v$c$b;->y:Z

    move-object v10, v9

    iget-object v9, v0, LG7/v$c$b;->z:Lv8/a;

    move-object v11, v10

    iget-object v10, v0, LG7/v$c$b;->A:Lcom/android/wallpaper/asset/a$f;

    move-object v12, v11

    iget-object v11, v0, LG7/v$c$b;->B:Landroid/app/WallpaperManager;

    move-object v13, v12

    iget-object v12, v0, LG7/v$c$b;->C:Lg3/v;

    move-object v14, v13

    iget-object v13, v0, LG7/v$c$b;->D:Landroid/view/SurfaceView;

    move-object v15, v14

    iget-object v14, v0, LG7/v$c$b;->E:Lkotlin/jvm/internal/E;

    move-object/from16 v16, v15

    iget-object v15, v0, LG7/v$c$b;->F:Lv8/l;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c$b;->G:Lv8/a;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c$b;->H:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, LG7/v$c$b;->I:Lkotlin/jvm/internal/E;

    move-object/from16 v19, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v19

    move-object/from16 v19, p2

    invoke-direct/range {v0 .. v19}, LG7/v$c$b;-><init>(Landroidx/lifecycle/x;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 26

    move-object/from16 v0, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG7/v$c$b;->q:I

    const/4 v3, 0x1

    if-eqz v2, :cond_19

    if-ne v2, v3, :cond_11

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_61

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v5, v0, LG7/v$c$b;->r:Landroidx/lifecycle/x;

    sget-object v2, Landroidx/lifecycle/q$b;->u:Landroidx/lifecycle/q$b;

    new-instance v4, LG7/v$c$b$a;

    iget-object v6, v0, LG7/v$c$b;->s:Lkotlin/jvm/internal/E;

    iget-object v7, v0, LG7/v$c$b;->t:Lv8/p;

    iget-object v8, v0, LG7/v$c$b;->u:Landroid/widget/ImageView;

    iget-object v9, v0, LG7/v$c$b;->v:Landroid/app/Activity;

    iget-boolean v10, v0, LG7/v$c$b;->w:Z

    iget-object v11, v0, LG7/v$c$b;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v12, v0, LG7/v$c$b;->y:Z

    iget-object v13, v0, LG7/v$c$b;->z:Lv8/a;

    iget-object v14, v0, LG7/v$c$b;->A:Lcom/android/wallpaper/asset/a$f;

    iget-object v15, v0, LG7/v$c$b;->B:Landroid/app/WallpaperManager;

    iget-object v3, v0, LG7/v$c$b;->C:Lg3/v;

    move-object/from16 v16, v3

    iget-object v3, v0, LG7/v$c$b;->D:Landroid/view/SurfaceView;

    move-object/from16 v17, v3

    iget-object v3, v0, LG7/v$c$b;->E:Lkotlin/jvm/internal/E;

    move-object/from16 v18, v3

    iget-object v3, v0, LG7/v$c$b;->F:Lv8/l;

    move-object/from16 v19, v3

    iget-object v3, v0, LG7/v$c$b;->G:Lv8/a;

    move-object/from16 v20, v3

    iget-object v3, v0, LG7/v$c$b;->H:Landroidx/cardview/widget/CardView;

    move-object/from16 v21, v3

    iget-object v3, v0, LG7/v$c$b;->I:Lkotlin/jvm/internal/E;

    const/16 v23, 0x0

    move-object/from16 v22, v3

    invoke-direct/range {v4 .. v23}, LG7/v$c$b$a;-><init>(Landroidx/lifecycle/x;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    const/4 v3, 0x1

    iput v3, v0, LG7/v$c$b;->q:I

    invoke-static {v5, v2, v4, v0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_61

    return-object v1

    :cond_61
    :goto_61
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method
