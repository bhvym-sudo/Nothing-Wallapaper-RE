.class public final LP6/a$c;
.super LP6/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final r:Le3/l0;

.field final synthetic s:LP6/a;


# direct methods
.method public constructor <init>(LP6/a;Le3/l0;)V
    .registers 5

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP6/a$c;->s:LP6/a;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, LP6/a$a;-><init>(LP6/a;Landroid/view/View;)V

    iput-object p2, p0, LP6/a$c;->r:Le3/l0;

    return-void
.end method

.method public static synthetic e(Z)Landroid/os/Bundle;
    .registers 1

    invoke-static {p0}, LP6/a$c;->h(Z)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LP6/a$c;->i(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LP6/a;)Lh8/A;
    .registers 1

    invoke-static {p0}, LP6/a$c;->j(LP6/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Z)Landroid/os/Bundle;
    .registers 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "key_enable_cache"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final i(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;
    .registers 2

    invoke-virtual {p0, p1}, Lg3/v;->i(Landroid/app/WallpaperColors;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final j(LP6/a;)Lh8/A;
    .registers 1

    invoke-static {p0}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    :cond_9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public d(Ljava/lang/Integer;I)V
    .registers 25

    move-object/from16 v0, p0

    if-eqz p1, :cond_f

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, LP6/a$c;->r:Le3/l0;

    iget-object v2, v2, Le3/l0;->w:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_f
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LK1/p;

    iget-object v2, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v2}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lh3/V;->k(Landroid/content/Context;)Lh3/c;

    move-result-object v4

    invoke-virtual {v1}, Lh3/V;->i()Lg3/v;

    move-result-object v6

    iget-object v2, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v2}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lh3/V;->e(Landroid/content/Context;)LH3/k;

    move-result-object v2

    iget-object v3, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v3}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Landroid/app/WallpaperManager;->getInstance(Landroid/content/Context;)Landroid/app/WallpaperManager;

    move-result-object v7

    sget-object v3, Lv3/l;->a:Lv3/l;

    iget-object v3, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v3}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v9

    iget-object v3, v0, LP6/a$c;->r:Le3/l0;

    iget-object v3, v3, Le3/l0;->v:Landroid/view/View;

    const-string v5, "null cannot be cast to non-null type androidx.cardview.widget.CardView"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v3

    check-cast v10, Landroidx/cardview/widget/CardView;

    new-instance v11, Lx3/d;

    new-instance v12, LH3/q;

    iget-object v3, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v3}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v3

    const-string v5, ""

    invoke-direct {v12, v3, v5}, LH3/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v13, LP6/b;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, LP6/b;-><init>(Z)V

    new-instance v3, LP6/a$c$a;

    iget-object v5, v0, LP6/a$c;->s:LP6/a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, LP6/a$c$a;-><init>(Lh3/c;LP6/a;Lg3/v;Landroid/app/WallpaperManager;Lm8/e;)V

    new-instance v15, LP6/c;

    invoke-direct {v15, v6}, LP6/c;-><init>(Lg3/v;)V

    iget-object v4, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v4}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v1, v4}, LK1/p;->p(Landroid/content/Context;)Lt3/a;

    move-result-object v16

    sget-object v17, Lh3/d$a;->r:Lh3/d$a;

    move v1, v14

    move-object v14, v3

    invoke-direct/range {v11 .. v17}, Lx3/d;-><init>(LH3/q;Lv8/a;Lv8/p;Lv8/l;Lt3/a;Lh3/d$a;)V

    iget-object v3, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v3}, LP6/a;->e(LP6/a;)Landroidx/lifecycle/x;

    move-result-object v3

    iget-object v4, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v4}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v2, v4}, LH3/k;->o(Landroid/app/Activity;)Z

    move-result v15

    iget-object v2, v0, LP6/a$c;->s:LP6/a;

    new-instance v4, LP6/d;

    invoke-direct {v4, v2}, LP6/d;-><init>(LP6/a;)V

    const/16 v20, 0xd40

    const/16 v21, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v12, v1

    move-object/from16 v17, v4

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v3

    invoke-static/range {v8 .. v21}, Lv3/l;->n(Landroid/app/Activity;Landroidx/cardview/widget/CardView;Lx3/d;Landroidx/lifecycle/x;ZZZZZLv8/a;Landroid/view/SurfaceView;ZILjava/lang/Object;)Lv3/l$a;

    iget-object v1, v0, LP6/a$c;->r:Le3/l0;

    iget-object v1, v1, Le3/l0;->w:Landroid/widget/ImageView;

    iget-object v0, v0, LP6/a$c;->s:LP6/a;

    invoke-static {v0}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f13010d

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, p2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method
