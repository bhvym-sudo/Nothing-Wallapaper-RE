.class final Lj7/j$o;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field A:Z

.field B:I

.field C:J

.field D:I

.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lj7/j;

.field final synthetic G:Landroid/app/Activity;

.field final synthetic H:Landroid/service/wallpaper/IWallpaperEngine;

.field final synthetic I:I

.field final synthetic J:Lj7/j$p;

.field final synthetic K:Z

.field final synthetic L:Z

.field final synthetic M:Lkotlin/jvm/internal/E;

.field final synthetic N:Lkotlin/jvm/internal/E;

.field final synthetic O:Lkotlin/jvm/internal/E;

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field v:Ljava/lang/Object;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method constructor <init>(Lj7/j;Landroid/app/Activity;Landroid/service/wallpaper/IWallpaperEngine;ILj7/j$p;ZZLkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lm8/e;)V
    .registers 12

    iput-object p1, p0, Lj7/j$o;->F:Lj7/j;

    iput-object p2, p0, Lj7/j$o;->G:Landroid/app/Activity;

    iput-object p3, p0, Lj7/j$o;->H:Landroid/service/wallpaper/IWallpaperEngine;

    iput p4, p0, Lj7/j$o;->I:I

    iput-object p5, p0, Lj7/j$o;->J:Lj7/j$p;

    iput-boolean p6, p0, Lj7/j$o;->K:Z

    iput-boolean p7, p0, Lj7/j$o;->L:Z

    iput-object p8, p0, Lj7/j$o;->M:Lkotlin/jvm/internal/E;

    iput-object p9, p0, Lj7/j$o;->N:Lkotlin/jvm/internal/E;

    iput-object p10, p0, Lj7/j$o;->O:Lkotlin/jvm/internal/E;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p11}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s()Z
    .registers 1

    invoke-static {}, Lj7/j$o;->u()Z

    move-result v0

    return v0
.end method

.method private static final u()Z
    .registers 1

    sget-object v0, LA6/b;->a:LA6/b;

    invoke-virtual {v0}, LA6/b;->k()Z

    move-result v0

    return v0
.end method

