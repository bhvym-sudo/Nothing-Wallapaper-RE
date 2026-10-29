.class final LG7/v$c$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, LG7/v$c$b$a;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, LG7/v$c$b$a;->s:Lkotlin/jvm/internal/E;

    iput-object p3, p0, LG7/v$c$b$a;->t:Lv8/p;

    iput-object p4, p0, LG7/v$c$b$a;->u:Landroid/widget/ImageView;

    iput-object p5, p0, LG7/v$c$b$a;->v:Landroid/app/Activity;

    iput-boolean p6, p0, LG7/v$c$b$a;->w:Z

    iput-object p7, p0, LG7/v$c$b$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p8, p0, LG7/v$c$b$a;->y:Z

    iput-object p9, p0, LG7/v$c$b$a;->z:Lv8/a;

    iput-object p10, p0, LG7/v$c$b$a;->A:Lcom/android/wallpaper/asset/a$f;

    iput-object p11, p0, LG7/v$c$b$a;->B:Landroid/app/WallpaperManager;

    iput-object p12, p0, LG7/v$c$b$a;->C:Lg3/v;

    iput-object p13, p0, LG7/v$c$b$a;->D:Landroid/view/SurfaceView;

    iput-object p14, p0, LG7/v$c$b$a;->E:Lkotlin/jvm/internal/E;

    iput-object p15, p0, LG7/v$c$b$a;->F:Lv8/l;

    move-object/from16 p1, p16

    iput-object p1, p0, LG7/v$c$b$a;->G:Lv8/a;

    move-object/from16 p1, p17

    iput-object p1, p0, LG7/v$c$b$a;->H:Landroidx/cardview/widget/CardView;

    move-object/from16 p1, p18

    iput-object p1, p0, LG7/v$c$b$a;->I:Lkotlin/jvm/internal/E;

    const/4 p1, 0x2

    move-object/from16 p2, p19

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 23

    move-object/from16 v0, p0

    new-instance v1, LG7/v$c$b$a;

    move-object v2, v1

    iget-object v1, v0, LG7/v$c$b$a;->r:Landroidx/lifecycle/x;

    move-object v3, v2

    iget-object v2, v0, LG7/v$c$b$a;->s:Lkotlin/jvm/internal/E;

    move-object v4, v3

    iget-object v3, v0, LG7/v$c$b$a;->t:Lv8/p;

    move-object v5, v4

    iget-object v4, v0, LG7/v$c$b$a;->u:Landroid/widget/ImageView;

    move-object v6, v5

    iget-object v5, v0, LG7/v$c$b$a;->v:Landroid/app/Activity;

    move-object v7, v6

    iget-boolean v6, v0, LG7/v$c$b$a;->w:Z

    move-object v8, v7

    iget-object v7, v0, LG7/v$c$b$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v9, v8

    iget-boolean v8, v0, LG7/v$c$b$a;->y:Z

    move-object v10, v9

    iget-object v9, v0, LG7/v$c$b$a;->z:Lv8/a;

    move-object v11, v10

    iget-object v10, v0, LG7/v$c$b$a;->A:Lcom/android/wallpaper/asset/a$f;

    move-object v12, v11

    iget-object v11, v0, LG7/v$c$b$a;->B:Landroid/app/WallpaperManager;

    move-object v13, v12

    iget-object v12, v0, LG7/v$c$b$a;->C:Lg3/v;

    move-object v14, v13

    iget-object v13, v0, LG7/v$c$b$a;->D:Landroid/view/SurfaceView;

    move-object v15, v14

    iget-object v14, v0, LG7/v$c$b$a;->E:Lkotlin/jvm/internal/E;

    move-object/from16 v16, v15

    iget-object v15, v0, LG7/v$c$b$a;->F:Lv8/l;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c$b$a;->G:Lv8/a;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c$b$a;->H:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, LG7/v$c$b$a;->I:Lkotlin/jvm/internal/E;

    move-object/from16 v19, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v19

    move-object/from16 v19, p2

    invoke-direct/range {v0 .. v19}, LG7/v$c$b$a;-><init>(Landroidx/lifecycle/x;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$c$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$c$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$c$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 25

    move-object/from16 v0, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v1, v0, LG7/v$c$b$a;->q:I

    if-nez v1, :cond_54

    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v1, v0, LG7/v$c$b$a;->r:Landroidx/lifecycle/x;

    invoke-static {v1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v3, LG7/v$c$b$a$a;

    iget-object v4, v0, LG7/v$c$b$a;->s:Lkotlin/jvm/internal/E;

    iget-object v5, v0, LG7/v$c$b$a;->t:Lv8/p;

    iget-object v6, v0, LG7/v$c$b$a;->u:Landroid/widget/ImageView;

    iget-object v7, v0, LG7/v$c$b$a;->v:Landroid/app/Activity;

    iget-boolean v8, v0, LG7/v$c$b$a;->w:Z

    iget-object v9, v0, LG7/v$c$b$a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v10, v0, LG7/v$c$b$a;->y:Z

    iget-object v11, v0, LG7/v$c$b$a;->z:Lv8/a;

    iget-object v12, v0, LG7/v$c$b$a;->A:Lcom/android/wallpaper/asset/a$f;

    iget-object v13, v0, LG7/v$c$b$a;->r:Landroidx/lifecycle/x;

    iget-object v14, v0, LG7/v$c$b$a;->B:Landroid/app/WallpaperManager;

    iget-object v15, v0, LG7/v$c$b$a;->C:Lg3/v;

    iget-object v1, v0, LG7/v$c$b$a;->D:Landroid/view/SurfaceView;

    move-object/from16 v16, v1

    iget-object v1, v0, LG7/v$c$b$a;->E:Lkotlin/jvm/internal/E;

    move-object/from16 v17, v1

    iget-object v1, v0, LG7/v$c$b$a;->F:Lv8/l;

    move-object/from16 v18, v1

    iget-object v1, v0, LG7/v$c$b$a;->G:Lv8/a;

    move-object/from16 v19, v1

    iget-object v1, v0, LG7/v$c$b$a;->H:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, LG7/v$c$b$a;->I:Lkotlin/jvm/internal/E;

    const/16 v22, 0x0

    move-object/from16 v21, v0

    move-object/from16 v20, v1

    invoke-direct/range {v3 .. v22}, LG7/v$c$b$a$a;-><init>(Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;Landroid/app/Activity;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lv8/l;Lv8/a;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_54
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
