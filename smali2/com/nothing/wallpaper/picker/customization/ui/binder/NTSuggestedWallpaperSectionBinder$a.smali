.class final Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->d(Landroidx/fragment/app/v;Landroid/content/Context;Landroid/view/View;Li7/g;Landroidx/lifecycle/x;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:Li7/g;

.field final synthetic t:Landroid/content/Context;

.field final synthetic u:Landroidx/fragment/app/v;

.field final synthetic v:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic w:Lcom/nothing/wallpaper/widget/MoreGuideView;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V
    .registers 8

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->s:Li7/g;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->t:Landroid/content/Context;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->u:Landroidx/fragment/app/v;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p6, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 11

    new-instance v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->r:Landroidx/lifecycle/x;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->s:Li7/g;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->t:Landroid/content/Context;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->u:Landroidx/fragment/app/v;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;-><init>(Landroidx/lifecycle/x;Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_37

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->r:Landroidx/lifecycle/x;

    sget-object v1, Landroidx/lifecycle/q$b;->t:Landroidx/lifecycle/q$b;

    new-instance v3, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->s:Li7/g;

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->t:Landroid/content/Context;

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->u:Landroidx/fragment/app/v;

    iget-object v7, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->w:Lcom/nothing/wallpaper/widget/MoreGuideView;

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a;-><init>(Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;->q:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_37

    return-object v0

    :cond_37
    :goto_37
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
