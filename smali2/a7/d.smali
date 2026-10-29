.class public final La7/d;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La7/d$b;,
        La7/d$c;
    }
.end annotation


# static fields
.field public static final v:La7/d$b;

.field private static final w:I

.field private static final x:I


# instance fields
.field private final c:Landroid/app/Application;

.field private final d:Landroidx/lifecycle/Q;

.field private final e:Lh8/h;

.field private final f:Lh8/h;

.field private final g:Lh8/h;

.field private final h:LI8/O;

.field private final i:LI8/O;

.field private final j:LI8/O;

.field private final k:LI8/O;

.field private l:LF8/x0;

.field private m:Lcom/bumptech/glide/request/FutureTarget;

.field private n:J

.field private o:I

.field private p:J

.field private volatile q:Z

.field private volatile r:Landroid/graphics/Point;

.field private volatile s:I

.field private t:I

.field private u:LF8/x0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, La7/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La7/d$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, La7/d;->v:La7/d$b;

    const/16 v0, 0xa

    sput v0, La7/d;->w:I

    const/4 v0, 0x3

    sput v0, La7/d;->x:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/Q;)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, La7/d;->c:Landroid/app/Application;

    iput-object p2, p0, La7/d;->d:Landroidx/lifecycle/Q;

    new-instance p1, La7/a;

    invoke-direct {p1, p0}, La7/a;-><init>(La7/d;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, La7/d;->e:Lh8/h;

    new-instance p1, La7/b;

    invoke-direct {p1}, La7/b;-><init>()V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, La7/d;->f:Lh8/h;

    new-instance p1, La7/c;

    invoke-direct {p1, p0}, La7/c;-><init>(La7/d;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, La7/d;->g:Lh8/h;

    const-string p1, "key_ui_state"

    sget-object v0, La7/d$c$h;->v:La7/d$c$h;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object p1

    iput-object p1, p0, La7/d;->h:LI8/O;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "key_selected_style_position"

    invoke-virtual {p2, v1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v1

    iput-object v1, p0, La7/d;->i:LI8/O;

    const-string v1, "key_selected_subject_position"

    invoke-virtual {p2, v1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v1

    iput-object v1, p0, La7/d;->j:LI8/O;

    const-string v1, "key_selected_wallpaper_position"

    invoke-virtual {p2, v1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object p2

    iput-object p2, p0, La7/d;->k:LI8/O;

    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    iput-object p2, p0, La7/d;->r:Landroid/graphics/Point;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "init last state:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "NtCreativeViewModel"

    invoke-static {v0, p2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, La7/d$c$e;->v:La7/d$c$e;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_93

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, La7/d$a;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, La7/d$a;-><init>(La7/d;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_93
    return-void
.end method

.method public static final synthetic A(La7/d;Z)V
    .registers 2

    iput-boolean p1, p0, La7/d;->q:Z

    return-void
.end method

.method public static final synthetic B(La7/d;LX6/b;)V
    .registers 2

    invoke-direct {p0, p1}, La7/d;->D0(LX6/b;)V

    return-void
.end method

.method private final B0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_last_style_prompt"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic C(La7/d;ZLm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, La7/d;->I0(ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final C0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_last_subject_prompt"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final D(LX6/d$b;)V
    .registers 5

    invoke-virtual {p0, p1}, La7/d;->u0(LX6/d$b;)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v1, "key_history_invalid_wallpapers"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v2, 0x0

    if-nez v0, :cond_29

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    invoke-virtual {p0, v1, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_29
    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_34
    return-void
.end method

.method private final D0(LX6/b;)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_prompts"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final E(LX6/d$b;)V
    .registers 5

    invoke-virtual {p0, p1}, La7/d;->u0(LX6/d$b;)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v1, "key_history_wallpapers"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v2, 0x0

    if-nez v0, :cond_29

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    invoke-virtual {p0, v1, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_29
    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_34
    return-void
.end method

.method private final F(LX6/d;)V
    .registers 5

    iget-boolean v0, p0, La7/d;->q:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "attemptEmitWallpaperData "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, La7/d;->q:Z

    if-eqz v0, :cond_22

    const/4 v0, 0x0

    iput-boolean v0, p0, La7/d;->q:Z

    invoke-direct {p0, p1}, La7/d;->U(LX6/d;)V

    :cond_22
    return-void
.end method

.method private final G(LX6/d$b;Lm8/e;)Ljava/lang/Object;
    .registers 10

    instance-of v0, p2, La7/d$d;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, La7/d$d;

    iget v1, v0, La7/d$d;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, La7/d$d;->v:I

    goto :goto_18

    :cond_13
    new-instance v0, La7/d$d;

    invoke-direct {v0, p0, p2}, La7/d$d;-><init>(La7/d;Lm8/e;)V

    :goto_18
    iget-object p2, v0, La7/d$d;->t:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, La7/d$d;->v:I

    const-string v3, "NtCreativeViewModel"

    const/4 v4, 0x1

    if-eqz v2, :cond_41

    if-ne v2, v4, :cond_39

    iget-object p0, v0, La7/d$d;->s:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    iget-object p1, v0, La7/d$d;->r:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, La7/d$d;->q:Ljava/lang/Object;

    check-cast v2, La7/d;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, v2

    goto :goto_68

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_41
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    const-string p2, "attemptLoadImageToDisk"

    invoke-static {v3, p2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    iput p2, p0, La7/d;->t:I

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const/4 p2, 0x0

    if-eqz p1, :cond_5e

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object p1

    goto :goto_5f

    :cond_5e
    move-object p1, p2

    :goto_5f
    if-eqz p1, :cond_c7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_68

    goto :goto_c7

    :cond_68
    :goto_68
    if-nez p2, :cond_a5

    iget v2, p0, La7/d;->t:I

    sget v5, La7/d;->x:I

    if-ge v2, v5, :cond_a5

    iget-object v2, p0, La7/d;->l:LF8/x0;

    if-eqz v2, :cond_a5

    invoke-interface {v2}, LF8/x0;->a()Z

    move-result v2

    if-ne v2, v4, :cond_a5

    iget-object p2, p0, La7/d;->c:Landroid/app/Application;

    invoke-direct {p0, p2, p1}, La7/d;->S(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p2

    iget v2, p0, La7/d;->t:I

    add-int/2addr v2, v4

    iput v2, p0, La7/d;->t:I

    if-nez p2, :cond_68

    iget-object v2, p0, La7/d;->c:Landroid/app/Application;

    invoke-static {v2}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_a0

    iput-object p0, v0, La7/d$d;->q:Ljava/lang/Object;

    iput-object p1, v0, La7/d$d;->r:Ljava/lang/Object;

    iput-object p2, v0, La7/d$d;->s:Ljava/lang/Object;

    iput v4, v0, La7/d$d;->v:I

    const-wide/16 v5, 0x1f4

    invoke-static {v5, v6, v0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_68

    return-object v1

    :cond_a0
    const-string v0, "attemptLoadImageToDisk failed, network is not available!"

    invoke-static {v3, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a5
    iget-object v0, p0, La7/d;->l:LF8/x0;

    if-eqz v0, :cond_c7

    invoke-interface {v0}, LF8/x0;->a()Z

    move-result v0

    if-ne v0, v4, :cond_c7

    if-nez p2, :cond_b7

    const-string p0, "attemptLoadImageToDisk failed, image is null!"

    invoke-static {v3, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c7

    :cond_b7
    const-string v0, "attemptLoadImageToDisk, put to cache."

    invoke-static {v3, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LU6/e;->k(Ljava/lang/String;Landroid/graphics/Bitmap;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    :cond_c7
    :goto_c7
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final G0(LX6/d$b;)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_wait_to_emit_wallpaper"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic I(La7/d;ZILjava/lang/Object;)V
    .registers 4

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_5

    move p1, p3

    :cond_5
    invoke-virtual {p0, p1}, La7/d;->H(Z)V

    return-void
.end method

.method private final I0(ZLm8/e;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    new-instance v1, La7/d$o;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, La7/d$o;-><init>(ZLa7/d;Lm8/e;)V

    invoke-static {v0, v1, p2}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_15

    return-object p0

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final J()V
    .registers 3

    iget-object v0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v1, "key_history_wallpapers"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_26

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, La7/d;->P(Ljava/lang/String;)V

    goto :goto_12

    :cond_26
    iget-object v0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v1, "key_history_invalid_wallpapers"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_4c

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, La7/d;->P(Ljava/lang/String;)V

    goto :goto_38

    :cond_4c
    return-void
.end method

.method private final J0()V
    .registers 4

    new-instance v0, LX6/d$a;

    new-instance v1, Ljava/lang/Exception;

    sget-object v2, La7/d$c;->q:La7/d$c$a;

    invoke-virtual {v2}, La7/d$c$a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LX6/d$a;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, v0}, La7/d;->U(LX6/d;)V

    const/4 v0, 0x0

    iput v0, p0, La7/d;->o:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La7/d;->p:J

    iput-boolean v0, p0, La7/d;->q:Z

    return-void
.end method

.method private final K0(LX6/d;)V
    .registers 18

    move-object/from16 v0, p1

    instance-of v1, v0, LX6/d$b;

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_50

    check-cast v0, LX6/d$b;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, La7/d;->u0(LX6/d$b;)Z

    move-result v0

    if-eqz v0, :cond_31

    sget-object v4, LR7/d;->r:LR7/d;

    invoke-direct {v1}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v5

    move-wide v6, v5

    goto :goto_21

    :cond_20
    move-wide v6, v2

    :goto_21
    invoke-direct {v1}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v2

    :cond_2b
    move-wide v8, v2

    const/4 v5, 0x4

    invoke-virtual/range {v4 .. v9}, LR7/d;->b(IJJ)V

    return-void

    :cond_31
    sget-object v10, LR7/d;->r:LR7/d;

    invoke-direct {v1}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v4

    move-wide v11, v4

    goto :goto_40

    :cond_3f
    move-wide v11, v2

    :goto_40
    invoke-direct {v1}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_4a

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v2

    :cond_4a
    move-wide v13, v2

    const/4 v15, 0x3

    invoke-virtual/range {v10 .. v15}, LR7/d;->a(JJI)V

    return-void

    :cond_50
    move-object/from16 v1, p0

    instance-of v4, v0, LX6/d$a;

    if-eqz v4, :cond_cf

    check-cast v0, LX6/d$a;

    invoke-virtual {v0}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    sget-object v5, La7/d$c;->q:La7/d$c$a;

    invoke-virtual {v5}, La7/d$c$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_6f

    const/4 v4, 0x1

    goto :goto_94

    :cond_6f
    invoke-virtual {v5}, La7/d$c$a;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7b

    const/4 v4, 0x2

    goto :goto_94

    :cond_7b
    invoke-virtual {v5}, La7/d$c$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_87

    const/4 v4, 0x7

    goto :goto_94

    :cond_87
    invoke-virtual {v5}, La7/d$c$a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_93

    move v4, v7

    goto :goto_94

    :cond_93
    const/4 v4, 0x5

    :goto_94
    sget-object v5, La7/d;->v:La7/d$b;

    invoke-virtual {v0}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v6

    invoke-virtual {v5, v6}, La7/d$b;->c(Ljava/lang/Exception;)Z

    move-result v6

    if-eqz v6, :cond_a3

    const/4 v4, 0x6

    :cond_a1
    :goto_a1
    move v13, v4

    goto :goto_b0

    :cond_a3
    invoke-virtual {v0}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {v5, v0}, La7/d$b;->d(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_a1

    const/16 v4, 0x8

    goto :goto_a1

    :goto_b0
    if-eq v13, v7, :cond_cf

    sget-object v8, LR7/d;->r:LR7/d;

    invoke-direct {v1}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_c0

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_c1

    :cond_c0
    move-wide v9, v2

    :goto_c1
    invoke-direct {v1}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_cb

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v2

    :cond_cb
    move-wide v11, v2

    invoke-virtual/range {v8 .. v13}, LR7/d;->a(JJI)V

    :cond_cf
    return-void
.end method

.method private final L(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)Z
    .registers 4

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object p0

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LV6/a;->k(J)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method private static final L0(La7/d;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, La7/d;->c:Landroid/app/Application;

    invoke-static {p0}, Li6/e;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final M(LX6/d$b;)V
    .registers 3

    invoke-virtual {p0, p1}, La7/d;->u0(LX6/d$b;)Z

    move-result p1

    if-nez p1, :cond_27

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    if-eqz p1, :cond_27

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    if-eqz p1, :cond_27

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object p1

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p0}, LV6/a;->q(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)I

    :cond_27
    return-void
.end method

.method private final N(LX6/d;Lm8/e;)Ljava/lang/Object;
    .registers 13

    instance-of v0, p2, La7/d$h;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, La7/d$h;

    iget v1, v0, La7/d$h;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, La7/d$h;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, La7/d$h;

    invoke-direct {v0, p0, p2}, La7/d$h;-><init>(La7/d;Lm8/e;)V

    :goto_18
    iget-object p2, v0, La7/d$h;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, La7/d$h;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3a

    if-ne v2, v3, :cond_32

    iget-object p0, v0, La7/d$h;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LX6/d;

    iget-object p0, v0, La7/d$h;->q:Ljava/lang/Object;

    check-cast p0, La7/d;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_8b

    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3a
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, La7/d;->n:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xbb8

    cmp-long p2, v4, v6

    if-gez p2, :cond_8f

    new-instance p2, Ljava/security/SecureRandom;

    invoke-direct {p2}, Ljava/security/SecureRandom;-><init>()V

    const-wide/16 v8, 0x1b58

    sub-long/2addr v8, v4

    long-to-int v2, v8

    invoke-virtual {p2, v2}, Ljava/util/Random;->nextInt(I)I

    move-result p2

    int-to-long v8, p2

    add-long/2addr v8, v4

    cmp-long v2, v8, v6

    if-gez v2, :cond_7d

    add-int/lit16 p2, p2, 0xbb8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkSpendTime spendTime:"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " waitTime:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "NtCreativeViewModel"

    invoke-static {v4, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7d
    int-to-long v4, p2

    iput-object p0, v0, La7/d$h;->q:Ljava/lang/Object;

    iput-object p1, v0, La7/d$h;->r:Ljava/lang/Object;

    iput v3, v0, La7/d$h;->u:I

    invoke-static {v4, v5, v0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8b

    return-object v1

    :cond_8b
    :goto_8b
    invoke-direct {p0, p1}, La7/d;->F(LX6/d;)V

    goto :goto_92

    :cond_8f
    invoke-direct {p0, p1}, La7/d;->F(LX6/d;)V

    :goto_92
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final O()V
    .registers 5

    invoke-direct {p0}, La7/d;->r0()LX6/d$b;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-virtual {v0}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-static {v0}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    if-eqz v0, :cond_41

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object v1

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkWaitToEmitWallpaper delete "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NtCreativeViewModel"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object v1

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LU6/e;->d(Ljava/lang/String;)V

    :cond_41
    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/d;->G0(LX6/d$b;)V

    return-void
.end method

.method private final P(Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LV6/a;->l(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object v0

    if-nez v0, :cond_2f

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object v0

    invoke-virtual {v0, p1}, LU6/e;->d(Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object p0

    invoke-virtual {p0}, LU6/e;->h()I

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Delete useless image cache file. "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "NtCreativeViewModel"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2f
    return-void
.end method

.method private static final R()LU6/e;
    .registers 1

    sget-object v0, LU6/e;->c:LU6/e$a;

    invoke-virtual {v0}, LU6/e$a;->b()LU6/e;

    move-result-object v0

    return-object v0
.end method

.method private final S(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .registers 6

    const/4 v0, 0x0

    if-eqz p2, :cond_50

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_a

    goto :goto_50

    :cond_a
    :try_start_a
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    const/high16 p2, -0x80000000

    invoke-virtual {p1, p2, p2}, Lcom/bumptech/glide/RequestBuilder;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object p1

    iput-object p1, p0, La7/d;->m:Lcom/bumptech/glide/request/FutureTarget;

    if-eqz p1, :cond_4c

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_26} :catch_27

    goto :goto_4d

    :catch_27
    move-exception p1

    iget p2, p0, La7/d;->t:I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadWallpaper failed, count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " msg:"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NtCreativeViewModel"

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4c
    move-object p1, v0

    :goto_4d
    iput-object v0, p0, La7/d;->m:Lcom/bumptech/glide/request/FutureTarget;

    return-object p1

    :cond_50
    :goto_50
    return-object v0
.end method

.method private final T(La7/d$c;)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_ui_state"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final U(LX6/d;)V
    .registers 10

    invoke-direct {p0}, La7/d;->r0()LX6/d$b;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "NtCreativeViewModel"

    if-eqz v0, :cond_15

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/d;->G0(LX6/d$b;)V

    const-string v0, "emitWallpaperData waitToEmitWallpaper set to null"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    iget-object v0, p0, La7/d;->c:Landroid/app/Application;

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8c

    instance-of v0, p1, LX6/d$b;

    if-eqz v0, :cond_80

    move-object v0, p1

    check-cast v0, LX6/d$b;

    invoke-virtual {p0, v0}, La7/d;->u0(LX6/d$b;)Z

    move-result v1

    if-eqz v1, :cond_80

    invoke-virtual {v0}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const/4 v2, 0x0

    if-eqz v1, :cond_50

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_50

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object v3

    invoke-virtual {v3, v1}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    if-eqz v1, :cond_4e

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_4f

    :cond_4e
    move v2, v3

    :cond_4f
    xor-int/2addr v2, v3

    :cond_50
    if-eqz v2, :cond_61

    invoke-direct {p0, v0}, La7/d;->E(LX6/d$b;)V

    new-instance v0, La7/d$c$b;

    invoke-direct {v0, p1}, La7/d$c$b;-><init>(LX6/d;)V

    invoke-direct {p0, v0}, La7/d;->T(La7/d$c;)V

    invoke-direct {p0, p1}, La7/d;->K0(LX6/d;)V

    return-void

    :cond_61
    invoke-direct {p0, v0}, La7/d;->D(LX6/d$b;)V

    new-instance p1, LX6/d$a;

    new-instance v0, Ljava/lang/Exception;

    sget-object v1, La7/d$c;->q:La7/d$c$a;

    invoke-virtual {v1}, La7/d$c$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, LX6/d$a;-><init>(Ljava/lang/Exception;)V

    new-instance v0, La7/d$c$b;

    invoke-direct {v0, p1}, La7/d$c$b;-><init>(LX6/d;)V

    invoke-direct {p0, v0}, La7/d;->T(La7/d$c;)V

    invoke-direct {p0, p1}, La7/d;->K0(LX6/d;)V

    return-void

    :cond_80
    new-instance v0, La7/d$c$b;

    invoke-direct {v0, p1}, La7/d$c$b;-><init>(LX6/d;)V

    invoke-direct {p0, v0}, La7/d;->T(La7/d$c;)V

    invoke-direct {p0, p1}, La7/d;->K0(LX6/d;)V

    return-void

    :cond_8c
    const-string v0, "emitWallpaperData no network"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, p1, LX6/d$b;

    if-eqz v0, :cond_9a

    check-cast p1, LX6/d$b;

    invoke-direct {p0, p1}, La7/d;->D(LX6/d$b;)V

    :cond_9a
    sget-object p1, La7/d$c$c;->v:La7/d$c$c;

    invoke-direct {p0, p1}, La7/d;->T(La7/d$c;)V

    sget-object v0, LR7/d;->r:LR7/d;

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_ae

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v3

    goto :goto_af

    :cond_ae
    move-wide v3, v1

    :goto_af
    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    if-eqz p0, :cond_b9

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    :cond_b9
    const/4 v5, 0x4

    move-wide v6, v3

    move-wide v3, v1

    move-wide v1, v6

    invoke-virtual/range {v0 .. v5}, LR7/d;->a(JJI)V

    return-void
.end method

.method private final V(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;La7/d$c;Z)V
    .registers 15

    const-string v0, "generateWallpaper"

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, La7/d;->q:Z

    if-nez v0, :cond_44

    iget-object v0, p0, La7/d;->l:LF8/x0;

    if-eqz v0, :cond_16

    invoke-interface {v0}, LF8/x0;->O0()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_44

    :cond_16
    const/4 v0, 0x0

    iput v0, p0, La7/d;->o:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La7/d;->p:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La7/d;->n:J

    invoke-direct {p0, p2}, La7/d;->B0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;)V

    invoke-direct {p0, p1}, La7/d;->C0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    new-instance v3, La7/d$i;

    const/4 v9, 0x0

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    move-object v5, p3

    move v8, p4

    invoke-direct/range {v3 .. v9}, La7/d$i;-><init>(La7/d;La7/d$c;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ZLm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, La7/d;->l:LF8/x0;

    return-void

    :cond_44
    :goto_44
    const-string p0, "generateWallpaper already started!"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final X(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;
    .registers 24

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, La7/d$j;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, La7/d$j;

    iget v3, v2, La7/d$j;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_18

    sub-int/2addr v3, v4

    iput v3, v2, La7/d$j;->y:I

    :goto_16
    move-object v8, v2

    goto :goto_1e

    :cond_18
    new-instance v2, La7/d$j;

    invoke-direct {v2, v0, v1}, La7/d$j;-><init>(La7/d;Lm8/e;)V

    goto :goto_16

    :goto_1e
    iget-object v1, v8, La7/d$j;->w:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v8, La7/d$j;->y:I

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v14, "NtCreativeViewModel"

    const/4 v15, 0x1

    const/4 v4, 0x0

    if-eqz v3, :cond_9c

    if-eq v3, v15, :cond_85

    if-eq v3, v12, :cond_68

    if-eq v3, v11, :cond_56

    if-eq v3, v10, :cond_48

    if-ne v3, v9, :cond_40

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_1fe

    :cond_40
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    iget-object v0, v8, La7/d$j;->r:Ljava/lang/Object;

    check-cast v0, LX6/d;

    iget-object v3, v8, La7/d$j;->q:Ljava/lang/Object;

    check-cast v3, La7/d;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v1, v4

    goto/16 :goto_1e5

    :cond_56
    iget-boolean v0, v8, La7/d$j;->v:Z

    iget v3, v8, La7/d$j;->u:I

    iget-object v5, v8, La7/d$j;->r:Ljava/lang/Object;

    check-cast v5, LX6/d;

    iget-object v6, v8, La7/d$j;->q:Ljava/lang/Object;

    check-cast v6, La7/d;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v1, v4

    goto/16 :goto_1a2

    :cond_68
    iget-boolean v0, v8, La7/d$j;->v:Z

    iget v3, v8, La7/d$j;->u:I

    iget-object v5, v8, La7/d$j;->t:Ljava/lang/Object;

    check-cast v5, LX6/d;

    iget-object v6, v8, La7/d$j;->s:Ljava/lang/Object;

    check-cast v6, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v7, v8, La7/d$j;->r:Ljava/lang/Object;

    check-cast v7, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v12, v8, La7/d$j;->q:Ljava/lang/Object;

    check-cast v12, La7/d;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v1, v4

    move-object v4, v6

    move-object v9, v7

    move-object v6, v12

    goto/16 :goto_161

    :cond_85
    iget-object v0, v8, La7/d$j;->s:Ljava/lang/Object;

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v3, v8, La7/d$j;->r:Ljava/lang/Object;

    check-cast v3, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v5, v8, La7/d$j;->q:Ljava/lang/Object;

    check-cast v5, La7/d;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object/from16 v18, v4

    move-object v4, v0

    move-object v0, v5

    move-object v5, v1

    move-object/from16 v1, v18

    goto :goto_d4

    :cond_9c
    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean v1, v0, La7/d;->q:Z

    if-nez v1, :cond_ab

    const-string v0, "generateWallpaperReally job canceled"

    invoke-static {v14, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_ab
    const-string v1, "generateWallpaperReally"

    invoke-static {v14, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0}, La7/d;->m0()LV6/a;

    move-result-object v3

    move-object v1, v4

    invoke-direct {v0}, La7/d;->q0()Ljava/lang/String;

    move-result-object v4

    iput-object v0, v8, La7/d$j;->q:Ljava/lang/Object;

    move-object/from16 v5, p1

    iput-object v5, v8, La7/d$j;->r:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v8, La7/d$j;->s:Ljava/lang/Object;

    iput v15, v8, La7/d$j;->y:I

    move/from16 v7, p3

    invoke-virtual/range {v3 .. v8}, LV6/a;->g(Ljava/lang/String;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_cf

    goto/16 :goto_1fd

    :cond_cf
    move-object/from16 v4, p2

    move-object v5, v3

    move-object/from16 v3, p1

    :goto_d4
    check-cast v5, LX6/d;

    instance-of v6, v5, LX6/d$b;

    if-eqz v6, :cond_1b9

    move-object v6, v5

    check-cast v6, LX6/d$b;

    invoke-virtual {v6}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1b9

    invoke-virtual {v6}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-direct {v0, v6}, La7/d;->L(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)Z

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "generateWallpaper repeat:"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v14, v7}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v6, :cond_1b6

    iget-wide v10, v0, La7/d;->p:J

    const-wide/16 v16, 0x0

    cmp-long v10, v10, v16

    if-nez v10, :cond_11b

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    iput-wide v10, v0, La7/d;->p:J

    :cond_11b
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    move-wide/from16 p1, v10

    iget-wide v9, v0, La7/d;->p:J

    sub-long v10, p1, v9

    const-wide/16 v16, 0x2710

    cmp-long v9, v10, v16

    if-gez v9, :cond_1af

    iget v9, v0, La7/d;->o:I

    add-int/2addr v9, v15

    iput v9, v0, La7/d;->o:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "generateWallpaperReally count:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v14, v9}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v8, La7/d$j;->q:Ljava/lang/Object;

    iput-object v3, v8, La7/d$j;->r:Ljava/lang/Object;

    iput-object v4, v8, La7/d$j;->s:Ljava/lang/Object;

    iput-object v5, v8, La7/d$j;->t:Ljava/lang/Object;

    iput v13, v8, La7/d$j;->u:I

    iput-boolean v6, v8, La7/d$j;->v:Z

    iput v12, v8, La7/d$j;->y:I

    const-wide/16 v9, 0x7d0

    invoke-static {v9, v10, v8}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_15c

    goto/16 :goto_1fd

    :cond_15c
    move v9, v6

    move-object v6, v0

    move v0, v9

    move-object v9, v3

    move v3, v13

    :goto_161
    invoke-direct {v6}, La7/d;->m0()LV6/a;

    move-result-object v10

    invoke-direct {v6}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v6}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v7, v6, La7/d;->r:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    invoke-virtual {v10, v11, v12, v7}, LV6/a;->t(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;I)I

    invoke-direct {v6, v9, v4, v13}, La7/d;->Z(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)I

    move-result v7

    iget v10, v6, La7/d;->s:I

    if-ne v7, v10, :cond_18b

    const-string v4, "generateWallpaperReally It\'s a loop now"

    invoke-static {v14, v4}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v6}, La7/d;->J0()V

    goto :goto_1a2

    :cond_18b
    iput-object v6, v8, La7/d$j;->q:Ljava/lang/Object;

    iput-object v5, v8, La7/d$j;->r:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->s:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->t:Ljava/lang/Object;

    iput v3, v8, La7/d$j;->u:I

    iput-boolean v0, v8, La7/d$j;->v:Z

    const/4 v10, 0x3

    iput v10, v8, La7/d$j;->y:I

    invoke-direct {v6, v9, v4, v7, v8}, La7/d;->X(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1a2

    goto/16 :goto_1fd

    :cond_1a2
    :goto_1a2
    iget v4, v6, La7/d;->o:I

    if-ne v4, v15, :cond_1ac

    iget-object v4, v6, La7/d;->r:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    iput v4, v6, La7/d;->s:I

    :cond_1ac
    move v4, v0

    :goto_1ad
    move-object v0, v5

    goto :goto_1bd

    :cond_1af
    invoke-direct {v0}, La7/d;->J0()V

    move v4, v6

    move v3, v15

    :goto_1b4
    move-object v6, v0

    goto :goto_1ad

    :cond_1b6
    move v4, v6

    move v3, v13

    goto :goto_1b4

    :cond_1b9
    move-object v6, v0

    move-object v0, v5

    move v3, v13

    move v4, v3

    :goto_1bd
    xor-int/2addr v4, v15

    if-nez v3, :cond_1c1

    move v13, v15

    :cond_1c1
    and-int v3, v4, v13

    iget-boolean v4, v6, La7/d;->q:Z

    and-int/2addr v3, v4

    if-eqz v3, :cond_201

    instance-of v3, v0, LX6/d$b;

    if-eqz v3, :cond_1ec

    move-object v3, v0

    check-cast v3, LX6/d$b;

    invoke-direct {v6, v3}, La7/d;->G0(LX6/d$b;)V

    iput-object v6, v8, La7/d$j;->q:Ljava/lang/Object;

    iput-object v0, v8, La7/d$j;->r:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->s:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->t:Ljava/lang/Object;

    const/4 v7, 0x4

    iput v7, v8, La7/d$j;->y:I

    invoke-direct {v6, v3, v8}, La7/d;->G(LX6/d$b;Lm8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1e4

    goto :goto_1fd

    :cond_1e4
    move-object v3, v6

    :goto_1e5
    move-object v4, v0

    check-cast v4, LX6/d$b;

    invoke-direct {v3, v4}, La7/d;->M(LX6/d$b;)V

    move-object v6, v3

    :cond_1ec
    iput-object v1, v8, La7/d$j;->q:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->r:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->s:Ljava/lang/Object;

    iput-object v1, v8, La7/d$j;->t:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v8, La7/d$j;->y:I

    invoke-direct {v6, v0, v8}, La7/d;->N(LX6/d;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1fe

    :goto_1fd
    return-object v2

    :cond_1fe
    :goto_1fe
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_201
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method private final Y()LU6/e;
    .registers 1

    iget-object p0, p0, La7/d;->f:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LU6/e;

    return-object p0
.end method

.method private final Z(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)I
    .registers 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getGenerateIndex updateRequestIndex:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_1f

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, LV6/a;->q(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)I

    :cond_1f
    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, LV6/a;->n(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)Landroid/graphics/Point;

    move-result-object p1

    iget-object p0, p0, La7/d;->r:Landroid/graphics/Point;

    iget p2, p1, Landroid/graphics/Point;->x:I

    iget p3, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p2, p3}, Landroid/graphics/Point;->set(II)V

    iget p0, p1, Landroid/graphics/Point;->y:I

    return p0
.end method

.method private final d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 2

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_last_style_prompt"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    return-object p0
.end method

.method private final e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 2

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_last_subject_prompt"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    return-object p0
.end method

.method public static synthetic f(La7/d;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, La7/d;->L0(La7/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()LU6/e;
    .registers 1

    invoke-static {}, La7/d;->R()LU6/e;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(La7/d;)LV6/a;
    .registers 1

    invoke-static {p0}, La7/d;->y0(La7/d;)LV6/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(La7/d;LX6/d$b;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, La7/d;->G(LX6/d$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(La7/d;ZLjava/lang/String;ILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2}, La7/d;->h0(ZLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic j(La7/d;)V
    .registers 1

    invoke-direct {p0}, La7/d;->J()V

    return-void
.end method

.method public static final synthetic k(La7/d;LX6/d;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, La7/d;->N(LX6/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final k0()LX6/b;
    .registers 2

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_prompts"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LX6/b;

    return-object p0
.end method

.method public static final synthetic l(La7/d;)V
    .registers 1

    invoke-direct {p0}, La7/d;->O()V

    return-void
.end method

.method public static final synthetic m(La7/d;La7/d$c;)V
    .registers 2

    invoke-direct {p0, p1}, La7/d;->T(La7/d$c;)V

    return-void
.end method

.method private final m0()LV6/a;
    .registers 1

    iget-object p0, p0, La7/d;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LV6/a;

    return-object p0
.end method

.method public static final synthetic n(La7/d;LX6/d;)V
    .registers 2

    invoke-direct {p0, p1}, La7/d;->U(LX6/d;)V

    return-void
.end method

.method public static final synthetic o(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, La7/d;->X(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(La7/d;)Landroid/app/Application;
    .registers 1

    iget-object p0, p0, La7/d;->c:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic q(La7/d;)LU6/e;
    .registers 1

    invoke-direct {p0}, La7/d;->Y()LU6/e;

    move-result-object p0

    return-object p0
.end method

.method private final q0()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, La7/d;->g:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic r(La7/d;)Lcom/bumptech/glide/request/FutureTarget;
    .registers 1

    iget-object p0, p0, La7/d;->m:Lcom/bumptech/glide/request/FutureTarget;

    return-object p0
.end method

.method private final r0()LX6/d$b;
    .registers 2

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_wait_to_emit_wallpaper"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LX6/d$b;

    return-object p0
.end method

.method public static final synthetic s(La7/d;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)I
    .registers 4

    invoke-direct {p0, p1, p2, p3}, La7/d;->Z(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)I

    move-result p0

    return p0
.end method

.method public static final synthetic t(La7/d;)LF8/x0;
    .registers 1

    iget-object p0, p0, La7/d;->l:LF8/x0;

    return-object p0
.end method

.method public static final synthetic u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 1

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 1

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w()I
    .registers 1

    sget v0, La7/d;->w:I

    return v0
.end method

.method public static final synthetic x(La7/d;)LX6/b;
    .registers 1

    invoke-direct {p0}, La7/d;->k0()LX6/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(La7/d;)LV6/a;
    .registers 1

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(La7/d;)LV6/a;
    .registers 5

    sget-object v0, LV6/a;->e:LV6/a$a;

    sget-object v1, Lcom/nothing/wallpaper/db/WallpaperDatabase;->p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    iget-object v2, p0, La7/d;->c:Landroid/app/Application;

    invoke-virtual {v1, v2}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;->b(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->D()Lu6/a;

    move-result-object v2

    iget-object v3, p0, La7/d;->c:Landroid/app/Application;

    invoke-virtual {v1, v3}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;->b(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->E()Lu6/c;

    move-result-object v1

    new-instance v3, Lcom/nothing/wallpaper/picker/creative/network/a;

    iget-object p0, p0, La7/d;->c:Landroid/app/Application;

    invoke-direct {v3, p0}, Lcom/nothing/wallpaper/picker/creative/network/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2, v1, v3}, LV6/a$a;->a(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;)LV6/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(La7/d;)Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, La7/d;->r:Landroid/graphics/Point;

    return-object p0
.end method


# virtual methods
.method public final A0(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)V
    .registers 9

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    new-instance v4, La7/d$n;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, La7/d$n;-><init>(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;La7/d;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final E0(I)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "key_selected_style_position"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final F0(I)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "key_selected_subject_position"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final H(Z)V
    .registers 15

    iget-boolean v0, p0, La7/d;->q:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cancelGenerateWallpaper "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, La7/d;->q:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, La7/d;->q:Z

    and-int/2addr p1, v0

    const/4 v0, 0x0

    if-eqz p1, :cond_31

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v4, La7/d$e;

    invoke-direct {v4, p0, v0}, La7/d$e;-><init>(La7/d;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_31
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v7

    new-instance v10, La7/d$f;

    invoke-direct {v10, p0, v0}, La7/d$f;-><init>(La7/d;Lm8/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final H0(I)V
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "key_selected_wallpaper_position"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final K()V
    .registers 7

    sget-object v0, LF8/r0;->q:LF8/r0;

    new-instance v3, La7/d$g;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, La7/d$g;-><init>(La7/d;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final Q()V
    .registers 2

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_history_wallpapers"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_f

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_f
    return-void
.end method

.method public final W(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)V
    .registers 5

    if-eqz p1, :cond_9

    if-eqz p2, :cond_9

    sget-object v0, La7/d$c$e;->v:La7/d$c$e;

    invoke-direct {p0, p1, p2, v0, p3}, La7/d;->V(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;La7/d$c;Z)V

    :cond_9
    return-void
.end method

.method public final a0()Ljava/util/List;
    .registers 3

    iget-object p0, p0, La7/d;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_history_wallpapers"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-nez p0, :cond_11

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :cond_11
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    sget v1, La7/d;->w:I

    if-le v0, v1, :cond_20

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v1}, Li8/s;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final b0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 1

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    return-object p0
.end method

.method public final c0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;
    .registers 1

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    return-object p0
.end method

.method protected d()V
    .registers 1

    invoke-super {p0}, Landroidx/lifecycle/a0;->d()V

    invoke-virtual {p0}, La7/d;->K()V

    return-void
.end method

.method public final f0()Ljava/util/List;
    .registers 3

    invoke-direct {p0}, La7/d;->k0()LX6/b;

    move-result-object p0

    if-eqz p0, :cond_2d

    instance-of v0, p0, LX6/b$b;

    if-eqz v0, :cond_2d

    check-cast p0, LX6/b$b;

    invoke-virtual {p0}, LX6/b$b;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    invoke-static {v0}, LX6/a;->a(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final g0()Ljava/util/List;
    .registers 3

    invoke-direct {p0}, La7/d;->k0()LX6/b;

    move-result-object p0

    if-eqz p0, :cond_2d

    instance-of v0, p0, LX6/b$b;

    if-eqz v0, :cond_2d

    check-cast p0, LX6/b$b;

    invoke-virtual {p0}, LX6/b$b;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    invoke-static {v0}, LX6/a;->b(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final h0(ZLjava/lang/String;)V
    .registers 11

    const-string v0, "language"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getPromptList "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    new-instance v5, La7/d$k;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, p2, v0}, La7/d$k;-><init>(La7/d;ZLjava/lang/String;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final j0(Ljava/lang/String;)V
    .registers 5

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La7/d;->h:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPromptListForInit uiState:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NtCreativeViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, La7/d;->h:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La7/d$c$h;->v:La7/d$c$h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, La7/d;->i0(La7/d;ZLjava/lang/String;ILjava/lang/Object;)V

    :cond_35
    return-void
.end method

.method public final l0()Ljava/lang/String;
    .registers 4

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_c
    move-object v0, v1

    :goto_d
    if-eqz v0, :cond_23

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_16

    goto :goto_23

    :cond_16
    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v0

    goto :goto_2d

    :cond_21
    move-object v0, v1

    goto :goto_2d

    :cond_23
    :goto_23
    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object v0

    :goto_2d
    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v2

    if-eqz v2, :cond_38

    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v2

    goto :goto_39

    :cond_38
    move-object v2, v1

    :goto_39
    if-eqz v2, :cond_4d

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_42

    goto :goto_4d

    :cond_42
    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    if-eqz p0, :cond_57

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v1

    goto :goto_57

    :cond_4d
    :goto_4d
    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    if-eqz p0, :cond_57

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object v1

    :cond_57
    :goto_57
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " + "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final n0()LI8/O;
    .registers 1

    iget-object p0, p0, La7/d;->i:LI8/O;

    return-object p0
.end method

.method public final o0()LI8/O;
    .registers 1

    iget-object p0, p0, La7/d;->j:LI8/O;

    return-object p0
.end method

.method public final p0()LI8/O;
    .registers 1

    iget-object p0, p0, La7/d;->h:LI8/O;

    return-object p0
.end method

.method public final s0(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)LJ6/i;
    .registers 12

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->m0()LV6/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LV6/a;->k(J)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object v0

    if-eqz v0, :cond_47

    iget-object v1, p0, La7/d;->c:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1301f2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v1, "getString(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LJ6/i;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    sget-object v1, LJ6/i;->F:LJ6/i$a;

    iget-object p0, p0, La7/d;->c:Landroid/app/Application;

    invoke-virtual {v1, p0}, LJ6/i$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v0}, LJ6/i$a;->f(Lcom/nothing/wallpaper/db/CreativeWallpaper;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, LJ6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_47
    const/4 p0, 0x0

    return-object p0
.end method

.method public final t0()LI8/O;
    .registers 1

    iget-object p0, p0, La7/d;->k:LI8/O;

    return-object p0
.end method

.method public final u0(LX6/d$b;)Z
    .registers 4

    const/4 p0, 0x0

    if-eqz p1, :cond_2c

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2c

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-ne v0, v1, :cond_2c

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    if-eqz p1, :cond_2c

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2c

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_2c

    return v1

    :cond_2c
    return p0
.end method

.method public final v0(Ljava/lang/String;)V
    .registers 8

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_3a

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-nez v0, :cond_12

    goto :goto_3a

    :cond_12
    iget-object v0, p0, La7/d;->u:LF8/x0;

    if-eqz v0, :cond_24

    invoke-interface {v0}, LF8/x0;->O0()Z

    move-result v0

    if-nez v0, :cond_24

    const-string p0, "NtCreativeViewModel"

    const-string p1, "onWallpaperDownload already downloading!"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_24
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, La7/d$l;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, La7/d$l;-><init>(La7/d;Ljava/lang/String;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, La7/d;->u:LF8/x0;

    :cond_3a
    :goto_3a
    return-void
.end method

.method public final w0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)V
    .registers 5

    const-string v0, "subjectPrompt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La7/d$c$d;->v:La7/d$c$d;

    invoke-direct {p0, p1, p2, v0, p3}, La7/d;->V(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;La7/d$c;Z)V

    return-void
.end method

.method public final x0()V
    .registers 10

    const-string v0, "NtCreativeViewModel"

    const-string v1, "regenerateWallpaper"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, La7/d;->W(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)V

    sget-object v3, LR7/d;->r:LR7/d;

    invoke-direct {p0}, La7/d;->e0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v4

    move-wide v5, v4

    goto :goto_30

    :cond_2f
    move-wide v5, v1

    :goto_30
    invoke-direct {p0}, La7/d;->d0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    if-eqz p0, :cond_3a

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    :cond_3a
    move-wide v7, v1

    const/4 v4, 0x2

    invoke-virtual/range {v3 .. v8}, LR7/d;->b(IJJ)V

    :cond_3f
    return-void
.end method

.method public final z0()V
    .registers 9

    const-string v0, "NtCreativeViewModel"

    const-string v1, "restorePromptUiState"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    new-instance v5, La7/d$m;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, La7/d$m;-><init>(La7/d;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
