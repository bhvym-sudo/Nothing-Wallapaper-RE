.class final Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Li7/g;

.field final synthetic t:Landroid/content/Context;

.field final synthetic u:Landroidx/fragment/app/v;

.field final synthetic v:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic w:Lcom/nothing/wallpaper/widget/MoreGuideView;


# direct methods
.method constructor <init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V
    .registers 7

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->s:Li7/g;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->t:Landroid/content/Context;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->u:Landroidx/fragment/app/v;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->s:Li7/g;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->t:Landroid/content/Context;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->u:Landroidx/fragment/app/v;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;-><init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->q:I

    if-nez v0, :cond_34

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v1, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->s:Li7/g;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->t:Landroid/content/Context;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->u:Landroidx/fragment/app/v;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;-><init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v3, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$b;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->s:Li7/g;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-direct {v3, p1, p0, v1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$b;-><init>(Li7/g;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
