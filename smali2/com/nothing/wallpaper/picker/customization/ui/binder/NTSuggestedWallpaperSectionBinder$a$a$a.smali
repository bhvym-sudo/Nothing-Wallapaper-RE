.class final Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Li7/g;

.field final synthetic s:Landroid/content/Context;

.field final synthetic t:Landroidx/fragment/app/v;

.field final synthetic u:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lm8/e;)V
    .registers 6

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->r:Li7/g;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->s:Landroid/content/Context;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->t:Landroidx/fragment/app/v;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->u:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->u(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)Lh8/A;
    .registers 4

    sget-object v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->a:Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;

    invoke-static {v0, p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->c(Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->r:Li7/g;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->s:Landroid/content/Context;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->t:Landroidx/fragment/app/v;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->u:Landroidx/recyclerview/widget/RecyclerView;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;-><init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->q:I

    if-nez v0, :cond_26

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->r:Li7/g;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->s:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->t:Landroidx/fragment/app/v;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->u:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;

    invoke-direct {v2, v1, p0}, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;-><init>(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1, v0, v2}, Li7/g;->h(Landroid/content/Context;Lv8/l;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_26
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
