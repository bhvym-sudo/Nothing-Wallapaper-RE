.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    const-string p2, "recyclerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->T(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;)Le3/F0;

    move-result-object p0

    iget-object p0, p0, Le3/F0;->v:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result p1

    if-eqz p1, :cond_15

    const/4 p1, 0x1

    goto :goto_16

    :cond_15
    const/4 p1, 0x0

    :goto_16
    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->A(Z)Z

    return-void
.end method
