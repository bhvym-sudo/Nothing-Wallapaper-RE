.class public final synthetic Lcom/nothing/wallpaper/picker/customization/ui/binder/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroidx/fragment/app/v;

.field public final synthetic r:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;->q:Landroidx/fragment/app/v;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;->r:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;->q:Landroidx/fragment/app/v;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/customization/ui/binder/a;->r:Landroidx/recyclerview/widget/RecyclerView;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a$a$a;->s(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