.method private static final v(Lh8/h;)Z
    .registers 1

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 15

    new-instance v0, Lj7/j$o;

    iget-object v1, p0, Lj7/j$o;->F:Lj7/j;

    iget-object v2, p0, Lj7/j$o;->G:Landroid/app/Activity;

    iget-object v3, p0, Lj7/j$o;->H:Landroid/service/wallpaper/IWallpaperEngine;

    iget v4, p0, Lj7/j$o;->I:I

    iget-object v5, p0, Lj7/j$o;->J:Lj7/j$p;

    iget-boolean v6, p0, Lj7/j$o;->K:Z

    iget-boolean v7, p0, Lj7/j$o;->L:Z

    iget-object v8, p0, Lj7/j$o;->M:Lkotlin/jvm/internal/E;

    iget-object v9, p0, Lj7/j$o;->N:Lkotlin/jvm/internal/E;

    iget-object v10, p0, Lj7/j$o;->O:Lkotlin/jvm/internal/E;

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lj7/j$o;-><init>(Lj7/j;Landroid/app/Activity;Landroid/service/wallpaper/IWallpaperEngine;ILj7/j$p;ZZLkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lm8/e;)V

    iput-object p1, v0, Lj7/j$o;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$o;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$o;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$o;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 23

    move-object/from16 v1, p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lj7/j$o;->D:I

    const-string v3, " to manager."

    const-string v4, "set "

    packed-switch v2, :pswitch_data_5e4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_17
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_5b7

    :pswitch_1e
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v8, v0

    goto/16 :goto_5a0

    :pswitch_24
    iget-object v0, v1, Lj7/j$o;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/E;

    iget-object v2, v1, Lj7/j$o;->v:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/C;

    iget-object v3, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v3, Landroid/app/WallpaperColors;

    iget-object v4, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v4, LC6/i;

    iget-object v5, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/E;

    iget-object v6, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v6, Landroid/app/Activity;

    iget-object v7, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v7, Lj7/j$p;

    iget-object v8, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v8, Lj7/j;

    :try_start_44
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_47
    .catchall {:try_start_44 .. :try_end_47} :catchall_4f

    move-object v13, v3

    move-object v3, v5

    move-object/from16 v5, p1

    :goto_4b
    move-object v14, v7

    move-object v7, v6

    goto/16 :goto_512

    :catchall_4f
    move-exception v0

    goto/16 :goto_53e

    :pswitch_52
    iget-wide v2, v1, Lj7/j$o;->C:J

    iget v5, v1, Lj7/j$o;->B:I

    iget-object v6, v1, Lj7/j$o;->w:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/C;

    iget-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    check-cast v7, Landroid/app/WallpaperColors;

    iget-object v9, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v9, LC6/i;

    iget-object v10, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v10, LC6/g;

    iget-object v11, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/E;

    iget-object v12, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v12, Landroid/app/Activity;

    iget-object v13, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v13, Lj7/j$p;

    iget-object v14, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v14, Lj7/j;

    :try_start_76
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_79
    .catchall {:try_start_76 .. :try_end_79} :catchall_4f

    move-object v8, v0

    move-object/from16 v17, v4

    move-object/from16 v4, p1

    goto/16 :goto_45d

    :pswitch_80
    iget-object v0, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v0, LJ6/a;

    iget-object v2, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v2, Landroid/app/WallpaperColors;

    iget-object v5, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v5, Landroid/app/Activity;

    iget-object v6, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v6, Lj7/j$p;

    iget-object v7, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v7, Lj7/j;

    :try_start_98
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_9b
    .catchall {:try_start_98 .. :try_end_9b} :catchall_4f

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object/from16 v3, p1

    :goto_a1
    move-object v12, v2

    move-object v13, v6

    move-object v6, v0

    goto/16 :goto_352

    :pswitch_a6
    iget v2, v1, Lj7/j$o;->B:I

    iget-object v5, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v5, LJ6/a;

    iget-object v6, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v7, Landroid/app/WallpaperColors;

    iget-object v9, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v9, Landroid/app/Activity;

    iget-object v10, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v10, Lj7/j$p;

    iget-object v11, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v11, Lj7/j;

    :try_start_c0
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_c3
    .catchall {:try_start_c0 .. :try_end_c3} :catchall_4f

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object v4, v0

    goto/16 :goto_313

    :pswitch_ca
    iget v2, v1, Lj7/j$o;->B:I

    iget-object v5, v1, Lj7/j$o;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, Lj7/j$o;->w:Ljava/lang/Object;

    check-cast v6, Landroid/app/WallpaperColors;

    iget-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    check-cast v7, LC6/g;

    iget-object v9, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v9, Landroid/service/wallpaper/IWallpaperEngine;

    iget-object v10, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/E;

    iget-object v11, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/E;

    iget-object v12, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v12, Landroid/app/Activity;

    iget-object v13, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v13, Lj7/j$p;

    iget-object v14, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v14, Lj7/j;

    :try_start_f0
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_f3
    .catchall {:try_start_f0 .. :try_end_f3} :catchall_4f

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object v8, v10

    move-object v4, v0

    move-object v10, v7

    move-object v0, v11

    move-object v11, v14

    move-object v7, v6

    move-object v6, v5

    move v5, v2

    move-object/from16 v2, p1

    goto/16 :goto_2bb

    :pswitch_103
    iget-boolean v2, v1, Lj7/j$o;->z:Z

    iget v9, v1, Lj7/j$o;->B:I

    iget-object v10, v1, Lj7/j$o;->y:Ljava/lang/Object;

    check-cast v10, Landroid/app/WallpaperColors;

    iget-object v11, v1, Lj7/j$o;->x:Ljava/lang/Object;

    check-cast v11, LC6/i;

    iget-object v12, v1, Lj7/j$o;->w:Ljava/lang/Object;

    check-cast v12, LC6/g;

    iget-object v13, v1, Lj7/j$o;->v:Ljava/lang/Object;

    check-cast v13, Landroid/service/wallpaper/IWallpaperEngine;

    iget-object v14, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/E;

    iget-object v15, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v15, Lkotlin/jvm/internal/E;

    iget-object v6, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/E;

    iget-object v5, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v5, Landroid/app/Activity;

    iget-object v7, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v7, Lj7/j$p;

    iget-object v8, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v8, Lj7/j;

    :try_start_12f
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_132
    .catchall {:try_start_12f .. :try_end_132} :catchall_4f

    move-object/from16 v17, v12

    move-object v12, v5

    move v5, v9

    move-object v9, v13

    move-object v13, v7

    move-object v7, v10

    move-object/from16 v10, v17

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object v4, v0

    move-object v0, v8

    move-object v8, v14

    move-object v14, v11

    move-object v11, v15

    goto/16 :goto_257

    :pswitch_146
    iget-boolean v2, v1, Lj7/j$o;->A:Z

    iget v5, v1, Lj7/j$o;->B:I

    iget-boolean v6, v1, Lj7/j$o;->z:Z

    iget-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    check-cast v7, Landroid/service/wallpaper/IWallpaperEngine;

    iget-object v8, v1, Lj7/j$o;->u:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/E;

    iget-object v9, v1, Lj7/j$o;->t:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/E;

    iget-object v10, v1, Lj7/j$o;->s:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/E;

    iget-object v11, v1, Lj7/j$o;->r:Ljava/lang/Object;

    check-cast v11, Landroid/app/Activity;

    iget-object v12, v1, Lj7/j$o;->q:Ljava/lang/Object;

    check-cast v12, Lj7/j$p;

    iget-object v13, v1, Lj7/j$o;->E:Ljava/lang/Object;

    check-cast v13, Lj7/j;

    :try_start_168
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_16b
    .catchall {:try_start_168 .. :try_end_16b} :catchall_4f

    move-object/from16 v14, p1

    goto :goto_1d1

    :pswitch_16e
    invoke-static/range {p1 .. p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lj7/j$o;->E:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, LF8/L;

    iget-object v2, v1, Lj7/j$o;->F:Lj7/j;

    new-instance v8, Lj7/j$o$a;

    const/4 v6, 0x0

    invoke-direct {v8, v2, v6}, Lj7/j$o$a;-><init>(Lj7/j;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v5

    invoke-static {v2, v5}, Lj7/j;->S(Lj7/j;LF8/x0;)V

    iget-object v2, v1, Lj7/j$o;->F:Lj7/j;

    invoke-virtual {v2}, Lj7/j;->u0()Lg3/x;

    move-result-object v2

    invoke-static {v2}, LG6/e;->s(Lg3/x;)Z

    move-result v2

    if-eqz v2, :cond_558

    iget-object v13, v1, Lj7/j$o;->F:Lj7/j;

    iget-boolean v6, v1, Lj7/j$o;->K:Z

    iget-object v12, v1, Lj7/j$o;->J:Lj7/j$p;

    iget v5, v1, Lj7/j$o;->I:I

    iget-boolean v2, v1, Lj7/j$o;->L:Z

    iget-object v11, v1, Lj7/j$o;->G:Landroid/app/Activity;

    iget-object v10, v1, Lj7/j$o;->M:Lkotlin/jvm/internal/E;

    iget-object v9, v1, Lj7/j$o;->N:Lkotlin/jvm/internal/E;

    iget-object v8, v1, Lj7/j$o;->O:Lkotlin/jvm/internal/E;

    iget-object v7, v1, Lj7/j$o;->H:Landroid/service/wallpaper/IWallpaperEngine;

    :try_start_1a9
    sget-object v14, Lh8/q;->r:Lh8/q$a;

    if-eqz v6, :cond_1b0

    sget-object v14, LC6/e$b;->c:LC6/e$b;

    goto :goto_1b1

    :cond_1b0
    const/4 v14, 0x0

    :goto_1b1
    iput-object v13, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v12, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v11, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v9, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v8, v1, Lj7/j$o;->u:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-boolean v6, v1, Lj7/j$o;->z:Z

    iput v5, v1, Lj7/j$o;->B:I

    iput-boolean v2, v1, Lj7/j$o;->A:Z

    const/4 v15, 0x1

    iput v15, v1, Lj7/j$o;->D:I

    invoke-static {v13, v14, v1}, Lj7/j;->p(Lj7/j;LC6/e;Lm8/e;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v0, :cond_1d1

    move-object v8, v0

    goto/16 :goto_5b6

    :cond_1d1
    :goto_1d1
    check-cast v14, Lh8/u;

    if-nez v14, :cond_1e1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "setWallpaper but buildEffectInfo return null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lj7/j$p;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_52f

    :cond_1e1
    invoke-virtual {v14}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LC6/g;

    invoke-virtual {v14}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 p1, v14

    move-object/from16 v14, v17

    check-cast v14, LC6/i;

    invoke-virtual/range {p1 .. p1}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    check-cast v3, Landroid/app/WallpaperColors;

    move-object/from16 v17, v4

    invoke-static {v13}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v4

    move-object/from16 v19, v0

    invoke-static {v5}, LG6/g;->b(I)Ljava/lang/String;

    move-result-object v0

    move/from16 p1, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v20, v2

    const-string v2, "start set PreviewImageWallpaper to "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-static {v13}, Lj7/j;->r(Lj7/j;)LA6/c;

    move-result-object v0

    if-eqz v0, :cond_536

    iput-object v13, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v12, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v11, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v9, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v8, v1, Lj7/j$o;->u:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v15, v1, Lj7/j$o;->w:Ljava/lang/Object;

    iput-object v14, v1, Lj7/j$o;->x:Ljava/lang/Object;

    iput-object v3, v1, Lj7/j$o;->y:Ljava/lang/Object;

    iput v5, v1, Lj7/j$o;->B:I

    move/from16 v2, v20

    iput-boolean v2, v1, Lj7/j$o;->z:Z

    const/4 v0, 0x2

    iput v0, v1, Lj7/j$o;->D:I

    move/from16 v6, p1

    invoke-static {v13, v6, v1}, Lj7/j;->O(Lj7/j;ZLm8/e;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v19

    if-ne v0, v4, :cond_24f

    :goto_24c
    move-object v8, v4

    goto/16 :goto_5b6

    :cond_24f
    move-object v6, v10

    move-object v0, v13

    move-object v10, v15

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object v9, v7

    move-object v7, v3

    :goto_257
    if-eqz v2, :cond_3a8

    invoke-virtual {v10}, LC6/g;->e()LE6/a$a;

    move-result-object v2
    :try_end_25d
    .catchall {:try_start_1a9 .. :try_end_25d} :catchall_4f

    const-string v3, "ORIGIN"

    if-eqz v2, :cond_26d

    :try_start_261
    invoke-virtual {v2}, LE6/a$a;->b()LC6/e;

    move-result-object v2

    if-eqz v2, :cond_26d

    invoke-virtual {v2}, LC6/e;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_26e

    :cond_26d
    move-object v2, v3

    :cond_26e
    invoke-virtual {v0}, Lj7/j;->l0()Lp7/a;

    move-result-object v6

    sget-object v14, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v6, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_291

    invoke-virtual {v0}, Lj7/j;->u0()Lg3/x;

    move-result-object v6

    invoke-virtual {v6}, Lg3/x;->s()Z

    move-result v6

    if-eqz v6, :cond_291

    sget-object v6, LC6/e$b;->c:LC6/e$b;

    invoke-virtual {v6}, LC6/e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_291

    goto :goto_292

    :cond_291
    move-object v3, v2

    :goto_292
    invoke-virtual {v0}, Lj7/j;->d0()LI8/f;

    move-result-object v2

    iput-object v0, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v13, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v12, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v11, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v8, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v9, v1, Lj7/j$o;->u:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->w:Ljava/lang/Object;

    iput-object v3, v1, Lj7/j$o;->x:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v1, Lj7/j$o;->y:Ljava/lang/Object;

    iput v5, v1, Lj7/j$o;->B:I

    const/4 v6, 0x3

    iput v6, v1, Lj7/j$o;->D:I

    invoke-static {v2, v1}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2b7

    goto :goto_24c

    :cond_2b7
    move-object v6, v11

    move-object v11, v0

    move-object v0, v6

    move-object v6, v3

    :goto_2bb
    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_384

    invoke-static {v11}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v3

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "set blur file path:"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Lq6/b;->g(Ljava/lang/String;)V

    iput-object v2, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    iput-object v7, v8, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    invoke-virtual {v11}, Lj7/j;->u0()Lg3/x;

    move-result-object v0

    invoke-virtual {v11}, Lj7/j;->b0()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v10, v7, v2}, LG6/e;->a(Lg3/x;LC6/g;Landroid/app/WallpaperColors;Landroid/content/Context;)LJ6/a;

    move-result-object v0

    if-eqz v9, :cond_31c

    iput-object v11, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v13, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v12, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v6, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v0, v1, Lj7/j$o;->u:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v2, v1, Lj7/j$o;->w:Ljava/lang/Object;

    iput-object v2, v1, Lj7/j$o;->x:Ljava/lang/Object;

    iput v5, v1, Lj7/j$o;->B:I

    const/4 v2, 0x4

    iput v2, v1, Lj7/j$o;->D:I

    invoke-static {v11, v0, v5, v9, v1}, Lj7/j;->R(Lj7/j;Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_30f

    goto/16 :goto_24c

    :cond_30f
    move v2, v5

    move-object v9, v12

    move-object v10, v13

    move-object v5, v0

    :goto_313
    sget-object v0, Lh8/A;->a:Lh8/A;

    move-object v0, v5

    move-object v3, v6

    move-object v6, v10

    move v5, v2

    :goto_319
    move-object v2, v7

    move-object v7, v11

    goto :goto_320

    :cond_31c
    move-object v3, v6

    move-object v9, v12

    move-object v6, v13

    goto :goto_319

    :goto_320
    invoke-virtual {v2}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result v8

    invoke-static {v7, v5, v8}, Lj7/j;->P(Lj7/j;II)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v5

    new-instance v8, Lj7/j$o$b;

    const/4 v10, 0x0

    invoke-direct {v8, v7, v10}, Lj7/j$o$b;-><init>(Lj7/j;Lm8/e;)V

    iput-object v7, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v6, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v9, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v2, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v3, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v0, v1, Lj7/j$o;->u:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->w:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->x:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v1, Lj7/j$o;->D:I

    invoke-static {v5, v8, v1}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_34f

    goto/16 :goto_24c

    :cond_34f
    move-object v5, v9

    goto/16 :goto_a1

    :goto_352
    check-cast v3, Landroid/graphics/Bitmap;

    invoke-static {v7}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    invoke-static {v6, v5}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v8, v17

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v18

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-static {v7}, Lj7/j;->D(Lj7/j;)Lh3/a0;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    move-object v7, v3

    invoke-virtual/range {v4 .. v13}, Lh3/a0;->t(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Lcom/android/wallpaper/asset/a;IFLandroid/graphics/Rect;Landroid/app/WallpaperColors;Lh3/U$a;)V

    goto/16 :goto_52f

    :cond_384
    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Lj7/j$p;->a(Ljava/lang/Throwable;)V

    invoke-static {v11}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "didn\'t find path for pathType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq6/b;->g(Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_3a8
    move-object/from16 v8, v17

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v2

    const-string v3, "setWallpaper for image."

    invoke-virtual {v2, v3}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-virtual {v0}, Lj7/j;->e0()Lo7/b;

    move-result-object v2

    if-eqz v2, :cond_3be

    invoke-virtual {v2}, Lo7/b;->v()V

    sget-object v2, Lh8/A;->a:Lh8/A;

    :cond_3be
    const/4 v15, 0x1

    if-ne v5, v15, :cond_3c2

    goto :goto_3c3

    :cond_3c2
    const/4 v15, 0x0

    :goto_3c3
    new-instance v2, Lj7/k;

    invoke-direct {v2}, Lj7/k;-><init>()V

    invoke-static {v2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v2

    invoke-virtual {v0}, Lj7/j;->l0()Lp7/a;

    move-result-object v3

    instance-of v3, v3, Lp7/a$c;

    new-instance v9, Lkotlin/jvm/internal/C;

    invoke-direct {v9}, Lkotlin/jvm/internal/C;-><init>()V

    iput v5, v9, Lkotlin/jvm/internal/C;->q:I

    const/4 v11, 0x2

    if-eq v5, v11, :cond_40f

    invoke-static {v2}, Lj7/j$o;->v(Lh8/h;)Z

    move-result v2

    if-eqz v2, :cond_40f

    invoke-virtual {v10}, LC6/g;->e()LE6/a$a;

    move-result-object v2

    if-eqz v2, :cond_3ed

    invoke-virtual {v2}, LE6/a$a;->b()LC6/e;

    move-result-object v2

    goto :goto_3ee

    :cond_3ed
    const/4 v2, 0x0

    :goto_3ee
    invoke-virtual {v0}, Lj7/j;->u0()Lg3/x;

    move-result-object v11

    invoke-virtual {v11}, Lg3/x;->k()LC6/g;

    move-result-object v11

    if-eqz v11, :cond_403

    invoke-virtual {v11}, LC6/g;->e()LE6/a$a;

    move-result-object v11

    if-eqz v11, :cond_403

    invoke-virtual {v11}, LE6/a$a;->b()LC6/e;

    move-result-object v11

    goto :goto_404

    :cond_403
    const/4 v11, 0x0

    :goto_404
    invoke-static {v2, v11}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v3, :cond_414

    if-eqz v2, :cond_414

    const/4 v11, 0x2

    iput v11, v9, Lkotlin/jvm/internal/C;->q:I

    :cond_40f
    move-object/from16 v17, v8

    move-object v8, v4

    goto/16 :goto_494

    :cond_414
    const/4 v11, 0x2

    if-eqz v15, :cond_418

    const/4 v11, 0x0

    :cond_418
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v15

    move-object/from16 v17, v8

    const-string v8, "start run blurDaemon."

    invoke-virtual {v15, v8}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v8

    new-instance v15, Lj7/j$o$d;

    move-object/from16 v19, v4

    const/4 v4, 0x0

    invoke-direct {v15, v11, v4}, Lj7/j$o$d;-><init>(ILm8/e;)V

    iput-object v0, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v13, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v12, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v6, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v14, v1, Lj7/j$o;->u:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v9, v1, Lj7/j$o;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v1, Lj7/j$o;->x:Ljava/lang/Object;

    iput-object v4, v1, Lj7/j$o;->y:Ljava/lang/Object;

    iput v5, v1, Lj7/j$o;->B:I

    iput-wide v2, v1, Lj7/j$o;->C:J

    const/4 v4, 0x6

    iput v4, v1, Lj7/j$o;->D:I

    invoke-static {v8, v15, v1}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v8, v19

    if-ne v4, v8, :cond_459

    goto/16 :goto_5b6

    :cond_459
    move-object v11, v6

    move-object v6, v9

    move-object v9, v14

    move-object v14, v0

    :goto_45d
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v14}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    sub-long v2, v15, v2

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 p1, v5

    const-string v5, "blurDaemon run result: "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", consume "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lq6/b;->g(Ljava/lang/String;)V

    move/from16 v5, p1

    move-object v2, v6

    move-object v4, v9

    move-object v0, v11

    move-object v3, v7

    move-object v6, v12

    move-object v7, v13

    goto :goto_49b

    :goto_494
    move-object v2, v9

    move-object v4, v14

    move-object v14, v0

    move-object v0, v6

    move-object v3, v7

    move-object v7, v13

    move-object v6, v12

    :goto_49b
    invoke-virtual {v14}, Lj7/j;->u0()Lg3/x;

    move-result-object v9

    invoke-virtual {v9, v10}, Lg3/x;->v(LC6/g;)V

    invoke-static {v14}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v9

    invoke-virtual {v14}, Lj7/j;->u0()Lg3/x;

    move-result-object v10

    invoke-static {v10, v6}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14}, Lj7/j;->i0()LI8/O;

    move-result-object v11

    invoke-interface {v11}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v15, v17

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " to manager, state:"

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " depthBitmap:"

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result v9

    invoke-static {v14, v5, v9}, Lj7/j;->P(Lj7/j;II)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v5

    new-instance v9, Lj7/j$o$c;

    const/4 v10, 0x0

    invoke-direct {v9, v14, v2, v10}, Lj7/j$o$c;-><init>(Lj7/j;Lkotlin/jvm/internal/C;Lm8/e;)V

    iput-object v14, v1, Lj7/j$o;->E:Ljava/lang/Object;

    iput-object v7, v1, Lj7/j$o;->q:Ljava/lang/Object;

    iput-object v6, v1, Lj7/j$o;->r:Ljava/lang/Object;

    iput-object v0, v1, Lj7/j$o;->s:Ljava/lang/Object;

    iput-object v4, v1, Lj7/j$o;->t:Ljava/lang/Object;

    iput-object v3, v1, Lj7/j$o;->u:Ljava/lang/Object;

    iput-object v2, v1, Lj7/j$o;->v:Ljava/lang/Object;

    iput-object v0, v1, Lj7/j$o;->w:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v1, Lj7/j$o;->x:Ljava/lang/Object;

    iput-object v10, v1, Lj7/j$o;->y:Ljava/lang/Object;

    const/4 v10, 0x7

    iput v10, v1, Lj7/j$o;->D:I

    invoke-static {v5, v9, v1}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_50d

    goto/16 :goto_5b6

    :cond_50d
    move-object v13, v3

    move-object v8, v14

    move-object v3, v0

    goto/16 :goto_4b

    :goto_512
    iput-object v5, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    invoke-static {v8}, Lj7/j;->D(Lj7/j;)Lh3/a0;

    move-result-object v6

    move-object v0, v8

    invoke-virtual {v0}, Lj7/j;->u0()Lg3/x;

    move-result-object v8

    iget v9, v2, Lkotlin/jvm/internal/C;->q:I

    invoke-virtual {v4}, LC6/i;->a()Landroid/graphics/Bitmap;

    move-result-object v10

    iget-object v2, v3, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Landroid/graphics/Bitmap;

    invoke-static {v0}, Lj7/j;->v(Lj7/j;)LJ6/e;

    move-result-object v12

    invoke-virtual/range {v6 .. v14}, Lh3/a0;->r(Landroid/app/Activity;Lg3/x;ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;LJ6/e;Landroid/app/WallpaperColors;Lh3/U$a;)V

    :goto_52f
    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_548

    :cond_536
    const-string v0, "setWallpaper: select blur but BlurHelper is NULL."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_53e
    .catchall {:try_start_261 .. :try_end_53e} :catchall_4f

    :goto_53e
    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_548
    iget-object v1, v1, Lj7/j$o;->J:Lj7/j$p;

    invoke-static {v0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_553

    invoke-virtual {v1, v2}, Lj7/j$p;->a(Ljava/lang/Throwable;)V

    :cond_553
    invoke-static {v0}, Lh8/q;->a(Ljava/lang/Object;)Lh8/q;

    goto/16 :goto_5e1

    :cond_558
    move-object v8, v0

    move-object v2, v3

    move-object v15, v4

    iget-object v0, v1, Lj7/j$o;->F:Lj7/j;

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    iget-object v3, v1, Lj7/j$o;->F:Lj7/j;

    invoke-virtual {v3}, Lj7/j;->u0()Lg3/x;

    move-result-object v3

    iget-object v4, v1, Lj7/j$o;->G:Landroid/app/Activity;

    invoke-static {v3, v4}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq6/b;->g(Ljava/lang/String;)V

    iget-object v0, v1, Lj7/j$o;->H:Landroid/service/wallpaper/IWallpaperEngine;

    if-eqz v0, :cond_5a2

    iget-object v2, v1, Lj7/j$o;->F:Lj7/j;

    iget v3, v1, Lj7/j$o;->I:I

    invoke-virtual {v2}, Lj7/j;->u0()Lg3/x;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.android.wallpaper.model.LiveWallpaperInfo"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lg3/k;

    const/16 v5, 0x8

    iput v5, v1, Lj7/j$o;->D:I

    invoke-static {v2, v4, v3, v0, v1}, Lj7/j;->R(Lj7/j;Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5a0

    goto :goto_5b6

    :cond_5a0
    :goto_5a0
    sget-object v0, Lh8/A;->a:Lh8/A;

    :cond_5a2
    iget-object v0, v1, Lj7/j$o;->F:Lj7/j;

    invoke-static {v0}, Lj7/j;->z(Lj7/j;)LD6/f;

    move-result-object v0

    invoke-interface {v0}, LD6/f;->S()LI8/f;

    move-result-object v0

    const/16 v2, 0x9

    iput v2, v1, Lj7/j$o;->D:I

    invoke-static {v0, v1}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5b7

    :goto_5b6
    return-object v8

    :cond_5b7
    :goto_5b7
    move-object v8, v0

    check-cast v8, Landroid/app/WallpaperColors;

    iget-object v0, v1, Lj7/j$o;->F:Lj7/j;

    iget v2, v1, Lj7/j$o;->I:I

    invoke-virtual {v8}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result v3

    invoke-static {v0, v2, v3}, Lj7/j;->P(Lj7/j;II)V

    iget-object v0, v1, Lj7/j$o;->F:Lj7/j;

    invoke-static {v0}, Lj7/j;->D(Lj7/j;)Lh3/a0;

    move-result-object v0

    iget-object v2, v1, Lj7/j$o;->G:Landroid/app/Activity;

    iget-object v3, v1, Lj7/j$o;->F:Lj7/j;

    invoke-virtual {v3}, Lj7/j;->u0()Lg3/x;

    move-result-object v3

    iget v5, v1, Lj7/j$o;->I:I

    const/4 v7, 0x0

    iget-object v9, v1, Lj7/j$o;->J:Lj7/j$p;

    const/4 v4, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lh3/a0;->u(Landroid/app/Activity;Lg3/x;Lcom/android/wallpaper/asset/a;IFLandroid/graphics/Rect;Landroid/app/WallpaperColors;Lh3/U$a;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    :goto_5e1
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :pswitch_data_5e4
    .packed-switch 0x0
        :pswitch_16e
        :pswitch_146
        :pswitch_103
        :pswitch_ca
        :pswitch_a6
        :pswitch_80
        :pswitch_52
        :pswitch_24
        :pswitch_1e
        :pswitch_17
    .end packed-switch
.end method
