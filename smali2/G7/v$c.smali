.class final LG7/v$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v;->j(Landroid/app/Activity;Landroidx/cardview/widget/CardView;Lg3/v;Lv8/p;Landroidx/lifecycle/x;ZZLv8/a;Lcom/android/wallpaper/asset/a$f;)LG7/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic A:Lkotlin/jvm/internal/E;

.field final synthetic B:Lv8/p;

.field final synthetic C:Landroid/widget/ImageView;

.field final synthetic D:Z

.field final synthetic E:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic F:Lv8/a;

.field final synthetic G:Lcom/android/wallpaper/asset/a$f;

.field final synthetic H:Landroid/app/WallpaperManager;

.field final synthetic I:Lg3/v;

.field final synthetic J:Lv8/l;

.field final synthetic K:Lv8/a;

.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Landroidx/lifecycle/x;

.field final synthetic t:Landroid/view/SurfaceView;

.field final synthetic u:Lkotlin/jvm/internal/E;

.field final synthetic v:Lkotlin/jvm/internal/E;

.field final synthetic w:Lkotlin/jvm/internal/E;

.field final synthetic x:Z

.field final synthetic y:Landroid/app/Activity;

.field final synthetic z:Landroidx/cardview/widget/CardView;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;Lv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Lv8/l;Lv8/a;Lm8/e;)V
    .registers 21

    iput-object p1, p0, LG7/v$c;->s:Landroidx/lifecycle/x;

    iput-object p2, p0, LG7/v$c;->t:Landroid/view/SurfaceView;

    iput-object p3, p0, LG7/v$c;->u:Lkotlin/jvm/internal/E;

    iput-object p4, p0, LG7/v$c;->v:Lkotlin/jvm/internal/E;

    iput-object p5, p0, LG7/v$c;->w:Lkotlin/jvm/internal/E;

    iput-boolean p6, p0, LG7/v$c;->x:Z

    iput-object p7, p0, LG7/v$c;->y:Landroid/app/Activity;

    iput-object p8, p0, LG7/v$c;->z:Landroidx/cardview/widget/CardView;

    iput-object p9, p0, LG7/v$c;->A:Lkotlin/jvm/internal/E;

    iput-object p10, p0, LG7/v$c;->B:Lv8/p;

    iput-object p11, p0, LG7/v$c;->C:Landroid/widget/ImageView;

    iput-boolean p12, p0, LG7/v$c;->D:Z

    iput-object p13, p0, LG7/v$c;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p14, p0, LG7/v$c;->F:Lv8/a;

    iput-object p15, p0, LG7/v$c;->G:Lcom/android/wallpaper/asset/a$f;

    move-object/from16 p1, p16

    iput-object p1, p0, LG7/v$c;->H:Landroid/app/WallpaperManager;

    move-object/from16 p1, p17

    iput-object p1, p0, LG7/v$c;->I:Lg3/v;

    move-object/from16 p1, p18

    iput-object p1, p0, LG7/v$c;->J:Lv8/l;

    move-object/from16 p1, p19

    iput-object p1, p0, LG7/v$c;->K:Lv8/a;

    const/4 p1, 0x2

    move-object/from16 p2, p20

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 24

    move-object/from16 v0, p0

    new-instance v1, LG7/v$c;

    move-object v2, v1

    iget-object v1, v0, LG7/v$c;->s:Landroidx/lifecycle/x;

    move-object v3, v2

    iget-object v2, v0, LG7/v$c;->t:Landroid/view/SurfaceView;

    move-object v4, v3

    iget-object v3, v0, LG7/v$c;->u:Lkotlin/jvm/internal/E;

    move-object v5, v4

    iget-object v4, v0, LG7/v$c;->v:Lkotlin/jvm/internal/E;

    move-object v6, v5

    iget-object v5, v0, LG7/v$c;->w:Lkotlin/jvm/internal/E;

    move-object v7, v6

    iget-boolean v6, v0, LG7/v$c;->x:Z

    move-object v8, v7

    iget-object v7, v0, LG7/v$c;->y:Landroid/app/Activity;

    move-object v9, v8

    iget-object v8, v0, LG7/v$c;->z:Landroidx/cardview/widget/CardView;

    move-object v10, v9

    iget-object v9, v0, LG7/v$c;->A:Lkotlin/jvm/internal/E;

    move-object v11, v10

    iget-object v10, v0, LG7/v$c;->B:Lv8/p;

    move-object v12, v11

    iget-object v11, v0, LG7/v$c;->C:Landroid/widget/ImageView;

    move-object v13, v12

    iget-boolean v12, v0, LG7/v$c;->D:Z

    move-object v14, v13

    iget-object v13, v0, LG7/v$c;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v15, v14

    iget-object v14, v0, LG7/v$c;->F:Lv8/a;

    move-object/from16 v16, v15

    iget-object v15, v0, LG7/v$c;->G:Lcom/android/wallpaper/asset/a$f;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c;->H:Landroid/app/WallpaperManager;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c;->I:Lg3/v;

    move-object/from16 v19, v1

    iget-object v1, v0, LG7/v$c;->J:Lv8/l;

    iget-object v0, v0, LG7/v$c;->K:Lv8/a;

    move-object/from16 v20, v19

    move-object/from16 v19, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v20

    move-object/from16 v20, p2

    invoke-direct/range {v0 .. v20}, LG7/v$c;-><init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;Lv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Lv8/l;Lv8/a;Lm8/e;)V

    move-object v2, v0

    move-object/from16 v0, p1

    iput-object v0, v2, LG7/v$c;->r:Ljava/lang/Object;

    return-object v2
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 25

    move-object/from16 v0, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v1, v0, LG7/v$c;->q:I

    if-nez v1, :cond_71

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v1, v0, LG7/v$c;->r:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, LF8/L;

    new-instance v3, LG7/v$c$a;

    iget-object v4, v0, LG7/v$c;->s:Landroidx/lifecycle/x;

    iget-object v5, v0, LG7/v$c;->t:Landroid/view/SurfaceView;

    iget-object v6, v0, LG7/v$c;->u:Lkotlin/jvm/internal/E;

    iget-object v7, v0, LG7/v$c;->v:Lkotlin/jvm/internal/E;

    iget-object v8, v0, LG7/v$c;->w:Lkotlin/jvm/internal/E;

    iget-boolean v9, v0, LG7/v$c;->x:Z

    iget-object v10, v0, LG7/v$c;->y:Landroid/app/Activity;

    iget-object v11, v0, LG7/v$c;->z:Landroidx/cardview/widget/CardView;

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, LG7/v$c$a;-><init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, LG7/v$c$b;

    iget-object v4, v0, LG7/v$c;->s:Landroidx/lifecycle/x;

    iget-object v5, v0, LG7/v$c;->A:Lkotlin/jvm/internal/E;

    iget-object v6, v0, LG7/v$c;->B:Lv8/p;

    iget-object v7, v0, LG7/v$c;->C:Landroid/widget/ImageView;

    iget-object v8, v0, LG7/v$c;->y:Landroid/app/Activity;

    iget-boolean v9, v0, LG7/v$c;->D:Z

    iget-object v10, v0, LG7/v$c;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v11, v0, LG7/v$c;->x:Z

    iget-object v12, v0, LG7/v$c;->F:Lv8/a;

    iget-object v13, v0, LG7/v$c;->G:Lcom/android/wallpaper/asset/a$f;

    iget-object v14, v0, LG7/v$c;->H:Landroid/app/WallpaperManager;

    iget-object v15, v0, LG7/v$c;->I:Lg3/v;

    iget-object v1, v0, LG7/v$c;->t:Landroid/view/SurfaceView;

    move-object/from16 v16, v1

    iget-object v1, v0, LG7/v$c;->w:Lkotlin/jvm/internal/E;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c;->J:Lv8/l;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c;->K:Lv8/a;

    move-object/from16 v19, v1

    iget-object v1, v0, LG7/v$c;->z:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, LG7/v$c;->v:Lkotlin/jvm/internal/E;

    const/16 v22, 0x0

    move-object/from16 v21, v0

    move-object/from16 v20, v1

    invoke-direct/range {v3 .. v22}, LG7/v$c$b;-><init>(Landroidx/lifecycle/x;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_71
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
